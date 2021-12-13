package hr.links.ui.tests;

import hr.links.ui.tests.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**TestCase ID: 3*/

public class RegisterUserEmptyForm extends BaseTest {

    @BeforeMethod
    public void navigateToRegisterPage(){
        registerPage.goToRegistrationPage();

    }

    @Test
    public void registerUserWithEmptyForm(){
        registerPage.registerEmptyForm();
        registerPage.assertRequiredFields();
    }
}
