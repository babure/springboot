package com.hospitalapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hospitalapp.model.HospitalDto;
import com.hospitalapp.service.HospitalServiceImpl;
import com.hospitalapp.service.IHospitalService;

@SpringBootApplication
public class SpringHospitalappJpaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringHospitalappJpaApplication.class, args);
	}

	@Autowired
	private IHospitalService hospitalService;

	@Override
	public void run(String... args) throws Exception {
		HospitalDto hospitalDto = new HospitalDto("babu", "MS", 2, 2000000);
		hospitalService.addDoctor(hospitalDto);
		hospitalDto = new HospitalDto("pramod", "MBBS", 3, 10);
		hospitalService.addDoctor(hospitalDto);
		hospitalDto = new HospitalDto("Akshata", "GNM", 6, 600000);
		hospitalService.addDoctor(hospitalDto);
        
		System.out.println("------------------------------------------------------");
		
	    hospitalService.getAll().forEach(System.out::println);
	}

}
