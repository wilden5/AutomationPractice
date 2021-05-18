import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class seleniumCartPractise {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        int j = 0;

        String[] itemsNeeded = {"Cucumber", "Brocolli", "Beetroot"};

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        Thread.sleep(3000);

        List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));

        for (int i = 0; i < products.size(); i++) {
            String[] name = products.get(i).getText().split("-"); // Array because of we are split it
            String formattedName = name[0].trim();
            List itemsNeededList = Arrays.asList(itemsNeeded); // command for convert Array to ArrayList


            if (itemsNeededList.contains(formattedName)) {
                j++;
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                if (j == itemsNeeded.length) {
                    break;
                }

            }

        }

    }
}
