
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Shopping search test
 **/
public class ShoppingSearchTest extends BaseTest {

    @Test
    public void searchTest() {
        getWelcomeScreen().tapSignIn();
        Assert.assertTrue(getSignInScreen().isSignScreenDisplayed(), "Sign In screen is not loaded");
        getSignInScreen().enterUserName(configuration.getString("userid"));
        getSignInScreen().enterPassword(configuration.getString("password"));
        getSignInScreen().tapSignIn();
    }
}
