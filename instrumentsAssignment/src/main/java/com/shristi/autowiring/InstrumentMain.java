package com.shristi.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class InstrumentMain {
	
	
	public static void main(String[] args) {
          AbstractApplicationContext context = new AnnotationConfigApplicationContext("com");
          Performer performer = (Performer)context.getBean("performer");
          performer.playSong("violin", "terimeri");
          performer.playSong("guitar", "hello");
          performer.playSong("keyboard", "goodbye");
          context.close();
	}
}
