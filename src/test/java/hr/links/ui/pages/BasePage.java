package hr.links.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static hr.links.ui.browser.BrowserFactory.*;
import static hr.links.ui.browser.BrowserNames.*;
import static hr.links.ui.util.Wrappers.click;

public class BasePage {

    public BasePage() {
        driver = startDriver(CHROME);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="eu-cookie-ok") WebElement cookie;

    public BasePage acceptCookies(){
        if(cookie.isDisplayed())
        { click(cookie);}
        return this;
    }

}
