package automation_journey;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchAmazon {
    public static void main (String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\HDD\\Automation\\WebDrivers\\chromedriver.exe");
        WebDriver chDriver = new ChromeDriver();

        chDriver.get("https://www.amazon.in/");
        chDriver.manage().window().maximize();

        LibraryUtils.isElementVisible(chDriver, chDriver.findElement(By.id("twotabsearchtextbox")), Duration.ofSeconds(10)).sendKeys("Apple iPhone");
    }
}