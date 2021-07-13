package LoginSuite;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utility.BrowserSetup;
import Utils.ExcelData;


public class CreateAccount extends ExcelData{
	WebDriver driver;
	

	@BeforeMethod
	public void browserIntialization() {
	driver = 	BrowserSetup.StartApplication(driver, "Chrome");
	}
	

	
	@Test(priority=1 )
	
	public void hitURLAndPassEmailAddress() {
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//*[@class='login']")).click();
		WebElement textPresence = driver.findElement(By.xpath("//*[contains(text(),'Create an account')]"));
		Boolean flag = textPresence.isDisplayed();
		Double RandomNumGen = Math.random();
		driver.findElement(By.xpath("//*[@id='email_create']")).sendKeys("nnbbvvcc" + RandomNumGen + "@gmail.com");
		driver.findElement(By.xpath("//*[@id='SubmitCreate']")).click();

	}

	
	  @Test(priority = 2, dataProvider = "userDataSupplier") 
	  public void passUserDetails(String UserFirstName, String UserLastName, String Password,
	  String Date, String Month, String Year, String Address,String ZipCode) throws Throwable {
		  
	 // ExcelData ED = new ExcelData();
	 // ED.excelDataExtract();
	  
	  Thread.sleep(5000);
	  
	  WebElement firstName =
	  driver.findElement(By.xpath("//*[@id='customer_firstname']"));
	  firstName.click();
	  
	  firstName.sendKeys(UserFirstName);
	  
	  WebElement lastName =
	  driver.findElement(By.xpath("//*[@id='customer_lastname']"));
	  lastName.click(); lastName.sendKeys(UserLastName);
	  
	  WebElement password = driver.findElement(By.xpath("//*[@id='passwd']"));
	  password.sendKeys(Password);
	  
	  WebElement dateDD = driver.findElement(By.xpath("//*[@id='uniform-days']"));
	  WebElement date = driver.findElement(By.xpath("//*[@id='days']"));
	  
	  WebElement monthDD =
	  driver.findElement(By.xpath("//*[@id='uniform-months']")); WebElement month =
	  driver.findElement(By.xpath("//*[@id='months']"));
	  
	  WebElement yearDD = driver.findElement(By.xpath("//*[@id='uniform-years']"));
	  WebElement year = driver.findElement(By.xpath("//*[@id='years']"));
	  
	  
	  Select select = new Select(date);
	  select.selectByValue(Date);
	  
	  monthDD.click(); Select select1 = new Select(month);
	  select1.selectByValue(Month);
	  
	  yearDD.click(); Select select2 = new Select(year);
	  select2.selectByValue(Year);
	  
	  WebElement addressLine1 =
	  driver.findElement(By.xpath("//*[@name='address1']")); 
	  Actions action = new Actions(driver); 
	  action.moveToElement(addressLine1);
	  
	  addressLine1.sendKeys(Address);
	  
	  WebElement zipCode = driver.findElement(By.xpath("//*[@name='postcode']"));
	  zipCode.sendKeys(ZipCode);
	  
	 //Excel Data Extract (WorkBook ->Sheet ->Row ->Cell)
	  
	  String excelPath = System.getProperty("user.dir");
	  XSSFWorkbook workBook = new XSSFWorkbook(excelPath + "\\ExcelData\\ExcelData.xlsx");
	  XSSFSheet sheet = workBook.getSheet("DummyAutomation");
	  XSSFRow row = sheet.getRow(1);
	  
	  String CityName = row.getCell(0).toString();
	  String StateName = row.getCell(1).toString();
	  String PhoneNum = row.getCell(2).getRawValue();
	  
	  
	  WebElement city = driver.findElement(By.xpath("//*[@name='city']"));
	  city.sendKeys(CityName);
	  
	  WebElement state = driver.findElement(By.xpath("//*[@name='id_state']"));
	  state.sendKeys(StateName);
	  
	  	  
	  WebElement mobile = driver.findElement(By.name("phone_mobile"));
	  mobile.sendKeys(PhoneNum);
	  
	  
	  WebElement submitBtn =
	  driver.findElement(By.xpath("//*[@id='submitAccount']")); submitBtn.click();
	  
	  }
	  
	  
	  public void dummyMethod() {
			String windowHandle = driver.getWindowHandle();
			Set<String> windowHandles = driver.getWindowHandles();
			
			for(String STR : windowHandles) {
				if(!STR.equals(windowHandle)) {
					driver.switchTo().window(windowHandle);
					driver.switchTo().defaultContent();
				}
			}
					
					
		}
	 
	  // Dummy Data to User Detail Method
	  
	  @DataProvider 
	  public Object[][] userDataSupplier() 
	  { 
		  
	  Object[][] Obj = new Object[1][8]; 
	  Obj[0][0] = "FirstNameFirstCase";
	  Obj[0][1] = "LastNameFirstCase"; 
	  Obj[0][2] = "ABCD@1234";
	  Obj[0][3] = "11";
	  Obj[0][4] = "11"; 
	  Obj[0][5] = "2011";
	  Obj[0][6] = "12345"; 
	  Obj[0][7] = "00000";
	 
	  
	  return Obj;
	  
	  }
	  
	  
	@AfterSuite
	public void tearDown() {
		driver.quit();

	}

}
