package Testing;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InventoryPegination
{

	WebDriver driver;
	
	public void chrome() throws InterruptedException	
	{
		
		System.setProperty("webdriver.chromedriver","C:\\Users\\Aaditya\\Selenium3\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://dev.poonamcoatings.com");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@id=\"email\"]"));
		username.sendKeys("admin@poonamcoatings.com");	
		
		WebElement Password = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		Password.sendKeys("Super@1234");
		
		WebElement Submit = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		Submit.click();	
	}
	
	
	public void inventoryclick() throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));        
		// Click on Setting
	    	try
	    	{
	        WebElement Inventoryclick = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class=\"scc-name\" and text()=\"Inventory\"]")));
	        Inventoryclick.click();
	        Thread.sleep(3000);     		
	    	}
	        catch(Exception e)
	        {
	            e.printStackTrace();
	        }
	    	
	    	try
	    	{
	    	WebElement InventoryInnerclick = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[6]/div[1]")));
	    	InventoryInnerclick.click();
	    	}
	    	
	    	catch(Exception e)
	    	{
	    		e.printStackTrace();
	    	}
		}    
	
	 public void pagination() throws InterruptedException
	    {
	        try       
	        {

	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".pagination-container")));  

	            List<WebElement> paginationButtons = driver.findElements(By.cssSelector(".pagination-container .pagBTN"));


	            for (WebElement button : paginationButtons) 
	            {
	                button.click();
	                Thread.sleep(3000); // You might need to adjust this sleep time
	                // Add your logic to handle the content on the new page here
	                
	                System.out.println("Clicked pagination button: " + button.getText());
	                // System.out.println("Waiting for content to load...");
	            }

	        } 	 

	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }	    
	        
	    }
		
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		InventoryPegination obj=new InventoryPegination();
		obj.chrome();
		obj.inventoryclick();
		obj.pagination();
		Thread.sleep(2000);
		
	}

}

//Successfully run Dt 28.10.24
