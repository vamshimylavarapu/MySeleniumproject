package com.PrimusBank.Tests;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.PrimusBank.Library.AdminHomepage;
import com.PrimusBank.Library.CreateBranch;
import com.PrimusBank.PrimusBankConstants.AdminHomepageConstants;
import com.PrimusBank.PrimusBankConstants.PrimusBankConstants;

public class CreateBranchTest extends AdminHomepageConstants
{ 
	   
	@Test
	public void branchTest()
	{
		System.out.println("starting Branch Creation Test");
		boolean rsult;
		CreateBranch chme=new CreateBranch();
		chme.branchname="lbnagar1145";
		chme.Add1="vijay";
		chme.zip="50824";
		chme.country="INDIA";
		chme.state="Andhra Pradesh";
		chme.city="Hyderabad";
		
		rsult=chme.branchcreation(chme.branchname, chme.Add1, chme.zip,chme.country,chme.state,chme.city);
		
		Assert.assertTrue(rsult);
		
		
	}
	    
	

}
