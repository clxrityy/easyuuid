package xyz.clxrity;

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;

/*
 * easyuuid java plugin
 */
public class Plugin extends JavaPlugin
{
  public static final Logger LOGGER = Logger.getLogger("easyuuid");
  
  private CommandHandler commandHandler;

  public void onEnable()
  {
    LOGGER.info("easyuuid enabled");
    commandHandler = new CommandHandler();
    getCommand("fetch").setExecutor(commandHandler);
  }

  public void onDisable()
  {
    LOGGER.info("easyuuid disabled");
  }
}
