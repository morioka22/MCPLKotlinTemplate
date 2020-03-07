package mc.mec.mcplkotlintemplate

import org.bukkit.Bukkit
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.event.player.PlayerQuitEvent
import java.util.logging.Logger

class EventListener(private var plg : MCPLKotlinTemplate, val log : Logger = plg.logger) : Listener {
    init {
        plg.server.pluginManager.registerEvents(this,plg);
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