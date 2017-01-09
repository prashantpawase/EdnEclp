package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn_Page 
{

	private static WebElement element = null;
	
	public static WebElement txtbx_UserName(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//input[@placeholder='Username / Email / Mobile']"));
		return element;
	}
	
	public static WebElement txtbx_Password(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		return element;
	}
	
	public static WebElement btn_LogIn(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//button[@type='submit']"));
		return element;
	}
}
