package me.gET.sv.compass.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Bannwart on 17/03/2016.
 */
public class Main extends JavaPlugin{

    public void onEnable(){
        Bukkit.getServer().getPluginManager().registerEvents(new EventManager(), this);
    }


}
