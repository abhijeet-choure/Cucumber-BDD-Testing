package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myAccountPage {
	
	//1. create object of webdriver
		WebDriver ldriver;

		//constructor
		public myAccountPage(WebDriver rdriver)
		{
			ldriver = rdriver;


			PageFactory.initElements(rdriver, this);
		}


		//identify webelements 
		
		//create new account
		@FindBy(xpath = "//input[@data-qa='signup-email']") 
		WebElement createEmailId;


		@FindBy(xpath="//input[@placeholder='Name']")
		WebElement SubmitName;

		
		
		
		@FindBy(xpath="//button[contains(text(),'Signup')]")
		WebElement SubmitCreate;

		
		//Already registered users
		@FindBy(xpath = "//input[@data-qa='login-email']") 
		WebElement registeredUsersEmail;
		
		@FindBy(xpath = "//input[@placeholder='Password']") 
		WebElement registeredUsersPwd;
		
		@FindBy(xpath = "//button[normalize-space()='Login']")
		WebElement submitLogin;
		
		
		//identify action on webelement
		
		
		
		public void enterName(String name) 
		{
			SubmitName.sendKeys(name);
		}

		public void enterCreateEmailAddress(String emailAdd) 
		{
			createEmailId.sendKeys(emailAdd);
		}
		
		public void clickSubmitCreate()
		{
			SubmitCreate.click();
		}
		
		//ACTIONS METHODS FOR ALREADY REGISTERED USERS
		
		public void enterEmailAddress(String emailAdd) 
		{
			registeredUsersEmail.sendKeys(emailAdd);
		}

		public void enterPassword(String pwd) 
		{
			registeredUsersPwd.sendKeys(pwd);
		}

		
		public void clickSignIn()
		{
			submitLogin.click();
		}

}
