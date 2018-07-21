package fr.ismania.survie.listeners;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import fr.ismania.survie.Main;
import fr.ismania.survie.event.BazarInteractEvent;
import fr.ismania.survie.event.ButcherInteractEvent;
import fr.ismania.survie.event.CroqueMortInteractEvent;
import fr.ismania.survie.event.FarmerInteractEvent;
import fr.ismania.survie.event.MinerInteractEvent;
import fr.ismania.survie.event.SmithInteractEvent;
import fr.ismania.survie.utils.PriceShop;

public class PlayerInteractListener implements Listener {

	private Main main;
	private PriceShop price;

	public PlayerInteractListener(Main main) {
		this.main = main;
		price = main.price;
	}

	@EventHandler
	public void onInteract(PlayerInteractAtEntityEvent e) {

		String entName = e.getRightClicked().getName();

		if(entName.equalsIgnoreCase("§cBoucher")) {

			ButcherInteractEvent bInteractE = new ButcherInteractEvent(e.getPlayer());
			Bukkit.getPluginManager().callEvent(bInteractE);

		} else if(entName.equalsIgnoreCase("§bForgeron")) {

			SmithInteractEvent sInteractE = new SmithInteractEvent(e.getPlayer());
			Bukkit.getPluginManager().callEvent(sInteractE);

		} else if(entName.equalsIgnoreCase("§0Croque-Mort")) {

			CroqueMortInteractEvent cMIE = new CroqueMortInteractEvent(e.getPlayer());
			Bukkit.getPluginManager().callEvent(cMIE);

		} else if(entName.equalsIgnoreCase("§aAgriculteur")) {

			FarmerInteractEvent fIE = new FarmerInteractEvent(e.getPlayer());
			Bukkit.getPluginManager().callEvent(fIE);

		} else if(entName.equalsIgnoreCase("§6Mineur")) {

			MinerInteractEvent mIE = new MinerInteractEvent(e.getPlayer());
			Bukkit.getPluginManager().callEvent(mIE);

		} else if(entName.equalsIgnoreCase("§cB§ba§0z§aa§6r")) {

			BazarInteractEvent bIE = new BazarInteractEvent(e.getPlayer());
			Bukkit.getPluginManager().callEvent(bIE);

		}

	}

