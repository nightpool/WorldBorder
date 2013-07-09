package com.wimbli.WorldBorder;

import org.bukkit.plugin.java.JavaPlugin;

public class PluginlessConfig extends Config {

	public static void load(JavaPlugin master, boolean logIt)
	{	// load config from file
		plugin = master;
		LogConfig("Using " + (ShapeName()) + " border, knockback of " + knockBack + " blocks, and timer delay of " + timerTicks + ".");
		StartBorderTimer();
	}
	
	public static void save(boolean logIt, boolean storeFillTask)
	{	
		
	}

}
