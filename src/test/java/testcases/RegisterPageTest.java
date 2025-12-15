package testcases;

import utils.Url;
import utils.WindowDimension;
import utils.validRegisterData;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utils.RandomStringGeneration;

import static utils.Driver.driver;

import pages.RegisterPage;

import java.util.ArrayList;

public class RegisterPageTest extends TestSuiteSetup {

    @BeforeClass
    public void initRegisterPageTest() {
        driver.get(RegisterPage.url);
    }

    @Test(priority = 1)
    public void clickOnHomeBreadcrumbTest() {
        driver.get(RegisterPage.url);
        RegisterPage.clickOnHomeBreadcrumb();
        Assert.assertEquals(driver.getCurrentUrl(), Url.home, "Check that site is directed to home page");
    }

    @Test(priority = 1)
    public void clickOnAccountBreadcrumbBeforeLoginTest() {
        driver.get(RegisterPage.url);
        RegisterPage.clickOnAccountBreadcrumb();
        Assert.assertEquals(driver.getCurrentUrl(), Url.login, "Check that site is directed to login page");
    }

    @Test(priority = 1)
    public void clickOnRegisterBreadcrumbTest() {
        driver.get(RegisterPage.url);
        RegisterPage.clickOnRegisterBreadcrumb();
        Assert.assertEquals(driver.getCurrentUrl(), Url.register, "Check that site is directed to register page");
    }

    @Test(priority = 1)
    public void clickOnLoginListGroupTest() {
        driver.get(RegisterPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(RegisterPage.isLoginListGroupDisplayed());
        RegisterPage.clickOnLoginListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.login, "Check that site is directed to login page");
    }

    @Test(priority = 1)
    public void clickOnRegisterListGroupTest() {
        driver.get(RegisterPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(RegisterPage.isRegisterListGroupDisplayed());
        RegisterPage.clickOnRegisterListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.register, "Check that site is directed to register page");
    }

    @Test(priority = 1)
    public void clickOnForgottenPasswordListGroupTest() {
        driver.get(RegisterPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(RegisterPage.isForgottenPasswordListGroupDisplayed());
        RegisterPage.clickOnForgottenPasswordListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.forgottenPassword, "Check that site is directed to forgotten password page");
    }

    @Test(priority = 1)
    public void clickOnMyAccountListGroupBeforeLoginTest() {
        driver.get(RegisterPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(RegisterPage.isMyAccountListGroupDisplayed());
        RegisterPage.clickOnMyAccountListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.login, "Check that site is directed to login page");
    }

    @Test(priority = 1)
    public void clickOnAddressBookListGroupBeforeLoginTest() {
        driver.get(RegisterPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(RegisterPage.isAddressBookListGroupDisplayed());
        RegisterPage.clickOnAddressBookListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.login, "Check that site is directed to login page");
    }

    @Test(priority = 1)
    public void clickOnWishlistListGroupBeforeLoginTest() {
        driver.get(RegisterPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(RegisterPage.isWishlistListGroupDisplayed());
        RegisterPage.clickOnWishlistListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.login, "Check that site is directed to login page");
    }

    @Test(priority = 1)
    public void clickOnOrderHistoryListGroupBeforeLoginTest() {
        driver.get(RegisterPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(RegisterPage.isOrderHistoryListGroupDisplayed());
        RegisterPage.clickOnOrderHistoryListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.login, "Check that site is directed to login page");
    }

    @Test(priority = 1)
    public void clickOnRewardPointListGroupBeforeLoginTest() {
        driver.get(RegisterPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(RegisterPage.isRewardPointListGroupDisplayed());
        RegisterPage.clickOnRewardPointListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.login, "Check that site is directed to login page");
    }

    @Test(priority = 1)
    public void clickOnTransactionsListGroupBeforeLoginTest() {
        driver.get(RegisterPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(RegisterPage.isTransactionsListGroupDisplayed());
        RegisterPage.clickOnTransactionsListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.login, "Check that site is directed to login page");
    }

    @Test(priority = 1)
    public void clickOnNewsletterListGroupBeforeLoginTest() {
        driver.get(RegisterPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(RegisterPage.isNewsletterListGroupDisplayed());
        RegisterPage.clickOnNewsletterListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.login, "Check that site is directed to login page");
    }

    @Test(priority = 2,groups = {"Valid Registration"})
    public void registerWithValidDataTest() {
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
        Assert.assertEquals(driver.getCurrentUrl(),Url.successAccountCreation, "Check that Account is created successfully");
    }

