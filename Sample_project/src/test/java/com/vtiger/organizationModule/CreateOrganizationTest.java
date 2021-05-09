package com.vtiger.organizationModule;

import org.testng.annotations.Test;

public class CreateOrganizationTest {
	@Test(groups="smoketest")
	public void createOrganizationTest() {		
		System.out.println("creating organization");
	}
	@Test(groups="regrassiontest")
	public void createOrganizationWithIndustryTest() {		
		System.out.println("creating organization with Industry");
	}
}
