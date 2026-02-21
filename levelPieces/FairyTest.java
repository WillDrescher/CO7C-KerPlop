package levelPieces;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;

class FairyTest {

	@Test
	public void testFairy() {
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		Fairy Fairy = new Fairy('0', null, 10);
		gameBoard[10] = Fairy;
		// Hit points if player on same space
		assertEquals(InteractionResult.ADVANCE, Fairy.interact(gameBoard, 10));
		// These loops ensure no interaction if not on same space
		for (int i=0; i<10; i++)
			assertEquals(InteractionResult.NONE, Fairy.interact(gameBoard, i));
		for (int i=11; i<GameEngine.BOARD_SIZE; i++)	
			assertEquals(InteractionResult.NONE, Fairy.interact(gameBoard, i));
	}		

}
