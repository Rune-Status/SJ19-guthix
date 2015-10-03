package org.apollo.game.message.handler;

import org.apollo.game.message.impl.ButtonMessage;
import org.apollo.game.model.World;
import org.apollo.game.model.entity.Player;

public final class EquipmentButtonMessageHandler extends MessageHandler<ButtonMessage> {

	/**
	 * Creates the EquipmentButtonMessageHandler.
	 *
	 * @param world The {@link World} the {@link ButtonMessage} occurred in.
	 */
	public EquipmentButtonMessageHandler(World world) {
		super(world);
	}

	private static final int EQUIPMENT_BUTTON = 21341;
	private static final int CLOSE_EQUIPMENT_BUTTON = 21299;

	private static final int EQUIPMENT_WINDOW = 21172;

	@Override
	public void handle(Player player, ButtonMessage message) {
		if (message.getWidgetId() == EQUIPMENT_BUTTON)
			player.getInterfaceSet().openWindow(EQUIPMENT_WINDOW);
		else if (message.getWidgetId() == CLOSE_EQUIPMENT_BUTTON)
			player.getInterfaceSet().close();
	}

}