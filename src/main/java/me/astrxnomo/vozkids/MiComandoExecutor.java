package me.astrxnomo.vozkids;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class MiComandoExecutor implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // Aquí va la lógica de tu comando
        sender.sendMessage("¡Has ejecutado mi nuevo comando!");
        return true;
    }
}