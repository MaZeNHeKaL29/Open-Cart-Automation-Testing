package testcases;

import org.testng.annotations.AfterMethod;
import utils.Url;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static utils.Driver.driver;

import pages.LoginPage;
import utils.WindowDimension;
import utils.validRegisterData;


public class LoginPageTest  extends TestSuiteSetup {


    @BeforeClass
    public void initLoginPageTest() {
        driver.get(LoginPage.url);
    }

    @Test(priority = 1, dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest"})
    public void loginWithValidDataTest() {
        driver.get(LoginPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        LoginPage.sendKeysToEmailForm(validRegisterData.email);
        LoginPage.sendKeysToPasswordForm(validRegisterData.password);
        LoginPage.clickOnLoginButton();
        Assert.assertEquals(driver.getCurrentUrl(),Url.account, "Check that Account is logged in successfully");
    }

    @Test(priority = 2, dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest"})
    public void loginWithNoPasswordTest() {
        driver.get(LoginPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        LoginPage.sendKeysToEmailForm(validRegisterData.email);
        LoginPage.clickOnLoginButton();
        Assert.assertEquals(driver.getCurrentUrl(),Url.login, "Check that Account is not logged in");
    }

    @Test(priority = 2)
    public void loginWithNoEmailTest() {
        driver.get(LoginPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        LoginPage.sendKeysToPasswordForm(validRegisterData.password);
        LoginPage.clickOnLoginButton();
        Assert.assertEquals(driver.getCurrentUrl(),Url.login, "Check that Account is not logged in");
    }

    @Test(priority = 2)
    public void loginWithEmptyEmailAndPasswordTest() {
        driver.get(LoginPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        LoginPage.clickOnLoginButton();
        Assert.assertEquals(driver.getCurrentUrl(),Url.login, "Check that Account is not logged in");

    }

    @Test(priority = 2, dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest"})
    public void loginWithWrongPasswordTest() {
        driver.get(LoginPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        LoginPage.sendKeysToEmailForm(validRegisterData.email);
        LoginPage.sendKeysToPasswordForm(validRegisterData.password + "123");
        LoginPage.clickOnLoginButton();
        Assert.assertEquals(driver.getCurrentUrl(),Url.login, "Check that Account is not logged in");

    }

    @Test(priority = 3)
    public void loginWithSQLInjectionTest() {
        driver.get(LoginPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);

        // SQL Injection payload
        String sqlPayload = "' OR '1'='1";

        // Enter injection payload in email and a dummy password
        LoginPage.sendKeysToEmailForm(sqlPayload);
        LoginPage.sendKeysToPasswordForm("invalidPassword");
        LoginPage.clickOnLoginButton();

        // Assert still on login page (authentication failed)
        Assert.assertEquals(driver.getCurrentUrl(), Url.login,
                "Check that SQL Injection did NOT bypass authentication");

    }

    @Test(priority = 4)
    public void clickOnHomeBreadcrumbTest() {
        driver.get(LoginPage.url);
        LoginPage.clickOnHomeBreadcrumb();
        Assert.assertEquals(driver.getCurrentUrl(), Url.home, "Check that site is directed to home page");
    }

    @Test(priority = 4)
    public void clickOnAccountBreadcrumbBeforeLoginTest() {
        driver.get(LoginPage.url);
        LoginPage.clickOnAccountBreadcrumb();
        Assert.assertEquals(driver.getCurrentUrl(), Url.login, "Check that site is directed to login page");
    }

    @Test(priority = 4)
    public void clickOnLoginBreadcrumbTest() {
        driver.get(LoginPage.url);
        LoginPage.clickOnLoginBreadcrumb();
        Assert.assertEquals(driver.getCurrentUrl(), Url.login, "Check that site is directed to login page");
    }

    @Test(priority = 4)
    public void clickOnLoginListGroupTest() {
        driver.get(LoginPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(LoginPage.isLoginListGroupDisplayed());
        LoginPage.clickOnLoginListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.login, "Check that site is directed to login page");
    }

    @Test(priority = 4)
    public void clickOnRegisterListGroupTest() {
        driver.get(LoginPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(LoginPage.isRegisterListGroupDisplayed());
        LoginPage.clickOnRegisterListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.register, "Check that site is directed to register page");
    }

    @Test(priority = 4)
    public void clickOnForgottenPasswordListGroupTest() {
        driver.get(LoginPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(LoginPage.isForgottenPasswordListGroupDisplayed());
        LoginPage.clickOnForgottenPasswordListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.forgottenPassword, "Check that site is directed to forgotten password page");
    }

    @Test(priority = 4)
    public void clickOnMyAccountListGroupBeforeLoginTest() {
        driver.get(LoginPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(LoginPage.isMyAccountListGroupDisplayed());
        LoginPage.clickOnMyAccountListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.login, "Check that site is directed to login page");
    }

    @Test(priority = 4)
    public void clickOnAddressBookListGroupBeforeLoginTest() {
        driver.get(LoginPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(LoginPage.isAddressBookListGroupDisplayed());
        LoginPage.clickOnAddressBookListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.login, "Check that site is directed to login page");
    }

    @Test(priority = 4)
    public void clickOnWishlistListGroupBeforeLoginTest() {
        driver.get(LoginPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(LoginPage.isWishlistListGroupDisplayed());
        LoginPage.clickOnWishlistListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.login, "Check that site is directed to login page");
    }

    @Test(priority = 4)
    public void clickOnOrderHistoryListGroupBeforeLoginTest() {
        driver.get(LoginPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(LoginPage.isOrderHistoryListGroupDisplayed());
        LoginPage.clickOnOrderHistoryListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.login, "Check that site is directed to login page");
    }

    @Test(priority = 4)
    public void clickOnRewardPointListGroupBeforeLoginTest() {
        driver.get(LoginPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(LoginPage.isRewardPointListGroupDisplayed());
        LoginPage.clickOnRewardPointListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.login, "Check that site is directed to login page");
    }

    @Test(priority = 4)
    public void clickOnTransactionsListGroupBeforeLoginTest() {
        driver.get(LoginPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(LoginPage.isTransactionsListGroupDisplayed());
        LoginPage.clickOnTransactionsListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.login, "Check that site is directed to login page");
    }

    @Test(priority = 4)
    public void clickOnNewsletterListGroupBeforeLoginTest() {
        driver.get(LoginPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(LoginPage.isNewsletterListGroupDisplayed());
        LoginPage.clickOnNewsletterListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.login, "Check that site is directed to login page");
    }

    @Test(priority = 4)
    public void clickOnForgottenPasswordHyperLinkFormTest() {
        driver.get(LoginPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(LoginPage.isForgottenPasswordHyperLinkFormDisplayed());
        LoginPage.clickOnForgottenPasswordHyperLinkForm();
        Assert.assertEquals(driver.getCurrentUrl(), Url.forgottenPassword, "Check that site is directed to forgotten password page");
    }

    @Test(priority = 4)
    public void clickOnContinueRegisterButtonTest() {
        driver.get(LoginPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(LoginPage.isContinueRegisterButtonDisplayed());
        LoginPage.clickOnContinueRegisterButton();
        Assert.assertEquals(driver.getCurrentUrl(), Url.register, "Check that site is directed to register page");
    }




    @AfterMethod
    public void clearCookies() {
        driver.manage().deleteAllCookies();
    }


}
