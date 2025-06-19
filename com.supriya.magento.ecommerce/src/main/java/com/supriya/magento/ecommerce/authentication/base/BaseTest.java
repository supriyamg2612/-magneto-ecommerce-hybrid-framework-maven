package com.supriya.magento.ecommerce.authentication.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.supriya.magento.ecommerce.authentication.utilities.PropertyUtility;

public class BaseTest {
	
	public static ExtentReports report = null;

	public static ExtentSparkReporter spark = null;

	public static ExtentTest test = null;

	
	public static  WebDriver driver = null;
	
	public void initialization() throws Exception {
		String browserName = PropertyUtility.readProperty("browser"); //reading browser name
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
			driver = new ChromeDriver();
		}

		if(browserName.equalsIgnoreCase("firefox")) {

		System.setProperty("webdriver.gecko.driver", "driver/geckodriver");

		driver = new FirefoxDriver();

		}
		driver.manage().window().maximize();

		driver.get(PropertyUtility.readProperty("url"));
		}
	
	public void reportInitialization() {

		report = new ExtentReports();

		spark = new ExtentSparkReporter(System.getProperty("user.dir")+"/target/Extentreports.html");

		report.attachReporter(spark);

		}

		
	
	
	
}
