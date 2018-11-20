import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Sample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///D:/Users/ADM-IG-HWDLAB1B/Desktop/WorkingWithForms.html");
		driver.findElement(By.id("txtUserName")).sendKeys("Suraj");
		//Thread.sleep(2000);
		driver.findElement(By.name("reset")).submit();
		driver.findElement(By.id("rbFemale")).click();
		//Thread.sleep(2000);
		driver.findElement(By.name("chkHobbies")).click();
		//Thread.sleep(2000);
		driver.findElement(By.name("submit")).submit();
		//Thread.sleep(2000);
		//driver.navigate().to("http://www.opencart.com");
		//Thread.sleep(2000);
		//driver.navigate().refresh();
		//Thread.sleep(2000);
		//driver.navigate().back();
		//Thread.sleep(2000);
		//driver.navigate().forward();
		//Thread.sleep(2000);
		System.out.println("Page Title is :" + driver.getTitle());
		System.out.println("url is "+ driver.getCurrentUrl());
		//System.out.println("Page Source is "+ driver.getPageSource());
		String actualTitle = driver.getTitle();
		String expectedTitle="Email Registration Form";
		if(actualTitle.contentEquals(expectedTitle))
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}
		if(driver.getPageSource().contains("User Name"))
		{
			System.out.println("Matched");
		}
		else
		{
			System.out.println("Not matched");
		}
		//driver.quit();
	}

}
