package org.apollo.game.message.handler;

import org.apollo.game.message.impl.ButtonMessage;
import org.apollo.game.model.World;
import org.apollo.game.model.entity.Player;

public final class RunButtonMessageHandler extends MessageHandler<ButtonMessage> {

	public RunButtonMessageHandler(World world) {
		super(world);
	}

	private static final int RUN_BUTTON_ID = 152;

	@Override
	public void handle(Player player, ButtonMessage message) {
		System.out.println(message.getWidgetId());
		if (message.getWidgetId() == RUN_BUTTON_ID)
			player.toggleRunning();
	}

}