    @Test(priority = 3)
    public void registerWithEmptyFirstNameDataTest() {
        driver.get(RegisterPage.url);
        RegisterPage.sendKeysToLastNameForm("Hekal");
        RegisterPage.sendKeysToEmailForm("example" + RandomStringGeneration.generateRandomString() + "@example.com");
        RegisterPage.sendKeysToTelephoneForm("0155285677");
        RegisterPage.sendKeysToPasswordForm("123456");
        RegisterPage.sendKeysToConfirmPasswordForm("123456");
        RegisterPage.clickOnAgreeToPrivacyPolicyCheckbox();
        RegisterPage.clickOnContinueButton();
        Assert.assertEquals(driver.getCurrentUrl(), Url.register, "Check that Account is not created");
        String expectedError = "First Name must be between 1 and 32 characters!";
        ArrayList<String> errors = RegisterPage.getErrorMessages();
        boolean found = false;
        for(String error : errors)
        {
            if(error.equals(expectedError)) {
                found = true;
            }
        }
        Assert.assertTrue(found, "Check that error message of First Name appears");
    }

    @Test(priority = 3)
    public void registerWithFirstNameMoreThan32CharactersDataTest() {
        driver.get(RegisterPage.url);
        RegisterPage.sendKeysToFirstNameForm("MazenLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL");
        RegisterPage.sendKeysToLastNameForm("Hekal");
        RegisterPage.sendKeysToEmailForm("example" + RandomStringGeneration.generateRandomString() + "@example.com");
        RegisterPage.sendKeysToTelephoneForm("0155285677");
        RegisterPage.sendKeysToPasswordForm("123456");
        RegisterPage.sendKeysToConfirmPasswordForm("123456");
        RegisterPage.clickOnAgreeToPrivacyPolicyCheckbox();
        RegisterPage.clickOnContinueButton();
        Assert.assertEquals(driver.getCurrentUrl(), Url.register, "Check that Account is not created");
        String expectedError = "First Name must be between 1 and 32 characters!";
        ArrayList<String> errors = RegisterPage.getErrorMessages();
        boolean found = false;
        for(String error : errors)
        {
            if(error.equals(expectedError)) {
                found = true;
            }
        }
        Assert.assertTrue(found, "Check that error message of First Name appears");
    }

    @Test(priority = 3)
    public void registerWithEmptyLastNameTest() {
        driver.get(RegisterPage.url);
        RegisterPage.sendKeysToFirstNameForm("Mazen");
        RegisterPage.sendKeysToEmailForm("example" + RandomStringGeneration.generateRandomString() + "@example.com");
        RegisterPage.sendKeysToTelephoneForm("0155285677");
        RegisterPage.sendKeysToPasswordForm("123456");
        RegisterPage.sendKeysToConfirmPasswordForm("123456");
        RegisterPage.clickOnAgreeToPrivacyPolicyCheckbox();
        RegisterPage.clickOnContinueButton();

        Assert.assertEquals(driver.getCurrentUrl(), Url.register, "Check that Account is not created");

        String expectedError = "Last Name must be between 1 and 32 characters!";
        ArrayList<String> errors = RegisterPage.getErrorMessages();

        boolean found = false;
        for (String error : errors) {
            if (error.equals(expectedError)) found = true;
        }

        Assert.assertTrue(found, "Check that error message of Last Name appears");
    }

    @Test(priority = 3)
    public void registerWithLastNameMoreThan32CharactersTest() {
        driver.get(RegisterPage.url);
        RegisterPage.sendKeysToFirstNameForm("Mazen");
        RegisterPage.sendKeysToLastNameForm("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL");
        RegisterPage.sendKeysToEmailForm("example" + RandomStringGeneration.generateRandomString() + "@example.com");
        RegisterPage.sendKeysToTelephoneForm("0155285677");
        RegisterPage.sendKeysToPasswordForm("123456");
        RegisterPage.sendKeysToConfirmPasswordForm("123456");
        RegisterPage.clickOnAgreeToPrivacyPolicyCheckbox();
        RegisterPage.clickOnContinueButton();

        Assert.assertEquals(driver.getCurrentUrl(), Url.register, "Check that Account is not created");

        String expectedError = "Last Name must be between 1 and 32 characters!";
        ArrayList<String> errors = RegisterPage.getErrorMessages();

        boolean found = false;
        for (String error : errors) {
            if (error.equals(expectedError)) found = true;
        }

        Assert.assertTrue(found, "Check that error message of Last Name appears");
    }

