package com.hospitalapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringHospitalappJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHospitalappJpaApplication.class, args);
	}

/*	@Autowired
	private IHospitalService hospitalService;
	@Override
	public void run(String... args) throws Exception {*/

		/*
		 * HospitalDto hospitalInfo2 = new HospitalDto( "2", "Sunset Medical Center",
		 * "456 Sunset Avenue, Town, State, ZIP", "+1 (555) 987-6543",
		 * "info@sunsetmedical.com", "Public", "Medicare Certified",
		 * Arrays.asList("Internal Medicine", "Pediatrics", "Dermatology"),
		 * Arrays.asList("ICU", "Cardiac Care Unit", "Neonatal ICU"),
		 * Arrays.asList("Radiology", "Pathology"), Arrays.asList("General Surgery",
		 * "Orthopedic Surgery"), 75, 150, 30, true, true, false, 4.2, 300,
		 * Arrays.asList("Medicare", "Medicaid", "Blue Cross"), "8:00 AM - 6:00 PM",
		 * Arrays.asList("Diabetes Support Group", "Heart Health Seminar"),
		 * Arrays.asList("Health Expo on November 15th") );
		 * 
		 * hospitalService.addHospital(hospitalInfo2);
		 */
	
	
		/*
		 * // Calling the getAll() function and printing the result List<HospitalDto>
		 * allHospitals = hospitalService.getAll();
		 * System.out.println("Printing List of All Hospitals:");
		 * allHospitals.forEach(System.out::println); System.out.println();
		 * 
		 * // Calling the getHospitalsByName() function and printing the result String
		 * hospitalName = "City General Hospital"; List<HospitalDto> hospitalsByName =
		 * hospitalService.getHospitalsByName(hospitalName);
		 * System.out.println("Printing Hospitals by Name ('City General Hospital'):");
		 * hospitalsByName.forEach(System.out::println); System.out.println();
		 * 
		 * // Calling the getHospitalsByLocation() function and printing the result
		 * String location = "123 Main Street, City, State, ZIP"; List<HospitalDto>
		 * hospitalsByLocation = hospitalService.getHospitalsByLocation(location);
		 * System.out.
		 * println("Printing Hospitals by Location ('123 Main Street, City, State, ZIP'):"
		 * ); hospitalsByLocation.forEach(System.out::println); System.out.println();
		 * 
		 * // Calling the getHospitalsByType() function and printing the result String
		 * type = "Private"; List<HospitalDto> hospitalsByType =
		 * hospitalService.getHospitalsByType(type);
		 * System.out.println("Printing Hospitals by Type ('Private'):");
		 * hospitalsByType.forEach(System.out::println); System.out.println();
		 * 
		 * // Calling the getHospitalsByDepartments() function and printing the result
		 * List<String> departments = List.of("Cardiology", "Orthopedics");
		 * List<HospitalDto> hospitalsByDepartments =
		 * hospitalService.getHospitalsByDepartments(departments); System.out.
		 * println("Printing Hospitals by Departments ('Cardiology', 'Orthopedics'):");
		 * hospitalsByDepartments.forEach(System.out::println); System.out.println();
		 * 
		 * // Calling the getHospitalsBySpecializationUnits() function and printing the
		 * result List<String> specializationUnits = List.of("ICU", "Maternity");
		 * List<HospitalDto> hospitalsBySpecializationUnits =
		 * hospitalService.getHospitalsBySpecializationUnits(specializationUnits);
		 * System.out.
		 * println("Printing Hospitals by Specialization Units ('ICU', 'Maternity'):");
		 * hospitalsBySpecializationUnits.forEach(System.out::println);
		 * System.out.println();
		 * 
		 * // Calling the getHospitalsWithRatingGreaterThan() function and printing the
		 * result double minRating = 4.0; List<HospitalDto>
		 * hospitalsWithRatingGreaterThan =
		 * hospitalService.getHospitalsWithRatingGreaterThan(minRating);
		 * System.out.println("Printing Hospitals with Rating Greater Than 4.0:");
		 * hospitalsWithRatingGreaterThan.forEach(System.out::println);
		 * System.out.println();
		 * 
		 * // Calling the getHospitalsWithNumberOfDoctorsGreaterThan() function and
		 * printing the result int minDoctors = 75; List<HospitalDto>
		 * hospitalsWithDoctorsGreaterThan =
		 * hospitalService.getHospitalsWithNumberOfDoctorsGreaterThan(minDoctors);
		 * System.out.println("Printing Hospitals with More Than 75 Doctors:");
		 * hospitalsWithDoctorsGreaterThan.forEach(System.out::println);
		 * System.out.println();
		 * 
		 * // Calling the getHospitalsBySurgicalServices() function and printing the
		 * result List<String> surgicalServices = List.of("Radiology", "Neurology");
		 * List<HospitalDto> hospitalsBySurgicalServices =
		 * hospitalService.getHospitalsBySurgicalServices(surgicalServices); System.out.
		 * println("Printing Hospitals by Surgical Services ('Radiology', 'Neurology'):"
		 * ); hospitalsBySurgicalServices.forEach(System.out::println);
		 * System.out.println();
		 * 
		 * // Calling the getHospitalsByAccreditationStatus() function and printing the
		 * result List<String> accreditationStatusList =
		 * List.of("Joint Commission Accredited"); List<HospitalDto>
		 * hospitalsByAccreditationStatus =
		 * hospitalService.getHospitalsByAccreditationStatus(accreditationStatusList);
		 * System.out.
		 * println("Printing Hospitals by Accreditation Status ('Joint Commission Accredited'):"
		 * ); hospitalsByAccreditationStatus.forEach(System.out::println);
		 * System.out.println();
		 * 
		 * // Calling the getHospitalsByInsuranceProviders() function and printing the
		 * result List<String> insuranceProviders = List.of("Aetna", "Blue Cross");
		 * List<HospitalDto> hospitalsByInsuranceProviders =
		 * hospitalService.getHospitalsByInsuranceProviders(insuranceProviders);
		 * System.out.
		 * println("Printing Hospitals by Insurance Providers ('Aetna', 'Blue Cross'):"
		 * ); hospitalsByInsuranceProviders.forEach(System.out::println);
		 * System.out.println();
		 * 
		 * // Calling the getHospitalsWithPharmacyServices() function and printing the
		 * result List<HospitalDto> hospitalsWithPharmacyServices =
		 * hospitalService.getHospitalsWithPharmacyServices();
		 * System.out.println("Printing Hospitals with Pharmacy Services:");
		 * hospitalsWithPharmacyServices.forEach(System.out::println);
		 * System.out.println();
		 * 
		 * // Calling the getHospitalsWithRehabilitationServices() function and printing
		 * the result List<HospitalDto> hospitalsWithRehabilitationServices =
		 * hospitalService.getHospitalsWithRehabilitationServices();
		 * System.out.println("Printing Hospitals with Rehabilitation Services:");
		 * hospitalsWithRehabilitationServices.forEach(System.out::println);
		 * System.out.println();
		 * 
		 * // Calling the getHospitalsWithSupportGroups() function and printing the
		 * result List<String> supportGroups = List.of("Cancer support group",
		 * "Mental health support"); List<HospitalDto> hospitalsWithSupportGroups =
		 * hospitalService.getHospitalsWithSupportGroups(supportGroups); System.out.
		 * println("Printing Hospitals with Support Groups ('Cancer support group', 'Mental health support'):"
		 * ); hospitalsWithSupportGroups.forEach(System.out::println);
		 * System.out.println(); }
		 */


}
