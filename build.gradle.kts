plugins {
    val kotlinVersion = "1.6.10"
    kotlin("jvm") version kotlinVersion
    kotlin("plugin.serialization") version kotlinVersion

    id("net.mamoe.mirai-console") version "2.13.2"
}

group = "org.example"
version = "0.1.0"

repositories {
    if (System.getenv("CI")?.toBoolean() != true) {
        maven("https://maven.aliyun.com/repository/public") // 阿里云国内代理仓库
    }
    mavenCentral()
}
