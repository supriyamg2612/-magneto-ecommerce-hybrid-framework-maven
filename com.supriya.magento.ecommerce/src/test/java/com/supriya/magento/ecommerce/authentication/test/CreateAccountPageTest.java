package com.supriya.magento.ecommerce.authentication.test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.supriya.magento.ecommerce.authentication.base.BaseTest;
import com.supriya.magento.ecommerce.authentication.pages.CreateAccountPage;
import com.supriya.magento.ecommerce.authentication.pages.HomePage;

public class CreateAccountPageTest extends BaseTest {
	CreateAccountPage cp;
	HomePage hp;
	
	
	@BeforeClass
	public void configuration() throws Exception {
		initialization();
		hp=new HomePage(driver);
		cp= new CreateAccountPage(driver);
		reportInitialization();
		
	}
	
	@Test
	public void verifyNewAccountCreation() {
		hp.createAccountLink();
		cp.createNewAccount("Alex", "Jones", "jones123@gmail.com", "Jones@123", "Jones@123");
		String actaulTitle= driver.getTitle();
		String expectedTitle= "My Account";
		Assert.assertEquals(actaulTitle, expectedTitle);
	}
	
	 @AfterClass
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }

}


}
