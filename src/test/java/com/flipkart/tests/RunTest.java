package com.flipkart.tests;

import org.junit.runner.RunWith;
//import cucumber.junit.Cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		plugin = { "pretty","html:cucumber-test-report","json:cucumber-test-report/cuc.json" }, 
//		plugin = { "pretty","html:cucumber-test-report" },
		features = "classpath:",
		glue = "classpath:",
		tags = {"@flipkartPositiveTest"})
//tags = {"@fetchTable"})

public class RunTest {

}
	