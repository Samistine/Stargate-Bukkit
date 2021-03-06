package net.TheDgtl.Stargate.event;

import org.bukkit.event.HandlerList;

import net.TheDgtl.Stargate.Portal;

/**
 * Stargate - A portal plugin for Bukkit Copyright (C) 2011, 2012 Steven
 * "Drakia" Scott <a href="mailto:Contact@TheDgtl.net">Contact@TheDgtl.net</a>
 *
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. If not, see <a href="http://www.gnu.org/licenses/">http://www.gnu.org/licenses/</a>.
 */
public class StargateDeactivateEvent extends StargateEvent {

    private static final HandlerList handlers = new HandlerList();

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public StargateDeactivateEvent(Portal portal) {
        super("StargatDeactivateEvent", portal);

    }
}
