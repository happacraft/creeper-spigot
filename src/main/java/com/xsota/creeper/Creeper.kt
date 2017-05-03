package com.xsota.creeper

import org.bukkit.plugin.java.JavaPlugin

class Creeper : JavaPlugin() {

    override fun onEnable() {
        super.onEnable()

        logger.info("enable Creeper plugin")
    }

    override fun onDisable() {
        super.onDisable()

        logger.info("disable Creeper plugin")
    }
}
