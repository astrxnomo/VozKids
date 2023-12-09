package me.astrxnomo.vozkids;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    private String prefix = ChatColor.translateAlternateColorCodes('&', "&d[VozKids]");
    private String version;

    @Override
    public void onEnable() {
        this.getLogger().info(prefix + " ¡El plugin ha sido habilitado!" + " v: " + version);
        Bukkit.getServer().broadcastMessage(prefix + " ¡El plugin ha sido habilitado!" + " v: " + version);
        
        // Comandos del plugin
        this.getCommand("miComando").setExecutor(new MiComandoExecutor());
    }

    @Override
    public void onDisable() {
        this.getLogger().info(prefix + " ¡El plugin ha sido deshabilitado!" + " v: " + version);
    }
}