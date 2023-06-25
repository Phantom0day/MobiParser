plugins {
    kotlin("multiplatform")
    id("com.android.library")
    kotlin("plugin.serialization")
}

@OptIn(org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi::class)
kotlin {
    targetHierarchy.default()

    android {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }
    
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "shared"
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                //put your multiplatform dependencies here

                //Coroutines
                implementation(libs.kotlinx.coroutines.core)
                //Logger
                implementation(libs.napier)
                //JSON
                implementation(libs.kotlinx.serialization.json)
                //Key-Value storage
                implementation(libs.multiplatform.settings)
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}

android {
    namespace = "com.phantomray.mobiparser"
    compileSdk = 33
    defaultConfig {
        minSdk = 21
    }
}