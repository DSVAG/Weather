plugins {
    id("com.android.application")
    id("com.dsvag.lib.resolutionStrategy")
    kotlin("android")
}

repositories {
    google()
    mavenCentral()
}

android {
    compileSdk = Config.CompileSdk
    buildToolsVersion = Config.BuildTools

    defaultConfig {
        applicationId = Config.PackageName
        minSdk = Config.MinSdk
        targetSdk = Config.TargetSdk
        versionCode = Config.VersionCode
        versionName = Config.VersionName
    }

    buildTypes {
        getByName("debug") {
            isDebuggable = true
            isShrinkResources = false
            isMinifyEnabled = false
            applicationIdSuffix = ".dev"
        }

        getByName("release") {
            isDebuggable = false
            isShrinkResources = true
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile(name = "proguard-android-optimize.txt"),
                "proguard-rules.pro",
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions { jvmTarget = "1.8" }
}

dependencies {
    implementation(Dependencies.AndroidX.Core)

    implementation(Dependencies.Google.Material)

    implementation(Dependencies.Kotlin.Stdlib)
    implementation(Dependencies.Kotlin.StdlibJdk8)
}
