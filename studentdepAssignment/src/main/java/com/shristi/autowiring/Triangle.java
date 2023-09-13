package com.shristi.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements Shape{

	@Override
	public void area(int length, int breadth) {
		System.out.println("Triangle area "+(0.5*length*breadth));
		
	}

}
