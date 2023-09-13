package com.spring.autojbased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class ShapeFactory {

	//autowire by type 
	//@Autowired
	//@Qualifier("rectangle") //when qualifier and primary added qualifier is proratized
	private Shape shape;
	
	public ShapeFactory(Shape shape) {
		super();
		this.shape = shape;
	}

	public void printArea(double x, double y) {
		shape.area(x, y);
		
	}
}
