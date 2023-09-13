package com.spring.interfac;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements Shape{

	@Override
	public void area(double x, double y) {
		System.out.println("tri"+0.5*x*y);		
		
	}

}
