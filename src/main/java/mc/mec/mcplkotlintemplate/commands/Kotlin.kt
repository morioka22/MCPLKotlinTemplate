package mc.mec.mcplkotlintemplate.commands

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

object Kotlin : CommandExecutor {
    private const val _prefix: String = "§b[Sample]"
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (sender !is Player) return false

        if (!sender.hasPermission("sample.cmd")) return false

        sender.sendMessage("$_prefix |ω・｀)ﾉ ﾔｧ")
        sender.sendMessage("$_prefix This code was written in Kotlin.")
        return false
    }
}