    @Test(priority = 3)
    public void registerWithEmptyEmailTest() {
        driver.get(RegisterPage.url);
        RegisterPage.sendKeysToFirstNameForm("Mazen");
        RegisterPage.sendKeysToLastNameForm("Hekal");
        RegisterPage.sendKeysToTelephoneForm("0155285677");
        RegisterPage.sendKeysToPasswordForm("123456");
        RegisterPage.sendKeysToConfirmPasswordForm("123456");
        RegisterPage.clickOnAgreeToPrivacyPolicyCheckbox();
        RegisterPage.clickOnContinueButton();

        Assert.assertEquals(driver.getCurrentUrl(), Url.register, "Check that Account is not created");

        String expectedError = "E-Mail Address does not appear to be valid!";
        ArrayList<String> errors = RegisterPage.getErrorMessages();

        boolean found = false;
        for (String error : errors) {
            if (error.equals(expectedError)) found = true;
        }

        Assert.assertTrue(found, "Check that error message of E-Mail appears");
    }


    @Test(priority = 3)
    public void registerWithInvalidEmailTest() {
        driver.get(RegisterPage.url);
        RegisterPage.sendKeysToFirstNameForm("Mazen");
        RegisterPage.sendKeysToLastNameForm("Hekal");
        RegisterPage.sendKeysToEmailForm("invalidEmail");
        RegisterPage.sendKeysToTelephoneForm("0155285677");
        RegisterPage.sendKeysToPasswordForm("123456");
        RegisterPage.sendKeysToConfirmPasswordForm("123456");
        RegisterPage.clickOnAgreeToPrivacyPolicyCheckbox();
        RegisterPage.clickOnContinueButton();

        Assert.assertEquals(driver.getCurrentUrl(), Url.register, "Check that Account is not created");
    }

    @Test(priority = 3)
    public void registerWithInvalidEmail2Test() {
        driver.get(RegisterPage.url);
        RegisterPage.sendKeysToFirstNameForm("Mazen");
        RegisterPage.sendKeysToLastNameForm("Hekal");
        RegisterPage.sendKeysToEmailForm("invalidEmail@s");
        RegisterPage.sendKeysToTelephoneForm("0155285677");
        RegisterPage.sendKeysToPasswordForm("123456");
        RegisterPage.sendKeysToConfirmPasswordForm("123456");
        RegisterPage.clickOnAgreeToPrivacyPolicyCheckbox();
        RegisterPage.clickOnContinueButton();

        Assert.assertEquals(driver.getCurrentUrl(), Url.register, "Check that Account is not created");

        String expectedError = "E-Mail Address does not appear to be valid!";
        ArrayList<String> errors = RegisterPage.getErrorMessages();

        boolean found = false;
        for (String error : errors) {
            if (error.equals(expectedError)) found = true;
        }

        Assert.assertTrue(found, "Check that error message of E-Mail appears");
    }

    @Test(priority = 3)
    public void registerWithEmptyTelephoneTest() {
        driver.get(RegisterPage.url);
        RegisterPage.sendKeysToFirstNameForm("Mazen");
        RegisterPage.sendKeysToLastNameForm("Hekal");
        RegisterPage.sendKeysToEmailForm("example" + RandomStringGeneration.generateRandomString() + "@example.com");
        RegisterPage.sendKeysToPasswordForm("123456");
        RegisterPage.sendKeysToConfirmPasswordForm("123456");
        RegisterPage.clickOnAgreeToPrivacyPolicyCheckbox();
        RegisterPage.clickOnContinueButton();

        Assert.assertEquals(driver.getCurrentUrl(), Url.register, "Check that Account is not created");

        String expectedError = "Telephone must be between 3 and 32 characters!";
        ArrayList<String> errors = RegisterPage.getErrorMessages();

        boolean found = false;
        for (String error : errors) {
            if (error.equals(expectedError)) found = true;
        }

        Assert.assertTrue(found, "Check that error message of Telephone appears");
    }


    @Test(priority = 3)
    public void registerWithTelephoneLessThan3CharactersTest() {
        driver.get(RegisterPage.url);
        RegisterPage.sendKeysToFirstNameForm("Mazen");
        RegisterPage.sendKeysToLastNameForm("Hekal");
        RegisterPage.sendKeysToEmailForm("example" + RandomStringGeneration.generateRandomString() + "@example.com");
        RegisterPage.sendKeysToTelephoneForm("1");
        RegisterPage.sendKeysToPasswordForm("123456");
        RegisterPage.sendKeysToConfirmPasswordForm("123456");
        RegisterPage.clickOnAgreeToPrivacyPolicyCheckbox();
        RegisterPage.clickOnContinueButton();

        Assert.assertEquals(driver.getCurrentUrl(), Url.register, "Check that Account is not created");

        String expectedError = "Telephone must be between 3 and 32 characters!";
        ArrayList<String> errors = RegisterPage.getErrorMessages();

        boolean found = false;
        for (String error : errors) {
            if (error.equals(expectedError)) found = true;
        }

        Assert.assertTrue(found, "Check that error message of Telephone appears");
    }

