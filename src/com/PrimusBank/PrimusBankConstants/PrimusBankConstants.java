package com.PrimusBank.PrimusBankConstants;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.PrimusBank.Library.AdminHomepage;
import com.PrimusBank.Library.PrimusBankHomepage;
import com.beust.jcommander.Parameter;

public class PrimusBankConstants 
{

	
	//public static WebDriver driver=new FirefoxDriver();
	public static DesiredCapabilities cap=null;
	public static RemoteWebDriver driver;
	public static String url="http://primusbank.qedgetech.com";
	
	@Parameters({"browser","os"})
	@BeforeSuite
	public static void launchApp(String b,String o) throws MalformedURLException
	{
		
		if(b.equalsIgnoreCase("ie"))
		{
			cap=DesiredCapabilities.internetExplorer();
			
		}/*else if (b.equalsIgnoreCase("chrome"))
		{
			cap=DesiredCapabilities.chrome();
			
			
		}else if (b.equalsIgnoreCase("iexplore")) 
		{
			cap=DesiredCapabilities.internetExplorer();
			
		}
		*/
		if(o.equalsIgnoreCase("windows"))
		{
			cap.setPlatform(Platform.WINDOWS);
			
		}else if (o.equalsIgnoreCase("linux")) 
		{
			cap.setPlatform(Platform.LINUX);
		}
		driver=new RemoteWebDriver(new URL("http://10.0.0.103:4444/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(url);
		
	}
	
	
	@AfterSuite
	public static void closeApp()
	{
		
		driver.close();
		
	}
	
	
	
}
