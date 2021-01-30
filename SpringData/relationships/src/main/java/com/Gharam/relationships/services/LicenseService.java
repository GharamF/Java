package com.Gharam.relationships.services;


import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Gharam.relationships.Repository.LicenseRepository;
import com.Gharam.relationships.models.License;


@Service
public class LicenseService {

	private final LicenseRepository LicenseRepository;
	
	public LicenseService(LicenseRepository LicenseRepository){
		this.LicenseRepository =LicenseRepository;
	}

	
	public License addLicense(License license) {
		return LicenseRepository.save(license);
	}
	
	public Optional<License> getLicense(Long id) {
		return LicenseRepository.findById(id);
	}
	
	public static int licenseNumber;

	public static int getLicenseNumber() {
		return licenseNumber;
	}

	public static void setLicenseNumber(int licenseNumber) {
		LicenseService.licenseNumber = licenseNumber;
	}

	
	
	public int generateLicenseNumber() {
		License l = LicenseRepository.findTopByOrderByNumberDesc();
		if(l == null)
			return 1;
		int largestNumber =l.getNumber();
		largestNumber++;
		return (largestNumber);
	}

}
