package Utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/**
 * BaseUtils.
 */
public class BaseUtils {
    /**
     * Scroll to Element.
     *
     * @param driver         android Driver
     * @param androidElement android Element
     */
    public static void scrollToElement(AndroidDriver<AndroidElement> driver, AndroidElement androidElement) {
        driver.findElementByAndroidUIAutomator(String.format("new UiScrollable(new UiSelector().scrollable(true))" +
                ".scrollIntoView(new UiSelector().textContains(\"%s\"))", androidElement.getText()));
    }

    /**
     * Scroll to Element by text.
     *
     * @param driver      android Driver
     * @param elementText partial or full text
     */
    public static void scrollToElementByText(AndroidDriver<AndroidElement> driver, final String elementText) {
        driver.findElementByAndroidUIAutomator(String.format("new UiScrollable(new UiSelector().scrollable(true))" +
                ".scrollIntoView(new UiSelector().textContains(\"%s\"))", elementText));
    }
}
