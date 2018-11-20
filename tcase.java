

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class tcase {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    //baseUrl = "https://demo.opencart.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testTcase() throws Exception {
    driver.get("file:///D:/Users/ADM-IG-HWDLAB1B/Desktop/WorkingWithForms.html");
    driver.findElement(By.id("txtUserName")).clear();
    driver.findElement(By.id("txtUserName")).sendKeys("vjagde");
    assertEquals("User Name :", driver.findElement(By.cssSelector("td")).getText());
    String usrName = driver.findElement(By.id("txtUserName")).getAttribute("value");
    System.out.println(usrName);
    driver.findElement(By.id("txtPassword")).clear();
    driver.findElement(By.id("txtPassword")).sendKeys("Pass1234");
    driver.findElement(By.id("txtConfPassword")).clear();
    driver.findElement(By.id("txtConfPassword")).sendKeys("Pass1234");
    driver.findElement(By.id("txtFirstName")).clear();
    driver.findElement(By.id("txtFirstName")).sendKeys("Vaibhav");
    driver.findElement(By.id("txtLastName")).clear();
    driver.findElement(By.id("txtLastName")).sendKeys("Jagde");
    driver.findElement(By.id("rbMale")).click();
    try {
      assertTrue(driver.findElement(By.id("rbMale")).isSelected());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("DOB")).clear();
    driver.findElement(By.id("DOB")).sendKeys("03-12-1997");
    driver.findElement(By.id("txtEmail")).clear();
    driver.findElement(By.id("txtEmail")).sendKeys("vaibhav.jagde@gmail.com");
    driver.findElement(By.id("txtAddress")).clear();
    driver.findElement(By.id("txtAddress")).sendKeys("Dombivli");
    driver.findElement(By.id("txtPhone")).clear();
    driver.findElement(By.id("txtPhone")).sendKeys("9004841888");
    driver.findElement(By.name("chkHobbies")).click();
    // ERROR: Caught exception [Error: Dom locators are not implemented yet!]
    driver.findElement(By.name("submit")).click();
    try {
      assertEquals("Submit", driver.findElement(By.name("submit")).getAttribute("value"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
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
