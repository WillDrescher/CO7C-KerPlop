package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

/**
 * Fairy: stationary piece that advances the player on contact.
 */
public class Fairy extends GamePiece {

    public Fairy(int location) {
        super('F', "Fairy", location);
    }

    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        if (playerLocation == getLocation()) {
            return InteractionResult.ADVANCE;
        }
        return InteractionResult.NONE;
    }
}
