package com.supriya.magento.ecommerce.authentication.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.supriya.magento.ecommerce.authentication.base.BaseTest;
import com.supriya.magento.ecommerce.authentication.utilities.DriverUtility;

public class MyListeners extends BaseTest implements ITestListener{
	@Override
	public void onTestStart(ITestResult result) {
		test = report.createTest(result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "TestCase Passes"+result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "TestCase Failed"+result.getName());

		try {
	        String path = DriverUtility.captureScreenshot(result.getName());
	        test.addScreenCaptureFromPath(path);
	    } catch (Exception e) {
	        e.printStackTrace();
	        test.log(Status.WARNING, "Screenshot capture failed due to: " + e.getMessage());
	    }
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "TestCase Skipped"+result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
	}

}
