package com.supriya.magento.ecommerce.authentication.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.supriya.magento.ecommerce.authentication.base.BaseTest;
import com.supriya.magento.ecommerce.authentication.utilities.DriverUtility;

public class MyListeners extends BaseTest implements ITestListener{
	
	
	  private static ExtentReports extent;
	    private static ExtentSparkReporter spark;
	
	    
	    private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();
	    
	    @Override
	public void onTestStart(ITestResult result) {
	    	  ExtentTest test = extent.createTest(result.getMethod().getMethodName());
	          extentTest.set(test);	
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		 extentTest.get().log(Status.PASS, "Test passed");	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		extentTest.get().log(Status.FAIL, "Test failed: " + result.getThrowable());

        try {
            String path = DriverUtility.captureScreenshot(result.getName());
            extentTest.get().addScreenCaptureFromPath(path);
        } catch (Exception e) {
            e.printStackTrace();
            extentTest.get().log(Status.WARNING, "Screenshot capture failed: " + e.getMessage());
        }
    }

	@Override
	public void onTestSkipped(ITestResult result) {
		extentTest.get().log(Status.SKIP, "Test skipped: " + result.getName());
        if (result.getThrowable() != null) {
            extentTest.get().log(Status.SKIP, "Skip reason: " + result.getThrowable().getMessage());
        }
    }
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onStart(ITestContext context) {
		extent = new ExtentReports();
        spark = new ExtentSparkReporter(System.getProperty("user.dir") + "/target/Extentreport.html");
        extent.attachReporter(spark);
    }
		
	

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}

}
