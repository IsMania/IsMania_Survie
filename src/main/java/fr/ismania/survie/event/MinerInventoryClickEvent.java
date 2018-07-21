package fr.ismania.survie.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;

public class MinerInventoryClickEvent extends Event {

	private Player p;
	private ItemStack it;

	public MinerInventoryClickEvent(Player p, ItemStack it) {
		this.p = p;
		this.it = it;
	}

	public Player getPlayer() {
		return p;
	}

	public ItemStack getItem() {
		return it;
	}

	private static final HandlerList handlers = new HandlerList();

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

}
