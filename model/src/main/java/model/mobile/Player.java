package model.mobile;

import javax.lang.model.element.Element;

import model.Element.Permeability;

public class Player extends Character implements Playerable {

	public Player(int x, int y) {
		this.setX(x);
		this.setY(y);
		this.setPermeability(Permeability.BLOCKING);
		this.setAlive(alive);
	}

	@Override
	public void moveUp() {
		this.setY(this.getY() + 1);

	}

	@Override
	public void moveDown() {
		this.setY(this.getY() - 1);
	}

	@Override
	public void moveLeft() {
		this.setX(this.getX() - 1);
	}

	@Override
	public void moveRight() {
		this.setX(this.getX() + 1);
	}

	@Override
	public void doNothing() {
		this.setX(this.getX());
		this.setY(this.getY());
	}

	@Override
	public void die() {
		this.setAlive(false);
	}

	// Le nom map doit être adapté
	@Override
	public void pushUp() {
		Element temp = map[this.getX()][this.getY() + 1];
		Permeability perm_temp = temp.getPermeability();
		if (perm_temp == Permeability.PENETRABLE) {
			this.setPosition(this.getX(), this.getY() + 1);
		} else {
			this.doNothing();
		}
	}

	@Override
	public void pushDown() {
		Element temp = map[this.getX()][this.getY() - 1];
		Permeability perm_temp = temp.getPermeability();
		if (perm_temp == Permeability.PENETRABLE) {
			this.setPosition(this.getX(), this.getY() - 1);
		} else {
			this.doNothing();
		}

	}

	@Override
	public void pushRight() {
		Element temp = map[this.getX() + 1][this.getY()];
		Permeability perm_temp = temp.getPermeability();
		if (perm_temp == Permeability.PENETRABLE) {
			this.setPosition(this.getX() + 1, this.getY());
		} else {
			this.doNothing();
		}

	}

	@Override
	public void pushLeft() {
		Element temp = map[this.getX() - 1][this.getY()];
		Permeability perm_temp = temp.getPermeability();
		if (perm_temp == Permeability.PENETRABLE) {
			this.setPosition(this.getX() - 1, this.getY());
		} else {
			this.doNothing();
		}

	}

}
