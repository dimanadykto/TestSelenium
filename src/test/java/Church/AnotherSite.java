package Church;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnotherSite {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/");
        Thread.sleep(4000);
        WebElement button =  driver.findElement(By.xpath("//a[text()='SQL Reference']"));
        button.click();
        driver.quit();
    }
}
