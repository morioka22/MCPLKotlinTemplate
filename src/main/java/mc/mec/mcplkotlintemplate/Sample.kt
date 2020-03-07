package mc.mec.mcplkotlintemplate

import org.bukkit.Bukkit
import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.plugin.java.JavaPlugin
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.event.player.PlayerQuitEvent

class MCPLKotlinTemplate : JavaPlugin() {

    var _prefix = "§b[Sample]"

    override fun onEnable() {
        // Plugin startup logic
        logger.info("Hello KT!")
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (sender !is Player) return false

        if (!sender.hasPermission("sample.cmd")) return false

        sender.sendMessage("$_prefix |ω・｀)ﾉ ﾔｧ")
        sender.sendMessage("$_prefix This code was written in Kotlin.")
        return false
    }

    @EventHandler
    fun onPlayerJoin(e: PlayerJoinEvent) {
        Bukkit.broadcastMessage("${e.player.displayName} がゲームに参加しました。")
    }

    @EventHandler
    fun onPlayerQuit(e: PlayerQuitEvent) {
        Bukkit.broadcastMessage("${e.player.displayName} がゲームから退出しました。")
    }
}