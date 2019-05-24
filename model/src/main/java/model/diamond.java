package model;

public class diamond extends environment {
	
	private int diamondPoints; //amount of points awarded to the player when picked up

	public diamond() {
		// TODO Auto-generated constructor stub
	}

	public int getDiamondPoints() {
		return diamondPoints;
	}

	public void setDiamondPoints(int diamondPoints) {
		this.diamondPoints = diamondPoints;
	}
	
	public void spawn() {
		//will generate diamonds when an enemy dies
	}
	
	public void countPoints(int diamondPoints) {
		//will award points for picking up a diamond
	}

}
