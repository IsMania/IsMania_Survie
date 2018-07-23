package fr.ismania.survie.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;

import fr.ismania.survie.Main;
import fr.ismania.survie.event.BazarInventoryClickEvent;

public class BazarInventoryClickListener implements Listener {

	private Main main;
	private double money;

	public BazarInventoryClickListener(Main main) {
		this.main = main;
	}

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onBazarInventoryClick(BazarInventoryClickEvent e) {

		Player p = e.getPlayer();
		ItemStack it = e.getItem();
		money = main.economy.getBalance(p.getName());

		if(it.getItemMeta().getLore().isEmpty()) return;

		if(it.getType() == Material.ELYTRA) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 1) {

					main.sell(Material.ELYTRA, 1, p, main.price.elytraSell1);

				}

			} else if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 1) {

					if(hasMoney(main.price.elytraBuy1)) {

						main.buy(it.getType(), it.getAmount(), p, main.price.elytraBuy1);

					} else {
						p.sendMessage(main.notHaveMoney);
					}

				}

			}

		} else if(it.getType() == Material.BEACON) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 1) {

					main.sell(Material.BEACON, 1, p, main.price.beaconSell1);

				}

			} else if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 1) {

					if(hasMoney(main.price.beaconBuy1)) {

						main.buy(it.getType(), it.getAmount(), p, main.price.beaconBuy1);

					} else {
						p.sendMessage(main.notHaveMoney);
					}

				}

			}

		} else if(it.getType() == Material.NAME_TAG) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 16) {

					main.sell(Material.NAME_TAG, 16, p, main.price.nametagSell16);

				}

			}

		} else if(it.getType() == Material.SPONGE) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 8) {

					main.sell(Material.SPONGE, 8, p, main.price.spongSell8);

				}

			}

		} else if(it.getType() == Material.SKULL_ITEM) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 1) {

					main.sell(Material.SKULL_ITEM, 1, p, main.price.dragonHeadSell1, (byte) 5);

				}

			}

		} else if(it.getType() == Material.EXP_BOTTLE) {

			if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 32) {

					if(hasMoney(main.price.xpBottleBuy32)) {

						main.buy(it.getType(), it.getAmount(), p, main.price.xpBottleBuy32);

					} else {
						p.sendMessage(main.notHaveMoney);
					}

				}

			}

		} else if(it.getType() == Material.TOTEM) {

			if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 1) {

					if(hasMoney(main.price.totemBuy1)) {

						main.buy(it.getType(), it.getAmount(), p, main.price.totemBuy1);

					} else {
						p.sendMessage(main.notHaveMoney);
					}

				}

			}

		} else if(it.getType() == Material.WEB) {

			if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 1) {

					if(hasMoney(main.price.cobwebBuy1)) {

						main.buy(it.getType(), it.getAmount(), p, main.price.cobwebBuy1);

					} else {
						p.sendMessage(main.notHaveMoney);
					}

				}

			}

		} else if(it.getType() == Material.PURPLE_SHULKER_BOX) {

			if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 1) {

					if(hasMoney(main.price.shulkerboxBuy1)) {

						main.buy(it.getType(), it.getAmount(), p, main.price.shulkerboxBuy1);

					} else {
						p.sendMessage(main.notHaveMoney);
					}

				}

			}

		} else if(it.getType() == Material.RECORD_8) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 1) {

					if(p.getInventory().containsAtLeast(new ItemStack(Material.RECORD_3, 1), 1)) {

						main.sell(Material.RECORD_3, 1, p, main.price.disqueSell1);

					} else if(p.getInventory().containsAtLeast(new ItemStack(Material.RECORD_4, 1), 1)) {

						main.sell(Material.RECORD_4, 1, p, main.price.disqueSell1);

					} else if(p.getInventory().containsAtLeast(new ItemStack(Material.RECORD_5, 1), 1)) {

						main.sell(Material.RECORD_5, 1, p, main.price.disqueSell1);

					} else if(p.getInventory().containsAtLeast(new ItemStack(Material.RECORD_6, 1), 1)) {

						main.sell(Material.RECORD_6, 1, p, main.price.disqueSell1);

					} else if(p.getInventory().containsAtLeast(new ItemStack(Material.RECORD_7, 1), 1)) {

						main.sell(Material.RECORD_7, 1, p, main.price.disqueSell1);

					} else if(p.getInventory().containsAtLeast(new ItemStack(Material.RECORD_8, 1), 1)) {

						main.sell(Material.RECORD_8, 1, p, main.price.disqueSell1);

					} else if(p.getInventory().containsAtLeast(new ItemStack(Material.RECORD_9, 1), 1)) {

						main.sell(Material.RECORD_9, 1, p, main.price.disqueSell1);

					} else if(p.getInventory().containsAtLeast(new ItemStack(Material.RECORD_10, 1), 1)) {

						main.sell(Material.RECORD_11, 1, p, main.price.disqueSell1);

					} else if(p.getInventory().containsAtLeast(new ItemStack(Material.RECORD_12, 1), 1)) {

						main.sell(Material.RECORD_12, 1, p, main.price.disqueSell1);

					} else {
						p.sendMessage(main.notHaveItem);
					}

				}

			}

		}

	}

	public boolean hasMoney(double price) {
		return money >= price;
	}

}
