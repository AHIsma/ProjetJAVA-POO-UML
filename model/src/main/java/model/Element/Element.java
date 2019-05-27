package model.Element;

public abstract class Element implements IElement {

	private Permeability permeability;

	private Sprite sprite;

	private int x;

	private int y;

	// associer une map à chaque objet

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public Sprite getSprite() {
		return this.sprite;
	}

	public void setPermeability(Permeability permeability) {
		this.permeability = permeability;
	}

	@Override
	public Permeability getPermeability() {
		return this.permeability;
	}
}
