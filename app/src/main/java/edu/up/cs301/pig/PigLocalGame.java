package edu.up.cs301.pig;

import edu.up.cs301.game.GamePlayer;
import edu.up.cs301.game.LocalGame;
import edu.up.cs301.game.actionMsg.GameAction;
import edu.up.cs301.game.infoMsg.GameState;

import android.util.Log;

import java.util.Random;

/**
 * class PigLocalGame controls the play of the game
 *
 * @author Andrew M. Nuxoll, modified by Steven R. Vegdahl
 * @version February 2016
 */
public class PigLocalGame extends LocalGame
{
	private PigGameState game_state;

	/**
	 * This constructor creates a new game state
	 */
	public PigLocalGame()
	{
		this.game_state = new PigGameState();
	}

	/**
	 * can the player with the given id take an action right now?
	 */
	@Override
	protected boolean canMove(int playerIdx)
	{
		if (playerIdx == game_state.getTurnID())
		{
			return true;
		}
		return false;
	}

	/**
	 * This method is called when a new action arrives from a player
	 *
	 * @return true if the action was taken or false if the action was invalid/illegal.
	 */
	@Override
	protected boolean makeMove(GameAction action)
	{
		if (action instanceof PigHoldAction)
		{
			if (this.game_state.getTurnID() == 0)
			{
				this.game_state.setPlayerZeroScore(this.game_state.getRunningTotal());
				this.game_state.setTurnID(1);
			} else if (this.game_state.getTurnID() == 1)
			{
				this.game_state.setPlayerOneScore(this.game_state.getRunningTotal());
				this.game_state.setTurnID(0);
			}
			this.game_state.setRunningTotal(0);
			return true;
		} else if (action instanceof PigRollAction)
		{
			Random gen = new Random();
			int dice = gen.nextInt(6) + 1;
			if (dice == 1) this.game_state.setRunningTotal(0);
			else this.game_state.setRunningTotal(this.game_state.getRunningTotal() + dice);
			return true;
		} else return false;
	}

	/**
	 * send the updated state to a given player
	 */
	@Override
	protected void sendUpdatedStateTo(GamePlayer p)
	{
		//TODO  You will implement this method
		PigGameState copy = new PigGameState(game_state);
		p.sendInfo(copy);
	}//sendUpdatedSate

	/**
	 * Check if the game is over
	 *
	 * @return a message that tells who has won the game, or null if the
	 * game is not over
	 */
	@Override
	protected String checkIfGameOver()
	{
		if (game_state.getPlayerZeroScore() >= 50)
		{
			return "Player Zero wins with score: " + game_state.getPlayerZeroScore();
		} else if (game_state.getPlayerOneScore() >= 50)
		{
			return "Player One wins with score: " + game_state.getPlayerOneScore();
		}
		//TODO  You will implement this method
		return null;
	}

}// class PigLocalGame
