package me.gET.sv.compass.main;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

/**
 * Created by Bannwart on 17/03/2016.
 */
public class EventManager implements Listener{

    @EventHandler
    public void onRightClick(PlayerInteractEvent e){
        if(e.getAction() != Action.RIGHT_CLICK_AIR || e.getAction() != Action.RIGHT_CLICK_BLOCK) return;
        if(e.getPlayer().getInventory().getItemInMainHand().getType() != Material.COMPASS) return;
        if(!(e.getPlayer().getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Minigames"))) return;

        e.getPlayer().openInventory(MinigamesInventory.getInv());

    }

    @EventHandler
    public void PlayerInteractInventory(InventoryClickEvent e){
        if(e.getInventory().getName() == null) return;
        if(!(e.getInventory().getName().equals("Choose a Minigame"))) return;

        if(e.getClickedInventory().getItem(e.getSlot()).getType() == Material.ELYTRA){
            //p.teleport(ElytraLobby);
        }
        e.setCancelled(true);
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e){
        ItemStack is = new ItemStack(Material.COMPASS);
        ItemMeta im = is.getItemMeta();
        im.setDisplayName("Minigames");
        is.setItemMeta(im);
        e.getPlayer().getInventory().setItem(0, is);
    }

}
