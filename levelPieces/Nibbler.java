package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

/**
 * Nibbler: stationary hazard that hits the player on contact.
 */
public class Nibbler extends GamePiece {

    public Nibbler(char symbol, String label, int location) {
        super('N', "Nibbler", location);

    }

    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        if (playerLocation == getLocation()) {
            return InteractionResult.HIT;
        }
        return InteractionResult.NONE;
    }
}
