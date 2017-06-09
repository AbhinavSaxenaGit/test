package com.poc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumMethods {
	WebDriver driver = null;
	
	public SeleniumMethods(WebDriver driver){
		this.driver = driver;
	}
	
	//Accessing a URL
	public boolean openURL(String url) {
		driver.get(url);
		return true;
	}
	
	//Method to check if element present on the page
	public boolean isElementPresent(By xpath) {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(xpath);
		return true;
	}
	
	//Method to get title of the page
	public String getTitle(){
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		return driver.getTitle();
	}

}
