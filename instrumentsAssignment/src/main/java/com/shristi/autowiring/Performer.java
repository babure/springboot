package com.shristi.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Performer {
	@Autowired
	@Qualifier("guitar")
	private IInstrument inst;
	
	@Autowired
	private IInstrument keyboard;
	
	private IInstrument violin;

	
	public Performer(IInstrument violin) {
		super();
		this.violin = violin;
	}


	public void playSong(String instrument, String song) {
		switch (instrument) {
		case "violin":
			violin.play(song);			
			break;
		case "guitar":
            inst.play(song);
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
