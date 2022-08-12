package net.augurnetwork.moshpitaddons;

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;

/*
 * MoshpitAddons Java Plugin
 */
public class MoshpitAddons extends JavaPlugin
{
  private static final Logger m_logger = Logger.getLogger("MoshpitAddons");

  public void onEnable()
  {
    m_logger.info("MoshpitAddons enabled");
  }

  public void onDisable() {
    m_logger.info("MoshpitAddons disabled");
  }
}
