package levelPieces;

import static org.junit.jupiter.api.Assertions.*;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;

import org.junit.jupiter.api.Test;

class CipherKillTest {

	@Test
	public void testCipherKill() {
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		Cipher Cipher = new Cipher('0', null, 10);
		gameBoard[10] = Cipher;

		assertEquals(InteractionResult.KILL, Cipher.interact(gameBoard, 9));
		assertEquals(InteractionResult.KILL, Cipher.interact(gameBoard, 11));

		for (int i = 0; i < 9; i++)
			assertEquals(InteractionResult.NONE, Cipher.interact(gameBoard, i));
		for (int i = 12; i < GameEngine.BOARD_SIZE; i++)
			assertEquals(InteractionResult.NONE, Cipher.interact(gameBoard, i));
	}

}
