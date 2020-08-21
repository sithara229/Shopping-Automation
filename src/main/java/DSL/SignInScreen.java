package DSL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Sign in screen.
 */
public class SignInScreen extends BaseScreen {
    public SignInScreen(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "ap_email_login")
    private AndroidElement userField;

    @AndroidFindBy(uiAutomator = "ap_password")
    private AndroidElement passwordField;

    @AndroidFindBy(id = "signInSubmit")
    private AndroidElement signInBtn;

    public void tapSignIn() {
        signInBtn.click();
    }

    public void enterUserName(String email) {
        userField.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }


    public boolean isSignScreenDisplayed() {
        return userField.isDisplayed();
    }
}
