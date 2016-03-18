package me.gET.sv.compass.main;

import org.bukkit.Bukkit;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

/**
 * Created by Bannwart on 17/03/2016.
 */
public class MinigamesInventory {

    private static Inventory inv;
    private static int[] border = new int[] {0,1,2,3,4,5,6,7,8, 9,17, 18,26, 27,35, 36,44, 45,46, 47,48,49,50,51,52,53};

    public MinigamesInventory(){
        inv = Bukkit.createInventory(null, 45, "Choose a Minigame");
    }

    public static Inventory getInv() {

        for(int i : border){
            inv.setItem(i, new ItemStack(Material.STAINED_GLASS_PANE, 1, DyeColor.BLACK.getData()));
        }

        ItemStack elytra = new ItemStack(Material.ELYTRA);
        ItemMeta elytraMeta = elytra.getItemMeta();
        elytraMeta.setDisplayName("Elytra Race!");
        elytra.setItemMeta(elytraMeta);
        elytra.addEnchantment(Enchantment.MENDING, 1);

        inv.setItem(20, elytra);

        return inv;
    }

}
