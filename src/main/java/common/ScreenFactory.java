package common;

import DSL.SignInScreen;
import DSL.WelcomeScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/**
 * ScreenFactory.
 */
public class ScreenFactory {

    private AndroidDriver<AndroidElement> driver;

    public ScreenFactory(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
    }

    public WelcomeScreen getWelcomeScreen() {
        return new WelcomeScreen(driver);
    }

    public SignInScreen getSignInScreen() {
        return new SignInScreen(driver);
    }
}
