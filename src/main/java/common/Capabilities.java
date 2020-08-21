package common;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Properties;

/**
 * DesiredCapabilities.
 */
public enum Capabilities {

        ANDROID {
            public DesiredCapabilities getCapabilities() {
                desiredCapabilities.setCapability("appActivity", "");// add value
                desiredCapabilities.setCapability("appPackage", "com.amazon.mShop.android.shopping");
                desiredCapabilities.setCapability("automationName", "UiAutomator2");
                return desiredCapabilities;
            }
        };

        /**
         * Constructs appropriate capabilities.
         *
         * @return DesiredCapabilities object
         */
        public abstract DesiredCapabilities getCapabilities();

        protected DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        protected Properties properties = System.getProperties();
    }

