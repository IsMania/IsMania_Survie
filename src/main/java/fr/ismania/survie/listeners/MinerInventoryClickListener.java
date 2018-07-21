package fr.ismania.survie.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;

import fr.ismania.survie.Main;
import fr.ismania.survie.event.MinerInventoryClickEvent;

public class MinerInventoryClickListener implements Listener {

	private Main main;
	private double money;

	public MinerInventoryClickListener(Main main) {
		this.main = main;
	}

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onMinerInventoryClick(MinerInventoryClickEvent e) {

		Player p = e.getPlayer();
		ItemStack it = e.getItem();
		money = main.economy.getBalance(p.getName());

		if(it.getItemMeta().getLore().isEmpty()) return;

		if(it.getType() == Material.STONE) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 64) {

					if(it.getItemMeta().getDisplayName().contains("Granites")) {

						main.sell(Material.STONE, 64, p, main.price.graniteSell64, (byte) 1);

					} else if(it.getItemMeta().getDisplayName().equalsIgnoreCase("Andésites")) {

						main.sell(Material.STONE, 64, p, main.price.andesiteSell64, (byte) 5);

					} else if(it.getItemMeta().getDisplayName().equalsIgnoreCase("Diorites")) {

						main.sell(Material.STONE, 64, p, main.price.dioriteSell64, (byte) 3);

					}

				}

			} else if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 64) {

					if(hasMoney(main.price.andesiteBuy64)) {

						if(it.getItemMeta().getDisplayName().contains("Granites")) {

							main.buy(it.getType(), it.getAmount(), p, main.price.graniteBuy64, (byte) 1);

						} else if(it.getItemMeta().getDisplayName().equalsIgnoreCase("Andésites")) {

							main.buy(it.getType(), it.getAmount(), p, main.price.andesiteBuy64, (byte) 5);

						} else if(it.getItemMeta().getDisplayName().equalsIgnoreCase("Diorites")) {

							main.buy(it.getType(), it.getAmount(), p, main.price.dioriteBuy64, (byte) 3);

						}

					} else {
						p.sendMessage(main.notHaveMoney);
					}

				}

			}

		} else if(it.getType() == Material.COBBLESTONE) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 64) {

					main.sell(Material.COBBLESTONE, 64, p, main.price.cobbleSell64);

				}

			} else if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 64) {

					if(hasMoney(main.price.cobbleBuy64)) {

						main.buy(it.getType(), it.getAmount(), p, main.price.cobbleBuy64);

					} else {
						p.sendMessage(main.notHaveMoney);
					}

				}

			}

		} else if(it.getType() == Material.CONCRETE && it.getItemMeta().getDisplayName().equalsIgnoreCase("Béton noir")) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 32) {

					main.sell(Material.CONCRETE, 32, p, main.price.black_concreteSell32, (byte) 15);

				}

			} else if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 32) {

					if(hasMoney(main.price.black_concreteBuy32)) {

						main.buy(it.getType(), it.getAmount(), p, main.price.black_concreteBuy32, (byte) 15);

					} else {
						p.sendMessage(main.notHaveMoney);
					}

				}

			}

		} else if(it.getType() == Material.OBSIDIAN) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 16) {

					main.sell(Material.OBSIDIAN, 16, p, main.price.obsidianSell16);

				}

			} else if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 16) {

					if(hasMoney(main.price.obsidianBuy16)) {

						main.buy(it.getType(), it.getAmount(), p, main.price.obsidianBuy16);

					} else {
						p.sendMessage(main.notHaveMoney);
					}

				}

			}

		} else if(it.getType() == Material.PRISMARINE) {

			if(it.getItemMeta().getDisplayName().contains("brick")) {

				if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

					if(it.getAmount() == 64) {

						main.sell(Material.PRISMARINE, 64, p, main.price.prismarine_tailleSell64, (byte) 1);

					}

				} else {

					if(it.getAmount() == 64) {

						if(hasMoney(main.price.prismarine_tailleBuy64)) {

							main.buy(it.getType(), it.getAmount(), p, main.price.prismarine_tailleBuy64, (byte) 1);

						} else {
							p.sendMessage(main.notHaveMoney);
						}

					}

				}

			} else if(it.getItemMeta().getDisplayName().contains("sombre")) {

				if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

					if(it.getAmount() == 64) {

						main.sell(Material.PRISMARINE, 64, p, main.price.prismarine_sombreSell64, (byte) 2);

					}

				} else {

					if(it.getAmount() == 64) {

						if(hasMoney(main.price.prismarine_sombreBuy64)) {

							main.buy(it.getType(), it.getAmount(), p, main.price.prismarine_sombreBuy64, (byte) 2);

						} else {
							p.sendMessage(main.notHaveMoney);
						}

					}

				}

			}

		} else if(it.getType() == Material.RED_NETHER_BRICK) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 64) {

					main.sell(Material.RED_NETHER_BRICK, 64, p, main.price.briqueRougeNetherSell64);

				}

			} else if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 64) {

					if(hasMoney(main.price.briqueRougeNetherBuy64)) {

						main.buy(it.getType(), it.getAmount(), p, main.price.briqueRougeNetherBuy64);

					} else {
						p.sendMessage(main.notHaveMoney);
					}

				}

			}

		} else if(it.getType() == Material.PACKED_ICE) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 64) {

					main.sell(Material.PACKED_ICE, 64, p, main.price.packedIceSell64);

				}

			} else if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 32) {

					if(hasMoney(main.price.packedIceBuy32)) {

						main.buy(it.getType(), it.getAmount(), p, main.price.packedIceBuy32);

					} else {
						p.sendMessage(main.notHaveMoney);
					}

				}

			}

		} else if(it.getType() == Material.QUARTZ_BLOCK) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 64) {

					main.sell(Material.QUARTZ_BLOCK, 64, p, main.price.quartzBlockSell64);

				}

			} else if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 64) {

					if(hasMoney(main.price.quartzBlockBuy64)) {

						main.buy(it.getType(), it.getAmount(), p, main.price.quartzBlockBuy64);

					} else {
						p.sendMessage(main.notHaveMoney);
					}

				}

			}

		} else if(it.getType() == Material.MAGMA) {

			if(it.getItemMeta().getLore().get(0).contains("Vendre")) {

				if(it.getAmount() == 64) {

					main.sell(Material.MAGMA, 64, p, main.price.magma_cubeSell64);

				}

			} else if(it.getItemMeta().getLore().get(0).contains("Acheter")) {

				if(it.getAmount() == 64) {

					if(hasMoney(main.price.magma_cubeBuy64)) {

						main.buy(it.getType(), it.getAmount(), p, main.price.magma_cubeBuy64);

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
