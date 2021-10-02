package me.fester999.yt;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	public void onEnable() {
		this.getCommand("pomoc").setExecutor(new komenda());
		this.getCommand("rangi").setExecutor(new gui());
		getServer().getConsoleSender().sendMessage("Wlaczanie pluginu...");
		
		getServer().getPluginManager().registerEvents(new GuiHandler(), this);			
		
	}
	
	public void onDisable() {
		getServer().getConsoleSender().sendMessage("Wylaczanie pluginu...");
		
	}
}
