package model.Element.Motionless;

import model.Element.Permeability;
import model.Element.Sprite;

public class Wall extends MotionlessElmnt {
	private static final Sprite SPRITE = new Sprite('N', "Wall.png");

	Wall() {
		super(SPRITE, Permeability.BLOCKING);
	}

}
