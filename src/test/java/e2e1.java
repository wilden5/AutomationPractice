import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class e2e1 {

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

		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date2']")).isEnabled());

		if (driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style").contains("1")) {
			System.out.println("Its enbaled");
			Assert.assertTrue(true);
		} else {
			System.out.println("Its disabled");
			Assert.assertTrue(false);
		}

		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();

		Thread.sleep(2000);

		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());

		for (int i = 1; i < 5; i++) {
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
		}

		driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText(), "5 Adult");

		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());

		driver.findElement(By.xpath("(//input[@id='ctl00_mainContent_btn_FindFlights'])[1]")).click();

	}

}
