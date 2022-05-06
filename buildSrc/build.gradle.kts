plugins {
    `java-gradle-plugin`
    `kotlin-dsl`
}

group = "com.dsvag.lib"

repositories {
    google()
    mavenCentral()
}

gradlePlugin {
    plugins {
        create("resolutionStrategy") {
            id = "$group.resolutionStrategy"
            implementationClass = "com.dsvag.lib.ResolutionStrategyPlugin"
        }
    }
}

dependencies {
    implementation("com.android.tools.build:gradle:7.0.4")
    implementation("com.android.tools.build:gradle-api:7.0.4")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
}