	@EventHandler
	public void onInteractButcher(ButcherInteractEvent e) {

		Player p = e.getPlayer();

		Inventory inv = Bukkit.createInventory(null, 54, "§cBoucher");

		inv.setItem(4, createItemGlass(Material.STAINED_GLASS_PANE, (byte) 0, " "));
		inv.setItem(13, createItemGlass(Material.STAINED_GLASS_PANE, (byte) 0, " "));
		inv.setItem(22, createItemGlass(Material.STAINED_GLASS_PANE, (byte) 0, " "));
		inv.setItem(31, createItemGlass(Material.STAINED_GLASS_PANE, (byte) 0, " "));
		inv.setItem(40, createItemGlass(Material.STAINED_GLASS_PANE, (byte) 0, " "));
		inv.setItem(49, createItemGlass(Material.STAINED_GLASS_PANE, (byte) 0, " "));

		inv.setItem(9, createItem(Material.COOKED_BEEF, 64, "Steaks", "§bVendre", "§aRaporte : §6" + price.steaksSell64 + main.maniaz));
		inv.setItem(18, createItem(Material.GRILLED_PORK, 64, "Porcs", "§bVendre", "§aRaporte : §6" + price.porkSell64 + main.maniaz));
		inv.setItem(27, createItem(Material.COOKED_CHICKEN, 64, "Poulets", "§bVendre", "§aRaporte : §6" + price.chickenSell64 + main.maniaz));
		inv.setItem(36, createItem(Material.COOKED_FISH, 64, "Morues", "§bVendre", "§aRaporte : §6" + price.moruesSell64 + main.maniaz));
		inv.setItem(10, createItem(Material.COOKED_FISH, 64, (byte) 1, "Saumons", "§bVendre", "§aRaporte : §6" + price.saumonsSell64 + main.maniaz));
		inv.setItem(19, createItem(Material.RAW_FISH, 32, (byte) 3, "Globes", "§bVendre", "§aRaporte : §6" + price.globesSell32 + main.maniaz));
		inv.setItem(28, createItem(Material.RAW_FISH, 16, (byte) 2, "Clowns", "§bVendre", "§aRaporte : §6" + price.clownsSell16 + main.maniaz));
		inv.setItem(37, createItem(Material.COOKED_RABBIT, 64, "Lapins", "§bVendre", "§aRaporte : §6" + price.rabbitSell64 + main.maniaz));
		inv.setItem(11, createItem(Material.COOKED_MUTTON, 64, "Moutons", "§bVendre", "§aRapporte : §6" + price.sheepSell64 + main.maniaz));
		inv.setItem(20, createItem(Material.EGG, 16, "Oeufs", "§bVendre", "§aRapporte : §6" + price.eggsSell16 + main.maniaz));
		inv.setItem(29, createItem(Material.LEATHER, 64, "Cuirs", "§bVendre", "§aRapporte : §6" + price.leatherSell64 + main.maniaz));
		inv.setItem(38, createItem(Material.FEATHER, 64, "Plumes", "§bVendre", "§aRapporte : §6" + price.featherSell64 + main.maniaz));
		inv.setItem(12, createItem(Material.WOOL, 64, "Laines", "§bVendre", "§aRapporte : §6" + price.woolSell64 + main.maniaz));
		inv.setItem(21, createItem(Material.RABBIT_FOOT, 32, "Pattes de lapins", "§bVendre", "§aRapporte : §6" + price.rabbit_pattesSell32 + main.maniaz));

		inv.setItem(14, createItem(Material.COOKED_BEEF, 64, "Steaks", "§eAcheter", "§cCoûte : §6" + price.steaksBuy64 + main.maniaz));
		inv.setItem(23, createItem(Material.GRILLED_PORK, 64, "Porcs", "§eAcheter", "§cCoûte : §6" + price.porkBuy64 + main.maniaz));
		inv.setItem(32, createItem(Material.COOKED_CHICKEN, 64, "Poulets", "§eAcheter", "§cCoûte : §6" + price.chickenBuy64 + main.maniaz));
		inv.setItem(41, createItem(Material.COOKED_FISH, 64, "Morues", "§eAcheter", "§cCoûte : §6" + price.moruesBuy64 + main.maniaz));
		inv.setItem(15, createItem(Material.COOKED_FISH, 64, (byte) 1, "Saumons", "§eAcheter", "§cCoûte : §6" + price.saumonsBuy64 + main.maniaz));
		inv.setItem(24, createItem(Material.RAW_FISH, 32, (byte) 3, "Globes", "§eAcheter", "§cCoûte : §6" + price.globesBuy32 + main.maniaz));
		inv.setItem(33, createItem(Material.RAW_FISH, 16, (byte) 2, "Clowns", "§eAcheter", "§cCoûte : §6" + price.clownsBuy16 + main.maniaz));
		inv.setItem(42, createItem(Material.COOKED_RABBIT, 64, "Lapins", "§eAcheter", "§cRaporte : §6" + price.rabbitBuy64 + main.maniaz));
		inv.setItem(16, createItem(Material.COOKED_MUTTON, 64, "Moutons", "§eAcheter", "§cCoûte : §6" + price.sheepBuy64 + main.maniaz));
		inv.setItem(25, createItem(Material.EGG, 1, "Oeufs", "§eAcheter", "§cCoûte : §6" + price.eggsBuy1 + main.maniaz));
		inv.setItem(34, createItem(Material.LEATHER, 1, "Cuirs", "§eAcheter", "§cCoûte : §6" + price.leatherBuy1 + main.maniaz));
		inv.setItem(43, createItem(Material.FEATHER, 64, "Plumes", "§eAcheter", "§cCoûte : §6" + price.featherBuy64 + main.maniaz));
		inv.setItem(17, createItem(Material.WOOL, 1, "Laines", "§eAcheter", "§cCoûte : §6" + price.woolBuy1 + main.maniaz));
		inv.setItem(26, createItem(Material.RABBIT_FOOT, 32, "Pattes de lapins", "§eAcheter", "§aCoûte : §6" + price.rabbit_pattesBuy32 + main.maniaz));

		p.openInventory(inv);

	}

