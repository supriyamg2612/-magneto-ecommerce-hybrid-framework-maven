package com.supriya.magento.ecommerce.authentication.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyUtility {
	
	
	
	public static String readProperty(String key) throws Exception {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/properties/config.properties");

		prop.load(fis);
		return prop.getProperty(key);
		
	}

}
