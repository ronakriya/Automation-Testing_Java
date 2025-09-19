package Testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductCreateNewMultipleAddBySheet
{

    WebDriver driver;

    public void chrome() throws InterruptedException 
    {
        // System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aaditya\\Selenium3\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://dev.poonamcoatings.com");
        driver.manage().window().maximize();

        // login
        WebElement Username = driver.findElement(By.xpath("//input[@id='email']"));
        Username.sendKeys("admin@poonamcoatings.com");

        WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
        Password.sendKeys("Super@1234");

        WebElement Login = driver.findElement(By.xpath("//button[@type='submit']"));
        Login.click();
        Thread.sleep(8000);
    }

    public void createNewProduct(String PaintName, String ProductStd, String ProductCode, String HSNCode, String Brand,
                                  String Category, String SubCategory, String SubChildCategory, String BasePaint1,
                                  String ProportionOfPaint1, String Tinter1, String ProportionOfTinter, String BasePaint2,
                                  String ProportionOfPaint2, String PackSize, String ProductQtyLtr, String Color,
                                  String PaintType, String FinishType, String CostPrice, String SellingPrice) throws InterruptedException 
    {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Navigate to Products
        WebElement AddProductClick = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Products']")));
        AddProductClick.click();

        WebElement CreateNewProduct = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn-primary header-btn header-btn-second']")));
        CreateNewProduct.click();

        // Paint Name
        WebElement Paintname = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='paintName']")));
        Paintname.sendKeys(PaintName);

        // Product Standard
        WebElement productStandard = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='direct fixedHeight'])[1]")));
        productStandard.click();
        WebElement productStandardSelect = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='drop-down-item']/span[normalize-space()='" + ProductStd + "']")));
        productStandardSelect.click();
        Thread.sleep(2000);

        // Product Code
        WebElement productCode = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='productCode']")));
        productCode.sendKeys(ProductCode);
        Thread.sleep(2000);

        // HSN Code
        WebElement hsnInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='hsnId']")));        
        hsnInput.sendKeys(HSNCode); // Enter the HSN code from Excel        

        // Wait for the dropdown to appear and select the correct HSN code
        WebElement hsnOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='" +HSNCode+ "']")));
        Thread.sleep(2000);
        hsnOption.click();       
        
        // Brand
    	WebElement brandOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='direct fixedHeight'])[2]")));
    	brandOption.click();
    	
    	WebElement brandOptionClick = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='" +Brand+ "']")));
    	brandOptionClick.click();   	

    	 // Select Category
        WebElement CategoryOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='direct fixedHeight'])[3]"))); // Corrected XPath
        CategoryOption.click();

        // Wait for the category options to be clickable
        WebElement Category1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='" + Category + "']")));
        Category1.click();
        
        
        //SubCategory Selection       
        WebElement subCategoryOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='direct fixedHeight'])[4]")));
        subCategoryOption.click();
        WebElement subCategorySelect = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='drop-down-item']/span[normalize-space()='" + SubCategory + "']")));
        subCategorySelect.click();
       
