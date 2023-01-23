package automation_journey;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LibraryUtils {
    public static WebElement isElementVisible(WebDriver driver, WebElement element, Duration timeout) {
        WebDriverWait waitDriver = new WebDriverWait(driver, timeout);
        WebElement webElement = waitDriver.until(ExpectedConditions.visibilityOf(element));
        return webElement;
    }

    public static WebElement isElementClickable(WebDriver driver, WebElement element, Duration timeout) {
        WebDriverWait waitDriver = new WebDriverWait(driver, timeout);
        WebElement webElement = waitDriver.until(ExpectedConditions.elementToBeClickable(element));
        return webElement;
    }

}
