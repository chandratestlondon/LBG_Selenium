package com.LBG.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestBaseClass {

	public static WebDriver driver;
	public static Properties prop;
	
	
	public  TestBaseClass()
	{
		try {
			prop =new Properties();
			String filepath ="F:\\OrangeHRM_Automation\\LBG_Selenium\\src\\main\\java\\com\\LBG\\config\\config.properties";
			
			
		    FileInputStream fs =new FileInputStream(filepath);
		    prop.load(fs);
       	}catch(FileNotFoundException e) {
	    	e.printStackTrace();
		
	      }catch(IOException e) {
		    e.printStackTrace();
	       } 
	}
	
	
	public static void Initilization()
	{
		String driverpath= prop.getProperty("driverpath");
		System.setProperty("webdriver.gecko.driver", driverpath);
		driver =new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get(prop.getProperty("url"));
	}
	
}
