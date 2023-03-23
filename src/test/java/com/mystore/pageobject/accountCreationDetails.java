package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class accountCreationDetails {
	
	

	//1. create object of webdriver
	WebDriver ldriver;

	//constructor
	public accountCreationDetails(WebDriver rdriver)
	{
		ldriver = rdriver;


		PageFactory.initElements(rdriver, this);
	}


	//identify webelements
	@FindBy(xpath = "//label[normalize-space()='Mr.']") //Title-Mr
	WebElement titleMr;

	@FindBy(xpath = "(//input[@id='id_gender2'])[1]") //Title-Mrs
	WebElement titleMrs;
	
	@FindBy(xpath="//input[@id='name']")
	WebElement custfirstName;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;

	@FindBy(xpath="(//input[@id='first_name'])[1]")
	WebElement addFirstname;

	@FindBy(xpath="(//input[@id='last_name'])[1]")
	WebElement addLastname;

	//address1
	@FindBy(xpath="(//input[@id='address1'])[1]")
	WebElement address1;
	

	@FindBy(xpath="(//select[@id='country'])[1]")
	WebElement country;


	//id_state
	@FindBy(xpath="//input[@id='state']")
	WebElement state;
	
	
	@FindBy(xpath="//input[@id='city']")
	WebElement city;


	@FindBy(xpath="(//input[@id='zipcode'])[1]")
	WebElement postcode;


	//phone_mobile
	@FindBy(xpath="(//input[@id='mobile_number'])[1]")
	WebElement phone_mobile;


	@FindBy(xpath="//button[contains(text(),'Create Account')]")
	WebElement register;
	//identify actions to be performed on web elements
	
	@FindBy(xpath="(//a[normalize-space()='Continue'])[1]")
	WebElement continuebtn;
	
	
	public void selectTitleMrs()
	{
		titleMrs.click();
	}

	public void selectTitleMr()
	{
		titleMr.click();
	}
	public void enterCustomerFirstName(String fname)
	
	{
		custfirstName.clear();
		custfirstName.sendKeys(fname);
	}


	public void enterPassword(String pwd)
	{
		password.sendKeys(pwd);
	}

	public void enterAddressFirstName(String fname)
	{
		addFirstname.clear();

		addFirstname.sendKeys(fname);
	}

	public void enterAddressLastName(String lname)
	{
		addLastname.clear();

		addLastname.sendKeys(lname);
	}

	public void enterAddress(String address)
	{
		address1.sendKeys(address);
		
		
	}

	public void selectCountry(String text)
	{
		Select obj = new Select(country);
		obj.selectByVisibleText(text);
	}

	public void enterState(String text)
	{
		
		state.sendKeys(text);
	}

	
	
	public void enterCity(String cityName)
	{
		city.sendKeys(cityName);
	}

	public void enterPostcode(String postcodeData)
	{
		postcode.sendKeys(postcodeData);
	}

	
	public void enterMobilePhone(String mobile)
	{
		phone_mobile.sendKeys(mobile);
	}

	

	public void clickOnRegister()
	{
		register.click();

	}
	

	public void clickOnContinoue()
	{
		continuebtn.click();

	}
	
	
	
	
	
	
	
}



	
	
	
	
	






