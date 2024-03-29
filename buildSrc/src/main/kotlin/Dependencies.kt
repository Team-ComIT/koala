object Dependencies {
    const val KOTLIN_REFLECT = "org.jetbrains.kotlin:kotlin-reflect"
    const val KOTLIN_JDK = "org.jetbrains.kotlin:kotlin-stdlib-jdk8"
    const val JAVA_SERVLET = "javax.servlet:javax.servlet-api:3.1.0"

    const val SPRING_WEB = "org.springframework.boot:spring-boot-starter-web"
    const val SPRING_VALIDATION = "org.springframework.boot:spring-boot-starter-validation"
    const val SPRING_SECURITY = "org.springframework.boot:spring-boot-starter-security"

    const val JACKSON = "com.fasterxml.jackson.module:jackson-module-kotlin"

    const val SPRING_DATA_JPA = "org.springframework.boot:spring-boot-starter-data-jpa"
    const val MYSQL_CONNECTOR = "mysql:mysql-connector-java"

    const val JWT = "io.jsonwebtoken:jjwt:${DependencyVersions.JWT_VERSION}"
    const val SPRING_TEST = "org.springframework.boot:spring-boot-starter-test:${PluginVersions.SPRING_BOOT_VERSION}"
}