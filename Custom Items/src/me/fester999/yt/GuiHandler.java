package me.fester999.yt;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class GuiHandler implements Listener {
	
	
	@EventHandler
	public void onMenuClick(InventoryClickEvent e) {
		Player player = (Player) e.getWhoClicked();
		if (e.getView().getTitle().equalsIgnoreCase("Rangi")) {
			e.setCancelled(true);
			if (e.getCurrentItem().getType().equals(Material.BARRIER)) {
				player.closeInventory();
				
			}
		}
	}
	

}
