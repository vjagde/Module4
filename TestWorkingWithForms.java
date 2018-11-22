import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestWorkingWithForms
{
	WebDriver driver;
	
	@Before
	public void openBrowser()
	{
		System.out.println("In Before");
		driver=new FirefoxDriver();
		
		driver.get("file:///D:/Users/ADM-IG-HWDLAB1B/Desktop/WorkingWithForms.html");
		
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	}
	
	@Test
	public void testTitle()
	{
		String title=driver.getTitle();
		assertEquals("Email Registration Form",title);
	}
	
	@Test
	public void testAlert() throws InterruptedException
	{
		WebElement elePwd=driver.findElement(By.id("txtPassword"));
		elePwd.sendKeys("VaibhavJagde");
		
		WebElement eleCPwd=driver.findElement(By.id("txtConfPassword"));
		eleCPwd.sendKeys("VaibhavJagde");
		
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
	}
	
	@Test
	public void testHeading()
	{
		String heading=driver.findElement(By.tagName("h1")).getText();
		assertEquals(heading,"Email Registration");
	}
	
	@After
	public void closeBrowser()
	{
		System.out.println("In After");
		driver.quit();
	}
	
}
