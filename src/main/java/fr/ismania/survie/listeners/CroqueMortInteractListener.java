package fr.ismania.survie.listeners;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import fr.ismania.survie.Main;
import fr.ismania.survie.event.CroqueMortInteractEvent;
import fr.ismania.survie.utils.PriceShop;

public class CroqueMortInteractListener implements Listener {

	private Main main;
	private PriceShop price;

	public CroqueMortInteractListener(Main main) {
		this.main = main;
		this.price = this.main.price;
	}

	@EventHandler
	public void onInteractCroqueMort(CroqueMortInteractEvent e) {

		Player p = e.getPlayer();

		Inventory inv = Bukkit.createInventory(null, 54, "§0Croque-Mort");

		inv.setItem(4, createItemGlass(Material.STAINED_GLASS_PANE, (byte) 0, " "));
		inv.setItem(13, createItemGlass(Material.STAINED_GLASS_PANE, (byte) 0, " "));
		inv.setItem(22, createItemGlass(Material.STAINED_GLASS_PANE, (byte) 0, " "));
		inv.setItem(31, createItemGlass(Material.STAINED_GLASS_PANE, (byte) 0, " "));
		inv.setItem(40, createItemGlass(Material.STAINED_GLASS_PANE, (byte) 0, " "));
		inv.setItem(49, createItemGlass(Material.STAINED_GLASS_PANE, (byte) 0, " "));

		inv.setItem(9, createItem(Material.ROTTEN_FLESH, 64, "Rotten Flesh", "§bVendre", "§aRaporte : §6" + price.rottenSell64 + main.maniaz));
		inv.setItem(18, createItem(Material.BONE, 64, "Os", "§bVendre", "§aRaporte : §6" + price.osSell64 + main.maniaz));
		inv.setItem(27, createItem(Material.SULPHUR, 64, "Gunpowder", "§bVendre", "§aRaporte : §6" + price.gunpowderSell64 + main.maniaz));
		inv.setItem(36, createItem(Material.SLIME_BLOCK, 16, "Slimeblock", "§bVendre", "§aRaporte : §6" + price.slimeblockSell16 + main.maniaz));
		inv.setItem(10, createItem(Material.BLAZE_ROD, 32, "Blazerod", "§bVendre", "§aRaporte : §6" + price.blazeRodSell32 + main.maniaz));
		inv.setItem(19, createItem(Material.ENDER_PEARL, 16, "Enderpearl", "§bVendre", "§aRaporte : §6" + price.enderpearlSell16 + main.maniaz));
		inv.setItem(28, createItem(Material.GHAST_TEAR, 8, "Larme de ghast", "§bVendre", "§aRaporte : §6" + price.ghastlarmeSell8 + main.maniaz));
		inv.setItem(37, createItem(Material.STRING, 64, "Fils", "§bVendre", "§aRaporte : §6" + price.stringSell64 + main.maniaz));
		inv.setItem(11, createItem(Material.SPIDER_EYE, 16, "Oeil d'araignée", "§bVendre", "§aRaporte : §6" + price.eyeSell16 + main.maniaz));
		inv.setItem(20, createItem(Material.ARROW, 64, "Flèches", "§bVendre", "§aRaporte : §6" + price.arrowSell64 + main.maniaz));

		inv.setItem(14, createItem(Material.ROTTEN_FLESH, 64, "Rotten Flesh", "§eAcheter", "§cCoûte : §6" + price.rottenBuy64 + main.maniaz));
		inv.setItem(23, createItem(Material.BONE, 64, "Os", "§eAcheter", "§cCoûte : §6" + price.osBuy64 + main.maniaz));
		inv.setItem(32, createItem(Material.SULPHUR, 64, "Gunpowder", "§eAcheter", "§cCoûte : §6" + price.gunpowderBuy64 + main.maniaz));
		inv.setItem(41, createItem(Material.SLIME_BLOCK, 16, "Slimeblock", "§eAcheter", "§cCoûte : §6" + price.slimeblockBuy16 + main.maniaz));
		inv.setItem(15, createItem(Material.BLAZE_ROD, 1, "Blazerod", "§eAcheter", "§cCoûte : §6" + price.blazeRodBuy1 + main.maniaz));
		inv.setItem(24, createItem(Material.ENDER_PEARL, 1, "Enderpearl", "§eAcheter", "§cCoûte : §6" + price.enderpearlBuy1 + main.maniaz));
		inv.setItem(33, createItem(Material.GHAST_TEAR, 1, "Larme de ghast", "§eAcheter", "§cCoûte : §6" + price.ghastlarmeBuy1 + main.maniaz));
		inv.setItem(42, createItem(Material.STRING, 64, "Fils", "§eAcheter", "§cCoûte : §6" + price.stringBuy64 + main.maniaz));
		inv.setItem(16, createItem(Material.SPIDER_EYE, 1, "Oeil d'araignée", "§eAcheter", "§cCoûte : §6" + price.eyeBuy1 + main.maniaz));
		inv.setItem(25, createItem(Material.ARROW, 64, "Flèches", "§eAcheter", "§cCoûte : §6" + price.arrowBuy64 + main.maniaz));

		p.openInventory(inv);

	}

	public ItemStack createItem(Material material, int nbr, String name, String lore1, String lore2) {

		ItemStack it = new ItemStack(material, nbr);
		ItemMeta itm = it.getItemMeta();
		if(name != null) itm.setDisplayName(name);
		if(lore1 != null && lore2 != null) itm.setLore(Arrays.asList(lore1, lore2));

		it.setItemMeta(itm);

		return it;

	}

	public ItemStack createItem(Material material, int nbr, String name, String lore1) {

		ItemStack it = new ItemStack(material, nbr);
		ItemMeta itm = it.getItemMeta();
		if(name != null) itm.setDisplayName(name);
		if(lore1 != null) itm.setLore(Arrays.asList(lore1));

		it.setItemMeta(itm);

		return it;

	}

	public ItemStack createItem(Material material, int nbr, byte data, String name, String lore1, String lore2) {

		ItemStack it = new ItemStack(material, nbr, data);
		ItemMeta itm = it.getItemMeta();
		if(name != null) itm.setDisplayName(name);
		if(lore1 != null) itm.setLore(Arrays.asList(lore1, lore2));

		it.setItemMeta(itm);

		return it;

	}

	public ItemStack createItemGlass(Material material, byte data, String name) {

		ItemStack it = new ItemStack(material, 1, data);
		ItemMeta itm = it.getItemMeta();
		if(name != null) itm.setDisplayName(name);

		it.setItemMeta(itm);

		return it;

	}

}
