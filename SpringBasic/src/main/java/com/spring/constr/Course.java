package com.spring.constr;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class Course {

	private String courseName;
	private Integer fees;
	
	public String getCourseName() {
		return courseName;
	}
	
	@Value("${student.course.name}")
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Integer getFees() {
		return fees;
	}
	
	@Value("${student.course.fees}")
	public void setFees(Integer fees) {
		this.fees = fees;
	}
	
	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", fees=" + fees + "]";
	}
	
}
