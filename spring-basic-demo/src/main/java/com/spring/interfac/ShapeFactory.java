package com.spring.interfac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShapeFactory {

	//autowire by type 
	@Autowired
	@Qualifier("rectangle")
	private Shape shape;
	
	
	//autowire by name
	@Autowired
	private Shape triangle;
	
	
	//autowire by constructor
	private Shape square;
	public ShapeFactory(Shape square) {
		super();
		this.square = square;
	}
	public void printArea(double x, double y) {
		shape.area(x, y);
		triangle.area(x, y);
		square.area(x, y);
	}
}
