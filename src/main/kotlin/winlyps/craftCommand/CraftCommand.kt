package winlyps.craftCommand

import org.bukkit.plugin.java.JavaPlugin

class CraftCommand : JavaPlugin() {

    override fun onEnable() {
        // Register the command executor
        getCommand("craft")?.setExecutor(CraftCommandExecutor(this))
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}