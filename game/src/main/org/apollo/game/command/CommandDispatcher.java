package org.apollo.game.command;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apollo.game.command.impl.CreditsCommandListener;
import org.apollo.game.command.impl.HitCommandListener;
import org.apollo.game.command.impl.OpenInterfaceCommandListener;
import org.apollo.game.command.impl.PathCommandListener;
import org.apollo.game.model.entity.Player;

/**
 * A class that dispatches {@link Command}s to {@link CommandListener}s.
 *
 * @author Graham
 */
public final class CommandDispatcher {

	/**
	 * A map of command strings to command listeners.
	 */
	private final Map<String, CommandListener> listeners = new HashMap<>();

	/**
	 * Initialises this CommandDispatcher.
	 *
	 * @param authors The {@link Set} of plugin authors.
	 */
	public void init(Set<String> authors) {
		listeners.put("credits", new CreditsCommandListener(authors));
		listeners.put("hit", new HitCommandListener());
		listeners.put("interface", new OpenInterfaceCommandListener());
		listeners.put("path", new PathCommandListener());
	}

	/**
	 * Dispatches a command to the appropriate listener.
	 *
	 * @param player The player.
	 * @param command The command.
	 */
	public void dispatch(Player player, Command command) {
		CommandListener listener = listeners.get(command.getName().toLowerCase());
		if (listener != null) {
			listener.executePrivileged(player, command);
		}
	}

	/**
	 * Registers a listener with the dispatcher.
	 *
	 * @param command The command's name.
	 * @param listener The listener.
	 */
	public void register(String command, CommandListener listener) {
		listeners.put(command.toLowerCase(), listener);
	}

}