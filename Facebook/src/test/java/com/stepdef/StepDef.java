package com.stepdef;

import org.openqa.selenium.support.PageFactory;

import com.common.Base;
import com.pageobject.PageObject;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef extends Base {
	
	PageObject pm;
	
	
	@Given("^User able to go home page$")
	public void user_able_to_go_home_page() throws Throwable {
	   getDriver();
	   pm= PageFactory.initElements(driver, PageObject.class);
	   
	    
	}



	@When("^user able to enter first name$")
	public void user_able_to_enter_first_name() throws Throwable {
	    pm.getFirstname().sendKeys("sheik");
	    
	}

	@When("^user able to enter last name$")
	public void user_able_to_enter_last_name() throws Throwable {
	    pm.getLastname().sendKeys("sumon");
	    
	}

	@When("^user able  to enter email address$")
	public void user_able_to_enter_email_address() throws Throwable {
	    pm.getEmail().sendKeys("sumonbd64ss@gmail.com");
	    
	}
	

	@When("^user able  to re-enter email address$")
	public void user_able_to_re_enter_email_address() throws Throwable {
       pm.getReenteremail().sendKeys("sumonbd64ss@gmail.com");
	}

	@When("^user able to create  password$")
	public void user_able_to_create_password() throws Throwable {
	    pm.getPassword().sendKeys("Sheik1765");
	    
	}



	@When("^user able select  month$")
	public void user_able_select_month() throws Throwable {
    pm.getMonth().sendKeys("mar");
	}

	@When("^user able select  day$")
	public void user_able_select_day() throws Throwable {
    pm.getDay().sendKeys("15");
	}

	@When("^user able select  year$")
	public void user_able_select_year() throws Throwable {
pm.getYear().sendKeys("1994");
	}
	

	@When("^user able to click gender$")
	public void user_able_to_click_gender() throws Throwable {
	    pm.getMale().click();
	   
	    
	}

	@When("^User able to click sign up$")
	public void user_able_to_click_sign_up() throws Throwable {
	    
	    pm.getSignup().click();
	}

	@Then("^User able to sign up successfully$")
	public void user_able_to_sign_up_successfully() throws Throwable {
	    
	    
	}



}
