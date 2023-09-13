package com.studentcourse;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.studentcourse.model.Student;

@SpringBootApplication
public class SpringStudentcourseDemoApplication implements CommandLineRunner{

	
	@Autowired
	private Student student;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringStudentcourseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
        System.out.println("-------------------------------------------");

        List<String> fullstackDevCourses = student.showCourse("fullstackDev");	
        System.out.println("Full Stack Course");
        for(String course:fullstackDevCourses) {
        	System.out.println(course);
        }
        
        System.out.println("-------------------------------------------");
        
        List<String> webDevCourses = student.showCourse("webDev");	
        System.out.println("Web Course");
        for(String course:webDevCourses) {
        	System.out.println(course);
        }
        
        System.out.println("-------------------------------------------");
        
        List<String> backendCourses = student.showCourse("backendDev");	
        System.out.println("Backend Course");
        for(String course:backendCourses) {
        	System.out.println(course);
        }
	}

}
