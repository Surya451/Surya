package com.rameshsoft.automation.seleniumcore;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Java Programs\\Firstapp\\Drivers\\chromedriver.exe");

		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com");
		
		WebElement ele = driver.findElement(By.xpath("//a[@rel='async']"));
		
		if (ele.isDisplayed()&&ele.isEnabled()) {
			ele.click();	
		}
		else {
			System.out.println("ele is not displayed");
		}
		WebElement dayDD= driver.findElement(By.id("day"));
		String actualTagName =dayDD.getTagName();
		
		if (actualTagName.equalsIgnoreCase("select")) {
		
			if (dayDD.isDisplayed()&&dayDD.isEnabled()) {
				Select select =new Select(dayDD);
				boolean status=select.isMultiple();
				if (status) {
					System.out.println("It is multi selected dropdown");
				}
				else {
					System.out.println("It is single selected dropdown");
				}
				select.selectByIndex(19);
				select.selectByValue("22");
				select.selectByVisibleText("4");
				
				WebElement element = select.getFirstSelectedOption();
				System.out.println("First selected option: "+element);
				
				List<WebElement> selectedElements = select.getAllSelectedOptions();
				System.out.println("Selected elements are: "+selectedElements.size());
				
				
				List<WebElement> totalElements = select.getOptions();
				System.out.println("Total no of elements are: "+totalElements.size());	
			}
		
		}
		else {
			driver.findElement(By.xpath("//*[@id='day']/option[8]")).click();
			List<WebElement> elements = driver.findElements(By.xpath("//*[@id='day']/option"));
			System.out.println("Total no of elements from dd: "+elements.size());
		}
	
	}


}
