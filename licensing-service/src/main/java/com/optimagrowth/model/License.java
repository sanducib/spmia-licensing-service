package com.optimagrowth.model;

public class License {
	
	  private String id;
	  private String organizationId;
	  private String productName;
	  private String licenseType;

	public String getId() {
		return id;
	}
	public License withId(String id) {
		this.id = id;
		return this;
	}
	public String getOrganizationId() {
		return organizationId;
	}
	public License withOrganizationId(String organizationId) {
		this.organizationId = organizationId;
		return this;
	}
	public String getProductName() {
		return productName;
	}
	public License withProductName(String productName) {
		this.productName = productName;
		return this;
	}
	public String getLicenseType() {
		return licenseType;
	}
	public License withLicenseType(String licenseType) {
		this.licenseType = licenseType;
		return this;
	}
	
	public void setLicenseType(String licenseType) {
		this.licenseType = licenseType;
	}
	  
	  

}
