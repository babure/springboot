package com.hospitalapp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hospitalapp.model.Hospital;

public interface IHospitalRepository extends MongoRepository<Hospital, String> {
	List<Hospital> findByName(String name);

	List<Hospital> findByAddress(String address);

	List<Hospital> findByType(String type);

	List<Hospital> findByAvailableDepartmentsIn(List<String> availableDepartments);

	List<Hospital> findBySpecializedUnitsIn(List<String> specializedUnits);

	List<Hospital> findByRatingGreaterThanEqual(double minrating);

	List<Hospital> findByNumberOfDoctorsGreaterThan(int minDoctors);

	List<Hospital> findBySurgicalServicesIn(List<String> surgicalServices);

	List<Hospital> findByAccreditationStatusIn(List<String> accreditationStatusList);

	List<Hospital> findByInsuranceProvidersIn(List<String> insuranceProviders);

	List<Hospital> findByPharmacyServicesTrue();

	List<Hospital> findByRehabilitationServicesIsTrue();

	List<Hospital> findBySupportGroupsIn(List<String> supportGroups);

}
