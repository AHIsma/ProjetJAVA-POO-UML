package model.mobile;

import model.Element.Element;

public abstract class Character extends Element implements Characterable {

	protected Boolean alive;

	@Override
	public Boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
	}

	public void getAlive() {
	}

	@Override
	public void moveUp() {

	}

	@Override
	public void moveDown() {
	}

	@Override
	public void moveLeft() {
	}

	@Override
	public void moveRight() {
	}

	@Override
	public void doNothing() {
	}

	@Override
	public void die() {
	}

}
