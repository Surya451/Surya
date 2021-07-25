package com.rameshsoft.automation.seleniumcore;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class ChromeTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Java Programs\\Firstapp\\Drivers\\chromedriver.exe");

		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);

		driver.get("https://www.jqueryui.com");
		driver.findElement(By.linkText("Draggable")).click();
		driver.switchTo().frame(0);
		WebElement draggable =driver.findElement(By.id("draggable"));
		
		Actions actions=new Actions(driver);
		actions.dragAndDropBy(draggable,150,150).build().perform();
		Thread.sleep(5000);
		driver.quit();
		
		
		
		
		
		
		
		
		
		/*
		 * WebElement ele= driver.findElement(By.id("day"));
		 * 
		 * Select select=new Select(ele); select.selectByIndex(5);
		 * 
		 * Thread.sleep(5000); driver.close();
		 */
		
		
		
		
		
		
		
		
		/*
		 * Actions actions=new Actions(driver);
		 * 
		 * actions.sendKeys(Keys.chord(Keys.CONTROL,Keys.SHIFT,"s")).build().perform();
		 * 
		 * driver.close();
		 */
	}
}
