package fr.ismania.survie.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import fr.ismania.survie.Main;
import fr.ismania.survie.event.BazarInventoryClickEvent;
import fr.ismania.survie.event.ButcherInventoryClickEvent;
import fr.ismania.survie.event.CroqueMortInventoryClickEvent;
import fr.ismania.survie.event.ForgeronInventoryClickEvent;
import fr.ismania.survie.event.MinerInventoryClickEvent;

public class PlayerInventoryListener implements Listener {

	public PlayerInventoryListener(Main main) {

	}

	@EventHandler
	public void onInventoryClick(InventoryClickEvent e) {

		Player p = (Player) e.getWhoClicked();
		ItemStack it = e.getCurrentItem();
		Inventory inv = e.getInventory();

		if(inv.getName().equalsIgnoreCase("§cBoucher")) {

			ButcherInventoryClickEvent bInvClick = new ButcherInventoryClickEvent(p, it);
			Bukkit.getPluginManager().callEvent(bInvClick);

			e.setCancelled(true);

		} else if(inv.getName().equalsIgnoreCase("§bForgeron")) {

			ForgeronInventoryClickEvent bInvClick = new ForgeronInventoryClickEvent(p, it);
			Bukkit.getPluginManager().callEvent(bInvClick);

			e.setCancelled(true);

		} else if(inv.getName().equalsIgnoreCase("§0Croque-Mort")) {

			CroqueMortInventoryClickEvent cMInvClick = new CroqueMortInventoryClickEvent(p, it);
			Bukkit.getPluginManager().callEvent(cMInvClick);

			e.setCancelled(true);

		} else if(inv.getName().equalsIgnoreCase("§aAgriculteur")) {

			FarmerInventoryClickEvent fInvClick = new FarmerInventoryClickEvent(p, it);
			Bukkit.getPluginManager().callEvent(fInvClick);

			e.setCancelled(true);

		} else if(inv.getName().equalsIgnoreCase("§6Mineur")) {

			MinerInventoryClickEvent mInvClick = new MinerInventoryClickEvent(p, it);
			Bukkit.getPluginManager().callEvent(mInvClick);

			e.setCancelled(true);

		} else if(inv.getName().equalsIgnoreCase("§cB§ba§0z§aa§6r")) {

			BazarInventoryClickEvent bInvClick = new BazarInventoryClickEvent(p, it);
			Bukkit.getPluginManager().callEvent(bInvClick);

			e.setCancelled(true);

		}

	}

}
