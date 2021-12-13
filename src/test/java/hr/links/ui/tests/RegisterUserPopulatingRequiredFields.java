package hr.links.ui.tests;

import hr.links.ui.tests.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static hr.links.ui.util.Constants.*;

/**TestCase ID: 2*/

public class RegisterUserPopulatingRequiredFields extends BaseTest {

    @BeforeMethod
    public void navigateToRegisterPage(){
        registerPage.goToRegistrationPage();

    }

    @Test
    public void registerUserRequiredFields(){
        registerPage.registerRequiredFieldsPopulated(NAME, LAST_NAME, EMAIL, PASSWORD);
        registerPage.assertSuccessRegisterMessageIsDisplayed();
    }
}