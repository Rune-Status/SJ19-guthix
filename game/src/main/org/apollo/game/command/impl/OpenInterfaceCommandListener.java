package org.apollo.game.command.impl;

import org.apollo.game.command.Command;
import org.apollo.game.command.CommandListener;
import org.apollo.game.model.entity.Player;

/**
 * Created by Corsair on 10/3/2015.
 */
public class OpenInterfaceCommandListener extends CommandListener {
	@Override
	public void execute(Player player, Command command) {
		player.getInterfaceSet().openWindow(5000);
	}
}
