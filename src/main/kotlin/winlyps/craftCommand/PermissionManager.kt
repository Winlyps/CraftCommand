package winlyps.craftCommand

import org.bukkit.entity.Player

object PermissionManager {

    private const val CRAFT_PERMISSION = "winlyps.craftcommand.use"

    fun hasCraftPermission(player: Player): Boolean {
        return player.isOp || player.hasPermission(CRAFT_PERMISSION)
    }
}