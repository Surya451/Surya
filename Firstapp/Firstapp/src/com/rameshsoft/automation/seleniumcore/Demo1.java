package com.rameshsoft.automation.seleniumcore;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Java Programs\\Firstapp\\Drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(85, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		
	    WebElement daydd = driver.findElement(By.id("day"));
	    
	    Select select =new Select(daydd);
	    select.selectByIndex(19);
	    
	    WebElement monthdd = driver.findElement(By.id("month"));
	    
	    Select select1 =new Select(monthdd);
	    select1.selectByValue("april");;
		
        WebElement  yeardd = driver.findElement(By.id("year"));
	    
	    Select select2 =new Select(yeardd);
	    select2.selectByIndex(1998);
	
	    Thread.sleep(5000);
	    driver.close();
		
		
		
		
		
		
		
	}

}
