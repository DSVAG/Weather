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
    namespace = Config.PackageName


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
        sourceCompatibility = Config.JavaVersion
        targetCompatibility = Config.JavaVersion
    }

    kotlinOptions { jvmTarget = "11" }

    buildFeatures { compose = true }

    composeOptions { kotlinCompilerExtensionVersion = Dependencies.Compose.Version }
}

dependencies {
    implementation(Dependencies.AndroidX.Appcompat)
    implementation(Dependencies.AndroidX.Core)

    implementation(Dependencies.Compose.Activity)
    implementation(Dependencies.Compose.Compiler)
    implementation(Dependencies.Compose.Ui)
    implementation(Dependencies.Compose.UiUtil)
    implementation(Dependencies.Compose.Foundation)
    implementation(Dependencies.Compose.Tooling)
    implementation(Dependencies.Compose.Preview)
    implementation(Dependencies.Compose.Pager)
    implementation(Dependencies.Compose.PagerIndicator)
    implementation(Dependencies.Compose.Material)
    implementation(Dependencies.Compose.IconsCore)
    implementation(Dependencies.Compose.IconsExtended)
    implementation(Dependencies.Compose.SwipeRefresh)
    implementation(Dependencies.Compose.UiController)

    implementation(Dependencies.Kotlin.Stdlib)
    implementation(Dependencies.Kotlin.StdlibJdk8)
}
