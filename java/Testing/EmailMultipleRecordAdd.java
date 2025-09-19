package Testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmailMultipleRecordAdd
{

    WebDriver driver;

    public void chrome() throws InterruptedException
	{
		//System.setProperty("Webdriver.chromedriver","C:\\Users\\Aaditya\\Selenium3\\chromedriver.exe");
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
	

    public void Addemail(String[] ETitles, String[] ESubject, String[] EDesc) throws InterruptedException 
    {
    	
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Click on Setting
        WebElement Settingclick = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Settings']")));
        Settingclick.click();
        Thread.sleep(4000);

        // Click on EmailManagement
        WebElement EmailManagementclick = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Email Management')]")));
        EmailManagementclick.click();

        for (int i = 0; i <= ETitles.length; i++) 
        {
            //Add new email
            WebElement EmailManagementadd = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn-primary header-btn']")));
            EmailManagementadd.click();
            Thread.sleep(2000);

            //Title
            WebElement Title = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='title']")));
            Title.sendKeys(ETitles[i]);

            //Subject
            WebElement Subject = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='subject']")));
            Subject.sendKeys(ESubject[i]);

            //Description
            WebElement Description = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ql-editor ql-blank']")));
            Description.sendKeys(EDesc[i]);
            Thread.sleep(2000);

            WebElement Submit = driver.findElement(By.xpath("//button[normalize-space()='Submit']"));         
            Submit.click();
        }
    }

    
   public static void main(String[] args) throws InterruptedException 
   {
        EmailMultipleRecordAdd obj = new EmailMultipleRecordAdd();
        obj.chrome();        
        String[] ETitles = {"Test A", "Test B", "Test C", "Test D", "Test E"};      
        String[] ESubject = {"Test A11dasdd1", "Test B11asddd11", "Test C1asddd111", "Test D11sadds11", "Test E1sasds111"};
        String[] EDesc = {"gasdadasdfsdfsdfsdfdd", "saddsadfsfsdfddasd", "dasasdddddfsdfsdfasd", "sadasasddsfsdfsdfdssd", "sdaasdfsdfsddadsd"};        
        obj.Addemail(ETitles, ESubject, EDesc);
    }
}

//Successful run on "22.10.24"