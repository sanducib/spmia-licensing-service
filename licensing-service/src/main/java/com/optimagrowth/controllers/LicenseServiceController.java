package com.optimagrowth.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.optimagrowth.config.ServiceConfig;
import com.optimagrowth.model.License;
import com.optimagrowth.services.LicenseService;

@RestController
@RequestMapping(value="v1/organizations/{organizationId}/licenses")
public class LicenseServiceController {
	
	@Autowired
	private ServiceConfig serviceConfig;
	
	@Autowired
	private LicenseService licenseService;
	
	@RequestMapping(value="{licenseId}" , method = RequestMethod.GET)
	public License getLicense(@PathVariable("organizationId") String organizationId , 
							  @PathVariable("licenseId") String licenseId) {
		
		return licenseService.getLicense(organizationId, licenseId);
	}
	
	@RequestMapping(value="{licenseId}" , method=RequestMethod.PUT)
	public String updateLicenses(@PathVariable("licenseId")String licenseId) {
		return String.format("This is the put");
	}
	
	@RequestMapping(value="{licenseId}" , method=RequestMethod.POST)
	public String saveLicenses(@PathVariable("licenseId")String licenseId) {
		return String.format("This is post");
		}
	
	@RequestMapping(value="{licenseId}" , method=RequestMethod.DELETE)
	public String deleteLicenses(@PathVariable String licenseId) {
		return String.format("This is delete");
	}
	
	}
