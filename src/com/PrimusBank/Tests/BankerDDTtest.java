package com.PrimusBank.Tests;

import java.io.IOException;

import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.PrimusBank.Library.BankerHomepage;
import com.PrimusBank.Library.PrimusBankHomepage;
import com.PrimusBank.PrimusBankConstants.PrimusBankConstants;
import com.utils.XLutils;


public class BankerDDTtest extends PrimusBankConstants
{

	PrimusBankHomepage phme=new PrimusBankHomepage();
	
	@Test
	public void bankerLogIntest() throws IOException, InterruptedException
	{
		
		String xlfile="D:\\vamshi1.xlsx";
		String xlsheet="Sheet1";
		PrimusBankHomepage phme=new PrimusBankHomepage();
		BankerHomepage bhme=new BankerHomepage();
		int rc=XLutils.getRowcoun(xlfile, xlsheet);
		System.out.println(rc);
		boolean res;

		for (int i = 1; i <= rc; i++) 
		{
			phme.branchname=XLutils.getcelldata(xlfile,xlsheet,i,0);
			phme.bankeruid=XLutils.getcelldata(xlfile,xlsheet,i,1);
			phme.bankerpwd=XLutils.getcelldata(xlfile,xlsheet,i,2);
			String some=phme.branchname;
			System.out.println(some);
			Sleeper.sleepTightInSeconds(5);
			res=phme.bankerLogin(phme.branchname,phme.bankeruid,phme.bankerpwd);
			if (res)
			{
			//if banker login suceefully enetered print this data
				XLutils.setcelldata(xlfile, xlsheet,1,3,"pass");
				XLutils.fillgreencolor(xlfile, xlsheet,1,3);		
			}
			else 
			{
				XLutils.setcelldata(xlfile, xlsheet, 1, 3,"fail");
				XLutils.fillRedColor(xlfile, xlsheet,1, 3);
			}
			bhme.bankerLogout();
		}
		
		
		
		
		
	}
	
	
	
	
	/*@DataProvider
	public Object logIndata() throws IOException
	{
	int rowcount=XLutils.getRowcoun("D:\\vamshi.xlsx","Sheet1");
		int cellcount=XLutils.getcellcount("D:\\vamshi.xlsx","Sheet1",1);
		System.out.println(rowcount);
		System.out.println(cellcount);
		Object[][] data=new Object[rowcount][cellcount];
		
		for (int i = 1; i<=rowcount; i++) 
		{
		
			data[i-1][0]=XLutils.getcelldata("D:\\vamshi.xlsx","Sheet1",i,0);
			data[i-1][1]=XLutils.getcelldata("D:\\vamshi.xlsx","Sheet1",i,1);
			data[i-1][2]=XLutils.getcelldata("D:\\vamshi.xlsx","Sheet1",i,2);
			
		}
		return data;
		
	
		*/
		
	}
	