	@EventHandler
	public void onInteractSmith(SmithInteractEvent e) {

		Player p = e.getPlayer();

		Inventory inv = Bukkit.createInventory(null, 54, "§bForgeron");

		inv.setItem(4, createItemGlass(Material.STAINED_GLASS_PANE, (byte) 0, " "));
		inv.setItem(13, createItemGlass(Material.STAINED_GLASS_PANE, (byte) 0, " "));
		inv.setItem(22, createItemGlass(Material.STAINED_GLASS_PANE, (byte) 0, " "));
		inv.setItem(31, createItemGlass(Material.STAINED_GLASS_PANE, (byte) 0, " "));
		inv.setItem(40, createItemGlass(Material.STAINED_GLASS_PANE, (byte) 0, " "));
		inv.setItem(49, createItemGlass(Material.STAINED_GLASS_PANE, (byte) 0, " "));

		inv.setItem(10, createItem(Material.COAL_BLOCK, 7, "Blocs de charbons", "§bVendre", "§aRaporte : §6" + price.coalBlockSell7 + main.maniaz));
		inv.setItem(19, createItem(Material.IRON_INGOT, 8, "Fers", "§bVendre", "§aRaporte : §6" + price.ironSell8 + main.maniaz));
		inv.setItem(28, createItem(Material.REDSTONE, 32, "Redstones", "§bVendre", "§aRaporte : §6" + price.redstoneSell32 + main.maniaz));
		inv.setItem(37, createItem(Material.INK_SACK, 32, (byte) 4, "Lapis", "§bVendre", "§aRaporte : §6" + price.lapisSell32 + main.maniaz));
		inv.setItem(12, createItem(Material.GOLD_INGOT, 8, "Ors", "§bVendre", "§aRaporte : §6" + price.orSell8 + main.maniaz));
		inv.setItem(21, createItem(Material.DIAMOND, 8, "Diamants", "§bVendre", "§aRaporte : §6" + price.diamondSell8 + main.maniaz));

		inv.setItem(14, createItem(Material.COAL_BLOCK, 7, "Blocs de charbons", "§eAcheter", "§cCoûte : §6" + price.coalBlockBuy7 + main.maniaz));
		inv.setItem(23, createItem(Material.IRON_INGOT, 8, "Fers", "§eAcheter", "§cCoûte : §6" + price.ironBuy8 + main.maniaz));
		inv.setItem(32, createItem(Material.REDSTONE, 32, "Redstones", "§eAcheter", "§cCoûte : §6" + price.redstoneBuy32 + main.maniaz));
		inv.setItem(41, createItem(Material.INK_SACK, 32, (byte) 4, "Lapis", "§eAcheter", "§cCoûte : §6" + price.lapisBuy32 + main.maniaz));
		inv.setItem(16, createItem(Material.GOLD_INGOT, 8, "Ors", "§eAcheter", "§cCoûte : §6" + price.orBuy8 + main.maniaz));
		inv.setItem(25, createItem(Material.DIAMOND, 8, "Diamants", "§eAcheter", "§cCoûte : §6" + price.diamondBuy8 + main.maniaz));

		p.openInventory(inv);

	}

