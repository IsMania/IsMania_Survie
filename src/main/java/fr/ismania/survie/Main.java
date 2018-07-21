package fr.ismania.survie;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

import fr.ismania.survie.listeners.BazarInventoryClickListener;
import fr.ismania.survie.listeners.ButcherInventoryClickListener;
import fr.ismania.survie.listeners.CroqueMortInteractListener;
import fr.ismania.survie.listeners.CroqueMortInventoryClickListener;
import fr.ismania.survie.listeners.FarmerInventoryClickListener;
import fr.ismania.survie.listeners.ForgeronInventoryClickListener;
import fr.ismania.survie.listeners.MinerInventoryClickListener;
import fr.ismania.survie.listeners.PlayerInteractListener;
import fr.ismania.survie.listeners.PlayerInventoryListener;
import fr.ismania.survie.utils.PriceShop;
import net.milkbowl.vault.economy.Economy;

public class Main extends JavaPlugin {

	public String prefix;
	public String maniaz;
	public String notHaveMoney;
	public String notHaveItem;
	public Economy economy;

	public PriceShop price;

	private static FileConfiguration fileConf;

	@Override
	public void onEnable() {

		saveDefaultConfig();

		fileConf = getConfig();

		prefix = getConfig().getString("options.prefix").replaceAll("&", "§");
		maniaz = " " + getConfig().getString("options.maniaz").replaceAll("&", "§");
		price = new PriceShop();
		notHaveMoney = getConfig().getString("options.notHaveMoney").replaceAll("&", "§");
		notHaveItem = getConfig().getString("options.notHaveItem").replaceAll("&", "§");

		setupEconomy();

		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new PlayerInteractListener(this), this);
		pm.registerEvents(new PlayerInventoryListener(this), this);
		pm.registerEvents(new ButcherInventoryClickListener(this), this);
		pm.registerEvents(new ForgeronInventoryClickListener(this), this);
		pm.registerEvents(new CroqueMortInteractListener(this), this);
		pm.registerEvents(new CroqueMortInventoryClickListener(this), this);
		pm.registerEvents(new FarmerInventoryClickListener(this), this);
		pm.registerEvents(new MinerInventoryClickListener(this), this);
		pm.registerEvents(new BazarInventoryClickListener(this), this);

		getLogger().info("Plugin survie activé !");

	}

	@Override
	public void onDisable() {

		getLogger().info("Plugin survie désactivé !");

	}

	public static FileConfiguration getConf() {
		return fileConf;
	}

	public void sell(Material material, int amount, Player p, double price) {

		if(p.getInventory().contains(material, amount)) {

			if(!setupEconomy()) {
				p.sendMessage("§cUne erreur est survenue !");
			}

			economy.depositPlayer(p, price);

			p.getInventory().removeItem(new ItemStack(material, amount));
			p.sendMessage("§a+ §6" + price + maniaz);

		} else {
			p.sendMessage(notHaveItem);
		}

	}

	public void sell(Material material, int amount, Player p, double price, byte data) {

		if(p.getInventory().containsAtLeast(new ItemStack(material, 1, data), amount)) {

			if(!setupEconomy()) {
				p.sendMessage("§cUne erreur est survenue !");
			}

			economy.depositPlayer(p, price);

			p.getInventory().removeItem(new ItemStack(material, amount, data));
			p.sendMessage("§a+ §6" + price + maniaz);

		} else {
			p.sendMessage(notHaveItem);
		}

	}

	public void buy(Material material, int amount, Player p, double price) {

		if(!setupEconomy()) {
			p.sendMessage("§cUne erreur est survenue !");
		}

		economy.withdrawPlayer(p, price);

		p.getInventory().addItem(new ItemStack(material, amount));
		p.sendMessage("§c- §6" + price + maniaz);

	}

	public void buy(Material material, int amount, Player p, double price, byte data) {

		if(!setupEconomy()) {
			p.sendMessage("§cUne erreur est survenue !");
		}

		economy.withdrawPlayer(p, price);

		p.getInventory().addItem(new ItemStack(material, amount, data));
		p.sendMessage("§c- §6" + price + maniaz);

	}

	private boolean setupEconomy() {
		RegisteredServiceProvider<Economy> economyProvider = getServer().getServicesManager().getRegistration(net.milkbowl.vault.economy.Economy.class);
		if(economyProvider != null) {
			economy = economyProvider.getProvider();
		}

		return (economy != null);
	}

}
