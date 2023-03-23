package com.mystore.testcases;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.mystore.pageobject.indexPage;
import com.mystore.pageobject.myAccountPage;
import com.mystore.pageobject.registeredUserAccount;

public class TC_ProductPageTest extends BaseClass{
	
	@Test(enabled=true)
	public void VerifySearchProduct() throws IOException
	{
		//String searchKey = "T-shirts";
		logger.info("\n***************TestCase Search Product started*****************"); 

		//Sign in 
		indexPage indexPg = new indexPage(driver);
		indexPg.clickOnSignIn();


		//Enter account details- email and password
		myAccountPage pg = new myAccountPage(driver);
		pg.enterEmailAddress(emailAddress);

		logger.info("User Email and Password entered.");
		pg.enterPassword(password);

		pg.clickSignIn();
		logger.info("Sign In link clicked");

	
		//Enter searchkey in search box
		registeredUserAccount productPg = new registeredUserAccount(driver);
		productPg.clickOnProducts();
		WebElement frame1 =driver.findElement(By.id("aswift_5"));
		driver.switchTo().frame(frame1);
		WebElement frame2 = driver.findElement(By.id("ad_iframe"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//div[@id='dismiss-button']/div/span")).click();
		driver.switchTo().defaultContent();
		logger.info("Product link clicked");	
		


		
		productPg.EnterDataInSearchBox("T-shirts");
		logger.info("T-shirt entered in search box");

		productPg.ClickOnSearchButton();
		logger.info("clicked on search button");		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
//		logger.info("Products link clicked");
	//	driver.switchTo().alert().accept();
		/*driver.findElement(By.id("dismiss-button")).click();
	    Alert simpleAlert = driver.switchTo().alert();
	    simpleAlert.accept();
		
		Set<String> wids=driver.getWindowHandles();
		if(wids.size()>1) {
			driver.switchTo().window("give name or window handle");
			try {
				WebElement elementOnPopup=driver.findElement(By.id("dismiss-button"));
				if(elementOnPopup.isDisplayed()) {
					elementOnPopup.click();
					
				}
			}
			catch(NoSuchElementException ne) {
				
				System.out.println("Alert is displayed but could not click on yes/ok button");
			
		
		
			}
		}
		else {
			System.out.println("Popup Window not displayed");

		}*/
	}
	
}
		
		
		
		
	
	
	
	
	
	
	


