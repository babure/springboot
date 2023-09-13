package com.spring.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    private String empName;
    private Integer employeeId;
    
    private Address address;
	public Address getAddress() {
		return address;
	}
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getEmpName() {
		return empName;
	}
	@Value("Babu")
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	@Value("402")
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", employeeId=" + employeeId + ", address=" + address + "]";
	}
	

    
}
