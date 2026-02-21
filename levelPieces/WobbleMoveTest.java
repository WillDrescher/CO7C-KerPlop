package levelPieces;

import static org.junit.jupiter.api.Assertions.*;

import gameEngine.Drawable;
import gameEngine.GameEngine;

import org.junit.jupiter.api.Test;

class WobbleMoveTest {

    @Test
    public void testWobbleMove() {

        {
            Drawable[] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
            int playerLoc = 10;

            Wobble wobble = new Wobble('0', null, 5);
            gameBoard[5] = wobble;

            wobble.move(gameBoard, playerLoc);

            assertEquals(6, wobble.getLocation());
            assertNull(gameBoard[5]);
            assertSame(wobble, gameBoard[6]);
        }

        {
            Drawable[] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
            int playerLoc = 10;

            Wobble wobble = new Wobble('0', null, 15);
            gameBoard[15] = wobble;

            wobble.move(gameBoard, playerLoc);

            assertEquals(14, wobble.getLocation());
            assertNull(gameBoard[15]);
            assertSame(wobble, gameBoard[14]);
        }

        {
            Drawable[] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
            int playerLoc = 10;

            Wobble wobble = new Wobble('0', null, 8); // distance = 2
            gameBoard[8] = wobble;

            wobble.move(gameBoard, playerLoc);

            assertEquals(8, wobble.getLocation());
            assertSame(wobble, gameBoard[8]);
        }

        {
            Drawable[] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
            int playerLoc = 10;

            Wobble wobble = new Wobble('0', null, 9); // distance = 1
            gameBoard[9] = wobble;

            wobble.move(gameBoard, playerLoc);

            assertEquals(9, wobble.getLocation());
            assertSame(wobble, gameBoard[9]);
        }

        {
            Drawable[] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
            int playerLoc = 10;

            Wobble wobble = new Wobble('0', null, 10); // distance = 0
            gameBoard[10] = wobble;

            wobble.move(gameBoard, playerLoc);

            assertEquals(10, wobble.getLocation());
            assertSame(wobble, gameBoard[10]);
        }
    }
}