package hr.links.ui.util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Random;

import static hr.links.ui.util.Waits.waitToBeClickable;

public class Wrappers {
    public static void type(WebElement element, String text) {
        waitToBeClickable(element);
        click(element);
        clear(element);
        element.sendKeys(text);
    }
    public static void typeInteger(WebElement element, Integer integer)  {
        waitToBeClickable(element);
        click(element);
        clear(element);
        element.sendKeys(String.valueOf(integer));
    }
    public static void typeIntegerSelectDropDown(WebElement element, Integer integer, WebElement dropdown)  {
        waitToBeClickable(element);
        click(element);
        clear(element);
        element.sendKeys(String.valueOf(integer));
        click(dropdown);
    }

    public static void click(WebElement element) {
        waitToBeClickable(element);
        element.click();
    }
    public static void selectByValue(WebElement element, Integer value) {
        waitToBeClickable(element);
        Select select = new Select(element);
        select.selectByValue(String.valueOf(value));
    }
    public static void selectByIndex(WebElement element, Integer value) {
        waitToBeClickable(element);
        Select select = new Select(element);
        select.selectByIndex(value);

    }

    public static void clear(WebElement element) {
        waitToBeClickable(element);
        element.clear();
    }

    public static String getTextFrom(WebElement element) {
        return element.getText();
    }
    public static String getValueFrom(WebElement element, String atr){
        return element.getAttribute(atr);
    }

    public static Integer getRandomInt(Integer min, Integer max){
        Random random = new Random();
        int randomNum = random.nextInt((max - min) + 1) + min;
        return randomNum;
    }
    public static String decodeText(String input, String encoding) throws IOException {
        return
                new BufferedReader(
                        new InputStreamReader(
                                new ByteArrayInputStream(input.getBytes()),
                                Charset.forName(encoding)))
                        .readLine();
    }
}
