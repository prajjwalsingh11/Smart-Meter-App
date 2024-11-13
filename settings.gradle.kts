pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()  // Maven Central repository
        gradlePluginPortal()  // Gradle Plugin Portal for plugins
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS) // Prevent repositories in build.gradle.kts
    repositories {
        google()       // Google repository for dependencies
        mavenCentral() // Maven Central repository for dependencies
    }
}

rootProject.name = "SmartMeterApp"
include(":app")
 