package com.studentcourse.model;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class BackendDev implements ICourse{

	@Override
	public List<String> printDetails() {
		return Arrays.asList("Java","Spring","phython","mongodb","sql");
	}

}
