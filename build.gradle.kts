plugins {
    kotlin("multiplatform") version "1.7.0"
}

group = "io.github.landgrafhomyak.itmo"
version = "0.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvm {}

    sourceSets {
        val jvmMain by getting {
            dependencies {}
        }

        val jvmTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}
