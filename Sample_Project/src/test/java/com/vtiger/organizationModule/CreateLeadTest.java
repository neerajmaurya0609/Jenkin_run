package com.vtiger.organizationModule;

import org.testng.annotations.Test;

public class CreateLeadTest {
	@Test(groups="smoketest")
	public void createLeadTest() {		
		System.out.println("create lead");
	}
	@Test(groups="regrassiontest")
	public void createLeadWithOrgNameTest() {		
		System.out.println("creating organization with Organization Name");
	}
}
