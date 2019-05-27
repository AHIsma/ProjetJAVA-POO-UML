package model.Element.Motionless;

import model.Element.Permeability;
import model.Element.Sprite;

public class Exit extends MotionlessElmnt {
	private static final Sprite SPRITE = new Sprite('X', "Exit.png");

	Exit() {
		super(SPRITE, Permeability.PENETRABLE);
	}

}