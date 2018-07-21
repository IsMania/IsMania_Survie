package fr.ismania.survie.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;

import fr.ismania.survie.Main;
import fr.ismania.survie.event.CroqueMortInventoryClickEvent;

public class CroqueMortInventoryClickListener implements Listener {

	private Main main;
	private double money;

	public CroqueMortInventoryClickListener(Main main) {
		this.main = main;
	}

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onCroqueMortInventoryClick(CroqueMortInventoryClickEvent e) {

		Player p = e.getPlayer();
		ItemStack it = e.getItem();
		money = main.economy.getBalance(p.getName());

		if(it == null || p == null) return;

		if(it.getType() == Material.ROTTEN_FLESH) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 64) {

					main.sell(Material.ROTTEN_FLESH, 64, p, main.price.rottenSell64);

				}

			} else if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 64) {

					if(hasMoney(main.price.rottenBuy64)) {

						main.buy(it.getType(), it.getAmount(), p, main.price.rottenBuy64);

					} else {
						p.sendMessage(main.notHaveMoney);
					}

				}

			}

		} else if(it.getType() == Material.BONE) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 64) {

					main.sell(Material.BONE, 64, p, main.price.osSell64);

				}

			} else if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 64) {

					if(hasMoney(main.price.osBuy64)) {

						main.buy(it.getType(), it.getAmount(), p, main.price.osBuy64);

					} else {
						p.sendMessage(main.notHaveMoney);
					}

				}

			}

		} else if(it.getType() == Material.SULPHUR) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 64) {

					main.sell(Material.SULPHUR, 64, p, main.price.gunpowderSell64);

				}

			} else if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 64) {

					if(hasMoney(main.price.gunpowderBuy64)) {

						main.buy(it.getType(), it.getAmount(), p, main.price.gunpowderBuy64);

					} else {
						p.sendMessage(main.notHaveMoney);
					}

				}

			}

		} else if(it.getType() == Material.SLIME_BLOCK) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 16) {

					main.sell(Material.SLIME_BLOCK, 16, p, main.price.slimeblockSell16);

				}

			} else if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 16) {

					if(hasMoney(main.price.slimeblockBuy16)) {

						main.buy(it.getType(), it.getAmount(), p, main.price.slimeblockBuy16);

					} else {
						p.sendMessage(main.notHaveMoney);
					}

				}

			}

		} else if(it.getType() == Material.BLAZE_ROD) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 32) {

					main.sell(Material.BLAZE_ROD, 32, p, main.price.blazeRodSell32);

				}

			} else if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 1) {

					if(hasMoney(main.price.blazeRodBuy1)) {

						main.buy(it.getType(), it.getAmount(), p, main.price.blazeRodBuy1);

					} else {
						p.sendMessage(main.notHaveMoney);
					}

				}

			}

		} else if(it.getType() == Material.ENDER_PEARL) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 16) {

					main.sell(Material.ENDER_PEARL, 16, p, main.price.enderpearlSell16);

				}

			} else if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 1) {

					if(hasMoney(main.price.enderpearlBuy1)) {

						main.buy(it.getType(), it.getAmount(), p, main.price.enderpearlBuy1);

					} else {
						p.sendMessage(main.notHaveMoney);
					}

				}

			}

		} else if(it.getType() == Material.GHAST_TEAR) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 8) {

					main.sell(Material.GHAST_TEAR, 8, p, main.price.ghastlarmeSell8);

				}

			} else if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 1) {

					if(hasMoney(main.price.ghastlarmeBuy1)) {

						main.buy(it.getType(), it.getAmount(), p, main.price.ghastlarmeBuy1);

					} else {
						p.sendMessage(main.notHaveMoney);
					}

				}
			}

		} else if(it.getType() == Material.STRING) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 64) {

					main.sell(Material.STRING, 64, p, main.price.stringSell64);

				}

			} else if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 64) {

					if(hasMoney(main.price.stringBuy64)) {

						main.buy(it.getType(), it.getAmount(), p, main.price.stringBuy64);

					} else {
						p.sendMessage(main.notHaveMoney);
					}

				}

			}

		} else if(it.getType() == Material.SPIDER_EYE) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 16) {

					main.sell(Material.SPIDER_EYE, 16, p, main.price.eyeSell16);

				}

			} else if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 1) {

					if(hasMoney(main.price.eyeBuy1)) {

						main.buy(it.getType(), it.getAmount(), p, main.price.eyeBuy1);

					} else {
						p.sendMessage(main.notHaveMoney);
					}

				}

			}

		} else if(it.getType() == Material.ARROW) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 64) {

					main.sell(Material.ARROW, 64, p, main.price.arrowSell64);

				}

			} else if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 64) {

					if(hasMoney(main.price.arrowBuy64)) {

						main.buy(it.getType(), it.getAmount(), p, main.price.arrowBuy64);

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
