package com.rameshsoft.automation.seleniumcore;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable_Test {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Java Programs\\Firstapp\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(82, TimeUnit.SECONDS);
		driver.get("https://www.jqueryui.com");
		driver.findElement(By.linkText("Draggable")).click();;
		driver.switchTo().frame(0);
		
		WebElement draggable = driver.findElement(By.id("draggable"));
		Actions action =new Actions(driver);
		action.dragAndDropBy(draggable, 200, 100).build().perform();
		
		Thread.sleep(5000);
		driver.close();
	}

}
