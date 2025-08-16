package com.example.matchbox;

import org.bukkit.plugin.java.JavaPlugin;

public class MatchboxPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Matchbox plugin enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Matchbox plugin disabled!");
    }
}
