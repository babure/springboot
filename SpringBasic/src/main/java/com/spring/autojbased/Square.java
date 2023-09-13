package com.spring.autojbased;

import org.springframework.stereotype.Component;

public class Square implements Shape {

	@Override
	public void area(double x, double y) {
		System.out.println("Square" + ( x * y));
	}

}
