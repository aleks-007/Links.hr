package hr.links.ui.tests.register;

import hr.links.ui.tests.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static hr.links.ui.util.Constants.*;

/**TestCase ID: 1*/

public class RegisterUserPopulatingAllFields extends BaseTest {


    @BeforeMethod
    public void navigateToRegisterPage(){
        registerPage.goToRegistrationPage();

    }
    @Test()
    public void registerNewUserWithAllFieldsPopulated()  {
        registerPage.registerAllFieldsPopulated(NAME, LAST_NAME, DAY_OF_BIRTH, MONTH_OF_BIRTH,
                YEAR_OF_BIRTH, EMAIL, STREET_ADDRESS, POST_CODE, CITY, PHONE_NUMBER, PASSWORD);
        registerPage.assertSuccessRegisterMessageIsDisplayed();
    }

}
