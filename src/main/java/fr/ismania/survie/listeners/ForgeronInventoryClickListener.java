package fr.ismania.survie.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;

import fr.ismania.survie.Main;
import fr.ismania.survie.event.ForgeronInventoryClickEvent;

public class ForgeronInventoryClickListener implements Listener {

	private Main main;
	private double money;

	public ForgeronInventoryClickListener(Main main) {
		this.main = main;
	}

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onForgeronInventoryClick(ForgeronInventoryClickEvent e) {

		Player p = e.getPlayer();
		ItemStack it = e.getItem();
		money = main.economy.getBalance(p.getName());

		if(it.getType() == Material.COAL_BLOCK) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 7) {

					main.sell(Material.COAL_BLOCK, 7, p, main.price.coalBlockSell7);

				}

			} else if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 7) {

					if(hasMoney(main.price.coalBlockBuy7)) {

						main.buy(Material.COAL_BLOCK, 7, p, main.price.coalBlockBuy7);

					} else {
						p.sendMessage(main.notHaveMoney);
					}

				}

			}

		} else if(it.getType() == Material.IRON_INGOT) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 8) {

					main.sell(Material.IRON_INGOT, 8, p, main.price.ironSell8);

				}

			} else if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 8) {

					if(hasMoney(main.price.ironBuy8)) {

						main.buy(Material.IRON_INGOT, 8, p, main.price.ironBuy8);

					} else {
						p.sendMessage(main.notHaveMoney);
					}

				}

			}

		} else if(it.getType() == Material.REDSTONE) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 32) {

					main.sell(Material.REDSTONE, 32, p, main.price.redstoneSell32);

				}

			} else if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 32) {

					if(hasMoney(main.price.redstoneBuy32)) {

						main.buy(Material.REDSTONE, 32, p, main.price.redstoneBuy32);

					} else {
						p.sendMessage(main.notHaveMoney);
					}

				}

			}

		} else if(it.getType() == Material.INK_SACK) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 32) {

					main.sell(Material.INK_SACK, 32, p, main.price.lapisSell32, (byte) 4);

				}

			} else if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 32) {

					if(hasMoney(main.price.lapisBuy32)) {

						main.buy(Material.INK_SACK, 32, p, main.price.lapisBuy32, (byte) 4);

					} else {
						p.sendMessage(main.notHaveMoney);
					}

				}

			}

		} else if(it.getType() == Material.GOLD_INGOT) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 8) {

					main.sell(Material.GOLD_INGOT, 8, p, main.price.orSell8);

				}

			} else if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 8) {

					if(hasMoney(main.price.orBuy8)) {

						main.buy(Material.GOLD_INGOT, 8, p, main.price.orBuy8);

					} else {
						p.sendMessage(main.notHaveMoney);
					}

				}

			}

		} else if(it.getType() == Material.DIAMOND) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 8) {

					main.sell(Material.DIAMOND, 8, p, main.price.diamondSell8);

				}

			} else if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 8) {

					if(hasMoney(main.price.diamondBuy8)) {

						main.buy(Material.DIAMOND, 8, p, main.price.diamondBuy8);

					} else {
						p.sendMessage(main.notHaveMoney);
					}

				}

			}

		}

	}

	public boolean hasMoney(double price) {

		return money >= price;

	}

}
