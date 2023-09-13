package com.spring.constr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudMain {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.constr");
		Student student = (Student)context.getBean("student");
		Student student1 = context.getBean("student",Student.class);
		Student student2 = context.getBean(Student.class);
		System.out.println(student);
		student1.setStudName("Arjun");
		System.out.println(student1);
		System.out.println(student2);


		
	}

}
