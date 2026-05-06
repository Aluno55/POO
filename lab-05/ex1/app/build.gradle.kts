plugins {
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(files("libs/algs4.jar"))
    testImplementation(libs.junit.jupiter)
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    implementation(libs.guava)
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(25)
    }
}

application {
    mainClass = "engtelecom.poo.App"
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
