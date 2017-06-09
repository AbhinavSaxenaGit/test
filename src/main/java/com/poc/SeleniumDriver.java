package com.poc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SeleniumDriver {
	
	WebDriver driver = null;
	
	@BeforeMethod
	//Starting driver instance
	public boolean startDriver() {
		try {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"/src/main/resources/chromedriver.exe");
			driver = new ChromeDriver(); 				
			return true;
		} catch (Exception ex) {
			System.out.println("Excpetion while stopping browser " + ex);
			return false;
		}
	}

	@AfterMethod
	//Stopping driver instance
	public boolean stopDriver() {
		try {
			driver.quit();
			return true;
		} catch (Exception ex) {
			System.out.println("Excpetion while stopping browser " + ex);
			return false;
		}
	}
}
