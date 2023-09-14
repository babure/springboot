package com.hospitalapp.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospitalapp.exceptions.HospitalNotFoundException;
import com.hospitalapp.model.Hospital;
import com.hospitalapp.model.HospitalDto;
import com.hospitalapp.model.HospitalMapper;
import com.hospitalapp.repository.IHospitalRepository;

@Service
public class HospitalServiceImpl implements IHospitalService {

    @Autowired
    private IHospitalRepository hospitalRepository;

    @Autowired
    private HospitalMapper hospitalMapper;

    @Override
    public void addHospital(HospitalDto hospitalDto) {
        hospitalRepository.insert(hospitalMapper.convertToEntity(hospitalDto));
    }

    @Override
    public void updateHospital(HospitalDto hospitalDto) {
        hospitalRepository.save(hospitalMapper.convertToEntity(hospitalDto));
    }

    @Override
    public void deleteHospital(String hospitalId) {
        hospitalRepository.deleteById(hospitalId);
    }

    @Override
    public List<HospitalDto> getAll() {
        List<HospitalDto> hospitalDtos = hospitalRepository.findAll().stream()
                .map(hospitals -> hospitalMapper.convertToDto(hospitals)).collect(Collectors.toList());
        return hospitalDtos;
    }

    @Override
    public List<HospitalDto> getHospitalsByName(String name) {
        List<Hospital> hospitals = hospitalRepository.findByName(name);
        if (hospitals == null || hospitals.isEmpty()) {
            throw new HospitalNotFoundException("Hospital with name " + name + " not found");
        }
        return hospitals.stream().map(hospitalMapper::convertToDto).collect(Collectors.toList());
    }

    @Override
    public List<HospitalDto> getHospitalsByLocation(String location) {
        List<Hospital> hospitals = hospitalRepository.findByAddress(location);
        if (hospitals == null || hospitals.isEmpty()) {
            throw new HospitalNotFoundException("Hospital with location " + location + " not found");
        }
        return hospitals.stream().map(hospitalMapper::convertToDto).collect(Collectors.toList());
    }

    @Override
    public List<HospitalDto> getHospitalsByType(String type) {
        List<Hospital> hospitals = hospitalRepository.findByType(type);
        if (hospitals == null || hospitals.isEmpty()) {
            throw new HospitalNotFoundException("Hospital with type " + type + " not found");
        }
        return hospitals.stream().map(hospitalMapper::convertToDto).collect(Collectors.toList());
    }

    @Override
    public List<HospitalDto> getHospitalsWithRatingGreaterThan(double minRating) {
        List<Hospital> hospitals = hospitalRepository.findByRatingGreaterThanEqual(minRating);
        if (hospitals == null || hospitals.isEmpty()) {
            throw new HospitalNotFoundException("Hospitals with rating greater than " + minRating + " not found");
        }
        return hospitals.stream().map(hospitalMapper::convertToDto).collect(Collectors.toList());
    }

    @Override
    public List<HospitalDto> getHospitalsWithNumberOfDoctorsGreaterThan(int minDoctors) {
        List<Hospital> hospitals = hospitalRepository.findByNumberOfDoctorsGreaterThan(minDoctors);
        if (hospitals == null || hospitals.isEmpty()) {
            throw new HospitalNotFoundException("Hospitals with more than " + minDoctors + " doctors not found");
        }
        return hospitals.stream().map(hospitalMapper::convertToDto).collect(Collectors.toList());
    }

    @Override
    public List<HospitalDto> getHospitalsBySurgicalServices(List<String> surgicalServices) {
        List<Hospital> hospitals = hospitalRepository.findBySurgicalServicesIn(surgicalServices);
        if (hospitals == null || hospitals.isEmpty()) {
            throw new HospitalNotFoundException("Hospitals with surgical services not found");
        }
        return hospitals.stream().map(hospitalMapper::convertToDto).collect(Collectors.toList());
    }

    @Override
    public List<HospitalDto> getHospitalsByAccreditationStatus(List<String> accreditationStatusList) {
        List<Hospital> hospitals = hospitalRepository.findByAccreditationStatusIn(accreditationStatusList);
        if (hospitals == null || hospitals.isEmpty()) {
            throw new HospitalNotFoundException("Hospitals with accreditation status not found");
        }
        return hospitals.stream().map(hospitalMapper::convertToDto).collect(Collectors.toList());
    }

    @Override
    public List<HospitalDto> getHospitalsByInsuranceProviders(List<String> insuranceProviders) {
        List<Hospital> hospitals = hospitalRepository.findByInsuranceProvidersIn(insuranceProviders);
        if (hospitals == null || hospitals.isEmpty()) {
            throw new HospitalNotFoundException("Hospitals with insurance providers not found");
        }
        return hospitals.stream().map(hospitalMapper::convertToDto).collect(Collectors.toList());
    }

    @Override
    public List<HospitalDto> getHospitalsWithPharmacyServices() {
        List<Hospital> hospitals = hospitalRepository.findByPharmacyServicesTrue();
        if (hospitals == null || hospitals.isEmpty()) {
            throw new HospitalNotFoundException("Hospitals with pharmacy services not found");
        }
        return hospitals.stream().map(hospitalMapper::convertToDto).collect(Collectors.toList());
    }

    @Override
    public List<HospitalDto> getHospitalsWithRehabilitationServices() {
        List<Hospital> hospitals = hospitalRepository.findByRehabilitationServicesIsTrue();
        if (hospitals == null || hospitals.isEmpty()) {
            throw new HospitalNotFoundException("Hospitals with rehabilitation services not found");
        }
        return hospitals.stream().map(hospitalMapper::convertToDto).collect(Collectors.toList());
    }

    @Override
    public List<HospitalDto> getHospitalsWithSupportGroups(List<String> supportGroups) {
        List<Hospital> hospitals = hospitalRepository.findBySupportGroupsIn(supportGroups);
        if (hospitals == null || hospitals.isEmpty()) {
            throw new HospitalNotFoundException("Hospitals with support groups not found");
        }
        return hospitals.stream().map(hospitalMapper::convertToDto).collect(Collectors.toList());
    }

    @Override
    public List<HospitalDto> getHospitalsByDepartments(List<String> departments) throws HospitalNotFoundException {
        List<Hospital> hospitals = hospitalRepository.findByAvailableDepartmentsIn(departments);
        if (hospitals == null || hospitals.isEmpty()) {
            throw new HospitalNotFoundException("Hospitals with departments not found");
        }
        return hospitals.stream().map(hospitalMapper::convertToDto).collect(Collectors.toList());
    }

    @Override
    public List<HospitalDto> getHospitalsBySpecializationUnits(List<String> specializationUnits)
            throws HospitalNotFoundException {
        List<Hospital> hospitals = hospitalRepository.findBySpecializedUnitsIn(specializationUnits);
        if (hospitals == null || hospitals.isEmpty()) {
            throw new HospitalNotFoundException("Hospitals with specialization units not found");
        }
        return hospitals.stream().map(hospitalMapper::convertToDto).collect(Collectors.toList());
    }

}
