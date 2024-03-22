// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
    alias(libs.plugins.ksp) apply false
    alias(libs.plugins.detekt)
}

tasks.withType<io.gitlab.arturbosch.detekt.Detekt>().configureEach {
    parallel = true
    autoCorrect = false
    disableDefaultRuleSets = false
    buildUponDefaultConfig = true

    jvmTarget = JavaVersion.valueOf(libs.versions.java.get()).toString()

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
        md.required.set(false)
    }

    config.setFrom(files(project.rootDir.resolve("conf/custom-detekt.yml")))
}

dependencies {
    add("detekt", libs.staticAnalysis.detektCli)
    add("detektPlugins", libs.staticAnalysis.detektFormatting)
    add("detektPlugins", libs.staticAnalysis.detektLibraries)
}
