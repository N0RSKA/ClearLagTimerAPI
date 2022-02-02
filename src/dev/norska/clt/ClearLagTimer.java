package dev.norska.clt;

import org.bukkit.plugin.java.JavaPlugin;

public class ClearLagTimer extends JavaPlugin {
	
	private static ClearLagTimer instance;
	
	 public ClearLagTimer() {
	     instance = this;
	 }

	 public static ClearLagTimer getInstance() {
	     return instance;
	 }
}
