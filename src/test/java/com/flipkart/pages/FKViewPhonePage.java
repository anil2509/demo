package com.flipkart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class FKViewPhonePage {

	WebDriver driver;

	By gotoCartButton = By.cssSelector("._2AkmmACqEoGpO0Lb0CP5qw._3Plo8Q-aRTjrAIDCXG3vYl._19RW-rzkCL0Td3RFU_ZnE9");
	By productNameField = By.cssSelector("._3eAQiDZVhw_jnZcZCyr4gi");

	public FKViewPhonePage(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isGotoCartButtonEnabled() {
		boolean isProductInStock;
		try {
			driver.findElement(gotoCartButton);
			isProductInStock = true;
		} catch (NoSuchElementException e) {
			isProductInStock = false;
		}
		return isProductInStock;
	}

	public String getProductName() {
		String productName = driver.findElement(productNameField).getText();
		return productName;
	}

	public void clickGotoCartButton() {
		driver.findElement(gotoCartButton).click();
	}
}
