package fr.ismania.survie.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class BazarInteractEvent extends Event {

	private Player p;

	public BazarInteractEvent(Player p) {
		this.p = p;
	}

	public Player getPlayer() {
		return p;
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