	@EventHandler
	public void onFarmerInteract(FarmerInteractEvent e) {

		Player p = e.getPlayer();

		Inventory inv = Bukkit.createInventory(null, 54, "§aAgriculteur");

		inv.setItem(4, createItemGlass(Material.STAINED_GLASS_PANE, (byte) 0, " "));
		inv.setItem(13, createItemGlass(Material.STAINED_GLASS_PANE, (byte) 0, " "));
		inv.setItem(22, createItemGlass(Material.STAINED_GLASS_PANE, (byte) 0, " "));
		inv.setItem(31, createItemGlass(Material.STAINED_GLASS_PANE, (byte) 0, " "));
		inv.setItem(40, createItemGlass(Material.STAINED_GLASS_PANE, (byte) 0, " "));
		inv.setItem(49, createItemGlass(Material.STAINED_GLASS_PANE, (byte) 0, " "));

		inv.setItem(10, createItem(Material.WHEAT, 64, "Blés", "§bVendre", "§aRaporte : §6" + price.wheatSell64 + main.maniaz));
		inv.setItem(19, createItem(Material.POTATO_ITEM, 64, "Patates", "§bVendre", "§aRapporte : §6" + price.potatoSell64 + main.maniaz));
		inv.setItem(28, createItem(Material.CARROT_ITEM, 64, "Carottes", "§bVendre", "§aRapporte : §6" + price.carrotSell64 + main.maniaz));
		inv.setItem(37, createItem(Material.PUMPKIN, 32, "Citrouilles", "§bVendre", "§aRapporte : §6" + price.pumpkinSell32 + main.maniaz));
		inv.setItem(11, createItem(Material.MELON, 32, "Pastèques", "§bVendre", "§aRapporte : §6" + price.melonSell32 + main.maniaz));
		inv.setItem(20, createItem(Material.BEETROOT, 64, "Bettraves", "§bVendre", "§aRapporte : §6" + price.beetrootSell64 + main.maniaz));
		inv.setItem(29, createItem(Material.NETHER_STALK, 64, "Verrues du nether", "§bVendre", "§aRapporte : §6" + price.netherwartSell64 + main.maniaz));
		inv.setItem(38, createItem(Material.APPLE, 32, "Pommes", "§bVendre", "§aRapporte : §6" + price.appleSell32 + main.maniaz));
		inv.setItem(12, createItem(Material.CHORUS_FRUIT_POPPED, 64, "Chorus éclatés", "§bVendre", "§aRapporte : §6" + price.chorusSell64 + main.maniaz));
		inv.setItem(21, createItem(Material.RED_MUSHROOM, 64, "Champignions", "§bVendre", "§aRapporte : §6" + price.mushroomSell64 + main.maniaz));
		inv.setItem(30, createItem(Material.SUGAR_CANE, 64, "Canne à sucre", "§bVendre", "§aRapporte : §6" + price.suggarcaneSell64 + main.maniaz));
		inv.setItem(39, createItem(Material.INK_SACK, 64, (byte) 3, "Fèves de cacao", "§bVendre", "§aRapporte : §6" + price.cacaoSell64 + main.maniaz));

		inv.setItem(14, createItem(Material.SEEDS, 1, "Graînes", "§eAcheter", "§cCoûte : §6" + price.wheatseedBuy1 + main.maniaz));
		inv.setItem(23, createItem(Material.POTATO_ITEM, 1, "Patates", "§eAcheter", "§cCoûte : §6" + price.potatoBuy1 + main.maniaz));
		inv.setItem(32, createItem(Material.CARROT_ITEM, 1, "Carottes", "§eAcheter", "§cCoûte : §6" + price.carrotBuy1 + main.maniaz));
		inv.setItem(41, createItem(Material.PUMPKIN_SEEDS, 1, "Graînes de citrouilles", "§eAcheter", "§cCoûte : §6" + price.pumpkinSeedBuy1 + main.maniaz));
		inv.setItem(15, createItem(Material.MELON_SEEDS, 1, "Graînes de pastèques", "§eAcheter", "§cCoûte : §6" + price.melonSeedBuy1 + main.maniaz));
		inv.setItem(24, createItem(Material.BEETROOT, 1, "Bettraves", "§eAcheter", "§cCoûte : §6" + price.beetrootBuy1 + main.maniaz));
		inv.setItem(33, createItem(Material.NETHER_STALK, 1, "Verrues du nether", "§eAcheter", "§cCoûte : §6" + price.netherwartBuy1 + main.maniaz));
		inv.setItem(42, createItem(Material.APPLE, 1, "Pommes", "§eAcheter", "§cCoûte : §6" + price.appleBuy1 + main.maniaz));
		inv.setItem(16, createItem(Material.CHORUS_FRUIT_POPPED, 64, "Chorus éclatés", "§eAcheter", "§cCoûte : §6" + price.chorusBuy64 + main.maniaz));
		inv.setItem(25, createItem(Material.RED_MUSHROOM, 1, "Champignions", "§eAcheter", "§cCoûte : §6" + price.mushroomBuy1 + main.maniaz));
		inv.setItem(34, createItem(Material.SUGAR_CANE, 1, "Canne à sucre", "§eAcheter", "§cCoûte : §6" + price.suggarcaneBuy1 + main.maniaz));
		inv.setItem(43, createItem(Material.INK_SACK, 1, (byte) 3, "Fèves de cacao", "§eAcheter", "§cCoûte : §6" + price.cacaoBuy1 + main.maniaz));

		p.openInventory(inv);

	}

