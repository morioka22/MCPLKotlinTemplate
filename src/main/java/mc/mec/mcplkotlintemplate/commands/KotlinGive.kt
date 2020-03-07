package mc.mec.mcplkotlintemplate.commands

import org.bukkit.Material
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack

object KotlinGive : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        (sender as? Player)?.inventory?.addItem(ItemStack(Material.STONE))
        if (sender !is Player) {
            sender.sendMessage("あなたはプレイヤーです。")
        } else {
            sender.sendMessage("あなたはプレイヤーではありません。")
        }
        return true
    }
}