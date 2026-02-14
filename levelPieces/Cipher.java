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
		if(Math.abs(getLocation() - playerLocation) <= 1) {
			return InteractionResult.KILL;
		} else {
			return null;
		}
	}

	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		// TODO Auto-generated method stub
	    int oldLoc = getLocation();
	    int newLoc = oldLoc;
	    
	    while (true) {
	        int spot = rand.nextInt(gameBoard.length);
	        if (gameBoard[spot] == null && spot != playerLocation) {
	            newLoc = spot;
	            break;
	        } else if (newLoc == oldLoc) {
	        	return;
	        }

	    }
	    
	    gameBoard[oldLoc] = null;
	    setLocation(newLoc);
	    gameBoard[newLoc] = this;
		
	}
}

