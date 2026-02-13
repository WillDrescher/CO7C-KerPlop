package levelPieces;

import java.util.ArrayList;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.Moveable;

public class LevelSetup {

    private Drawable[] board;
    private ArrayList<Moveable> movingPieces;
    private ArrayList<GamePiece> interactingPieces;
    private int playerStartLoc;
    
    private GamePiece Treasure = new Treasure('x',"X marks the spot", 5);

    public LevelSetup() {
        board = new Drawable[GameEngine.BOARD_SIZE];
        movingPieces = new ArrayList<>();
        interactingPieces = new ArrayList<>();
    }

    public void createLevel(int levelNum) {

        // reset everything each time a level loads
        board = new Drawable[GameEngine.BOARD_SIZE];
        movingPieces = new ArrayList<>();
        interactingPieces = new ArrayList<>();

        if (levelNum == 1) {
            setupLevelOne();
        } 
        else if (levelNum == 2) {
            setupLevelTwo();
        }
    }

    private void setupLevelOne() {

        playerStartLoc = GameEngine.BOARD_SIZE / 2;

        // example pieces — replace with your actual classes
        Treasure prize = new Drawable(5);
        board[5] = prize;
        interactingPieces.add(prize);

        Enemy enemy = new Enemy(15);
        board[15] = enemy;
        interactingPieces.add(enemy);
        movingPieces.add(enemy);
    }

    private void setupLevelTwo() {

        playerStartLoc = 0;

        Treasure prize1 = new Treasure(Treasure.getSymbol(), String label, int location);
        board[3] = prize1;
        interactingPieces.add(prize1);

        Treasure prize2 = new Prize(18);
        board[18] = prize2;
        interactingPieces.add(prize2);

        Enemy enemy1 = new Enemy(10);
        board[10] = enemy1;
        interactingPieces.add(enemy1);
        movingPieces.add(enemy1);
    }

    public Drawable[] getBoard() {
        return board;
    }

    public ArrayList<Moveable> getMovingPieces() {
        return movingPieces;
    }

    public ArrayList<GamePiece> getInteractingPieces() {
        return interactingPieces;
    }

    public int getPlayerStartLoc() {
        return playerStartLoc;
    }
}
