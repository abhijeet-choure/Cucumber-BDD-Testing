package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class indexPage {
	//1. create object of webdriver
		WebDriver ldriver;

		//constructor
		public indexPage(WebDriver rdriver)
		{
			ldriver = rdriver;
			

			PageFactory.initElements(rdriver, this);
		}


		//identify webelements
		@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]") 
		WebElement signIn;
		
		@FindBy(xpath="(//a[text()='T-shirts'])[2]")
		WebElement tshirtMenu;
		
		
		//identify action on webelement
		public void clickOnSignIn() {
			signIn.click();
		}
		
		public String getPageTitle()
		{
			return(ldriver.getTitle());
		}
		
		public void clickOnTShirtMenu()
		{
			tshirtMenu.click();
		}
		
	}

