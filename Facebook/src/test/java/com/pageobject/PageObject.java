package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObject  extends PageBase{

	public PageObject(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//input[@id='u_0_m']")
	public WebElement firstname ;

	public WebElement getFirstname() {
		return firstname;
	}
	
	
	
	
	@FindBy(xpath="//input[@id='u_0_o']")
	public WebElement  lastname;
	public WebElement getLastname() {
		return lastname;
	}
	
	
	@FindBy(xpath="//input[@id='u_0_r']")
	public WebElement email ;
	public WebElement getEmail() {
		return email;
	}
	
	
	@FindBy(xpath="//input[@id='u_0_u']")
	public WebElement reenteremail;
	public WebElement getReenteremail() {
		return reenteremail;
	}

	@FindBy(xpath="//input[@id='u_0_w']")
	public WebElement  password;
	public WebElement getPassword() {
		return password;
	}
	

	
	
	@FindBy(xpath="//select[@id='month']")
	public WebElement  month;
	public WebElement getMonth() {
		return month;
	}
	
	@FindBy(xpath="//select[@id='day']")
	public WebElement day;
	public WebElement getDay() {
		return day;
	}
	
	
	
	@FindBy(xpath="//select[@id='year']")
	public WebElement year ;
	public WebElement getYear() {
		return year;
	}
	
	

	
	
	@FindBy(xpath="//input[@id='u_0_7']")
	public WebElement male ;
	public WebElement getMale() {
		return male;
	}
	
	
	@FindBy(xpath="//button[@id='u_0_13']")
	public WebElement signup ;
	public WebElement getSignup() {
		return signup;
	}
	
	
	
}
