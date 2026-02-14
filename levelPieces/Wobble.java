package levelPieces;

import gameEngine.Drawable;
import gameEngine.Moveable;
import gameEngine.InteractionResult;

public class Wobble extends GamePiece implements Moveable {

	public Wobble(char symbol, String label, int location) {
		super(symbol, label, location);

		// TODO Auto-generated constructor stub
	}

	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		// TODO Auto-generated method stub
		gameBoard[getLocation()] = null;
		int newLoc = 0;
		

		if((Math.abs(getLocation() - playerLocation) <= 2) || (gameBoard[getLocation() + 1] != null) || (gameBoard[getLocation() - 1] != null)) {
			newLoc = getLocation();
		} else {
	        if(getLocation() > playerLocation) {
	        	newLoc = getLocation() - 1;
	        } else {
	        	newLoc = getLocation() + 1;
	        }
		}
        
        setLocation(newLoc);
        gameBoard[newLoc] = this;


	}

	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		// TODO Auto-generated method stub
		if(getLocation() == playerLocation) {
			return InteractionResult.HIT;
		} else {
			return null;
		}
	}
}