	@EventHandler
	public void onMinerInteract(MinerInteractEvent e) {

		Player p = e.getPlayer();

		Inventory inv = Bukkit.createInventory(null, 54, "§6Mineur");

		inv.setItem(4, createItemGlass(Material.STAINED_GLASS_PANE, (byte) 0, " "));
		inv.setItem(13, createItemGlass(Material.STAINED_GLASS_PANE, (byte) 0, " "));
		inv.setItem(22, createItemGlass(Material.STAINED_GLASS_PANE, (byte) 0, " "));
		inv.setItem(31, createItemGlass(Material.STAINED_GLASS_PANE, (byte) 0, " "));
		inv.setItem(40, createItemGlass(Material.STAINED_GLASS_PANE, (byte) 0, " "));
		inv.setItem(49, createItemGlass(Material.STAINED_GLASS_PANE, (byte) 0, " "));

		inv.setItem(10, createItem(Material.STONE, 64, (byte) 1, "Granites", "§bVendre", "§aRapporte : §6" + price.graniteSell64 + main.maniaz));
		inv.setItem(19, createItem(Material.STONE, 64, (byte) 5, "Andésites", "§bVendre", "§aRapporte : §6" + price.andesiteSell64 + main.maniaz));
		inv.setItem(28, createItem(Material.STONE, 64, (byte) 3, "Diorites", "§bVendre", "§aRapporte : §6" + price.dioriteSell64 + main.maniaz));
		inv.setItem(37, createItem(Material.COBBLESTONE, 64, "Cobbles", "§bVendre", "§aRapporte : §6" + price.cobbleSell64 + main.maniaz));
		inv.setItem(11, createItem(Material.CONCRETE, 32, (byte) 15, "Béton noir", "§bVendre", "§aRapporte : §6" + price.black_concreteSell32 + main.maniaz));
		inv.setItem(20, createItem(Material.OBSIDIAN, 16, "Obsidiennes", "§bVendre", "§aRapporte : §6" + price.obsidianSell16 + main.maniaz));
		inv.setItem(29, createItem(Material.PRISMARINE, 64, (byte) 1, "Prismarine brick", "§bVendre", "§aRapporte : §6" + price.prismarine_tailleSell64 + main.maniaz));
		inv.setItem(38, createItem(Material.PRISMARINE, 64, (byte) 2, "Prismarine sombre", "§bVendre", "§aRapporte : §6" + price.prismarine_sombreSell64 + main.maniaz));
		inv.setItem(12, createItem(Material.RED_NETHER_BRICK, 64, "Brique rouge du nether", "§bVendre", "§aRapporte : §6" + price.briqueRougeNetherSell64 + main.maniaz));
		inv.setItem(21, createItem(Material.PACKED_ICE, 64, "Glaces compactées", "§bVendre", "§aRapporte : §6" + price.packedIceSell64 + main.maniaz));
		inv.setItem(30, createItem(Material.QUARTZ_BLOCK, 64, "Block de quartz", "§bVendre", "§aRapporte : §6" + price.quartzBlockSell64 + main.maniaz));
		inv.setItem(39, createItem(Material.MAGMA, 64, "Cube de magma", "§bVendre", "§aRapporte : §6" + price.magma_cubeSell64 + main.maniaz));

		inv.setItem(14, createItem(Material.STONE, 64, (byte) 1, "Granites", "§eAcheter", "§cCoûte : §6" + price.graniteBuy64 + main.maniaz));
		inv.setItem(23, createItem(Material.STONE, 64, (byte) 5, "Andésites", "§eAcheter", "§cCoûte : §6" + price.andesiteBuy64 + main.maniaz));
		inv.setItem(32, createItem(Material.STONE, 64, (byte) 3, "Diorites", "§eAcheter", "§cCoûte : §6" + price.dioriteBuy64 + main.maniaz));
		inv.setItem(41, createItem(Material.COBBLESTONE, 64, "Cobbles", "§eAcheter", "§cCoûte : §6" + price.cobbleBuy64 + main.maniaz));
		inv.setItem(15, createItem(Material.CONCRETE, 32, (byte) 15, "Béton noir", "§eAcheter", "§cCoûte : §6" + price.black_concreteBuy32 + main.maniaz));
		inv.setItem(24, createItem(Material.OBSIDIAN, 16, "Obsidiennes", "§eAcheter", "§cCoûte : §6" + price.obsidianBuy16 + main.maniaz));
		inv.setItem(33, createItem(Material.PRISMARINE, 64, (byte) 1, "Prismarine brick", "§eAcheter", "§cCoûte : §6" + price.prismarine_tailleBuy64 + main.maniaz));
		inv.setItem(42, createItem(Material.PRISMARINE, 64, (byte) 2, "Prismarine sombre", "§eAcheter", "§cCoûte : §6" + price.prismarine_sombreBuy64 + main.maniaz));
		inv.setItem(16, createItem(Material.RED_NETHER_BRICK, 64, "Brique rouge du nether", "§eAcheter", "§cCoûte : §6" + price.briqueRougeNetherBuy64 + main.maniaz));
		inv.setItem(25, createItem(Material.PACKED_ICE, 32, "Glaces compactées", "§eAcheter", "§cCoûte : §6" + price.packedIceBuy32 + main.maniaz));
		inv.setItem(34, createItem(Material.QUARTZ_BLOCK, 64, "Block de quartz", "§eAcheter", "§cCoûte : §6" + price.quartzBlockBuy64 + main.maniaz));
		inv.setItem(43, createItem(Material.MAGMA, 64, "Cube de magma", "§eAcheter", "§cCoûte : §6" + price.magma_cubeBuy64 + main.maniaz));

		p.openInventory(inv);

	}

