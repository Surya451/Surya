package com.surya.automation.fp.businessscripts;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupDemo {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Java Programs\\frameworks\\Drivers\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.guru99.com/test/upload/");
	
		
		Runtime runtime =Runtime.getRuntime();
		runtime.exec("D:\\Java Programs\\frameworks\\Popups\\Popups.exe");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
		//driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\dell\\OneDrive\\Desktop\\Selinium.txt");
	
		
		/*
		 * WebElement un = driver.findElement(By.xpath("//input[@type='text']"));
		 * un.clear(); un.sendKeys("Super");
		 * driver.findElement(By.xpath("//input[@type='submit']")).click();
		 */

		
		/*
		 * TargetLocator t1 = driver.switchTo(); 
		 * Alert alert =t1.alert();
		 */
		/*
		 * Alert alert =driver.switchTo().alert();
		 * 
		 * alert.accept();
		 */
		
		Thread.sleep(3000);
		driver.close();
	
	}

}
