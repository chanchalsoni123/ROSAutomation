package com.ros.pageobjects.authentication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ros.utilities.com_ros_base_class;

public class pageobject_authentication extends com_ros_base_class{
	

	WebDriverWait wait;	
	

	public pageobject_authentication(WebDriver driver) {
        this.driver = driver;

	}
	
	@FindBy(xpath = "//*[text()='LOGIN']")
	private WebElement login;
	
	@FindBy(id = "email")
	private WebElement emailAddress;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(id = "next")
	private WebElement signin;
	
	
	public pageobject_authentication clickLogin()
	{

		login.click();
		return this;
	}
	
	
	public pageobject_authentication provideEmail(String email)
	{
		
	    emailAddress.click();
	    emailAddress.clear();
		emailAddress.sendKeys(email);
		return this;
	   
		
	}
	
	public pageobject_authentication providePassword(String pwd)
	{
		password.click();
		password.clear();
		password.sendKeys(pwd);
		return this;
		
	}
	
	public pageobject_authentication signIn() {
	
		signin.click();
		driver.switchTo().alert().dismiss();
		return this;
	}
	

}
