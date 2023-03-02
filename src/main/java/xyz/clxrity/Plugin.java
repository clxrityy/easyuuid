package xyz.clxrity;

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;

import xyz.clxrity.config.Config;

/*
 * easyuuid java plugin
 */
public class Plugin extends JavaPlugin {
  public static final Logger LOGGER = Logger.getLogger("easyuuid");

  private CommandHandler commandHandler;

  public void onEnable() {
    LOGGER.info("easyuuid enabled");
    Config.setup();
    Config.get().addDefault("fetch", "op");
    Config.get().addDefault("uuid", true);
    Config.get().options().copyDefaults();
    Config.save();
    commandHandler = new CommandHandler();
    getCommand("fetch").setExecutor(commandHandler);
  }

  public void onDisable() {
    LOGGER.info("easyuuid disabled");
  }
}
