package com.hospitalapp.service;

import java.util.List;

import com.hospitalapp.exceptions.HospitalNotFoundException;
import com.hospitalapp.model.HospitalDto;

public interface IHospitalService {
    
	// Basic Hospital Operations
	void addHospital(HospitalDto hospitalDto);
	void updateHospital(HospitalDto hospitalDto) throws HospitalNotFoundException;
	void deleteHospital(String hospitalId) throws HospitalNotFoundException;
	List<HospitalDto> getAll();

	// Hospital Information Retrieval
	List<HospitalDto> getHospitalsByName(String name) throws HospitalNotFoundException;
	List<HospitalDto> getHospitalsByLocation(String location) throws HospitalNotFoundException;
	List<HospitalDto> getHospitalsByType(String type) throws HospitalNotFoundException;
	List<HospitalDto> getHospitalsByDepartments(List<String> departments) throws HospitalNotFoundException;
	List<HospitalDto> getHospitalsBySpecializationUnits(List<String> specializationUnits) throws HospitalNotFoundException;

	// Hospital Filtering by Criteria
	List<HospitalDto> getHospitalsWithRatingGreaterThan(double minRating) throws HospitalNotFoundException;
	List<HospitalDto> getHospitalsWithNumberOfDoctorsGreaterThan(int minDoctors) throws HospitalNotFoundException;

	// Hospital Filtering by Services and Facilities
	List<HospitalDto> getHospitalsBySurgicalServices(List<String> surgicalServices) throws HospitalNotFoundException;
	List<HospitalDto> getHospitalsByAccreditationStatus(List<String> accreditationStatusList) throws HospitalNotFoundException;
	List<HospitalDto> getHospitalsByInsuranceProviders(List<String> insuranceProviders) throws HospitalNotFoundException;
	List<HospitalDto> getHospitalsWithPharmacyServices() throws HospitalNotFoundException;
	List<HospitalDto> getHospitalsWithRehabilitationServices() throws HospitalNotFoundException;
	List<HospitalDto> getHospitalsWithSupportGroups(List<String> supportGroups) throws HospitalNotFoundException;

}
