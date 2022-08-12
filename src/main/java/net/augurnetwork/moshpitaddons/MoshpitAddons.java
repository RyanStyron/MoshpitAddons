package net.augurnetwork.moshpitaddons;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

/*
 * MoshpitAddons Maven Java Plugin
 */
public class MoshpitAddons extends JavaPlugin {
  
  private static MoshpitAddons instance;
  private static Logger logger = Logger.getLogger("MoshpitAddons");

  public static MoshpitAddons getInstance() {
    return instance;
  }

  public void onEnable() {
    instance = this;
    
    new Register(this);
    logger.info("MoshpitAddons enabled");
  }

  public void onDisable() {
    logger.info("MoshpitAddons disabled");
  }
}
