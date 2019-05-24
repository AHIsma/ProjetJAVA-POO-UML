package model;

public class bowl extends environment {
	
	private boolean falling = false; //used to know if the bowl can kill the player

	public bowl() {
		// TODO Auto-generated constructor stub
	}
	
	public int fall() {
		//if there's an empty below the bowl, the bowl falls and falling becomes true
		//if there's the player below the bowl AND the bowl is falling the player dies
	}
}
