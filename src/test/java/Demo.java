import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		/*
		 * driver.get("https://www.facebook.com/");
		 * driver.findElement(By.xpath("//input[@name='email']")).
		 * sendKeys("This is test message");
		 * //driver.findElement(By.id("email")).sendKeys("This is test message");
		 * 
		 * driver.findElement(By.xpath("//input[@name='pass']")).
		 * sendKeys("This is test password");
		 * 
		 * Thread.sleep(3000);
		 * driver.findElement(By.xpath("//button[@name='login']")).click();
		 * System.out.println(driver.findElement(By.xpath("//div[@class='_9ay7']")).
		 * getText());
		 */
		
		
		/*
		 * driver.get("https://www.yahoo.com/"); driver.findElement(By.
		 * xpath("//div[@class='_yb_y69mb _yb_ch6z6']/div/div[2]/form/input[@type='text']"
		 * )).sendKeys("abraKadabra");
		 */
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement staticDropdown = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("USD");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
	}

}
