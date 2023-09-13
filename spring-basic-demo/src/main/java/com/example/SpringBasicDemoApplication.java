package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.interfac.ShapeFactory;

@SpringBootApplication(scanBasePackages = {"com"})
public class SpringBasicDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBasicDemoApplication.class, args);
	}
	
	@Autowired
	private ShapeFactory shapeFactory;
	
	@Autowired
	private ApplicationContext applicationContext;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		shapeFactory.printArea(10, 20);
		System.out.println(applicationContext.getBeanDefinitionCount());
		
	}

}
