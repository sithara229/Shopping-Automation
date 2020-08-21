package DSL;

import common.ScreenFactory;
import io.appium.java_client.android.AndroidDriver;

/**
 * Base screen
 */
public class BaseScreen extends ScreenFactory {

    private AndroidDriver driver = null;

    public BaseScreen(AndroidDriver driver) {
        super(driver);
    }


    public AndroidDriver getDriver() {
        return driver;
    }
}
