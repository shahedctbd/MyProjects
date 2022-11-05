package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;
import pages.TestBase;

public class TechStepDefinition extends TestBase {
	
	LoginPage loginPage;
	
	@Given("^User on Techfios Login Page$")
	public void user_on_Techfios_Login_Page()  {
		initDriver();
	    
	}

	@When("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String username)  {
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName(username);
	    
	}

	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password)  {
		loginPage.insertPassword(password);
	    
	}

	@When("^User clicks on Signin button$")
	public void user_clicks_on_Signin_button()  {
		loginPage.clickSigninButton();
	  
	}

	@Then("^User should land on Dashboard page$")
	public void user_should_land_on_Dashboard_page()  {
		
	    
	}


	
	@After
	public void tearDown() {
		
		driver.close();
		driver.quit();
		
	}
	
	
	
	

}
