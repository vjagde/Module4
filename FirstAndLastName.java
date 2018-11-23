package pomexamples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FirstAndLastName
{
	WebDriver driver;
	By uname;
	By ln;
	
	public By getUname() {
		return uname;
	}
	public void setUname(By uname,String uname1) {
		this.uname = uname;
		driver.findElement(uname).sendKeys(uname1);
	}
	public By getLn() {
		return ln;
	}
	public void setLn(By ln,String ln1) {
		this.ln = ln;
		driver.findElement(ln).sendKeys(ln1);
	}
	
	public FirstAndLastName(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	
}
