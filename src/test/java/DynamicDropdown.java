import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		
		driver.findElement(By.xpath("//a[@value='IXG']")).click();
		
			Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@value='GWL'])[2]")).click();
		
		// //div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='GWL'] - xpath without indexes
		
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-active']")).click(); // default date that was picked by system automatic
		
	}

}
