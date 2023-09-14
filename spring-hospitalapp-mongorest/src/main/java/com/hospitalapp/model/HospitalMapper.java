package com.hospitalapp.model;

import org.springframework.stereotype.Component;

@Component
public class HospitalMapper {

	public Hospital convertToEntity(HospitalDto hospitalDto) {
        Hospital hospital = new Hospital();
        hospital.setId(hospitalDto.getId());
        hospital.setName(hospitalDto.getName());
        hospital.setAddress(hospitalDto.getAddress());
        hospital.setPhone(hospitalDto.getPhone());
        hospital.setEmail(hospitalDto.getEmail());
        hospital.setType(hospitalDto.getType());
        hospital.setAccreditationStatus(hospitalDto.getAccreditationStatus());
        hospital.setAvailableDepartments(hospitalDto.getAvailableDepartments());
        hospital.setSpecializedUnits(hospitalDto.getSpecializedUnits());
        hospital.setDiagnosticServices(hospitalDto.getDiagnosticServices());
        hospital.setSurgicalServices(hospitalDto.getSurgicalServices());
        hospital.setNumberOfDoctors(hospitalDto.getNumberOfDoctors());
        hospital.setNumberOfNurses(hospitalDto.getNumberOfNurses());
        hospital.setAdministrativeStaff(hospitalDto.getAdministrativeStaff());
        hospital.setEmergencyServices(hospitalDto.isEmergencyServices());
        hospital.setPharmacyServices(hospitalDto.isPharmacyServices());
        hospital.setRehabilitationServices(hospitalDto.isRehabilitationServices());
        hospital.setRating(hospitalDto.getRating());
        hospital.setReviews(hospitalDto.getReviews());
        hospital.setInsuranceProviders(hospitalDto.getInsuranceProviders());
        hospital.setVisitingHours(hospitalDto.getVisitingHours());
        hospital.setSupportGroups(hospitalDto.getSupportGroups());
        hospital.setEvents(hospitalDto.getEvents());
        return hospital;
    }

    public HospitalDto convertToDto(Hospital hospital) {
        HospitalDto hospitalDto = new HospitalDto();
        hospitalDto.setId(hospital.getId());
        hospitalDto.setName(hospital.getName());
        hospitalDto.setAddress(hospital.getAddress());
        hospitalDto.setPhone(hospital.getPhone());
        hospitalDto.setEmail(hospital.getEmail());
        hospitalDto.setType(hospital.getType());
        hospitalDto.setAccreditationStatus(hospital.getAccreditationStatus());
        hospitalDto.setAvailableDepartments(hospital.getAvailableDepartments());
        hospitalDto.setSpecializedUnits(hospital.getSpecializedUnits());
        hospitalDto.setDiagnosticServices(hospital.getDiagnosticServices());
        hospitalDto.setSurgicalServices(hospital.getSurgicalServices());
        hospitalDto.setNumberOfDoctors(hospital.getNumberOfDoctors());
        hospitalDto.setNumberOfNurses(hospital.getNumberOfNurses());
        hospitalDto.setAdministrativeStaff(hospital.getAdministrativeStaff());
        hospitalDto.setEmergencyServices(hospital.isEmergencyServices());
        hospitalDto.setPharmacyServices(hospital.isPharmacyServices());
        hospitalDto.setRehabilitationServices(hospital.isRehabilitationServices());
        hospitalDto.setRating(hospital.getRating());
        hospitalDto.setReviews(hospital.getReviews());
        hospitalDto.setInsuranceProviders(hospital.getInsuranceProviders());
        hospitalDto.setVisitingHours(hospital.getVisitingHours());
        hospitalDto.setSupportGroups(hospital.getSupportGroups());
        hospitalDto.setEvents(hospital.getEvents());
        return hospitalDto;
    }
}

