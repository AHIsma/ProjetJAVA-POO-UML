package model.Element.Motionless;

import model.Element.Element;
import model.Element.Permeability;
import model.Element.Sprite;

abstract class MotionlessElmnt extends Element {

	MotionlessElmnt(final Sprite sprite, final Permeability permeability) {
		super(sprite, permeability);
	}

}
