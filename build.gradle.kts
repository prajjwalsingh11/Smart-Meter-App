// Top-level build file where you can add configuration options common to all sub-projects/modules.

plugins {
    // Apply the Android plugin for the project
    id("com.android.application") version "7.3.1" apply true // Ensure you're using the appropriate plugin version
    id("org.jetbrains.kotlin.android") version "1.8.20" apply true // Kotlin Android plugin

    // Add kapt plugin for Koin or other annotation processors
    id("org.jetbrains.kotlin.kapt") version "1.8.20" apply true // Use the appropriate Kotlin version
}

allprojects {
    repositories {
        // Do not include repositories here.
        // Repositories are already configured in settings.gradle.kts.
    }
}

subprojects {
    afterEvaluate {
        if (plugins.hasPlugin("com.android.application") || plugins.hasPlugin("com.android.library")) {
            android {
                compileSdk = 33

                defaultConfig {
                    minSdk = 21
                    targetSdk = 33
                    versionCode = 1
                    versionName = "1.0"
                }

                buildTypes {
                    getByName("release") {
                        isMinifyEnabled = false
                        proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
                    }
                }
            }
        }
    }
}

dependencies {
    // Core Android dependencies
    implementation("androidx.core:core-ktx:1.10.1")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.1")

    // Koin for Dependency Injection
    implementation("io.insert-koin:koin-android:3.3.0") // for Android dependency injection
    implementation("io.insert-koin:koin-androidx-viewmodel:3.3.0") // for ViewModel support in Koin
    implementation("io.insert-koin:koin-androidx-ext:3.3.0") // Koin extension for Android

    // Networking dependencies (example using Retrofit)
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")

    // Room Database dependencies (if you're using Room)
    implementation("androidx.room:room-runtime:2.5.0")
    kapt("androidx.room:room-compiler:2.5.0")

    // Testing dependencies
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation("io.insert-koin:koin-test:3.3.0") // Koin testing dependencies

    // Kotlin Coroutines (if you're using coroutines)
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4")
}
