package Church;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://homeofgospel.org/");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000);");
        WebElement button = driver.findElement(By.xpath("//a[text()='Submit']"));
        button.click();
    }
}
