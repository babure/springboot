package com.hospitalapp.model;

public class HospitalDto {
	private String docterName;
	private Integer docterId;
	private String degree;
	private Integer experience;
	private Integer doctorSalary;
	public HospitalDto() {
		super();
	}
	public HospitalDto(String docterName,String degree, Integer experience, Integer doctorSalary) {
		super();
		this.docterName = docterName;
		this.degree = degree;
		this.experience = experience;
		this.doctorSalary = doctorSalary;
	}
	
	
	public String getDocterName() {
		return docterName;
	}
	public void setDocterName(String docterName) {
		this.docterName = docterName;
	}
	public Integer getDocterId() {
		return docterId;
	}
	public void setDocterId(Integer docterId) {
		this.docterId = docterId;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public Integer getExperience() {
		return experience;
	}
	public void setExperience(Integer experience) {
		this.experience = experience;
	}
	public Integer getDoctorSalary() {
		return doctorSalary;
	}
	public void setDoctorSalary(Integer doctorSalary) {
		this.doctorSalary = doctorSalary;
	}
	@Override
	public String toString() {
		return "HospitalDto [docterName=" + docterName + ", docterId=" + docterId + ", degree=" + degree
				+ ", experience=" + experience + ", doctorSalary=" + doctorSalary + "]";
	}
	

}
