package hr.links.ui.util;

import hr.links.ui.browser.BrowserFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static hr.links.ui.util.Constants.DEFAULT_WAIT_TIMEOUT;

public class Waits {

    protected static WebDriverWait wait = new WebDriverWait(BrowserFactory.driver, DEFAULT_WAIT_TIMEOUT);

    public static void waitToBeVisible(WebElement element) {
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (Exception exception) {
            System.out.println("Element " + element + " is not visible.");
        }
    }

    public static void waitToBeClickable(WebElement element) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
        } catch (Exception exception) {
            System.out.println("Element " + element + " is not clickable.");
        }
    }
}
