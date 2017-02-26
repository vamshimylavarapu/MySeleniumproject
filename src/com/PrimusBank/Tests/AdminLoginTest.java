package com.PrimusBank.Tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.PrimusBank.Library.AdminHomepage;
import com.PrimusBank.Library.PrimusBankHomepage;
import com.PrimusBank.PrimusBankConstants.PrimusBankConstants;

public class AdminLoginTest  extends PrimusBankConstants
{

	@Test
	public void adminLoginTest() throws InterruptedException
	{
		Thread.sleep(5000);
		
		System.out.println("Adminloginstest started");
		boolean result;
		PrimusBankHomepage phme=new PrimusBankHomepage();
		
		phme.adminuid="Admin";
		phme.adminpwd="Admin";
		result=phme.adminLogin(phme.adminuid,phme.adminpwd);
		Assert.assertTrue(result);
		AdminHomepage adminhme=new AdminHomepage();
		adminhme.adminLogout1();
		
	}
	
	
	
	
	
	
	
	
}
