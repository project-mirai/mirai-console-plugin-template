package org.example.mirai.plugin

import net.mamoe.mirai.alsoLogin
import net.mamoe.mirai.console.MiraiConsole
import net.mamoe.mirai.console.plugin.PluginManager.INSTANCE.enable
import net.mamoe.mirai.console.plugin.PluginManager.INSTANCE.load
import net.mamoe.mirai.console.terminal.MiraiConsoleTerminalLoader

suspend fun main() {
    if (true) {

        error("""
            DEPRECATED:
            此启动方法已经被弃用, 请使用 ./gradlew runConsole 启动测试环境
            
            详见:
            https://docs.mirai.mamoe.net/console/plugin/JVMPlugin.html#%E8%B0%83%E8%AF%95
            https://github.com/mamoe/mirai/blob/dev/mirai-console/docs/plugin/JVMPlugin.md#%E8%B0%83%E8%AF%95
            """.trimIndent())
    }

    MiraiConsoleTerminalLoader.startAsDaemon()

    //如果是Kotlin
    PluginMain.load()
    PluginMain.enable()
    //如果是Java
//    JavaPluginMain.INSTANCE.load()
//    JavaPluginMain.INSTANCE.enable()

    val bot = MiraiConsole.addBot(123456, "") {
        fileBasedDeviceInfo()
    }.alsoLogin()

    MiraiConsole.job.join()
}