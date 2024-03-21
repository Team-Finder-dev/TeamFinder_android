import io.gitlab.arturbosch.detekt.Detekt
import io.gitlab.arturbosch.detekt.DetektCreateBaselineTask

val ruleFile = "conf/custom-detekt.yml"

plugins {
    id("io.gitlab.arturbosch.detekt")
}

fun Detekt.setupCommonDetektSettings() {
    parallel = true
    autoCorrect = false
    disableDefaultRuleSets = false
    buildUponDefaultConfig = false

    project.withVersionCatalog { libs ->
        jvmTarget = JavaVersion.valueOf(libs.versions.java.get()).toString()
    }

    setSource(files(projectDir))
    include("**/*.kt")
    include("**/*.kts")
    exclude("**/resources/**")
    exclude("**/build/**")

    reports {
        xml.required.set(true)
        html.required.set(true)
        txt.required.set(true)
        sarif.required.set(false)
    }
}

val detektAll by tasks.register<Detekt>("detektAll") {
    setupCommonDetektSettings()
    config.setFrom(files(project.rootDir.resolve(ruleFile)))
}

val detektProjectBaseline by tasks.register<DetektCreateBaselineTask>("detektProjectBaseline") {
    setSource(files(projectDir))
    include("**/*.kt")
    include("**/*.kts")
    exclude("**/resources/**")
    exclude("**/build/**")

    buildUponDefaultConfig = true
    ignoreFailures = true
    parallel = true

    project.withVersionCatalog { libs ->
        jvmTarget = JavaVersion.valueOf(libs.versions.java.get()).toString()
    }

    config.setFrom(files(project.rootDir.resolve(ruleFile)))
}

project.withVersionCatalog { libs ->
    dependencies {
        add("detekt", libs.staticAnalysis.detektCli)
        add("detektPlugins", libs.staticAnalysis.detektFormatting)
        add("detektPlugins", libs.staticAnalysis.detektLibraries)
    }
}
