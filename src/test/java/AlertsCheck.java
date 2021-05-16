import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsCheck {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Denis");
		
			Thread.sleep(1000);
			
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		
			Thread.sleep(1000);
			
			System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
			Thread.sleep(2000);
			
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Denis");
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().dismiss();

	}

}
