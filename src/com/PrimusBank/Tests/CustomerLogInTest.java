package com.PrimusBank.Tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.PrimusBank.Library.CustomerHomePage;
import com.PrimusBank.Library.PrimusBankHomepage;
import com.PrimusBank.PrimusBankConstants.PrimusBankConstants;

public class CustomerLogInTest extends PrimusBankConstants
{

	@Test
	public void customerLogin() throws InterruptedException
	{
		System.out.println("customer login Started");
		boolean result;
		PrimusBankHomepage phme=new PrimusBankHomepage();
		phme.custuid="sandeep";
		phme.custpwd="sandeep";
		result=phme.customerLogin(phme.custuid, phme.custpwd);
		Assert.assertTrue(result);
		CustomerHomePage custhme=new CustomerHomePage();
		custhme.customerLogout();
		
	}
	
	
	
	
	
	
	
}
