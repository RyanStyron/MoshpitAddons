package net.augurnetwork.moshpitaddons;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;

import net.augurnetwork.moshpitaddons.environment.DamageModifier;
import net.augurnetwork.moshpitaddons.environment.EventCanceler;

public class Register {

    private Plugin plugin;
    private PluginManager manager;

    public Register(Plugin plugin) {
        this.plugin = plugin;
        this.manager = plugin.getServer().getPluginManager();

        plugin.saveDefaultConfig();

        registerCommands();
        registerEvents();
    }

    private void registerCommands() {}

    private void registerEvents() {
        manager.registerEvents(new DamageModifier(), plugin);
        manager.registerEvents(new EventCanceler(), plugin);
    }
}