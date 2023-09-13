package com.spring.autojbased;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class ShapeMain {

	public static void main(String[] args) {

		AbstractApplicationContext context = new AnnotationConfigApplicationContext("com.spring.autojbased");
	    ShapeFactory shapeFactory = context.getBean(ShapeFactory.class);
	    shapeFactory.printArea(3, 5);
	    context.close();
	}

}
