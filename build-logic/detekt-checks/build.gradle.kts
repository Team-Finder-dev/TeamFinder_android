plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(projects.versionCatalog)
    implementation(libs.staticAnalysis.detektPlugin)
    implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))
}

