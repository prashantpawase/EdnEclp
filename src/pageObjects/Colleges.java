package pageObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Colleges
{


	public static WebElement pcolleges(WebDriver driver)
	{

	List<WebElement> col = driver.findElements(By.xpath("html/body/div[2]/div/div[2]/div/div[1]/div[3]/div/div/div/a[1]"));
		
	for(int c=0;c<col.size();c=c+1)
	{
	
		System.out.println(col.get(c).getText());

		Actions act = new Actions(driver);

		act.keyDown(Keys.LEFT_CONTROL).keyDown(Keys.LEFT_SHIFT).perform();
	 
		col.get(c).click();
   
		act.keyUp(Keys.LEFT_CONTROL).keyDown(Keys.LEFT_SHIFT).perform();

		String WindowHandl = driver.getWindowHandle();
		driver.switchTo().window(WindowHandl);
 

		WebElement cl = driver.findElement(By.xpath("//h1[@class='search-term']"));
	    System.out.println(cl.getText());
		
		System.out.println(driver.getTitle());
		
		WebElement cn = driver.findElement(By.xpath("//span[@class='res-counter']"));
		System.out.println(cn.getText());
	
		
		
		driver.findElement(By.xpath("//div[@class='col-sm-12 text-center']")).click();
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	     
		List<WebElement> colleges = driver.findElements(By.xpath("//a[@class='col-xs-6 title-20']"));

    	 for(int i=0; i<colleges.size(); i=i+1)	  
		 	{
    		 
    		 System.out.println(colleges.get(i).getText());
    		 
    		 Actions actt = new Actions(driver);
   
    		 actt.keyDown(Keys.LEFT_CONTROL).keyDown(Keys.LEFT_SHIFT).perform();
   	 /*
    		 JavascriptExecutor jasct = (JavascriptExecutor) driver;  
    		 jasct.executeScript("window.scrollTo(0, document.body.scrollHeight)", "");
    */		 
    		 
    		 colleges.get(i).click();
    		 
    		 System.out.println(driver.getTitle());
        
    		 actt.keyUp(Keys.LEFT_CONTROL).keyDown(Keys.LEFT_SHIFT).perform();
    
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
           
        	/*
        	WebElement elementt = driver.findElement(By.xpath("html/body/div[1]/ol/li[3]"));
        	elementt.click();
        	System.out.println(elementt.getText());
         */  
    			 driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "w");
    			 driver.switchTo().defaultContent();
        
     
    			 System.out.println("--------------------xxxxxxxxxxxx-----------------");
        	
    		 }
       
		 	}
    	 driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "w");
         driver.switchTo().defaultContent();
		 }
return null;

}	
}
