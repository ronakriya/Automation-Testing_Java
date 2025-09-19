package Testing;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserManagementaddmuldata {
    WebDriver driver;
    WebDriverWait wait;

    public void chrome() throws InterruptedException 
    {
        System.setProperty("WebDriver.chromedriver", "C:\\Users\\Aaditya\\Selenium3\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://dev.poonamcoatings.com");
        driver.manage().window().maximize();

        // Login
        WebElement Username = driver.findElement(By.xpath("//input[@id='email']"));
        Username.sendKeys("admin@poonamcoatings.com");

        WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
        Password.sendKeys("Super@1234");

        WebElement Login = driver.findElement(By.xpath("//button[@type='submit']"));
        Login.click();
        Thread.sleep(8000);
    }

    public void useradd1(String[] firstname, String[] lastname, String[] emailid, String[] phone, String[] gender, String[] dob, String[] role, String[] department) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement SettingClick = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Settings']")));
        SettingClick.click();
        Thread.sleep(2000);

        WebElement UserManagementClick = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'User Management')]")));
        UserManagementClick.click();
        Thread.sleep(2000);

        for (int i = 0; i < firstname.length; i++) 
        { // Loop through all records in arrays
            // Add User
            WebElement UserManagementAdd = driver.findElement(By.xpath("//button[@class='btn-primary header-btn']"));
            UserManagementAdd.click();

            // First Name
            WebElement FirstName = driver.findElement(By.xpath("//input[@id='first_name']"));
            FirstName.clear();
            FirstName.sendKeys(firstname[i]);

            // Last Name
            WebElement LastName = driver.findElement(By.xpath("//input[@id='last_name']"));
            LastName.clear();
            LastName.sendKeys(lastname[i]);

            // Email ID
            WebElement EmailId = driver.findElement(By.xpath("//input[@id='email']"));
            EmailId.clear();
            EmailId.sendKeys(emailid[i]);

            // Phone Number
            WebElement PhoneNumber = driver.findElement(By.xpath("//input[@id='phone_no']"));
            PhoneNumber.clear();
            PhoneNumber.sendKeys(phone[i]);

            // Gender
            WebElement Gender = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]"));
            Gender.click();
            WebElement Genderselect = driver.findElement(By.xpath("//span[normalize-space()='" + gender[i] + "']"));
            Genderselect.click();

            // DOB
            WebElement DOB = driver.findElement(By.xpath("//input[@id='dob']"));
            DOB.clear();
            DOB.sendKeys(dob[i]);

            // Role
            WebElement Role = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]"));
            Role.click();
            WebElement RoleSelect = driver.findElement(By.xpath("//span[normalize-space()='" + role[i] + "']"));
            RoleSelect.click();
            Thread.sleep(2000);

            // Department
            WebElement departmentDropdown = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[5]/div[2]/div[1]/div[1]/div[2]/div[1]"));
            departmentDropdown.click();
            Thread.sleep(1000);
            WebElement departmentOption = driver.findElement(By.xpath("//span[normalize-space()='" + department[i] + "']"));
            departmentOption.click();

            // Privileges
            WebElement Privileges = driver.findElement(By.xpath("//button[normalize-space()='Add Privileges']"));
            Privileges.click();

            // Set Privileges (Read, Write, Delete)
            WebElement PrivilegesRead = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]"));
            WebElement PrivilegesWrite = driver.findElement(By.xpath("//tbody/tr[1]/td[3]/input[1]"));
            WebElement PrivilegesDelete = driver.findElement(By.xpath("//tbody/tr[1]/td[4]/input[1]"));

            PrivilegesRead.click();
            PrivilegesWrite.click();
            PrivilegesDelete.click();

            // Submit privileges
            WebElement Submitpriv = driver.findElement(By.xpath("//div[@class='privileges-submit']//button[contains(text(),'Submit')]"));
            Submitpriv.click();

            // Main User add Submit
            WebElement MainSubmit = driver.findElement(By.xpath("//button[@type='submit']"));
            MainSubmit.click();
            Thread.sleep(2000); 
            
            // Adjust as needed for page load

            // Wait for the User Management page to reload
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn-primary header-btn']")));
        }
    }

    public static void main(String[] args) throws InterruptedException
    {
        UserManagementaddmuldata obj = new UserManagementaddmuldata();
        obj.chrome();
        String[] firstname = {"Ajadhdhdy", "Videdey", "Kedaa"};
        String[] lastname = {"Padddtuel", "Joshid", "Real"};
        String[] emailid = {"Ajedddghhfayod@poonamcoatings.com", "Vediodjeafo@poonamcoatings.com", "Kriesfhnadeo@poonamcoatings.com"};
        String[] phone = {"8191311612", "9510513182", "8059928782"};
        String[] gender = {"Female", "Male", "Female"};
        String[] dob = {"03-12-2001", "01-01-1981", "08-08-2000"};
        String[] role = {"Admin", "Admin", "Admin"};
        String[] department = {"Account", "Content", "Sales"};
        obj.useradd1(firstname, lastname, emailid, phone, gender, dob, role, department);
    }
}
