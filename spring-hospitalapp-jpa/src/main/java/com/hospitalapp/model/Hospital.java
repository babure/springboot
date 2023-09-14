package com.hospitalapp.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hospital {
	@Id
	private String id;
	private String name; // e.g., "City General Hospital"
	private String address; // e.g., "123 Main Street, City, State, ZIP"
	private String phone; // e.g., "+91 1234567890"
	private String email; // e.g., "info@cityhospital.com"
	private String type; // e.g., "Private"
	private String accreditationStatus; // e.g., "Joint Commission Accredited"
	private List<String> availableDepartments; // e.g., ["Cardiology", "Orthopedics", "Pediatrics"]
	private List<String> specializedUnits; // e.g., ["ICU", "NICU", "Maternity"]
	private List<String> diagnosticServices; // e.g., ["Radiology", "Laboratory"]
	private List<String> surgicalServices; // e.g., ["General Surgery", "Neurology"]
	private int numberOfDoctors; // e.g., 50
	private int numberOfNurses; // e.g., 100
	private int administrativeStaff; // e.g., 20
	private boolean emergencyServices; // e.g., true
	private boolean pharmacyServices; // e.g., true
	private boolean rehabilitationServices; // e.g., true
	private double rating; // e.g., 4.5
	private int reviews; // e.g., 500
	private List<String> insuranceProviders; // e.g., ["Aetna", "Blue Cross", "Cigna"]
	private String visitingHours; // e.g., "9:00 AM - 8:00 PM"
	private List<String> supportGroups; // e.g., ["Cancer support group", "Mental health support"]
	private List<String> events; // e.g., ["Health fair on October 10th"]

}
