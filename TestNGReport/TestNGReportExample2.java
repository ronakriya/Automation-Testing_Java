package TestNGReport;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestNGReportExample2
{
	@Test
	public void googleserch()
	{
		//Luanch chrome browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Reporter.log("Chrome browser opened..");
		
		//open url
		driver.get("https://www.google.com/");
		WebElement search=driver.findElement(By.name("q"));
		Reporter.log("India Keyword Entered");
		
		search.sendKeys("India Gate");
	    search.sendKeys(Keys.ENTER);
	    
		Reporter.log("Enter Key Pressed");
		driver.quit();
	    
		Reporter.log("Google Url closed");
		
		
}
	
}
