package levelPieces;

import gameEngine.Drawable;
import gameEngine.Moveable;
import gameEngine.InteractionResult;

/**
 * Fairy: stationary piece that advances the player on contact.
 */
public class Fairy extends GamePiece implements Moveable {

    public Fairy(char symbol, String label, int location) {
        super('F', "Fairy", location);

    }

    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        if (playerLocation == getLocation()) {
            return InteractionResult.ADVANCE;
        }
        return InteractionResult.NONE;
    }

	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		// TODO Auto-generated method stub
		
	}
}
