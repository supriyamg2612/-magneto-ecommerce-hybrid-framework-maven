package com.supriya.magento.ecommerce.authentication.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class HomePage {
	
	WebDriver driver ;
	WebDriverWait wait;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		this.wait = new WebDriverWait(driver, 10);
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(linkText = "Sign In")
	WebElement signInLink;
	
	@FindBy(linkText = "Create an Account")
	WebElement createAnAccountLink;
	
	@FindBy(xpath = "//button[@id='disagree-btn']")
	WebElement disagreeButton;
	
	@FindBy(xpath = "//button[@id='accept-btn']")
	WebElement agreeButton;

	
	public void handleCookieConsent(String option) {
		try {
	        
	        wait.until(ExpectedConditions.visibilityOf(agreeButton));

	        switch (option.toLowerCase()) {
	            case "agree":
	                agreeButton.click();
	                break;
	            case "disagree":
	                disagreeButton.click();
	                break;
	    
	            default:
	                break;
	        }
	    } catch (Exception e) {
	        // No popup shown
	    }
	}
	
	
	
	
	
	public SignInPage signInToApplicationLink() {
		handleCookieConsent("agree");
		wait.until(ExpectedConditions.elementToBeClickable(signInLink));
		signInLink.click();
		
		return new SignInPage(driver);
		//button[@id='disagree-btn']
	}
	public CreateAccountPage createAccountLink() {
		handleCookieConsent("agree");
		wait.until(ExpectedConditions.elementToBeClickable(createAnAccountLink));
		createAnAccountLink.click();
		return new CreateAccountPage(driver);
	}
}