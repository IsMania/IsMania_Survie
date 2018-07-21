package fr.ismania.survie.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;

import fr.ismania.survie.Main;
import fr.ismania.survie.event.ButcherInventoryClickEvent;

public class ButcherInventoryClickListener implements Listener {

	private Main main;
	private double money;

	public ButcherInventoryClickListener(Main main) {
		this.main = main;
	}

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onButcherInventoryClick(ButcherInventoryClickEvent e) {

		Player p = e.getPlayer();
		ItemStack it = e.getItem();
		money = main.economy.getBalance(p.getName());

		if(it.getType() == Material.COOKED_BEEF) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 64) {

					main.sell(Material.COOKED_BEEF, 64, p, main.price.steaksSell64);

				}

			} else if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 64) {

					if(hasMoney(main.price.steaksBuy64)) {

						main.buy(Material.COOKED_BEEF, 64, p, main.price.steaksBuy64);

					} else {
						p.sendMessage(main.notHaveMoney);
					}

				}

			}

		} else if(it.getType() == Material.GRILLED_PORK) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 64) {

					main.sell(Material.GRILLED_PORK, 64, p, main.price.porkSell64);

				}

			} else if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 64) {

					if(hasMoney(main.price.porkBuy64)) {

						main.buy(Material.GRILLED_PORK, 64, p, main.price.porkBuy64);

					} else {
						p.sendMessage(main.notHaveMoney);
					}

				}

			}

		} else if(it.getType() == Material.COOKED_CHICKEN) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 64) {

					main.sell(Material.COOKED_CHICKEN, 64, p, main.price.chickenSell64);

				}

			} else if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 64) {

					if(hasMoney(main.price.chickenBuy64)) {

						main.buy(Material.COOKED_CHICKEN, 64, p, main.price.chickenBuy64);

					} else {
						p.sendMessage(main.notHaveMoney);
					}

				}

			}

		} else if(it.getType() == Material.COOKED_FISH) {

			if(it.getItemMeta().getDisplayName().equalsIgnoreCase("Morues")) {

				if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

					if(it.getAmount() == 64) {

						main.sell(Material.COOKED_FISH, 64, p, main.price.moruesSell64, (byte) 0);

					}

				} else if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

					if(it.getAmount() == 64) {

						if(hasMoney(main.price.moruesBuy64)) {

							main.buy(Material.COOKED_FISH, 64, p, main.price.moruesBuy64, (byte) 0);

						} else {
							p.sendMessage(main.notHaveMoney);
						}

					}
				}

			} else if(it.getItemMeta().getDisplayName().equalsIgnoreCase("Saumons")) {

				if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

					if(it.getAmount() == 64) {

						main.sell(Material.COOKED_FISH, 64, p, main.price.saumonsSell64, (byte) 1);

					}

				} else if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

					if(it.getAmount() == 64) {

						if(hasMoney(main.price.saumonsBuy64)) {

							main.buy(Material.COOKED_FISH, 64, p, main.price.saumonsBuy64, (byte) 1);

						} else {
							p.sendMessage(main.notHaveMoney);
						}

					}

				}

			}

		} else if(it.getType() == Material.RAW_FISH) {

			if(it.getItemMeta().getDisplayName().equalsIgnoreCase("Globes")) {

				if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

					if(it.getAmount() == 32) {

						main.sell(Material.RAW_FISH, 32, p, main.price.globesSell32, (byte) 3);

					}

				} else if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

					if(it.getAmount() == 32) {

						if(hasMoney(main.price.globesBuy32)) {

							main.buy(Material.RAW_FISH, 32, p, main.price.globesBuy32, (byte) 3);

						} else {
							p.sendMessage(main.notHaveMoney);
						}

					}

				}

			} else if(it.getItemMeta().getDisplayName().equalsIgnoreCase("Clowns")) {

				if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

					if(it.getAmount() == 16) {

						main.sell(Material.RAW_FISH, 16, p, main.price.clownsSell16, (byte) 2);

					}

				} else if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

					if(it.getAmount() == 16) {

						if(hasMoney(main.price.clownsBuy16)) {

							main.buy(Material.RAW_FISH, 16, p, main.price.clownsBuy16, (byte) 2);

						} else {
							p.sendMessage(main.notHaveMoney);
						}

					}

				}

			}

		} else if(it.getType() == Material.COOKED_RABBIT) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 64) {

					main.sell(Material.COOKED_RABBIT, 64, p, main.price.rabbitSell64);

				}

			} else if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 64) {

					if(hasMoney(main.price.rabbitBuy64)) {

						main.buy(Material.COOKED_RABBIT, 64, p, main.price.rabbitBuy64);

					} else {
						p.sendMessage(main.notHaveMoney);
					}

				}

			}

		} else if(it.getType() == Material.COOKED_MUTTON) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 64) {

					main.sell(Material.COOKED_MUTTON, 64, p, main.price.sheepSell64);

				}

			} else if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 64) {

					if(hasMoney(main.price.sheepBuy64)) {

						main.buy(Material.COOKED_MUTTON, 64, p, main.price.sheepBuy64);

					} else {
						p.sendMessage(main.notHaveMoney);
					}

				}

			}

		} else if(it.getType() == Material.EGG) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 16) {

					main.sell(Material.EGG, 16, p, main.price.eggsSell16);

				}

			} else if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 1) {

					if(hasMoney(main.price.eggsBuy1)) {

						main.buy(Material.EGG, 1, p, main.price.eggsBuy1);

					} else {
						p.sendMessage(main.notHaveMoney);
					}

				}

			}

		} else if(it.getType() == Material.LEATHER) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 64) {

					main.sell(Material.LEATHER, 64, p, main.price.leatherSell64);

				}

			} else if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 1) {

					if(hasMoney(main.price.leatherBuy1)) {

						main.buy(Material.LEATHER, 1, p, main.price.leatherBuy1);

					} else {
						p.sendMessage(main.notHaveMoney);
					}

				}

			}

		} else if(it.getType() == Material.FEATHER) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 64) {

					main.sell(Material.FEATHER, 64, p, main.price.featherSell64);

				}

			} else if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 64) {

					if(hasMoney(main.price.featherBuy64)) {

						main.buy(Material.FEATHER, 64, p, main.price.featherBuy64);

					} else {
						p.sendMessage(main.notHaveMoney);
					}

				}

			}

		} else if(it.getType() == Material.WOOL) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 64) {

					main.sell(Material.WOOL, 64, p, main.price.woolSell64);

				}

			} else if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 1) {

					if(hasMoney(main.price.woolBuy1)) {

						main.buy(Material.WOOL, 1, p, main.price.woolBuy1);

					} else {
						p.sendMessage(main.notHaveMoney);
					}

				}

			}

		} else if(it.getType() == Material.RABBIT_FOOT) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 32) {

					main.sell(Material.RABBIT_FOOT, 32, p, main.price.rabbit_pattesSell32);

				}

			} else if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 32) {

					if(hasMoney(main.price.rabbit_pattesBuy32)) {

						main.buy(Material.RABBIT_FOOT, 32, p, main.price.rabbit_pattesBuy32);

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
