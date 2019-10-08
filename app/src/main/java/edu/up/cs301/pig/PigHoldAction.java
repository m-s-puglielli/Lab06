package edu.up.cs301.pig;

import edu.up.cs301.game.GamePlayer;
import edu.up.cs301.game.actionMsg.GameAction;

public class PigHoldAction extends GameAction
{
	private GamePlayer player;

	public PigHoldAction(GamePlayer player)
	{
		this.player = player;
	}
}
