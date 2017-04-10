package sel_practice;

import java.util.regex.Pattern;
import javax.swing.text.Document;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import com.google.common.base.Verify;
import com.sun.jna.StringArray;

import net.sourceforge.htmlunit.cyberneko.HTMLElements.ElementList;

public class GetTableValues {
  
  private WebDriver driver;
  String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
//	  System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
//	  System.out.println(System.getProperty("webdriver.chrome.driver"));
//	  DesiredCapabilities capabilities = DesiredCapabilities.chrome(); 
//	  capabilities.setCapability("chrome.switches", Arrays.asList("--incognito")); 
//	  WebDriver driver = new ChromeDriver(capabilities);
	  driver = new FirefoxDriver();
	 
    baseUrl = "https://www.tutorialspoint.com/";
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

  }

  @Test
  public void testSelGmail() throws Exception {
    driver.get(baseUrl + "/html/html_attributes_reference.htm/");
    int Row_Count = driver.findElements(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div[1]/div/table[1]/tbody/tr")).size();
    int Col_Count = driver.findElements(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div[1]/div/table[1]/tbody/tr[1]/th")).size();
//  System.out.println(Row_Count+" And "+Col_Count);
//  ArrayList<String> TD = new ArrayList<String>();
    
    String first_part = "/html/body/div[3]/div[1]/div/div[2]/div[1]/div/table[1]/tbody/tr[";
    String second_part = "]/td[";
    String third_part = "]";
    
    
     for (int i=2;i<=Row_Count;i++)
     {
    	 int k = 0;
//    	 String[][] TAD = new String[Row_Count][Col_Count];
    	 ArrayList<String> TD = new ArrayList<String>();
    	 for (int j=1;j<=Col_Count;j++)
    	 {
//    		 System.out.println(first_part+i+second_part+j+third_part);
//    		 TAD[i-2][j-1] = driver.findElement(By.xpath(first_part+i+second_part+j+third_part)).getText();
    		 TD.add(driver.findElement(By.xpath(first_part+i+second_part+j+third_part)).getText());
//    		 System.out.println(TAD[i-2][j-1]);
    		 System.out.println(TD.get(k));
    		 assertTrue(TD.get(k) != null);
    		 Assert.assertTrue("Test surely failed", TD.get(k) != null);
    		 k++;
    	 }
     }
//    System.out.println(TD);
//    driver.findElement(By.xpath("/html/body/nav/div/a[2]")).click();
//    driver.findElement(By.id("Email")).clear();
//    driver.findElement(By.id("Email")).sendKeys("anil.mehta16");
//    driver.findElement(By.id("next")).click();
//    driver.findElement(By.id("Passwd")).clear();
//    driver.findElement(By.id("Passwd")).sendKeys("Des#tinikAllz_7");
//    driver.findElement(By.id("signIn")).click();
//    driver.findElement(By.id(":2m")).click();
//    driver.findElement(By.xpath("//div[@id=':l2']/div")).click();
//    driver.findElement(By.xpath("//div[@id=':lo']/div")).click();
//    driver.findElement(By.xpath("//div[@id=':lo']/div")).click();
//    driver.findElement(By.xpath("//div[@id=':lo']/div")).click();
//    driver.findElement(By.xpath("//div[@id=':ma']/div")).click();
//    driver.findElement(By.xpath("//div[@id=':5']/div/div/div/div/div/div[2]/div[3]/div/div")).click();
//    driver.findElement(By.cssSelector("span.gb_9a.gbii")).click();
//    driver.findElement(By.id("gb_71")).click();
//    Select selec = new Select(driver.findElement(By.id("SelectID_One")));
     
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
