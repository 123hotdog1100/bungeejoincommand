package me.BungeePlugin;

import org.bukkit.plugin.java.JavaPlugin;

public class BungeeMain extends JavaPlugin {

    @Override
    public void onEnable(){
        getLogger().info("Custom Plugin has loaded");
    }
}
