package StepsDefinition;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.ros.configurations.com_ros_browser_settings;
import com.ros.pageobjects.authentication.pageobject_authentication;
import com.ros.utilities.com_ros_base_class;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class authentication_login_steps  extends com_ros_base_class{
	
	pageobject_authentication pa = new pageobject_authentication(driver);
	
	
	@Given("user is on welcome to ROS screen")
	public void user_is_on_welcome_to_ros_screen() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
         System.out.println("on welcome screen");
  
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	      pa.clickLogin();
	}

	@Then("user navigates to the azure login page")
	public void user_navigates_to_the_azure_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("successfully landed to the azure login screen");
	}

	@Given("user enters the valid email and password")
	public void user_enters_the_valid_email_and_password() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		String dr1=System.getProperty("user.dir");
		InputStream input = new FileInputStream(dr1+"/src/test/resources/property/ros.properties");
        Properties prop = new Properties();
	    // load a properties file
	    prop.load(input);
		String UserName = prop.getProperty("username");
		String Password = prop.getProperty("password");
	pa.provideEmail(UserName);
	 pa.providePassword(Password);
	  

	}

	@Given("user clicks on sign in")
	public void user_clicks_on_sign_in() {
	    // Write code here that turns the phrase above into concrete actions
	   pa.signIn();
	}

	@Then("user logs in successfuly")
	public void user_logs_in_successfuly() {
	    // Write code here that turns the phrase above into concrete actions

       System.out.println("User logged in successfully");
	}

	@Then("lands on the cashup sheets")
	public void lands_on_the_cashup_sheets() {
	    // Write code here that turns the phrase above into concrete actions 

		 System.out.println("User lands on the cashup sheets");
	}


}
