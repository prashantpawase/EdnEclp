package pageObjects;



import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Course 
{
	
		
	public static WebElement pcourse(WebDriver driver)
	{
		
	
		
		List<WebElement> coli = driver.findElements(By.xpath("html/body/div[2]/div/div[2]/div/div[1]/div[3]/div/div/div/a[2]"));
		
		for(int i=0;i<coli.size();i=i+1)
		{
			System.out.println(coli.get(i).getText());
			
			Actions act = new Actions(driver);
			
			act.keyDown(Keys.LEFT_CONTROL).keyDown(Keys.LEFT_SHIFT).perform();
			
			coli.get(i).click();
			
			act.keyUp(Keys.LEFT_CONTROL).keyDown(Keys.LEFT_SHIFT).perform();
			
			String WindowHandlei = driver.getWindowHandle();
			driver.switchTo().window(WindowHandlei);
			
			
			List<WebElement> colj = driver.findElements(By.xpath("//h4[@class='course']"));
			
			for(int j=0;j<colj.size();j=j+1)
			{
				System.out.println(colj.get(j).getText());
				colj.get(j).click();
			}
			
			List<WebElement> colk = driver.findElements(By.xpath("//li[@class='subcourse']"));
			
			for(int k=0;k<colk.size();k=k+1)
			{
				System.out.println(colk.get(k).getText());
				
				Actions actk = new Actions(driver);
				
				actk.keyDown(Keys.LEFT_CONTROL).keyDown(Keys.LEFT_SHIFT).perform();
				colk.get(k).click();
				actk.keyUp(Keys.LEFT_CONTROL).keyDown(Keys.LEFT_SHIFT).perform();
				
				String WindowHandlek = driver.getWindowHandle();
				driver.switchTo().window(WindowHandlek);
				
				
				
				List<WebElement> colc = driver.findElements(By.xpath("//a[@class='col-xs-6 title-20']"));
				
				for(int c=0;c<colc.size();c=c+1)
				{
					System.out.println(colc.get(c).getText());
					
					Actions actc = new Actions(driver);
					
					actc.keyDown(Keys.LEFT_CONTROL).keyDown(Keys.LEFT_SHIFT).perform();
					colc.get(c).click();
					actc.keyUp(Keys.LEFT_CONTROL).keyDown(Keys.LEFT_SHIFT).perform();
					
					 String windowHandlee = driver.getWindowHandle();

		             ArrayList tabs = new ArrayList (driver.getWindowHandles());

		             driver.switchTo().window(windowHandlee);
		                
		               if(!driver.findElements(By.xpath("//li[@class='active']")).isEmpty())
		               {
		               	 WebElement prashant = driver.findElement(By.xpath("//li[@class='active']"));
		                 System.out.println(prashant.getText());
		               	     	
		                 driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "w");
		                 driver.switchTo().defaultContent();
		               
		            
		                 System.out.println("--------------------xxxxxxxxxxxx-----------------");
		                
		           	
		               	
		               }
		               else
		               {
		                   
		               	System.out.println("\033[31mElement Not Found\033[0m");
		            
		               	driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "w");
		                driver.switchTo().defaultContent();
		               
		            
		                System.out.println("--------------------xxxxxxxxxxxx-----------------");
		               	
		               }
					
				}
				driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "w");
	            driver.switchTo().defaultContent();
				
			}
			
		}
		return null;
		
		
	}
	
	
}
