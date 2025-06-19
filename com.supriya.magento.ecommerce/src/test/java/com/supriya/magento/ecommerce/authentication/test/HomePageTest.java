package com.supriya.magento.ecommerce.authentication.test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.supriya.magento.ecommerce.authentication.base.BaseTest;
import com.supriya.magento.ecommerce.authentication.pages.HomePage;

public class HomePageTest extends BaseTest {
	
	

HomePage hp;


@BeforeClass
		public void configuration() throws Exception {
			initialization();
			hp=new HomePage(driver);
			reportInitialization();
			
		}

		@Test
		 public void verifySignInLinkNavigatesToSignInPage() {
			hp.signInToApplicationLink();
			String actualTitle = driver.getTitle();
			String expectedTitle = "Customer Login";
			Assert.assertEquals(actualTitle, expectedTitle);
		}
		 @AfterClass
		    public void tearDown() {
		        if (driver != null) {
		            driver.quit();
		        }

}
}