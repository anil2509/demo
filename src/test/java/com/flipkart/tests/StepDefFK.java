package com.flipkart.tests;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.flipkart.pages.FKHomePage;
import com.flipkart.pages.FKSearchResultsPage;
import com.flipkart.pages.FKViewCartPage;
import com.flipkart.pages.FKViewPhonePage;
import com.thoughtworks.selenium.webdriven.commands.GetText;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefFK {

	WebDriver driver = new FirefoxDriver();
	// RemoteWebDriver driver;
	Boolean isProductInStock;
	String productName;
	String productNameCart;
	
	FKHomePage inFKHomePage = new FKHomePage(driver);
	FKSearchResultsPage inFKSearchResultsPage = new FKSearchResultsPage(driver);
	FKViewPhonePage inFKViewPhonePage = new FKViewPhonePage(driver);
	FKViewCartPage inFKViewCartPage = new FKViewCartPage(driver);

	// DesiredCapabilities dr=null;{
	// dr=DesiredCapabilities.firefox();
	// dr.setBrowserName("firefox");
	// dr.setPlatform(Platform.WINDOWS);
	// }

	@Given("^user goes to flipkart site$")
	public void user_goes_to_flipkart_site() {

		// System.setProperty("webdriver.chrome.driver", "seleni");
		// System.setProperty("webdriver.chrome.driver",
		// "C://Apps//Tools//chromedriver.exe");
		// driver=new RemoteWebDriver(dr);
		// driver = new ChromeDriver();
		// driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@Given("^searches for item (.*)$")
	public void searches_for_item(String itemToSearch) {
		inFKHomePage.typeSearchItem(itemToSearch);
		inFKHomePage.clickSearchButton();
	}

	@Given("^checks that the product is in stock$")
	public void checks_that_the_product_is_in_stock() throws IOException, InterruptedException {

		// list fetches all Search result WEs present on Search page
		List<WebElement> listOfSearchResults = inFKSearchResultsPage.getListOfSearchResults();
		System.out.println("WL Size : " + listOfSearchResults.size());

		for (WebElement searchResultAt : listOfSearchResults) {

			// Store the current window handle
			String winHandleBefore = driver.getWindowHandle();

			// Perform the click operation that opens new window
			inFKSearchResultsPage.openInNewWindowSearchResult(searchResultAt);

			// Switch to new window opened
			for (String winHandle : driver.getWindowHandles()) {
				driver.switchTo().window(winHandle);
			}

			// Take Snap
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("cucumber-test-report\\snap.png"));

			isProductInStock = inFKViewPhonePage.isGotoCartButtonEnabled();

			if (isProductInStock & listOfSearchResults.indexOf(searchResultAt) == 0) {
				break;
			}
			isProductInStock = false;
			driver.close();
			driver.switchTo().window(winHandleBefore);
		}
	}

	@Given("^adds the product to his cart$")
	public void adds_the_product_to_his_cart() {
		if (isProductInStock) {
			productName = inFKViewPhonePage.getProductName();
			System.out.println("Product Name is : " + productName);

			inFKViewPhonePage.clickGotoCartButton();
		} else
			System.out.println("Product is not in Stock");
	}

	@Then("^the product is added to cart$")
	public void the_product_is_added_to_cart() {
		if (isProductInStock) {

			productNameCart = inFKViewCartPage.getProductNameInCart();
			assert (productName.contains(productNameCart));
		} else
			System.out.println("Product is not in Stock");
		driver.quit();
	}
}
