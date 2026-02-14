package levelPieces;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

/**
 * Gromp: moves left-to-right, stops if blocked, kills player on contact.
 */
public class Gromp extends GamePiece implements Moveable {

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

    @Override
    public void move(Drawable[] gameBoard, int playerLocation) {
        for (int i = 0; i < GameEngine.BOARD_SIZE - 1; i++) {
            if (gameBoard[i] == this) {
                if (gameBoard[i + 1] == null) {
                    gameBoard[i + 1] = this;
                    gameBoard[i] = null;
                    setLocation(i + 1);
                }
                return;
            }
        }
    }
}
