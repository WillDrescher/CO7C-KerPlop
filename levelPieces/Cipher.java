package levelPieces;

import gameEngine.Drawable;
import gameEngine.Moveable;
import gameEngine.InteractionResult;

public class Cipher extends GamePiece implements Moveable {

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
		
		
		
	}
}

