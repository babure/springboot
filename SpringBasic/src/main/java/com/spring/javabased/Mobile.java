package com.spring.javabased;

import org.springframework.beans.factory.annotation.Value;

public class Mobile {
	
	private String model;
	private Features features;
	
	public String getModel() {
		return model;
	}
	
	@Value("IPHONE-15")
	public void setModel(String model) {
		this.model = model;
	}
	public Features getFeatures() {
		return features;
	}
	public void setFeatures(Features features) {
		this.features = features;
	}
	@Override
	public String toString() {
		return "Mobile [model=" + model + ", features=" + features + "]";
	}
	
}
