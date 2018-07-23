package fr.ismania.survie.utils;

import fr.ismania.survie.Main;

public class PriceShop {

	// Price Butcher
	// Sell
	public double steaksSell64 = getPriceSell64("steaks");
	public double porkSell64 = getPriceSell64("pork");
	public double chickenSell64 = getPriceSell64("chicken");
	public double moruesSell64 = getPriceSell64("morues");
	public double saumonsSell64 = getPriceSell64("saumons");
	public double globesSell32 = getPriceSell32("globes");
	public double clownsSell16 = getPriceSell16("clowns");
	public double rabbitSell64 = getPriceSell64("rabbit");
	public double sheepSell64 = getPriceSell64("sheep");
	public double eggsSell16 = getPriceSell16("eggs");
	public double leatherSell64 = getPriceSell64("cuir");
	public double featherSell64 = getPriceSell64("plume");
	public double woolSell64 = getPriceSell64("wool");
	public double rabbit_pattesSell32 = getPriceSell32("pattes_lapin");
	// Buy
	public double steaksBuy64 = getPriceBuy64("steaks");
	public double porkBuy64 = getPriceBuy64("pork");
	public double chickenBuy64 = getPriceBuy64("chicken");
	public double moruesBuy64 = getPriceBuy64("morues");
	public double saumonsBuy64 = getPriceBuy64("saumons");
	public double globesBuy32 = getPriceBuy32("globes");
	public double clownsBuy16 = getPriceBuy16("clowns");
	public double rabbitBuy64 = getPriceBuy64("rabbit");
	public double sheepBuy64 = getPriceBuy64("sheep");
	public double eggsBuy1 = getPriceBuy1("eggs");
	public double leatherBuy1 = getPriceBuy1("cuir");
	public double featherBuy64 = getPriceBuy64("plume");
	public double woolBuy1 = getPriceBuy1("wool");
	public double rabbit_pattesBuy32 = getPriceBuy32("pattes_lapin");

	// Price Smith
	// Sell
	public double coalBlockSell7 = getPriceSell7("coal");
	public double ironSell8 = getPriceSell8("iron");
	public double redstoneSell32 = getPriceSell32("redstone");
	public double lapisSell32 = getPriceSell32("lapis");
	public double orSell8 = getPriceSell8("or");
	public double diamondSell8 = getPriceSell8("diamond");
	// Buy
	public double coalBlockBuy7 = getPriceBuy7("coal");
	public double ironBuy8 = getPriceBuy8("iron");
	public double redstoneBuy32 = getPriceBuy32("redstone");
	public double lapisBuy32 = getPriceBuy32("lapis");
	public double orBuy8 = getPriceBuy8("or");
	public double diamondBuy8 = getPriceBuy8("diamond");

	// Price Croque-Mort
	// Sell
	public double rottenSell64 = getPriceSell64("rotten");
	public double osSell64 = getPriceSell64("os");
	public double gunpowderSell64 = getPriceSell64("gunpowder");
	public double slimeblockSell16 = getPriceSell16("slimeblock");
	public double blazeRodSell32 = getPriceSell32("blazerod");
	public double enderpearlSell16 = getPriceSell16("enderpearl");
	public double ghastlarmeSell8 = getPriceSell8("larme-ghast");
	public double stringSell64 = getPriceSell64("string");
	public double eyeSell16 = getPriceSell16("eye");
	public double arrowSell64 = getPriceSell64("arrow");
	// Buy
	public double rottenBuy64 = getPriceBuy64("rotten");
	public double osBuy64 = getPriceBuy64("os");
	public double gunpowderBuy64 = getPriceBuy64("gunpowder");
	public double slimeblockBuy16 = getPriceBuy16("slimeblock");
	public double blazeRodBuy1 = getPriceBuy1("blazerod");
	public double enderpearlBuy1 = getPriceBuy1("enderpearl");
	public double ghastlarmeBuy1 = getPriceBuy1("larme-ghast");
	public double stringBuy64 = getPriceBuy64("string");
	public double eyeBuy1 = getPriceBuy1("eye");
	public double arrowBuy64 = getPriceBuy64("arrow");

	// Price Farmer
	// Buy
	public double wheatseedBuy1 = getPriceBuy1("wheat-seed");
	public double potatoBuy1 = getPriceBuy1("potato");
	public double carrotBuy1 = getPriceBuy1("carrot");
	public double pumpkinSeedBuy1 = getPriceBuy1("pumpkin-seed");
	public double melonSeedBuy1 = getPriceBuy1("melon-seed");
	public double beetrootBuy1 = getPriceBuy1("beetroot");
	public double netherwartBuy1 = getPriceBuy1("nether-wart");
	public double appleBuy1 = getPriceBuy1("apple");
	public double chorusBuy64 = getPriceBuy64("chorus");
	public double mushroomBuy1 = getPriceBuy1("mushroom");
	public double suggarcaneBuy1 = getPriceBuy1("sugar-cane");
	public double cacaoBuy1 = getPriceBuy1("cacao");
	public double cactusBuy1 = getPriceBuy1("cactus");
	// Sell
	public double wheatSell64 = getPriceSell64("wheat");
	public double wheatseedSell64 = getPriceSell64("wheat-seed");
	public double potatoSell64 = getPriceSell64("potato");
	public double carrotSell64 = getPriceSell64("carrot");
	public double pumpkinSell32 = getPriceSell32("pumpkin");
	public double melonSell32 = getPriceSell32("melon");
	public double beetrootSell64 = getPriceSell64("beetroot");
	public double netherwartSell64 = getPriceSell64("nether-wart");
	public double appleSell32 = getPriceSell32("apple");
	public double chorusSell64 = getPriceSell64("chorus");
	public double mushroomSell64 = getPriceSell64("mushroom");
	public double suggarcaneSell64 = getPriceSell64("sugar-cane");
	public double cacaoSell64 = getPriceSell64("cacao");
	public double cactusSell64 = getPriceSell64("cactus");

