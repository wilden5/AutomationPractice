import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SubmissionThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		driver.get("https://www.itgeared.com/demo/1506-ajax-loading.html");
		
		driver.findElement(By.xpath("//a[@href='javascript: void(0);loadAjax();']")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='results']")));
		System.out.println(driver.findElement(By.xpath("//div[@id='results']")).getText());
		
	}

}
