package os.stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import os.PageActions.OSLoginActions;

public class OSLoginStepDef {
	

OSLoginActions loginAction=new OSLoginActions();

@Given("^Browser to OSCommerce home page$")
public void browser_to_OSCommerce_home_page (){
	loginAction.launchOSLoginPage();
		   
}

@When("^Browser click on My account$")
public void browser_click_on_My_account()  {
	loginAction.inputMyAccount();
}

@When("^Put email address and password$")
public void put_email_address_and_password()  {
	loginAction.inputEmailAddress("rkarim2010@yahoo.com");
}

@When("^Click on sign in button$")
public void click_on_sign_in_button()  {
	loginAction.inputPassword("Ronju251967");
}

@Then("^Browser able to log in successfully$")
public void browser_able_to_log_in_successfully()  {
	loginAction.launchOSLoginPage();
}



}
