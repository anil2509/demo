import org.junit.runner.RunWith;
//import cucumber.junit.Cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		format = { "pretty", "html:cucumber-test-report" }, 
//		features = "sample.feature",
		tags = {"@flipkartPositiveTest"})
//tags = {"@fetchTable"})

public class RunTest {

}
	