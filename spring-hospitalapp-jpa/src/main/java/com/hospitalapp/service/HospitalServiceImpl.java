package com.hospitalapp.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospitalapp.model.HospitalDto;
import com.hospitalapp.model.HospitalMapper;
import com.hospitalapp.repository.IHospitalRepository;
@Service
public class HospitalServiceImpl implements IHospitalService{

	@Autowired
	private IHospitalRepository hospitalRepository;
	@Autowired
	private HospitalMapper hospitalMapper;
	@Override
	public void addDoctor(HospitalDto hospitalDto) {
		hospitalRepository.save(hospitalMapper.convertToEntity(hospitalDto));
		
	}

	@Override
	public void updateDoctor(HospitalDto hospitalDto) {
		hospitalRepository.save(hospitalMapper.convertToEntity(hospitalDto));
	}

	@Override
	public List<HospitalDto> getAll() {
		List<HospitalDto> hospitalDtos= hospitalRepository.findAll().stream().map(hospital->hospitalMapper.convertToDto(hospital)).collect(Collectors.toList());
		return hospitalDtos;
	}

}
