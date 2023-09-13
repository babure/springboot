package com.hospitalapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospitalapp.model.Hospital;

public interface IHospitalRepository extends JpaRepository<Hospital, Integer>{

}
