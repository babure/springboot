package com.shristi.auto;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class AutoMain {

	@Autowired
	private Restaurant restaurant;
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext("com");
		AutoMain autoMain = context.getBean(AutoMain.class);
		List<String> indianItems = autoMain.restaurant.displayMenu("indian");
		System.out.println("Indian Items:");
		for(String item:indianItems) {
			System.out.println(item);
		}
		List<String> chineseItems = autoMain.restaurant.displayMenu("chinese");
		System.out.println("Chinese Items:");
		for(String item:chineseItems) {
			System.out.println(item);
		}
		List<String> continentalItems = autoMain.restaurant.displayMenu("continental");
		System.out.println("Continental Items:");
		for(String item:continentalItems) {
			System.out.println(item);
		}
		context.close();
	}
}
