package edu.up.cs301.pig;

import edu.up.cs301.game.infoMsg.GameState;

public class PigGameState extends GameState
{

	public PigGameState()
	{
		this.turnID = 0;
		this.playerZeroScore = 0;
		this.playerOneScore = 0;
		this.runningTotal = 0;
		this.diceValue = 0;
	}

	public PigGameState(PigGameState that)
	{
		this.turnID = that.turnID;
		this.playerZeroScore = that.playerZeroScore;
		this.playerOneScore = that.playerOneScore;
		this.runningTotal = that.runningTotal;
		this.diceValue = that.diceValue;
	}
}
