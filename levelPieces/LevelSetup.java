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
    
    
    //*********Stage 1 units**************
    //stage 1 treasures
    private Treasure treasure1 = new Treasure('x',"X marks the spot", 3);
    private Treasure treasure2 = new Treasure('x',"X marks the spot", 18);
    
    //Wobble only appear on stage 1
    private Wobble wobble1 = new Wobble('W',"Will chase you but cant get around obstacles", 8);
    
    //Stage 1 Ciphers
    private Cipher cipher1 = new Cipher('C',"Highly accurate sniper, had too much coffee this morning", 5);
    
    //Stage 1 Nibbler
    private Nibbler nibbler1 = new Nibbler('N',"Unable to move, but definitely able to bite", 16);

    
    
    //Stage 2 peoples
    
    //stage 2 treasures
    private Treasure treasure3 = new Treasure('x',"X marks the spot", 5);
    private Treasure treasure4 = new Treasure('x',"X marks the spot", 1);
   
    //Stage 2 Ciphers
    private Cipher cipher2 = new Cipher('C',"Highly accurate sniper", 5);
    private Cipher cipher3 = new Cipher('C',"Highly accurate sniper", 5);




    public LevelSetup() {
        board = new Drawable[GameEngine.BOARD_SIZE];
        movingPieces = new ArrayList<>();
        interactingPieces = new ArrayList<>();
    }

    public void createLevel(int levelNum) {

        // reset all for every new level
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
        
        board[treasure1.getLocation()] = treasure1;
        interactingPieces.add(treasure1);
        
        board[treasure2.getLocation()] = treasure2;
        interactingPieces.add(treasure2);
        
        board[wobble1.getLocation()] = wobble1;
        interactingPieces.add(wobble1);
        movingPieces.add(wobble1);
        
        board[cipher1.getLocation()] = cipher1;
        interactingPieces.add(cipher1);
        movingPieces.add(cipher1);
        
        
        
       
    }

    private void setupLevelTwo() {

        playerStartLoc = GameEngine.BOARD_SIZE / 2;

        Treasure prize1 = new Treasure('x',"X marks the spot", 3);
        board[prize1.getLocation()] = prize1;
        interactingPieces.add(prize1);

        Treasure prize2 = new Treasure('x',"X marks the spot", 18);
        board[prize1.getLocation()] = prize2;
        interactingPieces.add(prize2);

        Cipher cipher1 = new Cipher('C',"Highly accurate sniper", 7);
        board[10] = cipher1;
        interactingPieces.add(cipher1);
        movingPieces.add(cipher1);
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
