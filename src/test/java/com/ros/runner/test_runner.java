package com.ros.runner;


import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.ros.configurations.com_ros_browser_settings;
import com.ros.utilities.com_ros_base_class;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features/com.ros.authentication/login.feature", glue ="StepsDefinition", plugin={"pretty", "html:target/cucumber.html"}, monochrome=true)

@Test
public class test_runner extends AbstractTestNGCucumberTests {
	
	static WebDriver driver;
	
	
	@BeforeSuite
	public static void setup() throws Exception
	{
      com_ros_base_class.setupBase();
	}
	
	

}

