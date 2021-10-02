package me.fester999.yt;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class komenda implements CommandExecutor {
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equals("pomoc")) {
			if (sender instanceof Player) {
				Player player = (Player) sender;
				if (player.hasPermission("pomoc.cashplay")) {
					player.sendMessage(ChatColor.RED + "Pomoc serwera:");
					player.sendMessage(ChatColor.YELLOW + "/free " + ChatColor.GRAY + "- " + ChatColor.GRAY + "Otrzymujesz darmowego brusha na 15 minut.");
					return true;
				}
				player.sendMessage("Nie masz uprawnien!");
				return true;
				}
			}
			else {
		sender.sendMessage("Hey console");
		return true;	
			}	
	
return false;
	}
	
}
