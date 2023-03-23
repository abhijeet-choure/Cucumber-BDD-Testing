package com.mystore.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mystore.pageobject.accountCreationDetails;
import com.mystore.pageobject.indexPage;
import com.mystore.pageobject.myAccountPage;
import com.mystore.pageobject.registeredUserAccount;

public class TC_MyAccountPageTest extends BaseClass{
	
	@Test(enabled =false)
	public void verifyRegistrationAndLogin()
	{
driver.get(url);
		logger.info("***************TestCase Verify Registration and Login starts*****************"); 


		indexPage pg = new indexPage(driver);

		pg.clickOnSignIn();
		logger.info("Clicked on sign in link");

		myAccountPage myAcpg = new myAccountPage(driver);
		myAcpg.enterName("abhijeet");
		logger.info("Name enterd");
		myAcpg.enterCreateEmailAddress("cs115@gmail.com");
		logger.info("Email address entered in create account section.");

		myAcpg.clickSubmitCreate();
		logger.info("clicked on create an account button");

		accountCreationDetails accCreationPg = new accountCreationDetails(driver);

		accCreationPg.selectTitleMrs();
		accCreationPg.enterCustomerFirstName("Abhijeet");
		accCreationPg.enterPassword("cs323");
		accCreationPg.enterAddressFirstName("Abhi");
		accCreationPg.enterAddressLastName("Jeet");
		accCreationPg.enterAddress("18/8 worli road");
		accCreationPg.selectCountry("United States");
		accCreationPg.enterState("Alabama");
		accCreationPg.enterCity("Huntsville");
		accCreationPg.enterPostcode("938");
		accCreationPg.enterMobilePhone("9891768192");
		accCreationPg.clickOnRegister(); 
		logger.info("clicked on Register button");	
		accCreationPg.clickOnContinoue();
		logger.info("entered user details on account creation page.");
		driver.switchTo().alert().accept();
		
		registeredUserAccount regUser = new registeredUserAccount(driver);
		String userName = regUser.getUserrName();

		Assert.assertEquals("Abhijeet", userName);

		logger.info("***************TestCase Verify Registration and Login ends*****************"); 

	}
	

	@Test
	public void VerifyLogin() throws IOException 
	{

		logger.info("***************TestCase Verify Login starts*****************"); 

		indexPage pg = new indexPage(driver);

		pg.clickOnSignIn();
		logger.info("Clicked on sign in link");

		myAccountPage myAcpg = new myAccountPage(driver);

		myAcpg.enterEmailAddress("cs763@gmail.com");
		logger.info("Entered email address");

		myAcpg.enterPassword("cs763");
		logger.info("Entered password");

		myAcpg.clickSignIn();
		logger.info("Clicked on sign in link..");


		registeredUserAccount regUser = new registeredUserAccount(driver);
		String userName = regUser.getUserrName();


		if(userName.equals("abhijeet"))
		{
			logger.info("VerifyLogin - Passed");
			//regUser.clickOnSignOut();
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("VerifyLogin - Failed");
			captureScreenShot(driver,"VerifyLogin");
			Assert.assertTrue(false);

		}

		logger.info("***************TestCase Verify Login ends*****************"); 

	}
}

