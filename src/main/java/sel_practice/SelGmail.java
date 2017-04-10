package sel_practice;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelGmail {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testSelGmail() throws Exception {
    driver.get(baseUrl + "/gmail/about/");
    driver.findElement(By.xpath("/html/body/nav/div/a[2]")).click();
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("Emai"))));
    driver.findElement(By.id("Email")).sendKeys("anil.mehta16");
    driver.findElement(By.id("next")).click();
    driver.findElement(By.id("Passwd")).clear();
    driver.findElement(By.id("Passwd")).sendKeys("Des#tinikAllz_7");
    driver.findElement(By.id("signIn")).click();
    driver.findElement(By. id(":2m")).click();
    driver.findElement(By.xpath("//div[@id=':l2']/div")).click();
    driver.findElement(By.xpath("//div[@id=':lo']/div")).click();
    driver.findElement(By.xpath("//div[@id=':lo']/div")).click();
    driver.findElement(By.xpath("//div[@id=':lo']/div")).click();
    driver.findElement(By.xpath("//div[@id=':ma']/div")).click();
    driver.findElement(By.xpath("//div[@id=':5']/div/div/div/div/div/div[2]/div[3]/div/div")).click();
    driver.findElement(By.cssSelector("span.gb_9a.gbii")).click();
    driver.findElement(By.id("gb_71")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
