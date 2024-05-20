pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven("http://maven.teamhelper.cn:8081/repository/MST/") {
            isAllowInsecureProtocol = true
        }
        maven("https://jitpack.io")
        maven("https://maven.rokid.com/repository/maven-public/")
        maven("https://api.xposed.info/")
        maven("https://s01.oss.sonatype.org/content/repositories/releases/")

    }
}

rootProject.name = "ExampleContainer"
include(":app")
