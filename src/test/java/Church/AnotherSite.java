package Church;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AnotherSite {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/");
        Thread.sleep(2000);
        WebElement button =  driver.findElement(By.xpath("//a[text()='SQL Reference']"));
        button.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.close();
    }
}
