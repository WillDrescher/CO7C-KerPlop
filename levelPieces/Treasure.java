package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Treasure extends GamePiece {

	public Treasure(char symbol, String label, int location) {
		super(symbol, label, location);
		// TODO Auto-generated constructor stub
	}

	private boolean collected = false;

	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
	    if (collected) {
	    	return null;
	    }

		// TODO Auto-generated method stub
		if(getLocation() == playerLocation) {
			gameBoard[getLocation()] = null;
			collected = true;
			return InteractionResult.GET_POINT;
		} else {
			return null;
		}
	}

}
