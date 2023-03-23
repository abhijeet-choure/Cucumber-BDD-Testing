package com.mystore.pageobject;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import com.mystore.utilities.ReadConfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {



	ReadConfig readConfig = new ReadConfig();

	String url = readConfig.getBaseUrl();
	String browser = readConfig.getBrowser();

	public String emailAddress = readConfig.getEmail() ;
	String password = readConfig.getPassword();


	public static WebDriver driver;
	public static Logger logger;
	@Given("user is onn login page")
	public void user_is_onn_login_page() {

		//launch browser
		switch(browser.toLowerCase())
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "msedge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			driver = null;
			break;

		}

		//implicit wait of 10 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//for logging
		logger = LogManager.getLogger("MyStoreV1");

		//open url
		driver.get(url);
		logger.info("url opened");

	}


	@When("user enters username and password")
	public void user_enters_username_and_password() {
		indexPage pg = new indexPage(driver);

		pg.clickOnSignIn();
		logger.info("Clicked on sign in link");


		//Already registered users
		driver.findElement(By.xpath ( "//input[@data-qa='login-email']")).sendKeys("cs763@gmail.com");
		logger.info("Entered email address");



		driver.findElement(By.xpath ("//input[@placeholder='Password']") ).sendKeys("cs763");
		logger.info("Entered password");





	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath ( "//button[normalize-space()='Login']") ).click();
		logger.info("Clicked on sign in link..");
	}

	@Then("user is logged into application")
	public void user_is_logged_into_application() {

		registeredUserAccount regUser = new registeredUserAccount(driver);
		String userName = regUser.getUserrName();


		if(userName.equals("abhijeet"))
		{
			logger.info("VerifyLogin - Passed");
			regUser.clickOnSignOut();
			Assert.assertTrue(true);
			driver.close();
			driver.quit();
		}
		else
		{
			logger.info("VerifyLogin - Failed");

			Assert.assertTrue(false);
			driver.close();
			driver.quit();

		}
	}

}
