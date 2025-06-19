package com.supriya.magento.ecommerce.authentication.test;

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
	
	@BeforeClass
	public void configuration() throws Exception {
		initialization();
		hp=new HomePage(driver);
		
	reportInitialization();
		
	}
	
	@Test
	public void verifySignInToApplicationT() {
		sp=hp.signInToApplicationLink();
		
		sp.signInToApplication("celinaredden123@gmail.com", "Celinaredden123");
		String actualTitle= driver.getTitle();
		String expectedTitle="Home Page";
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}
	
	 @AfterClass
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	        }
	

}
