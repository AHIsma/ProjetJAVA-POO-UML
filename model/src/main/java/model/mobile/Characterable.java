package model.mobile;

public interface Characterable {

	/**
	 * A voir avec les déplacements du méchant
	 */

	/*
	 * public void moveUp();
	 * 
	 * public void moveDown();
	 * 
	 * public void moveRight();
	 * 
	 * public void moveLeft();
	 * 
	 * public void doNothing();
	 */

	public void die();

	public int getX();

	public int getY();

	public Boolean isAlive();

}