//        try 
//        {
//        WebElement basepaintType1 = driver.findElement(By.xpath("//input[@id='basePaint1']"));            
//        basepaintType1.sendKeys(BasePaint1);  
//        Thread.sleep(2000);    
//        WebElement basePaint1Option = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(), '" + BasePaint1 + " 10 Litre')]")));
//        basePaint1Option.click();  
//        
//        WebElement basepaintTypeadd = driver.findElement(By.xpath("//input[@id='basePaint1']"));            
//        basepaintTypeadd.sendKeys(BasePaint1);  
//        
//        } 
//        
//        catch (Exception e) 
//        {
//            e.printStackTrace();
//        } 
        
        
        
        WebElement basePaint1Input = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='basePaint1']")));
        basePaint1Input.sendKeys(BasePaint1);
        Thread.sleep(2000); // Wait for the dropdown suggestions to load

        // Select the option in the dropdown that matches "Test 104 (10 litre)"
        WebElement basePaint1Option = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='drop-down-item2']/span[contains(text(), '" + BasePaint1 + "')]")));
        String fullDropdownText = basePaint1Option.getText();
        System.out.println("Dropdown option: " + fullDropdownText);
        basePaint1Option.click();
        
        //Pro Paint        
        WebElement Propaint1 = driver.findElement(By.xpath("//input[@id='proportionPaint1']"));
        Propaint1.sendKeys(ProportionOfPaint1);  
              
        WebElement tinter = driver.findElement(By.xpath("//input[@id='tinters1']"));
        tinter.sendKeys(Tinter1);   
        Thread.sleep(2000);
        
        // Select the option in the dropdown that matches "Test 104 (10 litre)"
        WebElement tinter1option = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='drop-down-item2']/span[contains(text(), '" + Tinter1 + " (10 litre)')]")));
        tinter1option.click();
        
        WebElement proptinter1 = driver.findElement(By.xpath("//input[@id='proportionTinters']"));
        proptinter1.sendKeys(ProportionOfTinter);        
              
        //Base Paint Component 2  	           
        WebElement basepaint2 = driver.findElement(By.xpath("//input[@id='basePaint2']"));
        basepaint2.sendKeys(BasePaint2);   
        Thread.sleep(2000);
        
     // Select the option in the dropdown that matches "Test 104 (10 litre)"
        WebElement basePaint2Option = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='drop-down-item2']/span[contains(text(), '" + BasePaint2 + " (10 litre)')]")));
        basePaint2Option.click();
        
                 
        WebElement basepaint2prop = driver.findElement(By.xpath("//input[@id='proportionPaint2']"));
        basepaint2prop.sendKeys(ProportionOfPaint2);
        
        //PackSize
        WebElement packsize = driver.findElement(By.xpath("//input[@id='packSize']"));
        packsize.sendKeys(PackSize);
        Thread.sleep(2000);    
        
        //QTY
        WebElement Quantity = driver.findElement(By.xpath("//input[@id='quantity']"));
        Quantity.sendKeys(ProductQtyLtr);
        Thread.sleep(2000);  
        
        //Handle Color
        try 
        {
            WebElement color1 = driver.findElement(By.xpath("//input[@id='color']"));            
            color1.sendKeys(Color);
            Thread.sleep(2000);
                          
//          WebElement color1select = driver.findElement(By.xpath("//div[@class='drop-down-item2 selectedDropBox'] //span[normalize-space()='" + Color + "']"));
          
             
        } 
        
        catch (Exception e) 
        {
           // System.out.println("Color selection issue for product: " + ProductName);
            e.printStackTrace();
        }

        
        // Handle PaintType
        try 
        {
            WebElement paintType1 = driver.findElement(By.xpath("//input[@id='paintType']"));            
            paintType1.sendKeys(PaintType);  
            Thread.sleep(2000);       
            
        } 
        
        catch (Exception e) 
        {
            e.printStackTrace();
        }

        // Handle FinishType
        try            
        {
            WebElement finishType1 = driver.findElement(By.xpath("//input[@id='finish']"));            
             finishType1.sendKeys(FinishType);
             Thread.sleep(2000);            
        }
        
        catch (Exception e) 
        {
            
           e.printStackTrace();
           
        }         
             
        
        try            
        {
            WebElement costprice = driver.findElement(By.xpath("//input[@id='costPrice']"));            
            costprice.sendKeys(CostPrice);
            Thread.sleep(2000);            
        }
        
        catch (Exception e) 
        {
            
           e.printStackTrace();         
        }         
             
        try            
        {
            WebElement sellingprice = driver.findElement(By.xpath("//input[@id='sellingPrice']"));            
            sellingprice.sendKeys(SellingPrice);
             Thread.sleep(100);            
        }
        
        catch (Exception e) 
        {
            
           e.printStackTrace();           
        }        
              
        
        //submit
        WebElement Submit = driver.findElement(By.xpath("//button[normalize-space()='Save']"));
        Submit.click();
        
        
    }

    public void createMultipleProductsFromExcel(String excelFilePath) throws IOException, InterruptedException 
    {
        FileInputStream inputStream = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(0);
        DataFormatter dataFormatter = new DataFormatter();
        for (int i = 1; i <= sheet.getLastRowNum(); i++) 
        {
            Row row = sheet.getRow(i);
            // Fetch values from Excel, handle null or empty cells
            String PaintName = dataFormatter.formatCellValue(row.getCell(0));
            String ProductStd = dataFormatter.formatCellValue(row.getCell(1));
            String ProductCode = dataFormatter.formatCellValue(row.getCell(2));
            String HSNCode = dataFormatter.formatCellValue(row.getCell(3)); // Assuming this is column 3 for HSN
            String Brand = dataFormatter.formatCellValue(row.getCell(4));
            String Category = dataFormatter.formatCellValue(row.getCell(5));
            String SubCategory = dataFormatter.formatCellValue(row.getCell(6));
            String SubChildCategory = dataFormatter.formatCellValue(row.getCell(7));
            String BasePaint1 = dataFormatter.formatCellValue(row.getCell(8));
            String ProportionOfPaint1 = dataFormatter.formatCellValue(row.getCell(9));
            String Tinter1 = dataFormatter.formatCellValue(row.getCell(10));
            String ProportionOfTinter = dataFormatter.formatCellValue(row.getCell(11));
            String BasePaint2 = dataFormatter.formatCellValue(row.getCell(12));
            String ProportionOfPaint2 = dataFormatter.formatCellValue(row.getCell(13));
            String PackSize = dataFormatter.formatCellValue(row.getCell(14));
            String ProductQtyLtr = dataFormatter.formatCellValue(row.getCell(15));
            String Color = dataFormatter.formatCellValue(row.getCell(16));
            String PaintType = dataFormatter.formatCellValue(row.getCell(17));
            String FinishType = dataFormatter.formatCellValue(row.getCell(18));
            String CostPrice = dataFormatter.formatCellValue(row.getCell(19));
            String SellingPrice = dataFormatter.formatCellValue(row.getCell(20));
            // Call the method to create new product
            createNewProduct(PaintName, ProductStd, ProductCode, HSNCode, Brand, Category, SubCategory, SubChildCategory, BasePaint1, ProportionOfPaint1, Tinter1, ProportionOfTinter, BasePaint2, ProportionOfPaint2, PackSize, ProductQtyLtr, Color, PaintType, FinishType, CostPrice, SellingPrice);
        }

        workbook.close();
        inputStream.close();
    }

    public static void main(String[] args) throws InterruptedException, IOException 
    {
    	ProductCreateNewMultipleAddBySheet obj = new ProductCreateNewMultipleAddBySheet();
        obj.chrome();
        obj.createMultipleProductsFromExcel("C:\\Users\\Ronak Patel\\eclipse-workspace\\com.poonam.www\\src\\test\\java\\Testing\\CreateNewProduct.xlsx");
    }
}
