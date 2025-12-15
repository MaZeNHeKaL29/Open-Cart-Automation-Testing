package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckoutPage;
import pages.HomePage;
import utils.Url;

import static utils.Driver.driver;

public class CheckoutTest extends TestSuiteSetup{

    @Test(priority = 1,dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest","testcases.AccountPageTest.loginWithValidDataTest"})
    public void checkoutAfterLogin() {
        driver.get(Url.home);
        HomePage.addItemToCart(1);
        driver.get(Url.cart);
        Assert.assertTrue(CartPage.isCheckoutButtonDisplayed());
        CartPage.clickOnCheckoutButton();
        Assert.assertEquals(driver.getCurrentUrl(),Url.checkout);

        CheckoutPage.sendKeysToFirstName("Mazen");
        CheckoutPage.sendKeysToLastName("Hekal");
        CheckoutPage.sendKeysToCompany("Test Company");
        CheckoutPage.sendKeysToAddress1("123 Test Street");
        CheckoutPage.sendKeysToAddress2("Apartment 5");
        CheckoutPage.sendKeysToCity("Cairo");
        CheckoutPage.sendKeysToPostCode("11511");

        CheckoutPage.selectCountry("Egypt");
        CheckoutPage.clickOnRegion();
        CheckoutPage.selectRegion(1);

        CheckoutPage.clickOnContinueDetailsButton();
    }

}
