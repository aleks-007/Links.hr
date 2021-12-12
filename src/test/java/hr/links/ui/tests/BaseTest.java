package hr.links.ui.tests;

import hr.links.ui.browser.BrowserFactory;
import hr.links.ui.pages.BasePage;
import hr.links.ui.pages.RegisterPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static hr.links.ui.browser.BrowserMethods.goTo;
import static hr.links.ui.browser.BrowserMethods.maximize;
import static hr.links.ui.util.Constants.PROD;

public class BaseTest {
    protected BasePage basePage;
    protected RegisterPage registerPage;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        basePage = new BasePage();
        registerPage = new RegisterPage();

        goTo(PROD);
//        maximize();
        basePage.acceptCookies();
    }

//    @AfterClass(alwaysRun = true)
//    protected void tearDown() {
//        BrowserFactory.quitDriver();
//    }

}
