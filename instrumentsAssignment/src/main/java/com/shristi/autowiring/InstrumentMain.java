package com.shristi.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class InstrumentMain {
	
	@Autowired
    private InstrumentFactory instrumentFactory;
	public static void main(String[] args) {
          AbstractApplicationContext context = new AnnotationConfigApplicationContext("com");
          InstrumentMain instrumentMain = context.getBean(InstrumentMain.class);
          instrumentMain.instrumentFactory.playSong("violin", "terimeri");
          instrumentMain.instrumentFactory.playSong("guitar", "hello");
          instrumentMain.instrumentFactory.playSong("keyboard", "goodbye");
          context.close();
	}
}
