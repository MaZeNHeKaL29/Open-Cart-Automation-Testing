package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.ForgottenPasswordPage;

import static utils.Driver.driver;
import pages.LoginPage;
import utils.RandomStringGeneration;
import utils.Url;
import utils.WindowDimension;
import utils.validRegisterData;

import java.util.ArrayList;


public class ForgottenPasswordPageTest  extends TestSuiteSetup {


    @BeforeClass
    public void initForgottenPasswordPageTest() {
        driver.get(ForgottenPasswordPage.url);
    }

    @Test(priority = 1, dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest"})
    public void forgetPasswordWithValidEmail() {
        driver.get(ForgottenPasswordPage.url);
        ForgottenPasswordPage.sendKeysToEmailForm(validRegisterData.email);
        ForgottenPasswordPage.clickOnContinueButton();
        Assert.assertEquals(driver.getCurrentUrl(), Url.login, "Check that site is directed to login page");
        String expectedError = "An email with a confirmation link has been sent your email address.";
        ArrayList<String> errors = LoginPage.getSuccessMessages();
        boolean found = false;
        for(String error : errors)
        {
            if(error.equals(expectedError)) {
                found = true;
            }
        }
        Assert.assertTrue(found, "Check that success message of confirmation link sent appears");
    }

    @Test(priority = 2)
    public void forgetPasswordWithInValidEmail() {
        driver.get(ForgottenPasswordPage.url);
        ForgottenPasswordPage.sendKeysToEmailForm("example" + RandomStringGeneration.generateRandomString() + "@example.com");
        ForgottenPasswordPage.clickOnContinueButton();
        Assert.assertEquals(driver.getCurrentUrl(), Url.forgottenPassword, "Check that site is still on forget password page");
        String expectedError = "Warning: The E-Mail Address was not found in our records, please try again!";
        ArrayList<String> errors = ForgottenPasswordPage.getErrorMessages();
        boolean found = false;
        for(String error : errors)
        {
            if(error.equals(expectedError)) {
                found = true;
            }
        }
        Assert.assertTrue(found, "Check that message of invalid email appears");
    }

    @Test(priority = 2, dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest"})
    public void forgetPasswordWithInEmptyEmail() {
        driver.get(ForgottenPasswordPage.url);
        Assert.assertEquals(driver.getCurrentUrl(), Url.forgottenPassword, "Check that site is still on forget password page");
        ForgottenPasswordPage.clickOnContinueButton();
        String expectedError = "Warning: The E-Mail Address was not found in our records, please try again!";
        ArrayList<String> errors = ForgottenPasswordPage.getErrorMessages();
        boolean found = false;
        for(String error : errors)
        {
            if(error.equals(expectedError)) {
                found = true;
            }
        }
        Assert.assertTrue(found, "Check that message of invalid email appears");
    }


    @Test(priority = 3)
    public void clickOnHomeBreadcrumbTest() {
        driver.get(ForgottenPasswordPage.url);
        ForgottenPasswordPage.clickOnHomeBreadcrumb();
        Assert.assertEquals(driver.getCurrentUrl(), Url.home, "Check that site is directed to home page");
    }

    @Test(priority = 3)
    public void clickOnAccountBreadcrumbBeforeLoginTest() {
        driver.get(ForgottenPasswordPage.url);
        ForgottenPasswordPage.clickOnAccountBreadcrumb();
        Assert.assertEquals(driver.getCurrentUrl(), Url.login, "Check that site is directed to login page");
    }

    @Test(priority = 3)
    public void clickOnForgottenPasswordBreadcrumbTest() {
        driver.get(ForgottenPasswordPage.url);
        ForgottenPasswordPage.clickOnForgottenPasswordBreadcrumb();
        Assert.assertEquals(driver.getCurrentUrl(), Url.forgottenPassword, "Check that site is directed to forget password page");
    }

    @Test(priority = 3)
    public void clickOnLoginListGroupTest() {
        driver.get(ForgottenPasswordPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(ForgottenPasswordPage.isLoginListGroupDisplayed());
        ForgottenPasswordPage.clickOnLoginListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.login, "Check that site is directed to login page");
    }

    @Test(priority = 3)
    public void clickOnRegisterListGroupTest() {
        driver.get(ForgottenPasswordPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(ForgottenPasswordPage.isRegisterListGroupDisplayed());
        ForgottenPasswordPage.clickOnRegisterListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.register, "Check that site is directed to register page");
    }

    @Test(priority = 3)
    public void clickOnForgottenPasswordListGroupTest() {
        driver.get(ForgottenPasswordPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(ForgottenPasswordPage.isForgottenPasswordListGroupDisplayed());
        ForgottenPasswordPage.clickOnForgottenPasswordListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.forgottenPassword, "Check that site is directed to forgotten password page");
    }

    @Test(priority = 3)
    public void clickOnMyAccountListGroupBeforeLoginTest() {
        driver.get(ForgottenPasswordPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(ForgottenPasswordPage.isMyAccountListGroupDisplayed());
        ForgottenPasswordPage.clickOnMyAccountListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.login, "Check that site is directed to login page");
    }

    @Test(priority = 3)
    public void clickOnAddressBookListGroupBeforeLoginTest() {
        driver.get(ForgottenPasswordPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(ForgottenPasswordPage.isAddressBookListGroupDisplayed());
        ForgottenPasswordPage.clickOnAddressBookListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.login, "Check that site is directed to login page");
    }

    @Test(priority = 3)
    public void clickOnWishlistListGroupBeforeLoginTest() {
        driver.get(ForgottenPasswordPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(ForgottenPasswordPage.isWishlistListGroupDisplayed());
        ForgottenPasswordPage.clickOnWishlistListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.login, "Check that site is directed to login page");
    }

    @Test(priority = 3)
    public void clickOnOrderHistoryListGroupBeforeLoginTest() {
        driver.get(ForgottenPasswordPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(ForgottenPasswordPage.isOrderHistoryListGroupDisplayed());
        ForgottenPasswordPage.clickOnOrderHistoryListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.login, "Check that site is directed to login page");
    }

    @Test(priority = 3)
    public void clickOnRewardPointListGroupBeforeLoginTest() {
        driver.get(ForgottenPasswordPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(ForgottenPasswordPage.isRewardPointListGroupDisplayed());
        ForgottenPasswordPage.clickOnRewardPointListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.login, "Check that site is directed to login page");
    }

    @Test(priority = 3)
    public void clickOnTransactionsListGroupBeforeLoginTest() {
        driver.get(ForgottenPasswordPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(ForgottenPasswordPage.isTransactionsListGroupDisplayed());
        ForgottenPasswordPage.clickOnTransactionsListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.login, "Check that site is directed to login page");
    }

    @Test(priority = 3)
    public void clickOnNewsletterListGroupBeforeLoginTest() {
        driver.get(ForgottenPasswordPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(ForgottenPasswordPage.isNewsletterListGroupDisplayed());
        ForgottenPasswordPage.clickOnNewsletterListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.login, "Check that site is directed to login page");
    }


    @Test(priority = 3)
    public void clickOnBackButtonTest() {
        driver.get(ForgottenPasswordPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(ForgottenPasswordPage.isBackButtonDisplayed());
        ForgottenPasswordPage.clickOnBackButton();
        Assert.assertEquals(driver.getCurrentUrl(), Url.login, "Check that site is directed to login page");
    }




    @AfterMethod
    public void clearCookies() {
        driver.manage().deleteAllCookies();
    }


}