    @Test(priority = 3)
    public void registerWithTelephoneMoreThan32CharactersTest() {
        driver.get(RegisterPage.url);
        RegisterPage.sendKeysToFirstNameForm("Mazen");
        RegisterPage.sendKeysToLastNameForm("Hekal");
        RegisterPage.sendKeysToEmailForm("example" + RandomStringGeneration.generateRandomString() + "@example.com");
        RegisterPage.sendKeysToTelephoneForm("11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        RegisterPage.sendKeysToPasswordForm("123456");
        RegisterPage.sendKeysToConfirmPasswordForm("123456");
        RegisterPage.clickOnAgreeToPrivacyPolicyCheckbox();
        RegisterPage.clickOnContinueButton();

        Assert.assertEquals(driver.getCurrentUrl(), Url.register, "Check that Account is not created");

        String expectedError = "Telephone must be between 3 and 32 characters!";
        ArrayList<String> errors = RegisterPage.getErrorMessages();

        boolean found = false;
        for (String error : errors) {
            if (error.equals(expectedError)) found = true;
        }

        Assert.assertTrue(found, "Check that error message of Telephone appears");
    }

    @Test(priority = 3)
    public void registerWithTelephoneContainingLettersTest() {
        driver.get(RegisterPage.url);
        RegisterPage.sendKeysToFirstNameForm("Mazen");
        RegisterPage.sendKeysToLastNameForm("Hekal");
        RegisterPage.sendKeysToEmailForm("example" + RandomStringGeneration.generateRandomString() + "@example.com");
        RegisterPage.sendKeysToTelephoneForm("12345m");
        RegisterPage.sendKeysToPasswordForm("123456");
        RegisterPage.sendKeysToConfirmPasswordForm("123456");
        RegisterPage.clickOnAgreeToPrivacyPolicyCheckbox();
        RegisterPage.clickOnContinueButton();

        Assert.assertEquals(driver.getCurrentUrl(), Url.register, "Check that Account is not created");

        String expectedError = "Telephone must be between 3 and 32 characters!";
        ArrayList<String> errors = RegisterPage.getErrorMessages();

        boolean found = false;
        for (String error : errors) {
            if (error.equals(expectedError)) found = true;
        }

        Assert.assertTrue(found, "Check that error message of Telephone appears");
    }


    @Test(priority = 3)
    public void registerWithEmptyPasswordTest() {
        driver.get(RegisterPage.url);
        RegisterPage.sendKeysToFirstNameForm("Mazen");
        RegisterPage.sendKeysToLastNameForm("Hekal");
        RegisterPage.sendKeysToEmailForm("example" + RandomStringGeneration.generateRandomString() + "@example.com");
        RegisterPage.sendKeysToTelephoneForm("0155285677");
        RegisterPage.clickOnAgreeToPrivacyPolicyCheckbox();
        RegisterPage.clickOnContinueButton();

        Assert.assertEquals(driver.getCurrentUrl(), Url.register, "Check that Account is not created");

        String expectedError = "Password must be between 4 and 20 characters!";
        ArrayList<String> errors = RegisterPage.getErrorMessages();

        boolean found = false;
        for (String error : errors) {
            if (error.equals(expectedError)) found = true;
        }

        Assert.assertTrue(found, "Check that error message of Password appears");
    }

    @Test(priority = 3)
    public void registerWithPasswordLessThan4CharactersTest() {
        driver.get(RegisterPage.url);
        RegisterPage.sendKeysToFirstNameForm("Mazen");
        RegisterPage.sendKeysToLastNameForm("Hekal");
        RegisterPage.sendKeysToEmailForm("example" + RandomStringGeneration.generateRandomString() + "@example.com");
        RegisterPage.sendKeysToTelephoneForm("0155285677");
        RegisterPage.sendKeysToPasswordForm("123");
        RegisterPage.sendKeysToConfirmPasswordForm("123");
        RegisterPage.clickOnAgreeToPrivacyPolicyCheckbox();
        RegisterPage.clickOnContinueButton();

        Assert.assertEquals(driver.getCurrentUrl(), Url.register, "Check that Account is not created");

        String expectedError = "Password must be between 4 and 20 characters!";
        ArrayList<String> errors = RegisterPage.getErrorMessages();

        boolean found = false;
        for (String error : errors) {
            if (error.equals(expectedError)) found = true;
        }

        Assert.assertTrue(found, "Check that error message of Password appears");
    }

    @Test(priority = 3)
    public void registerWithPasswordMoreThan20CharactersTest() {
        driver.get(RegisterPage.url);
        RegisterPage.sendKeysToFirstNameForm("Mazen");
        RegisterPage.sendKeysToLastNameForm("Hekal");
        RegisterPage.sendKeysToEmailForm("example" + RandomStringGeneration.generateRandomString() + "@example.com");
        RegisterPage.sendKeysToTelephoneForm("0155285677");
        RegisterPage.sendKeysToPasswordForm("111121314151617181920");
        RegisterPage.sendKeysToConfirmPasswordForm("111121314151617181920");
        RegisterPage.clickOnAgreeToPrivacyPolicyCheckbox();
        RegisterPage.clickOnContinueButton();

        Assert.assertEquals(driver.getCurrentUrl(), Url.register, "Check that Account is not created");

        String expectedError = "Password must be between 4 and 20 characters!";
        ArrayList<String> errors = RegisterPage.getErrorMessages();

        boolean found = false;
        for (String error : errors) {
            if (error.equals(expectedError)) found = true;
        }

        Assert.assertTrue(found, "Check that error message of Password appears");
    }

    @Test(priority = 3)
    public void registerWithEmptyConfirmPasswordTest() {
        driver.get(RegisterPage.url);
        RegisterPage.sendKeysToFirstNameForm("Mazen");
        RegisterPage.sendKeysToLastNameForm("Hekal");
        RegisterPage.sendKeysToEmailForm("example" + RandomStringGeneration.generateRandomString() + "@example.com");
        RegisterPage.sendKeysToTelephoneForm("0155285677");
        RegisterPage.sendKeysToPasswordForm("123456");
        RegisterPage.clickOnAgreeToPrivacyPolicyCheckbox();
        RegisterPage.clickOnContinueButton();

        Assert.assertEquals(driver.getCurrentUrl(), Url.register, "Check that Account is not created");

        String expectedError = "Password confirmation does not match password!";
        ArrayList<String> errors = RegisterPage.getErrorMessages();

        boolean found = false;
        for (String error : errors) {
            if (error.equals(expectedError)) found = true;
        }

        Assert.assertTrue(found, "Check that error message of Password appears");
    }

    @Test(priority = 3)
    public void registerWithConfirmPasswordNotEqualToPasswordTest() {
        driver.get(RegisterPage.url);
        RegisterPage.sendKeysToFirstNameForm("Mazen");
        RegisterPage.sendKeysToLastNameForm("Hekal");
        RegisterPage.sendKeysToEmailForm("example" + RandomStringGeneration.generateRandomString() + "@example.com");
        RegisterPage.sendKeysToTelephoneForm("0155285677");
        RegisterPage.sendKeysToPasswordForm("123456");
        RegisterPage.sendKeysToConfirmPasswordForm("12345");
        RegisterPage.clickOnAgreeToPrivacyPolicyCheckbox();
        RegisterPage.clickOnContinueButton();

        Assert.assertEquals(driver.getCurrentUrl(), Url.register, "Check that Account is not created");

        String expectedError = "Password confirmation does not match password!";
        ArrayList<String> errors = RegisterPage.getErrorMessages();

        boolean found = false;
        for (String error : errors) {
            if (error.equals(expectedError)) found = true;
        }

        Assert.assertTrue(found, "Check that error message of Password appears");
    }

    @Test(priority = 4)
    public void registerWithValidDataAndNoAgreeToPrivacyPolicyTest() {
        driver.get(RegisterPage.url);
        RegisterPage.sendKeysToFirstNameForm("Mazen");
        RegisterPage.sendKeysToLastNameForm("Hekal");
        RegisterPage.sendKeysToEmailForm("example" + RandomStringGeneration.generateRandomString() + "@example.com");
        RegisterPage.sendKeysToTelephoneForm("0155285677");
        RegisterPage.sendKeysToPasswordForm("123456");
        RegisterPage.sendKeysToConfirmPasswordForm("123456");
        RegisterPage.clickOnContinueButton();
        Assert.assertEquals(driver.getCurrentUrl(), Url.register, "Check that Account is not created");
    }





    @AfterMethod
    public void clearCookies() {
        driver.manage().deleteAllCookies();
    }


}
