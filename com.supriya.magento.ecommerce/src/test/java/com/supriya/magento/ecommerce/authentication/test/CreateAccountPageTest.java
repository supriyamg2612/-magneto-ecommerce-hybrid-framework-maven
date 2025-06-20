package com.supriya.magento.ecommerce.authentication.test;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
	WebDriverWait wait;
	
	
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
		wait.until(ExpectedConditions.titleIs("My Account"));
		String actaulTitle= getPageTitle();
		String expectedTitle= "My Account";
		Assert.assertEquals(actaulTitle, expectedTitle, "Title did not match!");
	}
	
	 @AfterClass
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }

}


}
