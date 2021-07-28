package com.optimagrowth.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.optimagrowth.config.ServiceConfig;
import com.optimagrowth.model.License;
import com.optimagrowth.repository.LicenseRepository;

@Service
public class LicenseService {

	@Autowired
	LicenseRepository licenseRepository;

	@Autowired
	ServiceConfig serviceConfig;

	public License getLicense(String organizationId, String licenseId) {

		License license = licenseRepository.findByOrganizationIdAndLicenseId(organizationId, licenseId);

		return license.withComment(serviceConfig.getExampleProperty());

	}

	public List<License> getLicensesByOrg(String organizationId) {
		return licenseRepository.findByOrganizationId(organizationId);
	}

	public void saveLicense(License license) {
		license.withId(UUID.randomUUID().toString());

		licenseRepository.save(license);

	}

	public void updateLicense(License license) {
		licenseRepository.save(license);
	}

	public void deleteLicense(License license) {
		licenseRepository.deleteById(license.getLicenseId());
	}

}
