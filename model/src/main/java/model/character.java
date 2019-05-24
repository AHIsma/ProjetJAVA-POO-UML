package model;

public abstract class character extends environment {

	private boolean alive;

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
	public int move() {
		//will return the character's coord. after the move
	}
	
	public void die() {
		
	}
}
