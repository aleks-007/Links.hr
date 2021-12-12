package hr.links.ui.browser;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import static hr.links.ui.browser.BrowserFactory.driver;

public class BrowserMethods {

    protected static Actions action = new Actions(driver);

    public static void goTo(String url) {
        driver.navigate().to(url);
    }

    public static void goBack() {
        driver.navigate().back();
    }

    public static void goForward() {
        driver.navigate().forward();
    }

    public static void maximize() {
        driver.manage().window().maximize();
    }

    public static void refresh() {
        driver.navigate().refresh();
    }

    public static void escape() {
        action.sendKeys(Keys.ESCAPE).build().perform();
    }

    public static void hover(WebElement element) {
        action.moveToElement(element).perform();
    }

}
