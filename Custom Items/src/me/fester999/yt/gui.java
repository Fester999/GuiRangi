package me.fester999.yt;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class gui implements CommandExecutor {
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equals("rangi")) {
			if (sender instanceof Player) {
				Player player = (Player) sender;
				
				Inventory rangi = Bukkit.createInventory(player, 27, "Rangi");
				player.openInventory(rangi);
				
				ItemStack item1 = new ItemStack(Material.GOLD_BLOCK);
				item1.addUnsafeEnchantment(Enchantment.ARROW_KNOCKBACK, 100);
				ItemMeta meta = item1.getItemMeta();
				meta.setUnbreakable(true);
				meta.setDisplayName(ChatColor.YELLOW + "VIP");
				ArrayList<String> lore = new ArrayList<>();
				lore.add("Przywileje rangi vip:");
				meta.setLore(lore);
				item1.setItemMeta(meta);
					rangi.setItem(11, item1);	
					
				ItemStack item2 = new ItemStack(Material.DIAMOND_BLOCK);
				item2.addUnsafeEnchantment(Enchantment.ARROW_KNOCKBACK, 100);
				ItemMeta meta2 = item2.getItemMeta();
				meta2.setUnbreakable(true);
				meta2.setDisplayName(ChatColor.YELLOW + "SVIP");
				ArrayList<String> lore2 = new ArrayList<>();
				lore2.add("Przywileje rangi svip:");
				meta2.setLore(lore2);
				item2.setItemMeta(meta2);
					rangi.setItem(13, item2);	
					
				ItemStack item3 = new ItemStack(Material.EMERALD_BLOCK);
				item3.addUnsafeEnchantment(Enchantment.ARROW_KNOCKBACK, 100);
				ItemMeta meta3 = item3.getItemMeta();
				meta3.setUnbreakable(true);
				meta3.setDisplayName(ChatColor.YELLOW + "BOGACZ");
				ArrayList<String> lore3 = new ArrayList<>();
				lore3.add("Przywileje rangi bogacz:");
				meta3.setLore(lore3);
				item3.setItemMeta(meta3);
					rangi.setItem(15, item3);	
					
				ItemStack item4 = new ItemStack(Material.BARRIER);
				ItemMeta meta4 = item4.getItemMeta();
				meta4.setDisplayName(ChatColor.RED + "Wyjscie");
				ArrayList<String> lore4 = new ArrayList<>();
				lore4.add(ChatColor.GRAY + "Kliknij aby wyjsc");
				meta4.setLore(lore4);
				item4.setItemMeta(meta4);
					rangi.setItem(26, item4);	
			}
		}
	return true;
}
	
}