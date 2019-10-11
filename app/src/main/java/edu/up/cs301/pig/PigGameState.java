package edu.up.cs301.pig;

import edu.up.cs301.game.infoMsg.GameState;

public class PigGameState extends GameState
{
	private int turnID;
	private int playerZeroScore;
	private int playerOneScore;
	private int runningTotal;
	private int diceValue;

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

	/**
	 * getter method for turnID variable
	 *
	 * @return the PigGameState's turnID
	 */
	public int getTurnID()
	{
		return turnID;
	}

	public int getPlayerZeroScore()
	{
		return playerZeroScore;
	}

	public int getPlayerOneScore()
	{
		return playerOneScore;
	}

	public void setTurnID(int turnID)
	{
		this.turnID = turnID;
	}

	public void setPlayerZeroScore(int playerZeroScore)
	{
		this.playerZeroScore += playerZeroScore;
	}

	public void setPlayerOneScore(int playerOneScore)
	{
		this.playerOneScore += playerOneScore;
	}

	public int getRunningTotal()
	{
		return runningTotal;
	}

	public int getDice()
	{
		return diceValue;
	}

	public void setDiceTotal(int diceValue)
	{
		this.diceValue = diceValue;
	}

	public void setRunningTotal(int runningTotal)
	{
		this.runningTotal = runningTotal;
	}
}
