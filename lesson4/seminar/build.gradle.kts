plugins {
    application
    kotlin("jvm") version "2.4.21"
}

repositories { mavenCentral() }

val bonus = providers.gradleProperty("bonus").orNull
require(bonus == null || bonus in listOf("06", "07", "08"))
application { mainClass.set("seminar4.MainKt") }

kotlin {
    jvmToolchain(26)
    sourceSets {
        main {
            kotlin.srcDir("tasks")
        }
        test {
            kotlin.setSrcDirs(listOf("tests"))
            kotlin.include(if (bonus != null) listOf("Task${bonus}Test.kt") else (1..5).map { "Task0${it}Test.kt" })
        }
    }
}


dependencies {
    testImplementation(platform("org.junit:junit-bom:5.13.4"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
    testLogging { events("failed", "skipped", "passed") }
}
