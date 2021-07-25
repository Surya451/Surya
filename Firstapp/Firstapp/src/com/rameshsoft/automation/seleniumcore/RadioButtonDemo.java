package com.rameshsoft.automation.seleniumcore;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonDemo {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Java Programs\\Firstapp\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(42, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com");
	
	
	WebElement radio = driver.findElement(By.id("uoe "));
	
	if (radio.isDisplayed()&&radio.isEnabled()) {
		radio.click();
	}else {
		System.out.println("Radio button is not click");
	}
	Thread.sleep(5000);
	driver.close();
	
	
	
	
}

}
