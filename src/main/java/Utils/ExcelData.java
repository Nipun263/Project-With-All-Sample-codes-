package Utils;

//Changes
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ExcelData {
WebDriver driver;
	
	
	public  void setUp() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\e5584133\\Downloads\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(900, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
		
		//Rows 
		List<WebElement> columnListed = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[1]/td"));
		int sizee = columnListed.size();
		
		for(int i=0;i<=sizee;i++) {
		
			List<WebElement> columnListed11 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]"));	
			
			for(WebElement WB : columnListed11) {
				
				String WW = WB.getText().toString();
				System.out.println("Data extracted is as  " +  WW);
			}
			
			
		}
		
		
		//Columns 
		List<WebElement> rowListed = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]"));
		int sizee_column = rowListed.size();
		System.out.println("Sizee of the row  is " +  sizee_column);

	}
	
	
	
	public static void main(String[] args) {
		
		ExcelData ED = new ExcelData();
		ED.setUp();
		
		
	}
	
		
	
	
	
	
	
}



