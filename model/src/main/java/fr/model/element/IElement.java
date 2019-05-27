package fr.model.element;

import java.awt.Image;
import fr.exia.showboard.ISquare;

public interface IElement extends ISquare {
	
	Sprite getSprite();
	Permeability getPermeability();
	Image getImage();

}
