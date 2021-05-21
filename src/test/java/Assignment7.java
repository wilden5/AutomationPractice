import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// my solution
		List<WebElement> rows = driver.findElements(By.xpath("//table[@name='courses']//tr"));
		List<WebElement> columns = driver.findElements(By.xpath("//table[@name='courses']//tr//th"));

		System.out.println(rows.size());
		System.out.println(columns.size());
		
		System.out.println(rows.get(2).findElements(By.tagName("td")).get(0).getText());
		System.out.println(rows.get(2).findElements(By.tagName("td")).get(1).getText());
		System.out.println(rows.get(2).findElements(By.tagName("td")).get(2).getText());
		
		
		
		
		// coach solution
		WebElement table=driver.findElement(By.id("product"));
		
		System.out.println(table.findElements(By.tagName("tr")).size());
		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());

		List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		System.out.println(secondrow.get(0).getText());
		System.out.println(secondrow.get(1).getText());
		System.out.println(secondrow.get(2).getText());

	}

}
