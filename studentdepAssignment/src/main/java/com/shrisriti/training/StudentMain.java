package com.shrisriti.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;

import com.shristi.autowiring.ShapeFactory;

@Component
public class StudentMain {
	@Autowired
	private ShapeFactory shapeFactory;
	
	public static void main(String[] args) {
			
        AbstractApplicationContext context = new AnnotationConfigApplicationContext("com");
        Student student = context.getBean(Student.class);
        System.out.println(student);
        System.out.println("----------------------------------------------");
       
        StudentMain studentMain = context.getBean(StudentMain.class);
        studentMain.shapeFactory.getArea(10, 20);
        
        context.close();
	}
}
