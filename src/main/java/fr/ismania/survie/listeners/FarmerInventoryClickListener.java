package fr.ismania.survie.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;

import fr.ismania.survie.Main;

public class FarmerInventoryClickListener implements Listener {

	private Main main;
	private double money;

	public FarmerInventoryClickListener(Main main) {
		this.main = main;
	}

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onInventoryClick(FarmerInventoryClickEvent e) {

		Player p = e.getPlayer();
		ItemStack it = e.getItem();
		money = main.economy.getBalance(p.getName());

		if(it.getType() == Material.SEEDS) {

			if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 1) {

					if(hasMoney(main.price.wheatseedBuy1)) {

						main.buy(it.getType(), it.getAmount(), p, main.price.wheatseedBuy1);

					} else {
						p.sendMessage(main.notHaveMoney);
					}

				}

			}

		} else if(it.getType() == Material.WHEAT) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 64) {

					main.sell(Material.WHEAT, 64, p, main.price.wheatSell64);

				}

			}

		} else if(it.getType() == Material.POTATO_ITEM) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 64) {

					main.sell(Material.POTATO_ITEM, 64, p, main.price.potatoSell64);

				}

			} else if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 1) {

					if(hasMoney(main.price.potatoBuy1)) {

						main.buy(it.getType(), it.getAmount(), p, main.price.potatoBuy1);

					} else {
						p.sendMessage(main.notHaveMoney);
					}

				}

			}

		} else if(it.getType() == Material.CARROT_ITEM) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 64) {

					main.sell(Material.CARROT_ITEM, 64, p, main.price.carrotSell64);

				}

			} else if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 1) {

					if(hasMoney(main.price.carrotBuy1)) {

						main.buy(it.getType(), it.getAmount(), p, main.price.carrotBuy1);

					} else {
						p.sendMessage(main.notHaveMoney);
					}

				}

			}

		} else if(it.getType() == Material.PUMPKIN) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 32) {

					main.sell(Material.PUMPKIN, 32, p, main.price.pumpkinSell32);

				}

			}

		} else if(it.getType() == Material.PUMPKIN_SEEDS) {

			if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 1) {

					if(hasMoney(main.price.pumpkinSeedBuy1)) {

						main.buy(it.getType(), it.getAmount(), p, main.price.pumpkinSeedBuy1);

					} else {
						p.sendMessage(main.notHaveMoney);
					}

				}

			}

		} else if(it.getType() == Material.MELON) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 32) {

					main.sell(Material.MELON, 32, p, main.price.melonSell32);

				}

			}

		} else if(it.getType() == Material.MELON_SEEDS) {

			if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 1) {

					if(hasMoney(main.price.melonSeedBuy1)) {

						main.buy(it.getType(), it.getAmount(), p, main.price.melonSeedBuy1);

					} else {
						p.sendMessage(main.notHaveMoney);
					}

				}

			}

		} else if(it.getType() == Material.BEETROOT) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 64) {

					main.sell(Material.BEETROOT, 64, p, main.price.beetrootSell64);

				}

			} else if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 1) {

					if(hasMoney(main.price.beetrootBuy1)) {

						main.buy(it.getType(), it.getAmount(), p, main.price.beetrootBuy1);

					} else {
						p.sendMessage(main.notHaveMoney);
					}

				}

			}

		} else if(it.getType() == Material.NETHER_STALK) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 64) {

					main.sell(Material.NETHER_STALK, 64, p, main.price.netherwartSell64);

				}

			} else if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 1) {

					if(hasMoney(main.price.netherwartBuy1)) {

						main.buy(it.getType(), it.getAmount(), p, main.price.netherwartBuy1);

					} else {
						p.sendMessage(main.notHaveMoney);
					}

				}

			}

		} else if(it.getType() == Material.APPLE) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 32) {

					main.sell(Material.APPLE, 32, p, main.price.appleSell32);

				}

			} else if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 1) {

					if(hasMoney(main.price.appleBuy1)) {

						main.buy(it.getType(), it.getAmount(), p, main.price.appleBuy1);

					} else {
						p.sendMessage(main.notHaveMoney);
					}

				}

			}

		} else if(it.getType() == Material.CHORUS_FRUIT_POPPED) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 64) {

					main.sell(Material.CHORUS_FRUIT_POPPED, 64, p, main.price.chorusSell64);

				}

			} else if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 64) {

					if(hasMoney(main.price.chorusBuy64)) {

						main.buy(it.getType(), it.getAmount(), p, main.price.chorusBuy64);

					} else {
						p.sendMessage(main.notHaveMoney);
					}

				}

			}

		} else if(it.getType() == Material.RED_MUSHROOM) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 64) {

					main.sell(Material.RED_MUSHROOM, 64, p, main.price.mushroomSell64);

				}

			} else if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 1) {

					if(hasMoney(main.price.mushroomBuy1)) {

						main.buy(it.getType(), it.getAmount(), p, main.price.mushroomBuy1);

					} else {
						p.sendMessage(main.notHaveMoney);
					}

				}

			}

		} else if(it.getType() == Material.SUGAR_CANE) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 64) {

					main.sell(Material.SUGAR_CANE, 64, p, main.price.suggarcaneSell64);

				}

			} else if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 1) {

					if(hasMoney(main.price.suggarcaneBuy1)) {

						main.buy(it.getType(), it.getAmount(), p, main.price.suggarcaneBuy1);

					} else {
						p.sendMessage(main.notHaveMoney);
					}

				}

			}

		} else if(it.getItemMeta().getDisplayName().equalsIgnoreCase("Fèves de cacao")) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 64) {

					main.sell(Material.INK_SACK, 64, p, main.price.cacaoSell64, (byte) 3);

				}

			} else if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 1) {

					if(hasMoney(main.price.cacaoBuy1)) {

						main.buy(it.getType(), it.getAmount(), p, main.price.cacaoBuy1, (byte) 3);

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
