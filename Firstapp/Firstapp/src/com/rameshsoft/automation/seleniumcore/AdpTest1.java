package com.rameshsoft.automation.seleniumcore;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AdpTest1 {
        public static void main(String[] args) {
			
        	
        	System.setProperty("webdriver.chrome.driver", "D:\\Java Programs\\Firstapp\\Drivers\\chromedriver.exe");
        	WebDriver driver =new ChromeDriver();
        	driver.manage().window().maximize();
        	driver.manage().deleteAllCookies();
        	driver.manage().timeouts().implicitlyWait(85, TimeUnit.SECONDS);
        	
        	driver.get("https://www.rameshsoft.com");
        	
        	driver.findElement(By.xpath("//a[@href=\"https://rameshsoft.com/submit-an-inquiry/\"]")).click();
        	
        	List<WebElement> elements = driver.findElements(By.xpath("//*"));
        	int checkBoxCount=0;
        	int radioBtnCount=0;
        	
        	for(WebElement element :elements) {
        		String typeval =element.getAttribute("type");
        		if( typeval != null &&  typeval.equalsIgnoreCase("checkbox")) {
        			checkBoxCount++;
        		}
        		else if (typeval != null && typeval.equalsIgnoreCase("radio")) {
					radioBtnCount++;
				}
        		System.out.println("the Checkboxes are : "+checkBoxCount);
        		System.out.println("the radio buttons are : "+radioBtnCount);
        		
        	}

        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
			/*
			 * List<WebElement> elements = driver.findElements(By.xpath("//*")); int
			 * frameCount=0; Iterator<WebElement> itr = elements.iterator();
			 * 
			 * while(itr.hasNext()) { WebElement element = itr.next(); String frameTagName =
			 * element.getTagName();
			 * 
			 * if(frameTagName.equalsIgnoreCase("iframe")) { frameCount++; String frameId
			 * =element.getAttribute("id"); String frameName =element.getAttribute("name");
			 * String frameClassName =element.getAttribute("classname"); String frameSrc
			 * =element.getAttribute("src");
			 * 
			 * System.out.println("FrameId: "+frameId);
			 * System.out.println("FrameName: "+frameName);
			 * System.out.println("FrameClassName: "+frameClassName);
			 * System.out.println("FrameSrc: "+frameSrc); } else {
			 * System.out.println("it is not a frame"); }
			 * System.out.println("Total no of frame count : "+frameCount);
			 * 
			 * }
			 */
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
			/*
			 * int enabledLinkCount=0;
			 * 
			 * int disabledLinkCount=0;
			 *  
			 * for(WebElement element :elements) { String actualTagName
			 * =element.getTagName();
			 * 
			 * if(actualTagName.equalsIgnoreCase("a"))
			 * if(element.isDisplayed()&&element.isEnabled()) { enabledLinkCount++;
			 * 
			 * } else { disabledLinkCount++; }
			 * System.out.println("Enabled links count : "+enabledLinkCount);
			 * System.out.println("Disabed links count: "+disabledLinkCount); }
			 */
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	/*
			 * List<WebElement> elements = driver.findElements(By.xpath("//*"));
			 * 
			 * Iterator<WebElement> itr =elements.iterator();
			 * 
			 * int adpORADPCount=0;
			 * 
			 * while(itr.hasNext()) { WebElement element = itr.next(); String txt =
			 * element.getText();
			 * 
			 * if(txt.contains("adp") || txt.contains("ADP")) { adpORADPCount++; }
			 * 
			 * System.out.println("ADP count : "+adpORADPCount); }
			 */
        	
        	
        	
		}
	
	
	
	
	
}
