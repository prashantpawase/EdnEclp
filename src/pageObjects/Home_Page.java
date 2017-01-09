package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Page
{

	private static WebElement element = null;
	
	public static WebElement lnk_SignIn(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//a[@href='/login']"));
		return element;
	}
	
	public static WebElement lnk_Logout(WebDriver driver)
	{
		WebElement span = driver.findElement(By.xpath("html/body/header/div/div/div[3]/div/a/span"));
		span.click();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		WebElement Logout = driver.findElement(By.xpath("//a[@href='http://www.edunuts.com/logout']"));
		Logout.click();
		
		return element;
	}
	
	
}
