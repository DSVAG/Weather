pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }

    resolutionStrategy.eachPlugin {
        when {
            requested.id.id.startsWith("com.android") -> {
                useVersion("7.2.1")
            }
            requested.id.id.startsWith("org.jetbrains.kotlin") -> {
                useVersion("1.7.0")
            }
            requested.id.id.startsWith("androidx.compose") -> {
                useVersion("1.2.0")
            }
        }
    }
}

rootProject.name = "Weather"

include(":app")
