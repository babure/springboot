package com.hospitalapp.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalapp.model.HospitalDto;
import com.hospitalapp.service.IHospitalService;

@RestController
@RequestMapping("/hospital-api/v1")
public class HospitalController {
	
	private IHospitalService hospitalService;
	
	public HospitalController(IHospitalService hospitalService) {
		super();
		this.hospitalService = hospitalService;
	}

	
	@PostMapping("/hospitals")
    public void addHospital(@RequestBody HospitalDto hospitalDto) {
        System.out.println("Adding hospital...");
        hospitalService.addHospital(hospitalDto);
        System.out.println("Hospital added successfully.");
    }

    @PutMapping("/hospitals")
    public void updateHospital(@RequestBody HospitalDto hospitalDto) {
        System.out.println("Updating hospital...");
        hospitalService.updateHospital(hospitalDto);
        System.out.println("Hospital updated successfully.");
    }

    @DeleteMapping("/hospitals/{hospitalId}")
    public void deleteHospital(@PathVariable String hospitalId) {
        System.out.println("Deleting hospital with ID: " + hospitalId);
        hospitalService.deleteHospital(hospitalId);
        System.out.println("Hospital deleted successfully.");
    }

    @GetMapping("/hospitals")
    public List<HospitalDto> getAll() {
        System.out.println("Getting all hospitals...");
        List<HospitalDto> hospitals = hospitalService.getAll();
        System.out.println("Retrieved " + hospitals.size() + " hospitals.");
        return hospitals;
    }
    
    @GetMapping("/hospitals/name/{name}")
    public List<HospitalDto> getHospitalsByName(@PathVariable String name) {
        System.out.println("Getting hospitals by name: " + name);
        List<HospitalDto> hospitals = hospitalService.getHospitalsByName(name);
        System.out.println("Retrieved " + hospitals.size() + " hospitals.");
        return hospitals;
    }

    @GetMapping("/hospitals/location/{location}")
    public List<HospitalDto> getHospitalsByLocation(@PathVariable String location) {
        System.out.println("Getting hospitals by location: " + location);
        List<HospitalDto> hospitals = hospitalService.getHospitalsByLocation(location);
        System.out.println("Retrieved " + hospitals.size() + " hospitals.");
        return hospitals;
    }

    @GetMapping("/hospitals/type/{type}")
    public List<HospitalDto> getHospitalsByType(@PathVariable String type) {
        System.out.println("Getting hospitals by type: " + type);
        List<HospitalDto> hospitals = hospitalService.getHospitalsByType(type);
        System.out.println("Retrieved " + hospitals.size() + " hospitals.");
        return hospitals;
    }

    @GetMapping("/hospitals/departments")
    public List<HospitalDto> getHospitalsByDepartments(@RequestParam List<String> departments) {
        System.out.println("Getting hospitals by departments: " + departments);
        List<HospitalDto> hospitals = hospitalService.getHospitalsByDepartments(departments);
        System.out.println("Retrieved " + hospitals.size() + " hospitals.");
        return hospitals;
    }

    @GetMapping("/hospitals/specialization-units")
    public List<HospitalDto> getHospitalsBySpecializationUnits(@RequestParam List<String> specializationUnits) {
        System.out.println("Getting hospitals by specialization units: " + specializationUnits);
        List<HospitalDto> hospitals = hospitalService.getHospitalsBySpecializationUnits(specializationUnits);
        System.out.println("Retrieved " + hospitals.size() + " hospitals.");
        return hospitals;
    }

    @GetMapping("/hospitals/rating/{minRating}")
    public List<HospitalDto> getHospitalsWithRatingGreaterThan(@PathVariable double minRating) {
        System.out.println("Getting hospitals with rating greater than: " + minRating);
        List<HospitalDto> hospitals = hospitalService.getHospitalsWithRatingGreaterThan(minRating);
        System.out.println("Retrieved " + hospitals.size() + " hospitals.");
        return hospitals;
    }

    @GetMapping("/hospitals/doctors/{minDoctors}")
    public List<HospitalDto> getHospitalsWithNumberOfDoctorsGreaterThan(@PathVariable int minDoctors) {
        System.out.println("Getting hospitals with number of doctors greater than: " + minDoctors);
        List<HospitalDto> hospitals = hospitalService.getHospitalsWithNumberOfDoctorsGreaterThan(minDoctors);
        System.out.println("Retrieved " + hospitals.size() + " hospitals.");
        return hospitals;
    }
    
    @GetMapping("/hospitals/surgical-services")
    public List<HospitalDto> getHospitalsBySurgicalServices(@RequestParam List<String> surgicalServices) {
        System.out.println("Getting hospitals by surgical services: " + surgicalServices);
        List<HospitalDto> hospitals = hospitalService.getHospitalsBySurgicalServices(surgicalServices);
        System.out.println("Retrieved " + hospitals.size() + " hospitals.");
        return hospitals;
    }

    @GetMapping("/hospitals/accreditation-status")
    public List<HospitalDto> getHospitalsByAccreditationStatus(@RequestParam List<String> accreditationStatusList) {
        System.out.println("Getting hospitals by accreditation status: " + accreditationStatusList);
        List<HospitalDto> hospitals = hospitalService.getHospitalsByAccreditationStatus(accreditationStatusList);
        System.out.println("Retrieved " + hospitals.size() + " hospitals.");
        return hospitals;
    }

    @GetMapping("/hospitals/insurance-providers")
    public List<HospitalDto> getHospitalsByInsuranceProviders(@RequestParam List<String> insuranceProviders) {
        System.out.println("Getting hospitals by insurance providers: " + insuranceProviders);
        List<HospitalDto> hospitals = hospitalService.getHospitalsByInsuranceProviders(insuranceProviders);
        System.out.println("Retrieved " + hospitals.size() + " hospitals.");
        return hospitals;
    }

    @GetMapping("/hospitals/pharmacy-services")
    public List<HospitalDto> getHospitalsWithPharmacyServices() {
        System.out.println("Getting hospitals with pharmacy services...");
        List<HospitalDto> hospitals = hospitalService.getHospitalsWithPharmacyServices();
        System.out.println("Retrieved " + hospitals.size() + " hospitals.");
        return hospitals;
    }

    @GetMapping("/hospitals/rehabilitation-services")
    public List<HospitalDto> getHospitalsWithRehabilitationServices() {
        System.out.println("Getting hospitals with rehabilitation services...");
        List<HospitalDto> hospitals = hospitalService.getHospitalsWithRehabilitationServices();
        System.out.println("Retrieved " + hospitals.size() + " hospitals.");
        return hospitals;
    }

    @GetMapping("/hospitals/support-groups")
    public List<HospitalDto> getHospitalsWithSupportGroups(@RequestParam List<String> supportGroups) {
        System.out.println("Getting hospitals with support groups: " + supportGroups);
        List<HospitalDto> hospitals = hospitalService.getHospitalsWithSupportGroups(supportGroups);
        System.out.println("Retrieved " + hospitals.size() + " hospitals.");
        return hospitals;
    }


}
