package hr.links.ui.util;

import java.util.Random;

import static hr.links.ui.util.Wrappers.getRandomInt;
import static javax.swing.UIManager.get;

public class Constants {


    // WAIT
    public static final int DEFAULT_WAIT_TIMEOUT = 10;

    // ENVIRONMENTS
    public static final String PROD = "https://www.links.hr/hr/";
    public static final String NAME = "Aleksandra";
    public static final String LAST_NAME = "Todorovic";
    public static final Integer DAY_OF_BIRTH = 12;
    public static final Integer MONTH_OF_BIRTH = 12;
    public static final Integer YEAR_OF_BIRTH = 1992;
    public static final String EMAIL = getRandomInt(100, 10000) + "todorovic7@yahoo.com";
    public static final String STREET_ADDRESS = "Julska 8";
    public static final Integer POST_CODE = 21;
    public static final String CITY = "Novi Sad";
    public static final String COUNTRY = "Serbia";
    public static final String PHONE_NUMBER = "123456798";
    public static final String PASSWORD = "skocko";

    public static final String REGISTER_SUCCESS_MESSAGE = "Poslan vam je e-mail koji sadrži upute za aktivaciju članstva.";
    public static final String NAME_REQUIRED_MESSAGE = "Ime je potrebno";
    public static final String LAST_NAME_REQUIRED_MESSAGE = "Prezime je potrebno.";
    public static final String EMAIL_REQUIRED_MESSAGE = "Elektronska pošta je potrebna";
    public static final String PASSWORD_REQUIRED_MESSAGE = "Lozinka je potrebna.";
}
