package hr.links.ui.util;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static hr.links.ui.util.Waits.waitToBeVisible;
import static hr.links.ui.util.Wrappers.getTextFrom;
import static hr.links.ui.util.Wrappers.getValueFrom;

public class Asserts {
    public static void assertElementIsNotPresent(WebElement element) {
        Assert.assertFalse(isElementDisplayed(element));
    }

    public static void assertElementIsPresent(WebElement element) {

        Assert.assertTrue(isElementDisplayed(element));
    }

    public static void assertActualValueOfElementIsEqualToExpected(String expectedElement, WebElement actualElement, String atr) {
        Assert.assertEquals(expectedElement, getValueFrom(actualElement, atr));
    }
    public static void assertActualTextOfElementIsEqualToExpected(String expectedElement, WebElement actualElement) {
        Assert.assertEquals(expectedElement, getTextFrom(actualElement));
    }

    // Simple methods for creating complex methods

    public static boolean isElementDisplayed(WebElement element) {
        try {
            waitToBeVisible(element);
            element.isDisplayed();
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
}
