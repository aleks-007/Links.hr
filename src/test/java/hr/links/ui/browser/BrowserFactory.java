package hr.links.ui.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.HashMap;
import java.util.Map;

import static io.github.bonigarcia.wdm.WebDriverManager.*;

public class BrowserFactory {

    public static WebDriver driver = null;

    public static ChromeOptions disableNotif(){
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.notifications", 2);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
        return options;
    }


    public static WebDriver startDriver(BrowserNames browser) {
        if (driver == null) {
            switch (browser) {
                case CHROME:
                    chromedriver().setup();
                    driver = new ChromeDriver(disableNotif());
                    break;
                case FIREFOX:
                    firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case OPERA:
                    driver = new OperaDriver();
                    operadriver().setup();
                    break;
                case IE:
                    driver = new InternetExplorerDriver();
                    iedriver().setup();
                    break;
            }
        }
        return driver;
    }

    public static void quitDriver() {
        driver.quit();
        driver = null;
    }
}
