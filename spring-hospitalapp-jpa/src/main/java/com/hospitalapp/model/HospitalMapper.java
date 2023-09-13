package com.hospitalapp.model;

import org.springframework.stereotype.Component;

@Component
public class HospitalMapper {
	public Hospital convertToEntity(HospitalDto hospitalDto) {
		Hospital hospital=new Hospital();
		hospital.setDocterId(hospitalDto.getDocterId());
		hospital.setDegree(hospitalDto.getDegree());
		hospital.setDocterName(hospitalDto.getDocterName());
		hospital.setDoctorSalary(hospitalDto.getDoctorSalary());
		hospital.setExperience(hospitalDto.getExperience());
		return hospital;
	}
	
	public HospitalDto convertToDto(Hospital hospital) {
		HospitalDto hospitalDto=new HospitalDto();
		hospitalDto.setDocterId(hospital.getDocterId());
		hospitalDto.setDegree(hospital.getDegree());
		hospitalDto.setDocterName(hospital.getDocterName());
		hospitalDto.setDoctorSalary(hospital.getDoctorSalary());
		hospitalDto.setExperience(hospital.getExperience());
		return hospitalDto;
	}

}
