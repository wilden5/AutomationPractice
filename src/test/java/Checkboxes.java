import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Assert.assertFalse(driver.findElement(By.xpath("//input[contains(@id, 'SeniorCitizenDiscount')]")).isSelected());
		//System.out.println(driver.findElement(By.xpath("//input[contains(@id, 'SeniorCitizenDiscount')]")).isSelected());
		
		driver.findElement(By.xpath("//input[contains(@id, 'SeniorCitizenDiscount')]")).click();
		
		
		//System.out.println(driver.findElement(By.xpath("//input[contains(@id, 'SeniorCitizenDiscount')]")).isSelected());
		Assert.assertTrue(driver.findElement(By.xpath("//input[contains(@id, 'SeniorCitizenDiscount')]")).isSelected());
		
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		
	}

}
