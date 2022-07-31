plugins {
    id("com.android.application")
    kotlin("android")
}

repositories {
    google()
    mavenCentral()
}

android {
    compileSdk = libs.versions.compilesdk.get().toInt()
    buildToolsVersion = libs.versions.buildtools.get()
    namespace = "com.dsvag.weather"

    defaultConfig {
        applicationId = "com.dsvag.weather"
        minSdk = libs.versions.minsdk.get().toInt()
        targetSdk = libs.versions.targetsdk.get().toInt()
        versionCode = 1
        versionName = "1.0"
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions { jvmTarget = "17" }

    buildFeatures { compose = true }

    composeOptions { kotlinCompilerExtensionVersion = libs.versions.composecompiler.get() }
}

dependencies {
    implementation(libs.appcompat)
    implementation(libs.ktx)

    implementation(libs.accompanist.swiperefresh)
    implementation(libs.accompanist.systemuicontroller)
    implementation(libs.accompanist.permissions)
    implementation(libs.activity.compose)
    implementation(libs.compose.compiler)
    implementation(libs.compose.animation)
    implementation(libs.compose.ui)
    implementation(libs.compose.ui.tooling)
    implementation(libs.compose.ui.preview)
    implementation(libs.compose.ui.util)
    implementation(libs.compose.foundation)
    implementation(libs.compose.material)
    implementation(libs.compose.runtime)

    implementation(libs.stdlib)
    implementation(libs.stdlib8)
}
