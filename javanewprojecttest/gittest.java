package javanewprojecttest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gittest
{
	public void chrome()
	{
		WebDriver driver;
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\Aaditya\\Selenium3\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://www.google.com");
	}
	
	

	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		gittest obj=new gittest();
		obj.chrome();
				
	}

}
