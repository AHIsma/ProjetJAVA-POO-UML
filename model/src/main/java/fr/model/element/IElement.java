package fr.model.element;

import java.awt.image.*;
import fr.exia.showboard.*;

public interface IElement extends ISquare {
	
	Sprite getSprite();
	Permeability getPermeability();

}
