package com.supriya.magento.ecommerce.authentication.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.supriya.magento.ecommerce.authentication.utilities.PropertyUtility;

public class SignInPage {

	WebDriver driver ;
	WebDriverWait wait;

	public SignInPage(WebDriver driver) {
		this.driver=driver;
		this.wait = new WebDriverWait(driver, 10);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Sign In")
	WebElement signInLink;
	
	@FindBy(id="email")
	WebElement emailField;
	
	@FindBy(id="pass")
	WebElement passwordField;
	
	@FindBy(id="send2")
	 WebElement signInButton;
	
	public void signInToApplication(String email, String password) {
		emailField.sendKeys(email);
		passwordField.sendKeys(password);
		signInButton.click();
	}
	
	public DashboardPage validLogin() throws Exception {
		emailField.sendKeys(PropertyUtility.readProperty("email"));
		passwordField.sendKeys(PropertyUtility.readProperty("password"));
		signInButton.click();
		return new DashboardPage(driver);
	}
	
	
	

}
