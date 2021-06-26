pluginManagement {
    val kspVersion: String by settings
    val kotlinVersion: String by settings
    val testRepo: String by settings
    plugins {
        id("com.google.devtools.ksp") version kspVersion
        kotlin("jvm") version kotlinVersion
    }
    repositories {
        maven(testRepo)
        gradlePluginPortal()
        google()
        maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/bootstrap/")
    }
}

rootProject.name = "on-error"

include(":workload")
include(":on-error-processor")
