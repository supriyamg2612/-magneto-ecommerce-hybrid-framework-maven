package com.supriya.magento.ecommerce.authentication.test;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.supriya.magento.ecommerce.authentication.base.BaseTest;
import com.supriya.magento.ecommerce.authentication.pages.HomePage;
import com.supriya.magento.ecommerce.authentication.pages.SignInPage;

public class SignInPageTest extends BaseTest{
	
	SignInPage sp;
	HomePage hp;
	WebDriverWait wait;
	
	@BeforeClass
	public void configuration() throws Exception {
		initialization();
		hp=new HomePage(driver);
		this.wait = new WebDriverWait(driver, 10);
		
		
	
		
	}
	
	@Test
	public void verifySignInRedirectsToHomePage() {
		sp=hp.signInToApplicationLink();
		
		sp.signInToApplication("celinaredden123@gmail.com", "Celinaredden123");
	    wait.until(ExpectedConditions.titleIs("Home Page")); 

		String actualTitle= getPageTitle();
		String expectedTitle="Home Page";
		 Assert.assertEquals(actualTitle, expectedTitle, "Title did not match!");
		
	}
	
	
	
	@AfterClass
	  public void tearDown() {
	     if (driver != null) {
	         driver.quit();
	     }
	     }
	

}
