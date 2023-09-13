package com.studentcourse.model;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Autowired
	@Qualifier("fullstackDev")
	private ICourse fullstackDev;
	
	@Autowired
	@Qualifier("webDev")
	private ICourse webDev;
	
	@Autowired
	@Qualifier("backendDev")
	private ICourse backendDev;
	
	public List<String> showCourse(String type){
	         switch (type) {
			case "fullstackDev":
				return fullstackDev.printDetails();
			case "webDev":
				return webDev.printDetails();
			case "backendDev":
				return backendDev.printDetails();
			default:
				return Arrays.asList("");
			}
	}
	
}
