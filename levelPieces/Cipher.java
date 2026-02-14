package levelPieces;

import gameEngine.Drawable;
import gameEngine.Moveable;
import gameEngine.InteractionResult;
import java.util.Random;


public class Cipher extends GamePiece implements Moveable {
	Random rand = new Random();

	public Cipher(char symbol, String label, int location) {
		super(symbol, label, location);
		// TODO Auto-generated constructor stub
	}

	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		// TODO Auto-generated method stub
		if(Math.abs(getLocation() - playerLocation) < 1) {
			return InteractionResult.GET_POINT;
		} else {
			return null;
		}
	}

	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		// TODO Auto-generated method stub
	    gameBoard[getLocation()] = null;
	    
        int newLoc = rand.nextInt((21 - 0) + 1) + 0;
		
		if (gameBoard[newLoc] != null) {
	        return;
	    }
		
		int location = newLoc;
		
		gameBoard[location] = this;
		
		
		
	}
}

