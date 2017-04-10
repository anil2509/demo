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

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefFK {

	WebDriver driver;
	// RemoteWebDriver driver;
	Boolean isProductInStock;
	int elementIndex;
	List<WebElement> WebElementList;
	String prouctName;
	String productNameCart;

	// DesiredCapabilities dr=null;{
	// dr=DesiredCapabilities.firefox();
	// dr.setBrowserName("firefox");
	// dr.setPlatform(Platform.WINDOWS);
	// }

	@Given("^user goes to flipkart site$")
	public void user_goes_to_flipkart_site() {
		// driver = new FirefoxDriver();
		// System.setProperty("webdriver.chrome.driver", "seleni");
		System.setProperty("webdriver.chrome.driver", "C://Apps//Tools//chromedriver.exe");
		// driver=new RemoteWebDriver(dr);
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Given("^searches for a product$")
	public void searches_for_a_product() {
		driver.findElement(By.name("q")).sendKeys("nokia mobiles");
		driver.findElement(By.cssSelector(".vh79eN")).click();
	}

	@Given("^checks that the product is in stock$")
	public void checks_that_the_product_is_in_stock() throws IOException, InterruptedException {
		System.out.println("Reached checked product is in stock");

		// Use JS executor to scroll down and back up the page so WebElement
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		js.executeScript("window.scrollTo(0, 0)");

		// list fetches all WEs present on page
		WebElementList = driver.findElements(By.cssSelector("._1Nyybr._30XEf0"));
		System.out.println("WL Size : " + WebElementList.size());
		for (WebElement webElement : WebElementList) {

			// Store the current window handle
			String winHandleBefore = driver.getWindowHandle();

			// Perform the click operation that opens new window
			Actions newwin = new Actions(driver);
			newwin.keyDown(Keys.SHIFT).click(webElement).keyUp(Keys.SHIFT).build().perform();

			// Switch to new window opened
			for (String winHandle : driver.getWindowHandles()) {
				driver.switchTo().window(winHandle);
			}

			// Take Snap
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("cucumber-test-report\\snap.png"));

			try {
				driver.findElement(By.cssSelector("._2AkmmA._3Plo8Q._19RW-r"));
				isProductInStock = true;
			} catch (NoSuchElementException e) {
				isProductInStock = false;
			}
			if (isProductInStock & WebElementList.indexOf(webElement) > 2) {
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
			System.out.println("Product Name is : " + prouctName);
			driver.findElement(By.cssSelector("._2AkmmA._3Plo8Q._19RW-r")).click();
		} else
			System.out.println("Product is not in Stock");
	}

	@Then("^the product is added to cart$")
	public void the_product_is_added_to_cart() {
		if (isProductInStock) {
			driver.findElement(By.cssSelector("._3NFO0d")).click();
			productNameCart = driver.findElement(By.cssSelector("._325-ji._3ROAwx")).getText();
			// System.out.println("Product name in cart ---- : " +
			// productNameCart);
			assert (prouctName.contains(productNameCart));
		} else
			System.out.println("Product is not in Stock");
		driver.quit();
	}
}
