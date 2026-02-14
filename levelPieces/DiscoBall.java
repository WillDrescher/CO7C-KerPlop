package levelPieces;

import gameEngine.Drawable;

public class DiscoBall implements Drawable {
	
	private char symbol = '0';
	private int location;

	public DiscoBall(int location) {
		// TODO Auto-generated constructor stub
		this.location = location;
		
	}
	
	@Override
	public void draw() {
		System.out.print(symbol);
	}

}
