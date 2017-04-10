//package sel_practice;
//
//import java.util.ArrayList;
//import java.util.concurrent.TimeUnit;
//
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//import static org.testng.Assert.*;
//import org.openqa.selenium.*;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;
//
//public class SaveTableValues {
//  private WebDriver driver;
//  private String baseUrl;
//  private boolean acceptNextAlert = true;
//  private StringBuffer verificationErrors = new StringBuffer();
//
//  @BeforeClass(alwaysRun = true)
//  public void setUp() throws Exception {
//    driver = new FirefoxDriver();
//    baseUrl = "https://www.tutorialspoint.com/";
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//  }
//
//  @Test
//  public void testSaveTableValues() throws Exception {
//    driver.get(baseUrl + "//html/html_attributes_reference.htm/");
//    assertEquals(driver.getTitle(), "HTML Attribute Reference");
//    int Row_Count = driver.findElements(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div[1]/div/table[1]/tbody/tr")).size();
//    int Col_Count = driver.findElements(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div[1]/div/table[1]/tbody/tr[1]/th")).size();
//    
//    String first_part = "/html/body/div[3]/div[1]/div/div[2]/div[1]/div/table[1]/tbody/tr[";
//    String second_part = "]/td[";
//    String third_part = "]";
//    
//    
//     for (int i=2;i<=Row_Count;i++)
//     {
//    	 int k = 0;
//    	 ArrayList<String> TD = new ArrayList<String>();
//    	 for (int j=1;j<=Col_Count;j++)
//    	 {
//    		 TD.add(driver.findElement(By.xpath(first_part+i+second_part+j+third_part)).getText());
//    		 System.out.println(TD.get(k));
//    		 k++;
//    	 }
//     }
//  }
//
//  @AfterClass(alwaysRun = true)
//  public void tearDown() throws Exception {
//    driver.quit();
//    String verificationErrorString = verificationErrors.toString();
//    if (!"".equals(verificationErrorString)) {
//      fail(verificationErrorString);
//    }
//  }
//
//  private boolean isElementPresent(By by) {
//    try {
//      driver.findElement(by);
//      return true;
//    } catch (NoSuchElementException e) {
//      return false;
//    }
//  }
//
//  private boolean isAlertPresent() {
//    try {
//      driver.switchTo().alert();
//      return true;
//    } catch (NoAlertPresentException e) {
//      return false;
//    }
//  }
//
//  private String closeAlertAndGetItsText() {
//    try {
//      Alert alert = driver.switchTo().alert();
//      String alertText = alert.getText();
//      if (acceptNextAlert) {
//        alert.accept();
//      } else {
//        alert.dismiss();
//      }
//      return alertText;
//    } finally {
//      acceptNextAlert = true;
//    }
//  }
//}
