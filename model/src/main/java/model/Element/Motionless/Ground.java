package model.Element.Motionless;

import model.Element.Permeability;
import model.Element.Sprite;

public class Ground extends MotionlessElmnt {
	private static final Sprite SPRITE = new Sprite('M', "Ground.png");

	Ground() {
		super(SPRITE, Permeability.PENETRABLE);
	}

}