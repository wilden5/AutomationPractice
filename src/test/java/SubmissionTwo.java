import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SubmissionTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://cleartrip.com/");
		
		
		WebElement adultsDropdown = driver.findElement(By.xpath("//select[@id='Adults']"));
		Select dropdown1 = new Select (adultsDropdown);
		dropdown1.selectByValue("5");
		
		WebElement childsDropdown = driver.findElement(By.xpath("//select[@id='Childrens']"));
		Select dropdown2 = new Select (childsDropdown);
		dropdown2.selectByValue("2");
		
		driver.findElement(By.xpath("//input[@id='DepartDate']")).click();	
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active ']")).click();
		
		driver.findElement(By.xpath("//a[@id='MoreOptionsLink']")).click();
		
		driver.findElement(By.xpath("//input[@id='AirlineAutocomplete']")).sendKeys("Emirates");
		
		driver.findElement(By.xpath("//input[@id='SearchBtn']")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@id='homeErrorMessage']")).getText());

	}

}
