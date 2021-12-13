package hr.links.ui.tests;

import hr.links.ui.tests.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

import static hr.links.ui.util.Constants.*;
import static hr.links.ui.util.Wrappers.getRandomInt;

/**TestCase ID: 1*/

public class RegisterUserPopulatingAllFields extends BaseTest {


    @BeforeMethod
    public void navigateToRegisterPage(){
        registerPage.goToRegistrationPage();

    }
    @Test()
    public void registerNewUserWithAllFieldsPopulated() throws IOException {
        registerPage.registerAllFieldsPopulated(NAME, LAST_NAME, DAY_OF_BIRTH, MONTH_OF_BIRTH,
                YEAR_OF_BIRTH, EMAIL(getRandomInt(10000, 10000000)), STREET_ADDRESS, POST_CODE, CITY, PHONE_NUMBER, PASSWORD);
        registerPage.assertSuccessRegisterMessageIsDisplayed();
    }

}
