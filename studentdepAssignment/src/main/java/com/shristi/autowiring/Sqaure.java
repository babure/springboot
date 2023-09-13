package com.shristi.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Sqaure implements Shape{

	@Override
	public void area(int length, int breadth) {
		System.out.println("Square area "+(length*breadth));
		
	}

}
