package com.shrisriti.training;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Department {
     private int depId;
     private String depName;
     private String depHead;
	public int getDepId() {
		return depId;
	}
	@Value("#23")
	public void setDepId(int depId) {
		this.depId = depId;
	}
	public String getDepName() {
		return depName;
	}
	@Value("CSE")
	public void setDepName(String depName) {
		this.depName = depName;
	}
	public String getDepHead() {
		return depHead;
	}
	@Value("me")
	public void setDepHead(String depHead) {
		this.depHead = depHead;
	}
	@Override
	public String toString() {
		return "Department [depId=" + depId + ", depName=" + depName + ", depHead=" + depHead + "]";
	}
	
	
}
