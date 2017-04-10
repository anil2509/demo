
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {

	WebDriver driver;

	@Given("^sample feature file is ready$")
	public void givenStatement() {
		System.out.println("Given statement executed successfully");
	}

	@When("^I run the feature file$")
	public void whenStatement() {
		System.out.println("When statement execueted successfully");
	}

	@Then("^run should be successful$")
	public void thenStatment() {
		System.out.println("Then statement executed successfully");
	}

	@Given("^User is on firefox browser$")
	public void userIsOnFirefoxBrowser() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("^navigates to \"(.*)\"$")
	public void navigatesTo(String URL) {
//		String URLs = URL;
		driver.get(URL);
	}

	@Then("^table values in the page should not be null$")
	public void tableValuesInThePageShouldNotBeNull() {
		int Row_Count = driver
				.findElements(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div[1]/div/table[1]/tbody/tr")).size();
		int Col_Count = driver
				.findElements(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div[1]/div/table[1]/tbody/tr[1]/th"))
				.size();
		
		String first_part = "/html/body/div[3]/div[1]/div/div[2]/div[1]/div/table[1]/tbody/tr[";
		String second_part = "]/td[";
		String third_part = "]";

		for (int i = 2; i <= Row_Count; i++) {
			int k = 0;
			ArrayList<String> TD = new ArrayList<String>();
			for (int j = 1; j <= Col_Count; j++) {
				TD.add(driver.findElement(By.xpath(first_part + i + second_part + j + third_part)).getText());
				System.out.println(TD.get(k));
				assertTrue(TD.get(k) != null);
				Assert.assertTrue("Test surely failed", TD.get(k) == null);
				k++;
			}
		}
		driver.close();
	}
}
