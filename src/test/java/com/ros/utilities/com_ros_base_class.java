package com.ros.utilities;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import com.ros.configurations.com_ros_browser_settings;

public class com_ros_base_class {

	public static WebDriver driver;

	public static void setupBase() throws Exception {
		String dr1 = System.getProperty("user.dir");

		InputStream input = new FileInputStream(dr1 + "/src/test/resources/property/ros.properties");
		Properties prop = new Properties();
		// load a properties file
		prop.load(input);
		String Browser = prop.getProperty("browser");
		com_ros_browser_settings br = new com_ros_browser_settings();
		driver = br.setupBrowser(Browser);
		driver.get("https://app.test.restaurantonesolution.com/login");
		driver.manage().window().maximize();
	}

	@AfterTest
	public static void tearDown() {
		driver.close();

	}

}
