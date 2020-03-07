package mc.mec.mcplkotlintemplate

import mc.mec.mcplkotlintemplate.commands.Kotlin
import mc.mec.mcplkotlintemplate.commands.KotlinGive
import org.bukkit.Bukkit
import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.plugin.java.JavaPlugin
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.event.player.PlayerQuitEvent

class MCPLKotlinTemplate : JavaPlugin() {

    private val _prefix: String = "§b[Sample]"

    override fun onEnable() {
        // Plugin startup logic
        getCommand("kotlin")?.setExecutor(Kotlin)
        getCommand("kotlingive")?.setExecutor(KotlinGive)
        EventListener(this)
        logger.info("Hello KT!")
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}