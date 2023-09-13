package com.spring.interfac;

import org.springframework.stereotype.Component;

@Component
public class Rectangle implements Shape{

	@Override
	public void area(double x, double y) {
		System.out.println("rect"+0.5*x*y);		

		
	}

}
