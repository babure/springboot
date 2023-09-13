package com.spring.autojbased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ShapeConfig {

	@Bean
	public Triangle triangle() {
		return new Triangle();
	}

	@Bean
	public Square square() {
		return new Square();
	}

	@Bean
	// @Primary //us Primary along with autowire
	public Rectangle rectangle() {
		return new Rectangle();
	}

	@Bean //using this if the shapefactory has constructors 
	public ShapeFactory shapeFactory() {
		ShapeFactory shapeFactory = new ShapeFactory(rectangle());
		return shapeFactory;
	}

}
