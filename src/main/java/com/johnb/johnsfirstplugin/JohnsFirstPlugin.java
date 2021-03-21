package com.johnb.johnsfirstplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class JohnsFirstPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("JohnsFirstPlugin is enabled!");
    }
    @Override
    public void onDisable() {
        getLogger().info("JohnsFirstPlugin is disabled!");
    }
}
