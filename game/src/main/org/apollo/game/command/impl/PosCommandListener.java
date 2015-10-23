package org.apollo.game.command.impl;

import org.apollo.game.command.Command;
import org.apollo.game.command.CommandListener;
import org.apollo.game.model.Position;
import org.apollo.game.model.entity.Player;
import org.apollo.game.model.entity.WalkingQueue;
import org.apollo.game.model.entity.path.AStarPathfindingAlgorithm;
import org.apollo.game.model.entity.path.ManhattanHeuristic;

import java.util.Deque;

/**
 * Created by Corsair on 10/3/2015.
 */
public class PosCommandListener extends CommandListener {
	@Override
	public void execute(Player player, Command command) {
		player.sendMessage("x: " + player.getPosition().getX() + ", y: " + player.getPosition().getY() + ", height: " + player.getPosition().getHeight());
	}
}
