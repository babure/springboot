package com.shristi.auto;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Indian implements IFoodMenu{

	@Override
	public List<String> showItems() {
		return Arrays.asList("roti","dal");
	}

}
