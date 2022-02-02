package dev.norska.clt.api;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class CLTIntervalChangeEvent extends Event implements Cancellable {
    private boolean isCancelled;
    private static final HandlerList HANDLERS;
    
    private int interval;
    
    static {
        HANDLERS = new HandlerList();
    }
    
    public CLTIntervalChangeEvent(int interval) {
        this.isCancelled = false;
        this.interval = interval;
    }
    
    public boolean isCancelled() {
        return this.isCancelled;
    }
    
    public void setCancelled(final boolean isCancelled) {
        this.isCancelled = isCancelled;
    }
    
    public void setInterval(int interval) {
    	this.interval = interval;
    }
    
    public int getInterval() {
    	return this.interval;
    }
    
    public HandlerList getHandlers() {
        return CLTIntervalChangeEvent.HANDLERS;
    }
    
    public static HandlerList getHandlerList() {
        return CLTIntervalChangeEvent.HANDLERS;
    }
}
