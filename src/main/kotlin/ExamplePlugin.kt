package org.example.mirai.plugin

import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescription
import net.mamoe.mirai.console.plugin.jvm.KotlinPlugin
import net.mamoe.mirai.utils.info

object ExamplePlugin : KotlinPlugin(
    JvmPluginDescription("org.example.mirai-plugin", "1.0.0")
) {
    override fun onEnable() {
        logger.info { "Plugin loaded" }
    }
}