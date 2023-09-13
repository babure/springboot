package com.shristi.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShapeFactory {
	@Autowired
	@Qualifier("triangle")
	private Shape triangle;
	
	@Autowired
	@Qualifier("sqaure")
	private Shape square;
	
	@Autowired
	@Qualifier("rectangle")
	private Shape rectangle;
	
	public void getArea(int x, int y) {
		triangle.area(x, y);
		square.area(x, y);
		rectangle.area(x, y);
	}

}
