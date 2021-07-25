package com.rameshsoft.automation.seleniumcore;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_SignUp {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Java Programs\\Firstapp\\Drivers\\chromedriver.exe.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//a[@rel='async']")).click();
		
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Hello");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("hii");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("0989098988");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("poiujk@122");
		WebElement day = driver.findElement(By.id("day"));
		Select select=new Select(day);
		select.selectByIndex(18);
		WebElement month = driver.findElement(By.id("month"));
		Select select1=new Select(month);
		select1.selectByValue("4");
		WebElement year = driver.findElement(By.id("year"));
		Select select2=new Select(year);
		select2.selectByValue("1998");
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		Thread.sleep(5000);
		driver.close();
	
	}

}
