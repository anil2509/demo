package com.flipkart.tests;

import org.junit.runner.RunWith;
//import cucumber.junit.Cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		format = { "pretty", "json:cucumber-test-report" }, 
		features = "classpath:",
		glue = "classpath:",
		tags = {"@flipkartPositiveTest"})
//tags = {"@fetchTable"})

public class RunTest {

}
	