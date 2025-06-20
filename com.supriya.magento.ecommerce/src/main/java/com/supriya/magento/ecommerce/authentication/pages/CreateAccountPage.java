package com.supriya.magento.ecommerce.authentication.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
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
	
	
	
	
	@FindBy(id="firstname")
	WebElement firstNameField;
	
	@FindBy(id="lastname")
	WebElement lastNameField;
	
	@FindBy(id="email_address")
	WebElement emailField;
	
	@FindBy(id="password")
	WebElement passwordField;
	
	@FindBy(id="password-confirmation")
	WebElement confirmPasswordField;
	
	@FindBy(xpath ="//button[@title='Create an Account']")
	WebElement createAccountButtonField;
	
	public void createNewAccount(String firstName, String lastName, String email, String password, String confirmPassword ) {
		firstNameField.sendKeys(firstName);
		lastNameField.sendKeys(lastName);
		emailField.sendKeys(email);
		passwordField.sendKeys(password);
		confirmPasswordField.sendKeys(confirmPassword);
		createAccountButtonField.click();
	}
	
}
