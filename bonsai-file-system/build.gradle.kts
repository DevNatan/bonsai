plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("org.jetbrains.compose")
    id("com.vanniktech.maven.publish")
}

kotlinMultiplatform()

kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                api(projects.bonsaiCore)
                api(libs.okio)
                compileOnly(compose.foundation)
                compileOnly(compose.ui)
                implementation(compose.materialIconsExtended)
            }
        }
    }
}
