package automationFramework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import appModules.SignIn_Action;
import pageObjects.Colleges;
import pageObjects.Course;
import pageObjects.Home_Page;
import utility.Constant;

public class Prashant
{

	private static WebDriver driver = null;
	
	public static void main(String args[]) throws Exception
	{
		driver = new FirefoxDriver();
		driver.get(Constant.URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		WebElement city = driver.findElement(By.xpath("//a[@data-url='delhi']"));
		city.click();
		
		Thread.sleep(1000);
		
		SignIn_Action.Execute(driver);
		System.out.println("Login Success");
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(1000);
	
		
		//WebElement Agriculture = driver.findElement(By.xpath("//a[@href='/agriculture']"));
		WebElement Agriculture = driver.findElement(By.linkText("Agriculture"));

		Agriculture.click();
		Thread.sleep(1000);

		List<WebElement> college = driver.findElements(By.xpath("html/body/div[2]/div/div[2]/div[1]/div/div/div/div/h4"));
		try
		{
		for(int q=0;q<college.size();q=q+1)
		{

		System.out.println(college.get(q).getText());
		college.get(q).click();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		Colleges.pcolleges(driver).click();


		Thread.sleep(2000);
		}
		}
		catch(Exception e)
		{
			System.out.println("");
		}
/*
		Colleges.pcolleges(driver).click();
*/		
		
		List<WebElement> course = driver.findElements(By.xpath("html/body/div[2]/div/div[2]/div[1]/div/div/div/div/h4"));
		try
		{
		for(int q=0;q<course.size();q=q+1)
		{

		System.out.println(course.get(q).getText());
		course.get(q).click();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		Course.pcourse(driver).click();


		Thread.sleep(2000);
		}
		}
		catch(Exception e)
		{
			System.out.println("");
		}
		
		
		
	    Thread.sleep(2000);
		
		Home_Page.lnk_Logout(driver);
		System.out.println("Logout Success");
		
		System.out.println(driver.getTitle());
		
		driver.close();
	}
}
