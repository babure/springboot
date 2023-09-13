package com.studentcourse.model;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class FullstackDev implements ICourse{

	@Override
	public List<String> printDetails() {
		return Arrays.asList("reactJs","expressjs","nodejs","mongo");
	}

}
