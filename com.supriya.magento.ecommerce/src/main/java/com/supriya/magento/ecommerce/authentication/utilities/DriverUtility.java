package com.supriya.magento.ecommerce.authentication.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.supriya.magento.ecommerce.authentication.base.BaseTest;

public class DriverUtility extends BaseTest{
	
	public static String captureScreenshot (String name) throws Exception {

		TakesScreenshot tc = (TakesScreenshot)driver;

		File src = tc.getScreenshotAs(OutputType.FILE);

		String path = System.getProperty("user.dir")+"/src/test/resourses/screenshots/"+name+".jpg";

		File dest = new File(path);
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return path;

		
		
	}


}
