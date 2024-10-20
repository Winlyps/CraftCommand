package winlyps.craftCommand

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class CraftCommandExecutor(private val plugin: CraftCommand) : CommandExecutor {

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (sender !is Player) {
            sender.sendMessage("This command can only be used by players.")
            return true
        }

        if (!PermissionManager.hasCraftPermission(sender)) {
            sender.sendMessage("You do not have permission to use this command.")
            return true
        }

        // Open the crafting table for the player
        sender.openWorkbench(null, true)
        return true
    }
}