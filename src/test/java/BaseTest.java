import DSL.SignInScreen;
import DSL.WelcomeScreen;
import common.Capabilities;
import common.ScreenFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;

public class BaseTest<MD extends AndroidDriver<? extends AndroidElement>> {
    private AndroidDriver<AndroidElement> driver;

    private ScreenFactory screenFactory;

    /**
     * Constructs AndroidFactory.
     */
    @BeforeMethod
    public void constructAndroidScreenFactory(){
        screenFactory = new ScreenFactory(getDriver());
    }


    public WelcomeScreen getWelcomeScreen() {
        return screenFactory.getWelcomeScreen();
    }

    public SignInScreen getSignInScreen() {
        return screenFactory.getSignInScreen();
    }


    public ResourceBundle configuration;
    private String appiumUrl;

    public BaseTest() {
        configuration = ResourceBundle.getBundle("config");
        appiumUrl = String.format("http://%s:%s/wd/hub", configuration.getString("defaultIP"),
                configuration.getString("defaultPort"));
    }

    /**
     * Get Appium url.
     *
     * @return url value
     */
    public String getAppiumUrl() {
        return appiumUrl;
    }

    /**
     * Get driver.
     *
     * @return driver object
     */
    public AndroidDriver<AndroidElement> getDriver() {
        return driver;
    }

    /**
     * Create driver.
     *
     * @return driver type
     * @throws MalformedURLException
     */
    public AndroidDriver<AndroidElement> createDriver() throws MalformedURLException {
        return new AndroidDriver(new URL(getAppiumUrl()), Capabilities.ANDROID.getCapabilities());
    }

    /**
     * Setting up driver.
     */
    @BeforeMethod
    public void setUp() {
        try {
            driver = createDriver();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Quiting the driver.
     */
    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
