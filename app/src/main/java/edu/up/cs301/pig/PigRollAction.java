package edu.up.cs301.pig;

import edu.up.cs301.game.GamePlayer;
import edu.up.cs301.game.actionMsg.GameAction;

public class PigRollAction extends GameAction
{
	private GamePlayer player;

	public PigRollAction(GamePlayer player)
	{
		super(player);
	}
}
