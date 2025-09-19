package Testing;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class UserManagementDeletemuldata 
{

	WebDriver driver;
	
	public void chrome() throws InterruptedException
	{
		//System.setProperty("WebDriver.chromedriver","C:\\Users\\Aaditya\\Selenium3\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://dev.poonamcoatings.com");
		driver.manage().window().maximize();		

		//login
		WebElement Username=driver.findElement(By.xpath("//input[@id='email']"));
		Username.sendKeys("admin@poonamcoatings.com");		
		
		WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys("Super@1234");
		
		WebElement Login=driver.findElement(By.xpath("//button[@type='submit']"));
		Login.click();	
		Thread.sleep(8000);		
	}
	
		
	public void userdelete() throws InterruptedException
	{
		
		//Click on Setting 
		WebElement Settingclick=driver.findElement(By.xpath("//span[normalize-space()='Settings']"));		
		Settingclick.click();
		
		//Click on UserManagement
		WebElement UserManagementclick=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[12]/div[3]"));
		UserManagementclick.click();
		Thread.sleep(2000);
		
		int row=6;
		for(int i=0;i<=row;i++)
		{		
		//delete User							
		WebElement deleteuser=driver.findElement(By.xpath("//tbody/tr[\"+i\"]/td[7]/div[1]/button[3]/span[1]"));		
		deleteuser.click();			
		WebElement deleteclick=driver.findElement(By.xpath("//button[@class='del-conform']"));
		deleteclick.click();		
		}
		
	}	
	
	public static void main(String[] args) throws InterruptedException
	{		
		UserManagementDeletemuldata obj=new UserManagementDeletemuldata();
		obj.chrome();			
		obj.userdelete();	
	}

}

//Successful run 28.10.24