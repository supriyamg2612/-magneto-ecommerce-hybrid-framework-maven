package com.supriya.magento.ecommerce.authentication.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAccountPage {

	WebDriver driver ;
	WebDriverWait wait;
	
	public CreateAccountPage(WebDriver driver) {
		this.driver=driver;
		this.wait = new WebDriverWait(driver, 10);
		PageFactory.initElements(driver, this);
	}

}
