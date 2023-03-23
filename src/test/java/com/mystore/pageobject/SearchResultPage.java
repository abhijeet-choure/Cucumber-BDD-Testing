package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage {
	
	WebDriver ldriver;

	//2. Create constructor
	public SearchResultPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);//driver that will be used to lookup the web element

	}

	//Identify the elements present in search result page



	@FindBy(xpath="//input[@id='search_product']")
	WebElement searchResultProduct ;
	
	@FindBy(xpath="//button[@id='submit_search']")
	WebElement more;
	
	//action methods on web elements of search result page
	
	public String getSearchResultProductName()
	{
		return(searchResultProduct.getText());
	} 
	
	public void ClickOnMoreLink()
	{
		more.click();

	}

	
	

}
