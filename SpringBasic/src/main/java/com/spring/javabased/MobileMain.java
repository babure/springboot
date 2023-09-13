package com.spring.javabased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MobileMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.javabased");
		Mobile mobile = context.getBean(Mobile.class);
		System.out.println(mobile);
	}

}
