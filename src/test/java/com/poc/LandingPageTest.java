package com.poc;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.poc.AppPages.LandingPage;

public class LandingPageTest extends SeleniumDriver
{
	SeleniumMethods selObj = new SeleniumMethods(driver);
	
	@Test
    public void validateHomePageOfWiki()
    {
		SeleniumMethods obj = new SeleniumMethods(driver);
		obj.openURL(ConfigReader.getConfig("url"));
		Assert.assertFalse(obj.isElementPresent(LandingPage.logo), "*****Falied*****");
		System.out.println("Method :: validateHomePageOfWiki executed by thread "+Thread.currentThread().getId());		
    }
	
	@Test
	public void validateTitleOfWiki(){
		SeleniumMethods obj = new SeleniumMethods(driver);
		obj.openURL(ConfigReader.getConfig("url"));
		Assert.assertEquals(obj.getTitle(), LandingPage.title);
		System.out.println("Method :: validateTitleOfWiki executed by thread "+Thread.currentThread().getId());
	}
	
	//@Test
	public void validateTitleOfWikWrong(){
		SeleniumMethods obj = new SeleniumMethods(driver);
		obj.openURL(ConfigReader.getConfig("url"));
		Assert.assertEquals(obj.getTitle(), "Wikipedia");
		System.out.println("Method :: validateTitleOfWiki executed by thread "+Thread.currentThread().getId());
	}	
}
