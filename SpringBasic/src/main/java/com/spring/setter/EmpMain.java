package com.spring.setter;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmpMain {

	public static void main(String[] args) {

	ApplicationContext context = new AnnotationConfigApplicationContext("com.spring");
	Arrays.stream(context.getBeanDefinitionNames()).forEach(bean->System.out.println(bean));
	Employee employee = (Employee)context.getBean("employee");
	System.out.println(employee);
	}

}
