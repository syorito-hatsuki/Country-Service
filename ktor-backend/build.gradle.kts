plugins {
    kotlin("jvm") version "1.9.0"
    kotlin("plugin.serialization") version "1.9.0"
    application
}

group = "dev.syoritohatsuki"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    val ktorVersion: String by project
    implementation("io.ktor", "ktor-server-core", ktorVersion)
    implementation("io.ktor", "ktor-server-netty", ktorVersion)
    implementation("io.ktor", "ktor-server-content-negotiation", ktorVersion)
    implementation("io.ktor", "ktor-serialization-kotlinx-json", ktorVersion)

    val logbackVersion: String by project
    implementation("ch.qos.logback","logback-classic", logbackVersion)

    testImplementation(kotlin("test"))
    testImplementation("io.ktor", "ktor-server-test-host", ktorVersion)
    testImplementation("org.jetbrains.kotlin", "kotlin-test-junit", "1.9.0")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(19)
}

application {
    mainClass.set("MainKt")
}