plugins {
    kotlin("jvm") version PluginVersions.JVM_VERSION
}

subprojects {
    apply {
        plugin("org.jetbrains.kotlin.jvm")
        version = PluginVersions.JVM_VERSION
    }

    apply {
        plugin("org.jetbrains.kotlin.kapt")
        version = PluginVersions.KAPT_VERSION
    }

    dependencies {
        implementation(Dependencies.KOTLIN_REFLECT)
        implementation(Dependencies.KOTLIN_JDK)
        implementation(Dependencies.SPRING_TEST)
        implementation(Dependencies.JAVA_SERVLET)
    }
}

allprojects {
    group = "comit.simsimpulyi"
    version = "0.0.1-SNAPSHOT"

    tasks {
        compileKotlin {
            kotlinOptions {
                freeCompilerArgs = listOf("-Xjsr305=strict")
                jvmTarget = "17"
            }
        }

        compileJava {
            sourceCompatibility = JavaVersion.VERSION_17.majorVersion
        }

        test {
            useJUnitPlatform()
        }
    }

    repositories {
        mavenCentral()
    }
}

tasks.getByName<Jar>("jar") {
    enabled = false
}