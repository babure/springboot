package com.shristi.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class InstrumentFactory {
	@Autowired
	@Qualifier("guitar")
	private IInstrument guitar;
	
	@Autowired
	@Qualifier("keyboard")
	private IInstrument keyboard;
	
	@Autowired
	@Qualifier("violin")
	private IInstrument violin;
	
	public void playSong(String instrument, String song) {
		switch (instrument) {
		case "violin":
			violin.play(song);			
			break;
		case "guitar":
			guitar.play(song);
			break;
	    case "keyboard":
	    	keyboard.play(song);
	    	break;
		default:
			System.err.println("instrument doesn't match !!");
			break;
		}
	}

}
