package com.supriya.magento.ecommerce.authentication.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.supriya.magento.ecommerce.authentication.base.BaseTest;
import com.supriya.magento.ecommerce.authentication.pages.DashboardPage;
import com.supriya.magento.ecommerce.authentication.pages.HomePage;
import com.supriya.magento.ecommerce.authentication.pages.SignInPage;

public class DashboardPageTest extends BaseTest{
	
	DashboardPage dp;
	HomePage hp;
	SignInPage sp;
	
	@BeforeClass
	public void configuration() throws Exception {
		initialization();
		hp=new HomePage(driver);
		sp=new SignInPage(driver);
		reportInitialization();
		
	}
	
	@Test
	public void verfiyValidLoginNavigatesToDashboardPage() {
		hp.signInToApplicationLink();
		dp=sp.validLogin();
		Assert.assertEquals(driver.getTitle(), "Home Page");
	}

}
