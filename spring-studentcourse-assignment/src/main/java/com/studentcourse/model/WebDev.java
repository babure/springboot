package com.studentcourse.model;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class WebDev implements ICourse{

	@Override
	public List<String> printDetails() {
		return Arrays.asList("html","css","js");
	}

}
