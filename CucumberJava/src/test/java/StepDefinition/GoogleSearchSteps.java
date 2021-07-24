package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	
	 WebDriver driver= null;
	 String projectPath;
	
	
	@Given("browser is opened")
	public void browser_is_opened() {
		
		
		projectPath= System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", projectPath+"\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS); 
		
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
	    
		driver.get("https://google.com");
		
	}

	@When("user enters text in search box")
	public void user_enters_text_in_search_box() {
	  
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
	}

	@And("hits enter")
	public void hits_enter() throws InterruptedException {
	    
		driver.findElement(By.xpath("//body[@jsmodel='TvHxbe']")).click();
		Thread.sleep(3000);
	}

	@Then("user is navigated to search result")
	public void user_is_navigated_to_search_result() {
	    
		driver.getPageSource().contains("Online Courses");
		driver.close();
	}
	
	
	
	
	
	
	

}
