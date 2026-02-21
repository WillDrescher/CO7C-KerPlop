package levelPieces;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;

class GrompTest {

	
	 /*
     * Test that BumbleBee hits player (interaction) only when player is on same location
    */
    @Test
public void testGromp() {
	Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
	Gromp Gromp = new Gromp('0', null, 10);
	gameBoard[10] = Gromp;
	// Hit points if player on same space
	assertEquals(InteractionResult.KILL, Gromp.interact(gameBoard, 10));
	// These loops ensure no interaction if not on same space
	for (int i=0; i<10; i++)
		assertEquals(InteractionResult.NONE, Gromp.interact(gameBoard, i));
	for (int i=11; i<GameEngine.BOARD_SIZE; i++)	
		assertEquals(InteractionResult.NONE, Gromp.interact(gameBoard, i));
}		

}
