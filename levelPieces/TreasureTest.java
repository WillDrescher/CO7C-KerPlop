package levelPieces;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;

class TreasureTest {

	@Test
	public void testTreasure() {
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		Treasure Treasure = new Treasure('0', null, 10);
		gameBoard[10] = Treasure;
		// Hit points if player on same space
		assertEquals(InteractionResult.GET_POINT, Treasure.interact(gameBoard, 10));
		// These loops ensure no interaction if not on same space
		for (int i=0; i<10; i++)
			assertEquals(InteractionResult.NONE, Treasure.interact(gameBoard, i));
		for (int i=11; i<GameEngine.BOARD_SIZE; i++)	
			assertEquals(InteractionResult.NONE, Treasure.interact(gameBoard, i));
	}		

}
