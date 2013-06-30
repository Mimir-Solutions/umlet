package com.umlet.element.experimental;

import com.baselet.element.GridElement;
import com.baselet.element.Selector;

public interface DrawHandlerInterface {

	void updatePropertyPanel();

	float getZoomFactor();
	
	boolean displaceDrawingByOnePixel();
	
	GridElement clone();
	
	void Resize(float diffw, float diffh);

	Selector getSelector();

}
