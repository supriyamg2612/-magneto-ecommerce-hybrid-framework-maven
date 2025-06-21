package com.supriya.magento.ecommerce.authentication.test;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.supriya.magento.ecommerce.authentication.base.BaseTest;
import com.supriya.magento.ecommerce.authentication.pages.HomePage;

public class HomePageTest extends BaseTest {
	
	

HomePage hp;
WebDriverWait wait;


@BeforeClass
		public void configuration() throws Exception {
	initialization();
			hp=new HomePage(driver);
			
			this.wait = new WebDriverWait(driver, 10);
			
		}

		@Test
		 public void verifySignInLinkNavigatesToSignInPage() {
			hp.signInToApplicationLink();
			wait.until(ExpectedConditions.titleIs("Customer Login"));
			String actualTitle = getPageTitle();
			String expectedTitle = "Customer Login";
		    Assert.assertEquals(actualTitle, expectedTitle, "Sign-in page title did not match!");

		}
		
		@Test
		public void verifyCreateAccountLinkNavigatesToCreateAccountnPage() {
			
			hp.createAccountLink();
			wait.until(ExpectedConditions.titleIs("Create New Customer Account"));
			String actualTitle = getPageTitle();
			String expectedTitle = "Create New Customer Account";
			Assert.assertEquals(actualTitle, expectedTitle, "Create New Customer Account page title did not match!");	
			}
		
		
		@AfterClass
		    public void tearDown() {
		        if (driver != null) {
		            driver.quit();
		        }

}
}