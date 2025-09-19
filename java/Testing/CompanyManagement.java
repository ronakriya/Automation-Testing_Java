package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompanyManagement 
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
		
		//Click on Setting 
		WebElement Settingclick=driver.findElement(By.xpath("//span[normalize-space()='Settings']"));
		Settingclick.click();
			
		//Click on Company
		WebElement Companyclick=driver.findElement(By.xpath("//div[normalize-space()='Company']"));
		Companyclick.click();			
		//Perfect Run
	}	
	
	
	public void companymanage() throws InterruptedException
	{
		
		//Edit Company
		WebElement EditCompanyclick=driver.findElement(By.xpath("//span[@class='material-symbols-outlined small']"));
		EditCompanyclick.click();	
		
		//*************Company form************//		
		//NameOfCompany
		WebElement NameOfCompany=driver.findElement(By.xpath("//input[@id='company_name']"));
		NameOfCompany.sendKeys(Keys.CONTROL,"A", Keys.DELETE);	
		NameOfCompany.sendKeys("Poonam Coatings Test Co. Pvt Ltd");		
		
		//Official Email Address
		WebElement OffEmail1=driver.findElement(By.xpath("//input[@id='email']"));		
		OffEmail1.sendKeys(Keys.CONTROL,"A", Keys.DELETE);	
		OffEmail1.sendKeys("testpoonamadmins@poonamcoatings.com");		
		
		WebElement ContactNumber=driver.findElement(By.xpath("//input[@id='contact_num']"));
		ContactNumber.sendKeys(Keys.CONTROL,"A", Keys.DELETE);
		ContactNumber.sendKeys("8146074056");		
		
		//Industry
		WebElement Industry=driver.findElement(By.xpath("//input[@id='industry']"));
		Industry.sendKeys(Keys.CONTROL,"A", Keys.DELETE);
		Industry.sendKeys("PaintB");	
		
		//FoundingYear
		WebElement FoundingYear=driver.findElement(By.xpath("//input[@id='founding_year']"));
		FoundingYear.sendKeys(Keys.CONTROL,"A", Keys.DELETE);
		FoundingYear.sendKeys("2012");
		
		//GSTNumber
		WebElement GSTNumber=driver.findElement(By.xpath("//input[@id='gst_number']"));
		GSTNumber.sendKeys(Keys.CONTROL,"A", Keys.DELETE);
		GSTNumber.sendKeys("24AANCP9611L1ZZ");
		
		//Addressline1
		WebElement AddrsLine1=driver.findElement(By.xpath("//input[@id='address-line-one']"));
		AddrsLine1.sendKeys(Keys.CONTROL,"A", Keys.DELETE);		
		AddrsLine1.sendKeys("Sitapur Sarai Test obj");
		
		//Addressline2
		WebElement AddrsLine2=driver.findElement(By.xpath("//input[@id='address_line_two']"));
		AddrsLine2.sendKeys(Keys.CONTROL,"A", Keys.DELETE);		
		AddrsLine2.sendKeys("Solatest obj");		
		
		//Pincode
		WebElement Pincode=driver.findElement(By.xpath("//input[@id='pinCode']"));
		Pincode.sendKeys(Keys.CONTROL,"A", Keys.DELETE);		
		Pincode.sendKeys("384355");	
		Thread.sleep(4000);
				
		//Submit
		WebElement Submit=driver.findElement(By.xpath("//button[normalize-space()='Save']"));
		Submit.click();		
		//Perfect Run	
	}
	
	
	
	public void BankDetailsAdd() throws InterruptedException
	{
		//Click on Add Bank Details
		
		WebElement AddBankDetails=driver.findElement(By.xpath("//div[3]//div[1]//div[1]//button[1]//span[2]"));
		AddBankDetails.click();
		
		WebElement IFSC=driver.findElement(By.xpath("//input[@id='ifsc']"));
		IFSC.sendKeys("BARB0ABRBUL");	
		
		WebElement ACHolderName=driver.findElement(By.xpath("//input[@id='accountHolderName']"));
		ACHolderName.sendKeys("Kavya");
		
		// WebElement BankName=driver.findElement(By.xpath("//input[@id='bankName']"));
		// BankName.sendKeys("BOB");	
	
		// WebElement BranchName=driver.findElement(By.xpath("//input[@id='branch']"));
		// BranchName.sendKeys("Sola Bahgvat");
		
		WebElement AccNo=driver.findElement(By.xpath("//input[@id='accountNo']"));
		AccNo.click();
		AccNo.sendKeys("687687686241");
		
		WebElement ACtype=driver.findElement(By.xpath("//div[@class='direct fixedHeight']"));
		ACtype.click();
		
		WebElement ACtypeselect=driver.findElement(By.xpath("//span[normalize-space()='Saving']"));		
		//span[normalize-space()='Saving']
		ACtypeselect.click();
		//ACtypeselect.sendKeys("saving");
		
		WebElement UPIID=driver.findElement(By.xpath("//input[@id='upi']"));
		UPIID.sendKeys("9427604051@IFSCI");			
			
		WebElement submit=driver.findElement(By.xpath("//button[normalize-space()='SUBMIT']"));
		submit.click();			
	}
	
	public void BankDetailsEdit() throws InterruptedException
	{
		//Add Bank Details	
		//Click on bank details		
		
		WebElement ClickBankDetails1=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]"));
		ClickBankDetails1.click();			
		
		
		WebElement EditBankDetails=driver.findElement(By.xpath("/body/div/div/div/div/div/div/div/div[1]/div[1]/div[1]"));
		EditBankDetails.click();
		
		
		WebElement EditIFSC=driver.findElement(By.xpath("//input[@id='ifsc']"));
		EditIFSC.sendKeys("BARB0ABRBUL");
		
		WebElement EditACHolderName=driver.findElement(By.xpath("//input[@id='accountHolderName']"));
		EditACHolderName.sendKeys("Kashish");		
		
				/*		WebElement EditBankName=driver.findElement(By.xpath("//input[@id='bankName']"));
						EditBankName.sendKeys("BOB");						
						WebElement EditBranchName=driver.findElement(By.xpath("//input[@id='branch']"));
						EditBranchName.sendKeys("Sola Bahgvat"); 
				*/
		
		WebElement EditAccNo=driver.findElement(By.xpath("//input[@id='accountNo']"));
		EditAccNo.click();
		EditAccNo.sendKeys("687687686742");
		
		WebElement EditACtype=driver.findElement(By.xpath("//div[@class='direct fixedHeight']"));
		EditACtype.click();
		WebElement EditACtypeselect=driver.findElement(By.xpath("//div[@class='drop-down-menu']//div[2]"));		
		EditACtypeselect.click();
		EditACtypeselect.sendKeys("saving");	
		
		WebElement EditUPIID=driver.findElement(By.xpath("//input[@id='upi']"));
		EditUPIID.sendKeys("9427604052@IFSCI");		
		
		
		WebElement submit=driver.findElement(By.xpath("//button[normalize-space()='SUBMIT']"));
		submit.click();	
		
		//not perfect
	}
	
	public void warehouseEdit() throws InterruptedException
	{			
		
		try
		{		
		WebElement Editaddress = driver.findElement(By.cssSelector(".btn-primary"));
		Editaddress.click();		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		//WebElement Editaddress = driver.findElement(By.id("address-line-one"));
		//Editaddress.click();
		//Editaddress.sendKeys("55 suraj nagarda");			
	}
		
		
	public static void main(String[] args) throws InterruptedException
	{

		CompanyManagement obj=new CompanyManagement();
		obj.chrome();
		//obj.companymanage();
		//obj.BankDetailsAdd();
		//obj.BankDetailsEdit();
		//BankDetails details not done
		Thread.sleep(2000);
		//obj.warehouseAdd();
		obj.warehouseEdit();
		
	}

}
