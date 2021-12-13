package hr.links.ui.tests;

import hr.links.ui.tests.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

import static hr.links.ui.util.Constants.*;
import static hr.links.ui.util.Wrappers.getRandomInt;

/**TestCase ID: 2*/

public class RegisterUserPopulatingRequiredFields extends BaseTest {

    @BeforeMethod
    public void navigateToRegisterPage(){
        registerPage.goToRegistrationPage();

    }

    @Test
    public void registerUserRequiredFields() throws IOException {
        registerPage.registerRequiredFieldsPopulated(NAME, LAST_NAME, EMAIL(getRandomInt(10000, 10000000)), PASSWORD);
        registerPage.assertSuccessRegisterMessageIsDisplayed();
    }
}