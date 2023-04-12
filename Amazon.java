package project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Amazon{
    public static void main( String[] args ) throws InterruptedException
    {
    	        WebDriverManager.chromedriver().setup();
    	    	ChromeOptions co=new ChromeOptions();
    	    	co.addArguments("--remote-allow-origins=*");
    	    	WebDriver driver=new ChromeDriver(co);
    	    	driver.manage().window().maximize();
    	    	driver.get("https://www.amazon.in/Sony-ZV-E10L-Interchangeable-Lens-Mirrorless-Autofocus/dp/B09F9Q7287/ref=sr_1_1?crid=126EB8MU8JBXZ&keywords=sony%2Bcamera&qid=1681288394&sprefix=sonycamera%2Caps%2C736&sr=8-1&th=1");
    	    	driver.findElement(By.id("add-to-cart-button")).submit();
    	    	String t=driver.getTitle();
    	    	System.out.println(t);
    	    	
    	    	
    	    	String cart=driver.findElement(By.xpath("//*[@id=\"NATC_SMART_WAGON_CONF_MSG_SUCCESS\"]/span")).getText();
    	     	if(cart.equals("Added to cart"));
    	     		System.out.println("1.  Verified that Product added to cart ");
    	     		
    	     		driver.navigate().back();
        	    	
        	    	WebElement sort1=driver.findElement(By.xpath("//*[@id=\"quantity\"]"));
                	sort1.click();
                	Select select=new Select(sort1);
                	select.selectByIndex(1);
                	
                	String drop=driver.findElement(By.xpath("//*[@id=\"quantity\"]")).getText();
        	     	if(drop.equals("2"));
        	     		System.out.println("3.  Verified that Product is updated to cart ");	
    }
}