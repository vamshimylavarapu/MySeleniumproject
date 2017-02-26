package com.PrimusBank.Tests;

import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.PrimusBank.Library.BankerHomepage;
import com.PrimusBank.Library.PrimusBankHomepage;
import com.PrimusBank.PrimusBankConstants.PrimusBankConstants;

public class BankerLoginTest extends PrimusBankConstants
{

	@Test
	public void bankerLoginTest() throws InterruptedException
	{
		System.out.println("banker logins started");
		boolean result;
		Sleeper.sleepTightInSeconds(5);
		PrimusBankHomepage phme=new PrimusBankHomepage();
		phme.branchname="Ameerpet";
		phme.bankeruid="divyaggg";
		phme.bankerpwd="sree";
		Sleeper.sleepTightInSeconds(5);
		result=phme.bankerLogin(phme.branchname,phme.bankeruid,phme.bankerpwd);
		Assert.assertTrue(result);
		BankerHomepage bhme=new BankerHomepage();
		bhme.bankerLogout();
		
	}
	
	
	
	
	
}
