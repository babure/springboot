package com.shristi.autowiring;

import javax.swing.SwingContainer;

import org.springframework.stereotype.Component;

@Component
public class Guitar implements IInstrument{

	@Override
	public void play(String song) {
		System.out.println("playing this "+song +" using Guitar");
	}

}
