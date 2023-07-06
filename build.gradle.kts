plugins {
    id("org.springframework.boot") version "2.7.13"
    id("io.spring.dependency-management") version "1.0.15.RELEASE"
    kotlin("multiplatform") version "1.6.21"
    kotlin("plugin.spring") version "1.6.21"
    kotlin("plugin.jpa") version "1.6.21"
}

group = "io.github.landgrafhomyak.itmo"
version = "0.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
}

kotlin {
    jvm {
        compilations.all {
            kotlinOptions {
                freeCompilerArgs += "-Xjsr305=strict"
                jvmTarget = "11"
            }
        }
    }

    sourceSets {
        val jvmMain by getting {
            dependencies {
                implementation("org.springframework.boot:spring-boot-starter-data-jpa")
                implementation("org.jetbrains.kotlin:kotlin-reflect")
                implementation("io.github.kotlin-telegram-bot.kotlin-telegram-bot:telegram:6.1.0")
                runtimeOnly("com.h2database:h2")
               }
        }

        val jvmTest by getting {
            dependencies {
                implementation(kotlin("test"))
                implementation("org.springframework.boot:spring-boot-starter-test")
            }
        }
    }
}
