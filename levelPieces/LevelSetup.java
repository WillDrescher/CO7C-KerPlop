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

    
    
    //Stage 1 Wobble
    private Wobble wobble1 = new Wobble('W',"Will chase you but cant get around obstacles", 8);
    
    //Stage 1 Ciphers
    private Cipher cipher1 = new Cipher('C',"Highly accurate sniper, had too much coffee this morning", 5);
    
    //Stage 1 Nibbler
    private Nibbler nibbler1 = new Nibbler('N',"Unable to move, but definitely able to bite", 16);
    
    //Stage 1 fairy
    private Fairy fairy1 = new Fairy('F',"Moves sporatically, but gives a grand reward if caught", 20);

    

    
    
    //Stage 2 peoples
    
    //stage 2 treasures
    private Treasure treasure3 = new Treasure('x',"X marks the spot", 2);
    private Treasure treasure4 = new Treasure('x',"X marks the spot", 19);
   
    //Stage 2 Cipher
    private Cipher cipher2 = new Cipher('C',"Highly accurate sniper", 1);
    
    //Stage 2 Gromp
    private Gromp gromp1 = new Gromp('G',"Fat and dangerous", 5);
    
    //Stage 2 Nibbler
    private Nibbler nibbler2 = new Nibbler('N',"Unable to move, but definitely able to bite", 17);
    
  //Stage 2 Wobble
    private Wobble wobble2 = new Wobble('W',"Will chase you but cant get around obstacles", 8);
    
    //Stage 2 disco ball
    private DiscoBall disco = new DiscoBall(13);







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
		System.out.println(treasure2.symbol + ": " + treasure2.getLabel());

        
        board[nibbler1.getLocation()] = nibbler1;
        interactingPieces.add(nibbler1);
		System.out.println(nibbler1.symbol + ": " + nibbler1.getLabel());

        
        board[wobble1.getLocation()] = wobble1;
        interactingPieces.add(wobble1);
        movingPieces.add(wobble1);
		System.out.println(wobble1.symbol + ": " + wobble1.getLabel());

        
        board[cipher1.getLocation()] = cipher1;
        interactingPieces.add(cipher1);
        movingPieces.add(cipher1);
		System.out.println(cipher1.symbol + ": " + cipher1.getLabel());

        
        board[fairy1.getLocation()] = fairy1;
        interactingPieces.add(fairy1);
        movingPieces.add(fairy1);
		System.out.println(fairy1.symbol + ": " + fairy1.getLabel());

        
        
       
    }

    private void setupLevelTwo() {

        playerStartLoc = GameEngine.BOARD_SIZE / 2;

        board[treasure3.getLocation()] = treasure3;
        interactingPieces.add(treasure3);
		System.out.println(treasure3.symbol + ": " + treasure3.getLabel());
		
		board[treasure4.getLocation()] = treasure4;
        interactingPieces.add(treasure4);
        
        board[nibbler2.getLocation()] = nibbler2;
        interactingPieces.add(nibbler2);
		System.out.println(nibbler2.symbol + ": " + nibbler2.getLabel());

        board[cipher2.getLocation()] = cipher2;
        interactingPieces.add(cipher2);
        movingPieces.add(cipher2);
		System.out.println(cipher2.symbol + ": " + cipher2.getLabel());
		
		board[wobble2.getLocation()] = wobble2;
        interactingPieces.add(wobble2);
        movingPieces.add(wobble2);
		System.out.println(wobble2.symbol + ": " + wobble2.getLabel());
		
		board[gromp1.getLocation()] = gromp1;
        interactingPieces.add(gromp1);
        movingPieces.add(gromp1);
		System.out.println(gromp1.symbol + ": " + gromp1.getLabel());
		
		board[13] = disco;
		System.out.println ("0: Its party time");
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
