package model.Element;

import java.awt.Image;

public abstract class Element {

	private Sprite sprite;
	private Permeability permeability;

	public Element(final Sprite sprite, final Permeability permeability) {
		this.setSprite(sprite);
		this.setPermeability(permeability);
	}

	public final Sprite getSprite() {
		return this.sprite;
	}

	protected final void setSprite(final Sprite sprite) {
		this.sprite = sprite;
	}

	public final Permeability getPermeability() {
		return this.permeability;
	}

	protected final void setPermeability(final Permeability permeability) {
		this.permeability = permeability;
	}

	public final Image getImage() {
		return this.getSprite().getImage();
	}

}