	// Price Miner
	// Buy
	public double graniteBuy64 = getPriceBuy64("granite");
	public double andesiteBuy64 = getPriceBuy64("andesite");
	public double dioriteBuy64 = getPriceBuy64("diorite");
	public double cobbleBuy64 = getPriceBuy64("cobble");
	public double black_concreteBuy32 = getPriceBuy32("black_concrete");
	public double obsidianBuy16 = getPriceBuy16("obsidian");
	public double prismarine_tailleBuy64 = getPriceBuy64("prismarine_taille");
	public double prismarine_sombreBuy64 = getPriceBuy64("prismarine_sombre");
	public double briqueRougeNetherBuy64 = getPriceBuy64("brique_rouge_nether");
	public double packedIceBuy32 = getPriceBuy32("packed_ice");
	public double quartzBlockBuy64 = getPriceBuy64("quartz_block");
	public double magma_cubeBuy64 = getPriceBuy64("magma_cube");
	// Sell
	public double graniteSell64 = getPriceSell64("granite");
	public double andesiteSell64 = getPriceSell64("andesite");
	public double dioriteSell64 = getPriceSell64("diorite");
	public double cobbleSell64 = getPriceSell64("cobble");
	public double black_concreteSell32 = getPriceSell32("black_concrete");
	public double obsidianSell16 = getPriceSell16("obsidian");
	public double prismarine_tailleSell64 = getPriceSell64("prismarine_taille");
	public double prismarine_sombreSell64 = getPriceSell64("prismarine_sombre");
	public double briqueRougeNetherSell64 = getPriceSell64("brique_rouge_nether");
	public double packedIceSell64 = getPriceSell64("packed_ice");
	public double quartzBlockSell64 = getPriceSell64("quartz_block");
	public double magma_cubeSell64 = getPriceSell64("magma_cube");

	// Price Bazar
	// Buy
	public double elytraBuy1 = getPriceBuy1("elytra");
	public double beaconBuy1 = getPriceBuy1("beacon");
	public double xpBottleBuy32 = getPriceBuy32("xp_bottle");
	public double totemBuy1 = getPriceBuy1("totem");
	public double cobwebBuy1 = getPriceBuy1("cobweb");
	public double shulkerboxBuy1 = getPriceBuy1("shulkerbox");
	public double enchantBookThorns3Buy1 = getPriceBuy1("enchant_book_thorns3");
	public double enchantBookMendingBuy1 = getPriceBuy1("enchant_book_mending");
	public double enchantBookLooting3Buy1 = getPriceBuy1("enchant_book_looting3");
	// Sell
	public double elytraSell1 = getPriceSell1("elytra");
	public double beaconSell1 = getPriceSell1("beacon");
	public double nametagSell16 = getPriceSell16("nametag");
	public double disqueSell1 = getPriceSell1("disque");
	public double spongSell8 = getPriceSell8("sponge");
	public double dragonHeadSell1 = getPriceSell1("dragon_head");

	public double getPriceBuy64(String itemName) {

		return Main.getConf().getDouble("price." + itemName + ".64.buy");

	}

	public double getPriceBuy32(String itemName) {

		return Main.getConf().getDouble("price." + itemName + ".32.buy");

	}

	public double getPriceBuy16(String itemName) {

		return Main.getConf().getDouble("price." + itemName + ".16.buy");

	}

	public double getPriceBuy8(String itemName) {

		return Main.getConf().getDouble("price." + itemName + ".8.buy");

	}

	public double getPriceBuy7(String itemName) {

		return Main.getConf().getDouble("price." + itemName + ".7.buy");

	}

	public double getPriceBuy1(String itemName) {

		return Main.getConf().getDouble("price." + itemName + ".1.buy");

	}

	public double getPriceSell64(String itemName) {

		return Main.getConf().getDouble("price." + itemName + ".64.sell");

	}

	public double getPriceSell32(String itemName) {

		return Main.getConf().getDouble("price." + itemName + ".32.sell");

	}

	public double getPriceSell16(String itemName) {

		return Main.getConf().getDouble("price." + itemName + ".16.sell");

	}

	public double getPriceSell8(String itemName) {

		return Main.getConf().getDouble("price." + itemName + ".8.sell");

	}

	public double getPriceSell7(String itemName) {

		return Main.getConf().getDouble("price." + itemName + ".7.sell");

	}

	public double getPriceSell1(String itemName) {

		return Main.getConf().getDouble("price." + itemName + ".1.sell");

	}

}
