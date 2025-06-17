// Root-level build.gradle.kts

buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:8.9.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.20") // ✅ UPDATED
    }
}

plugins {
    id("com.android.application") version "8.0.0" apply false
    id("com.android.library") version "8.9.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.20" apply false // ✅ UPDATED
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
