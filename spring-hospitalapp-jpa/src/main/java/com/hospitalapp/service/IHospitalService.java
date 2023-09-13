package com.hospitalapp.service;

import java.util.List;

import com.hospitalapp.model.HospitalDto;

public interface IHospitalService {
	void addDoctor(HospitalDto hospitalDto);
	void updateDoctor(HospitalDto hospitalDto);
	List<HospitalDto> getAll();

}
