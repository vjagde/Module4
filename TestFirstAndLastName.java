package pomexamples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestFirstAndLastName {
  @Test
  public void verifylogin()
  {
	  WebDriver driver=new FirefoxDriver();
	  driver.get("file:///D:/Users/ADM-IG-HWDLAB1B/Desktop/WorkingWithForms.html");
	  FirstAndLastName fnl=new FirstAndLastName(driver);
	  fnl.setLn(By.id("txtLastName"),"Jagde");
  }
}
