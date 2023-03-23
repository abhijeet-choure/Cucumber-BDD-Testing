package com.mystore.utilities;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/main/resource/Features/login.feature",
		
		glue ="com.mystore.pageobject"
		
		
		)




public class TestRunner {

}
