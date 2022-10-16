package xyz.clxrity;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandHandler implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equalsIgnoreCase("fetch") && sender instanceof Player) {

            Player player = (Player) sender;
            String target = args[0];
            Plugin.LOGGER.info(player + " is searching for the UUID of " + target);
            player.sendMessage("Searching for the UUID of " + target);

            return true;
        }
        return false;
    }
}
