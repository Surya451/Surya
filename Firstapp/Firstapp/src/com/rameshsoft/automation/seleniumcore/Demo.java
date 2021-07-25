package com.rameshsoft.automation.seleniumcore;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Java Programs\\Firstapp\\Drivers\\chromedriver.exe");
     	WebDriver driver=new ChromeDriver();
     	driver.manage().window().maximize();
     	driver.manage().deleteAllCookies();
       
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
		/*
		 * driver.get("https://www.gmail.com"); String title =driver.getTitle();
		 * System.out.println(title);
		 */
  
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	//findElement(By.xpath("//input[@role=\"combobox\"]")).sendKeys("jathiratnalu");
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
//     	driver.get("https://www.flipkart.com");
//     	
//     	driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
//     	
//     	driver.findElement(By.xpath("//input[@autocomplete=\"off\"]")).sendKeys("iphone");
//     	
//     	
//     	
//     	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
//     	
//     	
//     	driver.findElement(By.xpath("//a[@class=\"s1Q9rs\"]")).click();
//     	
     	
     	
     	
     	
     	
     	
     	
     	
//     	driver.get("https://www.yahoo.com");
//     	driver.findElement(By.linkText("Sign in")).click();
//     	
//        driver.findElement(By.id("login-username")).sendKeys("surya@yahoo.com");     
//        driver.findElement(By.id("login-signin")).click();  
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
//     	1.id
//     	WebElement un = driver.findElement(By.id("identifierId"));
//     	un.sendKeys("suryanarayanmachetti@gmail.com");
//     	2.name 
//     	WebElement next= driver.findElement(By.className("VfPpkd-RLmnJb"));
//     	next.click();
//     	Thread.sleep(5000);
//     	driver.findElement(By.id("identifierId")).sendKeys("suryanarayanamachetti@gmail.com");
//     	driver.findElement(By.className("VfPpkd-RLmnJb")).click();
//     	Thread.sleep(5000);
	}

	private static WebElement findElement(By id) {
		// TODO Auto-generated method stub
		return null;
	}

}
