plugins {
    application
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(libs.junit.jupiter)
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    implementation(libs.guava)
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

application {
    mainClass = "engtelecom.poo.App"
}

tasks.run.configure {
standardInput = System.`in`
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
