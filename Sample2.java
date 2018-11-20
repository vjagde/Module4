
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Sample2 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/Users/ADM-IG-HWDLAB1B/Desktop/WorkingWithForms.html");
		//boolean status=element.isDisplayed();
		//boolean status
		
		
		if(driver.findElement(By.id("txtUserName")).isDisplayed())
		{
			driver.findElement(By.id("txtUserName")).sendKeys("S_singh");
		}
		else
		{
			System.out.println("NOOOO");
		}
		Thread.sleep(3000);
		driver.findElement(By.id("txtPassword")).sendKeys("Suraj1234");
		driver.findElement(By.className("Format")).sendKeys("Suraj1234");
		driver.findElement(By.id("txtFirstName")).sendKeys("Suraj");
		driver.findElement(By.id("txtLastName")).sendKeys("Singh");
		if(driver.findElements(By.name("gender")).get(0).isSelected())
		{
			driver.findElements(By.name("gender")).get(0).click();
		}
		else
		{
			driver.findElements(By.name("gender")).get(1).click();
			
		}
		//driver.findElement(By.id("rbMale")).click();
		driver.findElement(By.name("DtOB")).sendKeys("27/01/1997");
		driver.findElement(By.id("txtEmail")).sendKeys("suraj.singh@gmail.com");
		driver.findElement(By.id("txtAddress")).sendKeys("Kolkata");
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[10]/td[2]/select/option[2]")).click();
		System.out.println(driver.findElement(By.id("txtUserName")).getAttribute("value"));
		System.out.println(driver.findElement(By.xpath(".//*[@id='txtPassword']")).getText());
		driver.findElement(By.id("txtPhone")).sendKeys("9874563215");
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[12]/td[2]/input[2]")).click();
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[12]/td[2]/input[3]")).click();
		Thread.sleep(2000);
		
		Select drpCity=new Select(driver.findElement(By.name("City")));
		drpCity.selectByVisibleText("Mumbai");
		drpCity.selectByIndex(1);
		drpCity.selectByIndex(2);
		Thread.sleep(2000);
		
		Select country=new Select(driver.findElement(By.id("drpCountry")));
		
		driver.findElement(By.name("submit")).submit();
		driver.findElement(By.name("reset")).clear();
		driver.quit();
	}

	private static WebElement get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

	

}
