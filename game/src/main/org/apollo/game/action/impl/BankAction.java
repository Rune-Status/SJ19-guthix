package org.apollo.game.action.impl;

import org.apollo.game.action.DistancedAction;
import org.apollo.game.model.Position;
import org.apollo.game.model.entity.Player;

public class BankAction extends DistancedAction {

	private static final int BANK_BOOTH_SIZE = 1;

	private Player player;

	/**
	 * Creates a new BankAction.
	 *
	 * @param position The position.
	 */
	public BankAction(Player player, Position position) {
		super(0, true, player, position, BANK_BOOTH_SIZE);
		this.player = player;
		System.out.println("got here2");
	}

	@Override
	protected void executeAction() {
		player.openBank();
		System.out.println("got here3");
		stop();
	}
}
