plugins {
    application
    kotlin("jvm") version "2.4.21"
}

repositories { mavenCentral() }

val bonus = providers.gradleProperty("bonus").orNull
require(bonus == null || bonus in listOf("06", "07", "08", "09"))
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

// The same entry points can run from IntelliJ or through the Gradle Wrapper.
(1..9).forEach { number ->
    val id = number.toString().padStart(2, '0')
    tasks.register<JavaExec>("runTask$id") {
        group = "application"
        description = "Run the example in Task$id.kt"
        classpath = sourceSets["main"].runtimeClasspath
        javaLauncher.set(javaToolchains.launcherFor { languageVersion.set(JavaLanguageVersion.of(26)) })
        mainClass.set("seminar4.Task${id}Kt")
    }
}
