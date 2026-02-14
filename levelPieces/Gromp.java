package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;


/**
 * Gromp: moves left-to-right, stops if blocked, kills player on contact.
 */
public class Gromp extends GamePiece{

    public Gromp(char symbol, String label, int location) {
        super('G', "Gromp", location);

    }

    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        if (playerLocation == getLocation()) {
            return InteractionResult.KILL;
        }
        return InteractionResult.NONE;
    }

}
