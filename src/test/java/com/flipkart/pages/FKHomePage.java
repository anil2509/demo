package com.flipkart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FKHomePage {

	WebDriver driver;
	
	By username_field = By.name("q");
	By searchbutton = By.cssSelector(".vh79eN");
	
	public FKHomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void typeSearchItem(String itemToSearch)
	{
		driver.findElement(username_field).sendKeys(itemToSearch);;
	}
	
	public void clickSearchButton()
	{
		driver.findElement(searchbutton).click();
	}
}
