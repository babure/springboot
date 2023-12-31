package com.spring.setter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {

	private String city;
	private String state;
	public String getCity() {
		return city;
	}
	@Value("Bengaluru")
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	@Value("Karnatak")
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "[city=" + city + ", state=" + state + "]";
	}
}
