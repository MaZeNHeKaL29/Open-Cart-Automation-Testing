package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utils.RandomStringGeneration;
import utils.Url;
import utils.WindowDimension;
import utils.validRegisterData;

import static utils.Driver.driver;

public class E2ETest extends TestSuiteSetup{

    @Test(priority = 1)
    static public void registerThenCheckout() {
        driver.get(RegisterPage.url);
        validRegisterData.email = "example" + RandomStringGeneration.generateRandomString() + "@example.com";
        RegisterPage.sendKeysToFirstNameForm(validRegisterData.firstName);
        RegisterPage.sendKeysToLastNameForm(validRegisterData.LastName);
        RegisterPage.sendKeysToEmailForm(validRegisterData.email);
        RegisterPage.sendKeysToTelephoneForm(validRegisterData.telephone);
        RegisterPage.sendKeysToPasswordForm(validRegisterData.password);
        RegisterPage.sendKeysToConfirmPasswordForm(validRegisterData.password);
        RegisterPage.clickOnAgreeToPrivacyPolicyCheckbox();
        RegisterPage.clickOnContinueButton();
        Assert.assertEquals(driver.getCurrentUrl(), Url.successAccountCreation, "Check that Account is created successfully");
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
