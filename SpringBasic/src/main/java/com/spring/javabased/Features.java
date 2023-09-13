package com.spring.javabased;

import org.springframework.beans.factory.annotation.Value;

public class Features {
	private String ram;

	public String getRam() {
		return ram;
	}
    @Value("2GB")
	public void setRam(String ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "Features [ram=" + ram + "]";
	}
	
}
