package model.Element.Motionless;

import model.Element.Permeability;
import model.Element.Sprite;

public class Empty extends MotionlessElmnt {
	private static final Sprite SPRITE = new Sprite('N', "Empty.png");

	Empty() {
		super(SPRITE, Permeability.PENETRABLE);
	}

}