	@EventHandler
	public void onBazarInteract(BazarInteractEvent e) {

		Player p = e.getPlayer();

		Inventory inv = Bukkit.createInventory(null, 54, "§cB§ba§0z§aa§6r");

		inv.setItem(4, createItemGlass(Material.STAINED_GLASS_PANE, (byte) 0, " "));
		inv.setItem(13, createItemGlass(Material.STAINED_GLASS_PANE, (byte) 0, " "));
		inv.setItem(22, createItemGlass(Material.STAINED_GLASS_PANE, (byte) 0, " "));
		inv.setItem(31, createItemGlass(Material.STAINED_GLASS_PANE, (byte) 0, " "));
		inv.setItem(40, createItemGlass(Material.STAINED_GLASS_PANE, (byte) 0, " "));
		inv.setItem(49, createItemGlass(Material.STAINED_GLASS_PANE, (byte) 0, " "));

		inv.setItem(10, createItem(Material.ELYTRA, 1, "Elytra", "§bVendre", "§aRaporte : §6" + price.elytraSell1 + main.maniaz));
		inv.setItem(19, createItem(Material.BEACON, 1, "Beacon", "§bVendre", "§aRaporte : §6" + price.beaconSell1 + main.maniaz));
		inv.setItem(28, createItem(Material.NAME_TAG, 16, "Name tag", "§bVendre", "§aRaporte : §6" + price.nametagSell16 + main.maniaz));
		inv.setItem(37, createItem(Material.RECORD_8, 1, "Disque", "§bVendre", "§aRaporte : §6" + price.disqueSell1 + main.maniaz));
		inv.setItem(11, createItem(Material.SPONGE, 8, "Eponges", "§bVendre", "§aRaporte : §6" + price.spongSell8 + main.maniaz));
		inv.setItem(20, createSkull(Material.SKULL, "Tête de l'ender dragon", "§bVendre", "§aRaporte : §6" + price.dragonHeadSell1 + main.maniaz));

		inv.setItem(14, createItem(Material.ELYTRA, 1, "Elytra", "§eAcheter", "§cCoûte : §6" + price.elytraBuy1 + main.maniaz));
		inv.setItem(23, createItem(Material.BEACON, 1, "Beacon", "§eAcheter", "§cCoûte : §6" + price.beaconBuy1 + main.maniaz));
		inv.setItem(32, createItem(Material.ENDER_PORTAL_FRAME, 1, "Ender portal", "§eAcheter", "§cCoûte : §6" + price.enderPortalBuy1 + main.maniaz));
		inv.setItem(41, createItem(Material.EXP_BOTTLE, 32, "Bouteilles d'xp", "§eAcheter", "§cCoûte : §6" + price.xpBottleBuy32 + main.maniaz));
		inv.setItem(15, createItem(Material.TOTEM, 1, "Totem d'immortalité", "§eAcheter", "§cCoûte : §6" + price.totemBuy1 + main.maniaz));
		inv.setItem(24, createItem(Material.WEB, 1, "Toile d'araignée", "§eAcheter", "§cCoûte : §6" + price.cobwebBuy1 + main.maniaz));
		inv.setItem(33, createItem(Material.PURPLE_SHULKER_BOX, 1, "Shulkerbox", "§eAcheter", "§cCoûte : §6" + price.shulkerboxBuy1 + main.maniaz));

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

	public ItemStack createSkull(Material material, String name, String lore1, String lore2) {

		ItemStack it = new ItemStack(Material.SKULL_ITEM, 1, (byte) 5);
		SkullMeta skullM = (SkullMeta) it.getItemMeta();
		skullM.setDisplayName(name);
		skullM.setLore(Arrays.asList(lore1, lore2));
		skullM.setOwner("dragon_head");
		it.setItemMeta(skullM);

		return it;

	}

	public ItemStack createEnchantedBook(Enchantment ench, int level, String name, String lore1, String lore2) {

		ItemStack it = new ItemStack(Material.ENCHANTED_BOOK, 1);
		ItemMeta itm = it.getItemMeta();
		itm.setDisplayName(name);
		itm.addEnchant(ench, level, false);
		it.setItemMeta(itm);

		return it;

	}

}
