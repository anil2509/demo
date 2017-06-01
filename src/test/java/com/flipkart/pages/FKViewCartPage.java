package com.flipkart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FKViewCartPage {
	
	WebDriver driver;
	
	By productNameInCartField = By.cssSelector("._325-ji._3ROAwx");

	public FKViewCartPage(WebDriver driver){
		this.driver = driver;
	}
	
	public String getProductNameInCart()
	{
		String productNameInCart = driver.findElement(productNameInCartField).getText();
		return productNameInCart;
	}
}
