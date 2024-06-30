plugins {
    java
    `maven-publish`
}

val log4j_version : String = "2.19.0"

group = "net.kappamc"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.apache.logging.log4j:log4j-core:$log4j_version")
    implementation("org.apache.logging.log4j:log4j-api:$log4j_version")
    implementation("net.sf.jopt-simple:jopt-simple:5.0.4")
}

publishing {
    repositories {
        maven(File(rootDir, "target"))
    }

    publications {
        create<MavenPublication>("mavenJava") {
            group = project.group
            version = project.version as String
            artifactId = project.name

            from(components["java"])
        }
    }
}
