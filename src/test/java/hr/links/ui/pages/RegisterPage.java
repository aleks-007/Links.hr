package hr.links.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static hr.links.ui.util.Asserts.*;
import static hr.links.ui.util.Constants.*;
import static hr.links.ui.util.Waits.waitToBeVisible;
import static hr.links.ui.util.Wrappers.*;

public class RegisterPage extends BasePage{

    public RegisterPage() { super(); }

    @FindBy(xpath="//a[@href='/hr/register']") WebElement registerLink;
    @FindBy(id="RegisterAsCompany") WebElement registerAsCompanyCheckbox;

    @FindBy(id="gender-female") WebElement femaleRadioBtn;
    @FindBy(id="gender-male") WebElement maleRadioBtn;
    @FindBy(id="FirstName") WebElement name;
    @FindBy(id="LastName") WebElement lastName;
    @FindBy(name = "DateOfBirthDay") WebElement dayOfBirth;
    @FindBy(name = "DateOfBirthMonth") WebElement monthOfBirth;
    @FindBy(name = "DateOfBirthYear") WebElement yearOfBirth;
    @FindBy(id = "Email") WebElement email;    // "Pogrešan e-mail"

    @FindBy(id = "StreetAddress") WebElement streetAddress;
    @FindBy(xpath = "//*[@id='ZipPostalCode']/preceding-sibling::input") WebElement postCode;
    @FindBy(xpath = "//*[@id='ui-id-2']/li/a[contains(text(), '" + CITY +"')]") WebElement dropDown;
    @FindBy(xpath = "//*[@id='City']/preceding-sibling::input") WebElement city;
    @FindBy(id = "CountryId_dropdown") WebElement country;      //disabled

    @FindBy(xpath = "//*[@id='CountryId']") WebElement selectedCountry;

    @FindBy(id = "Phone") WebElement phoneNum;

    @FindBy(id ="Newsletter") WebElement newsletterCheckbox;

    @FindBy(id = "Password") WebElement password;       //"Lozinka je potrebna." , data-val-length="Lozinka treba imati najmanje 6 znakova."
    @FindBy(id = "ConfirmPassword") WebElement confirmPassword;     //data-val-equalto="Lozinka i potvrda lozinke se ne podudaraju."

    @FindBy(id = "register-button") WebElement registerBtn;

    @FindBy(className = "result") WebElement successRegisterMessage;



    /**Register user by population all fields like private entity*/
    public void registerAllFieldsPopulated(String firstName, String lastName, Integer dayOfBirthTxt, Integer monthOfBirthTxt,
                              Integer yearOfBirthTxt,String emailInput, String strAddress,Integer postCodeTxt, String cityTxt,
                                     String phoneNumberTxt, String passTxt) {
        selectGenderFemale();
        enterName(firstName);
        enterLastName(lastName);
        selectDayOfBirth(dayOfBirthTxt);
        selectMonthOfBirth(monthOfBirthTxt);
        selectYearOfBirth(yearOfBirthTxt);
        enterEmail(emailInput);
        enterStreetAddress(strAddress);
        enterPostCode(postCodeTxt);
        //validate country //TODO
        enterPhone(phoneNumberTxt);
        selectNewsletterCheckbox();
        enterPassword(passTxt);
        confirmPassword(passTxt);
        clickRegisterBtn();

    }

    /**Register user by populating only required fields like private entity*/
    public void registerRequiredFieldsPopulated(String firstName, String lastName, String emailInput, String passTxt){
        enterName(firstName);
        enterLastName(lastName);
        enterEmail(emailInput);
        enterPassword(passTxt);
        confirmPassword(passTxt);
        clickRegisterBtn();
    }

    /**Register user without any data populated*/
    public void registerEmptyForm(){
        clickRegisterBtn();

    }

//    public RegisterPage assertSelectedCountryIsCorrect(){
//        selectByIndex(country, getChosenCountryByValue());
//        //TODO
//        return this;
//    }
//    public Integer getChosenCountryByValue(){
//        Integer selectedCountryId = Integer.valueOf(selectedCountry.getAttribute("value"));
//        return selectedCountryId;
//    }

    //Assertions

    public RegisterPage assertSuccessRegisterMessageIsDisplayed(){
        waitToBeVisible(successRegisterMessage);
        assertElementIsPresent(successRegisterMessage);
        assertActualTextOfElementIsEqualToExpected(REGISTER_SUCCESS_MESSAGE, successRegisterMessage);
        return this;
    }
    public RegisterPage assertRequiredFields(){
        assertActualValueOfElementIsEqualToExpected(NAME_REQUIRED_MESSAGE, name, "data-val-required");
        assertActualValueOfElementIsEqualToExpected(LAST_NAME_REQUIRED_MESSAGE, lastName, "data-val-required");
        assertActualValueOfElementIsEqualToExpected(EMAIL_REQUIRED_MESSAGE, email, "data-val-required");
        assertActualValueOfElementIsEqualToExpected(PASSWORD_REQUIRED_MESSAGE, password, "data-val-required");
        assertActualValueOfElementIsEqualToExpected(PASSWORD_REQUIRED_MESSAGE, confirmPassword, "data-val-required");
        return this;
    }

    public RegisterPage goToRegistrationPage(){ click(registerLink);return this; }

    public RegisterPage selectGenderFemale(){ click(femaleRadioBtn); return this; }

    public RegisterPage enterName(String firstName){ type(name, firstName); return this;}

    public RegisterPage enterLastName(String lastNameTxt){ type(lastName, lastNameTxt); return this;}

    public RegisterPage selectDayOfBirth(Integer value) { selectByValue(dayOfBirth, value); return this;}

    public RegisterPage selectMonthOfBirth(Integer value) { selectByValue(monthOfBirth, value); return this;}

    public RegisterPage selectYearOfBirth(Integer value) { selectByValue(yearOfBirth, value); return this;}

    public RegisterPage enterEmail(String emailTxt){ type(email, emailTxt); return this;}

    public RegisterPage enterStreetAddress(String streetAddressTxt) { type(streetAddress, streetAddressTxt); return this;}

    public RegisterPage enterPostCode(Integer postCodePartialTxt) {
        typeIntegerSelectDropDown(postCode, postCodePartialTxt, dropDown); return this;}
        //select from dropdown #ui-id-2 >li:nth-child(1)

    public RegisterPage enterCity(String cityName){ type(city, cityName); return this;}

    public RegisterPage enterPhone(String phoneNumber){ type(phoneNum, phoneNumber); return this;}

    public RegisterPage selectNewsletterCheckbox(){ click(newsletterCheckbox); return this;}

    public RegisterPage enterPassword(String pass){ type(password, pass); return this;}

    public RegisterPage confirmPassword(String confirmPass){ type(confirmPassword, confirmPass); return this;}

    public RegisterPage clickRegisterBtn(){ click(registerBtn);return this; }




}
