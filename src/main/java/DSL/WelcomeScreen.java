package DSL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Welcome screen.
 */
public class WelcomeScreen extends BaseScreen {

    @AndroidFindBy(id = "gwm-SignIn-button")
    private AndroidElement signIn;

    public WelcomeScreen(AndroidDriver driver) {
        super(driver);
    }

    /**
     * Taps on sign_in button
     */
    public void tapSignIn() {
       signIn.click();
    }
}
