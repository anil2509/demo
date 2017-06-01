package com.flipkart.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FKSearchResultsPage {

	WebDriver driver;
	List<WebElement> listOfSearchResults;

	By searchResults = By.cssSelector("._1Nyybr._30XEf0");

	public FKSearchResultsPage(WebDriver driver) {
		this.driver = driver;
	}

	public List<WebElement> getListOfSearchResults() {
		// Use JS executor to scroll down and back up the page so all Search Elements are fetched
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		js.executeScript("window.scrollTo(0, 0)");
		listOfSearchResults = driver.findElements(searchResults);
		return listOfSearchResults;
	}

	public void openInNewWindowSearchResult(WebElement searchResultAt) {
		Actions newwin = new Actions(driver);
		newwin.keyDown(Keys.SHIFT).click(searchResultAt).keyUp(Keys.SHIFT).build().perform();
	}

}
