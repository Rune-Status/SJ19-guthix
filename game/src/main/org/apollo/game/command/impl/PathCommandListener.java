package org.apollo.game.command.impl;

import org.apollo.game.command.Command;
import org.apollo.game.command.CommandListener;
import org.apollo.game.model.Position;
import org.apollo.game.model.entity.Player;
import org.apollo.game.model.entity.WalkingQueue;
import org.apollo.game.model.entity.path.AStarPathfindingAlgorithm;
import org.apollo.game.model.entity.path.ChebyshevHeuristic;
import org.apollo.game.model.entity.path.ManhattanHeuristic;

import java.util.Deque;

/**
 * Created by Corsair on 10/3/2015.
 */
public class PathCommandListener extends CommandListener {
	@Override
	public void execute(Player player, Command command) {
		AStarPathfindingAlgorithm algorithm = new AStarPathfindingAlgorithm(player.getWorld().getRegionRepository(), new ManhattanHeuristic());
		Deque<Position> positions = algorithm.find(player.getPosition(), new Position(3333, 3333));
		WalkingQueue queue = player.getWalkingQueue();

		Position first = positions.pollFirst();
		queue.addFirstStep(first);
		//algorithm.find(player.getPosition(), new Position(3333, 3333));
	}
}
