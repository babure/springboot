package com.shristi.auto;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {

	@Autowired
	@Qualifier("indian")
	private IFoodMenu indian;
	
	@Autowired
	@Qualifier("continental")
	private IFoodMenu continetal;
	
	@Autowired
	@Qualifier("chinese")
	private IFoodMenu chinese;
	
	public List<String> displayMenu(String choice){
		switch (choice) {
		case "chinese":
			return chinese.showItems();
		case "indian":
			return indian.showItems();
		case "continental":
			return continetal.showItems();
		default:
			return Arrays.asList("");
		}
	}
	
}
