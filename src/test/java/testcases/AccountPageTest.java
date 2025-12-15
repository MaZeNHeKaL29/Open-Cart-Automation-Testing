package testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import pages.LoginPage;
import utils.Url;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static utils.Driver.driver;

import pages.AccountPage;
import utils.WindowDimension;
import testcases.LoginPageTest;
import utils.validRegisterData;



public class AccountPageTest extends TestSuiteSetup {

    @BeforeClass
    public void initAccountPageTest() {
        driver.get(AccountPage.url);
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

    @Test(priority = 1,dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest","testcases.AccountPageTest.loginWithValidDataTest"})
    public void clickOnEditAccountTest() {
        driver.get(AccountPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(AccountPage.isEditAccountHyperLinkDisplayed());
        AccountPage.clickOnEditAccountHyperLink();
        Assert.assertEquals(driver.getCurrentUrl(), Url.editAccount, "Check that site is directed to edit account page");
    }

    @Test(priority = 1,dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest","testcases.AccountPageTest.loginWithValidDataTest"})
    public void clickOnChangePasswordTest() {
        driver.get(AccountPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(AccountPage.isChangePasswordHyperLinkDisplayed());
        AccountPage.clickOnChangePasswordHyperLink();
        Assert.assertEquals(driver.getCurrentUrl(), Url.changePassword, "Check that site is directed to change password page");
    }

    @Test(priority = 1,dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest","testcases.AccountPageTest.loginWithValidDataTest"})
    public void clickOnAddressBookTest() {
        driver.get(AccountPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(AccountPage.isAddressBookHyperLinkDisplayed());
        AccountPage.clickOnAddressBookHyperLink();
        Assert.assertEquals(driver.getCurrentUrl(), Url.addressBook, "Check that site is directed to address book page");
    }

    @Test(priority = 1,dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest","testcases.AccountPageTest.loginWithValidDataTest"})
    public void clickOnWishlistTest() {
        driver.get(AccountPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(AccountPage.isWishlistHyperLinkDisplayed());
        AccountPage.clickOnWishlistHyperLink();
        Assert.assertEquals(driver.getCurrentUrl(), Url.wishlist, "Check that site is directed to wishlist page");
    }

    @Test(priority = 1,dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest","testcases.AccountPageTest.loginWithValidDataTest"})
    public void clickOnOrderHistoryTest() {
        driver.get(AccountPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(AccountPage.isOrderHistoryHyperLinkDisplayed());
        AccountPage.clickOnOrderHistoryHyperLink();
        Assert.assertEquals(driver.getCurrentUrl(), Url.order, "Check that site is directed to order page");
    }

    @Test(priority = 1,dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest","testcases.AccountPageTest.loginWithValidDataTest"})
    public void clickOnDownloadsTest() {
        driver.get(AccountPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(AccountPage.isDownloadsHyperLinkDisplayed());
        AccountPage.clickOnDownloadsHyperLink();
        Assert.assertEquals(driver.getCurrentUrl(), Url.downloads, "Check that site is directed to downloads page");
    }

    @Test(priority = 1,dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest","testcases.AccountPageTest.loginWithValidDataTest"})
    public void clickOnRewardTest() {
        driver.get(AccountPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(AccountPage.isRewardHyperLinkDisplayed());
        AccountPage.clickOnRewardHyperLink();
        Assert.assertEquals(driver.getCurrentUrl(), Url.reward, "Check that site is directed to reward page");
    }

    @Test(priority = 1,dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest","testcases.AccountPageTest.loginWithValidDataTest"})
    public void clickOnReturnRequestTest() {
        driver.get(AccountPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(AccountPage.isReturnRequestHyperLinkDisplayed());
        AccountPage.clickOnReturnRequestHyperLink();
        Assert.assertEquals(driver.getCurrentUrl(), Url.returnRequests, "Check that site is directed to return requests page");
    }

    @Test(priority = 1,dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest","testcases.AccountPageTest.loginWithValidDataTest"})
    public void clickOnTransactionsTest() {
        driver.get(AccountPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(AccountPage.isTransactionsHyperLinkDisplayed());
        AccountPage.clickOnTransactionsHyperLink();
        Assert.assertEquals(driver.getCurrentUrl(), Url.transactions, "Check that site is directed to transactions page ");
    }

    @Test(priority = 1,dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest","testcases.AccountPageTest.loginWithValidDataTest"})
    public void clickOnRecurringPaymentsTest() {
        driver.get(AccountPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(AccountPage.isRecurringPaymentsHyperLinkDisplayed());
        AccountPage.clickOnRecurringPaymentsHyperLink();
        Assert.assertEquals(driver.getCurrentUrl(), Url.recurringPayments, "Check that site is directed to recurring payments page");
    }

    @Test(priority = 1,dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest","testcases.AccountPageTest.loginWithValidDataTest"})
    public void clickOnRegisterAffiliateTest() {
        driver.get(AccountPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(AccountPage.isRegisterAffiliateHyperLinkDisplayed());
        AccountPage.clickOnRegisterAffiliateHyperLink();
        Assert.assertEquals(driver.getCurrentUrl(), Url.registerAffiliate, "Check that site is directed to register affiliate page");
    }

    @Test(priority = 1,dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest","testcases.AccountPageTest.loginWithValidDataTest"})
    public void clickOnNewsletterTest() {
        driver.get(AccountPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(AccountPage.isNewsletterHyperLinkDisplayed());
        AccountPage.clickOnNewsletterHyperLink();
        Assert.assertEquals(driver.getCurrentUrl(), Url.newsletter, "Check that site is directed to newsletter page");
    }

    @Test(priority = 2,dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest","testcases.AccountPageTest.loginWithValidDataTest"})
    public void clickOnHomeBreadCrumbTest() {
        driver.get(AccountPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(AccountPage.isHomeBreadcrumbDisplayed());
        AccountPage.clickOnHomeBreadcrumb();
        Assert.assertEquals(driver.getCurrentUrl(), Url.home, "Check that site is directed to home page");
    }

    @Test(priority = 2,dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest","testcases.AccountPageTest.loginWithValidDataTest"})
    public void clickOnAccountBreadCrumbTest() {
        driver.get(AccountPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(AccountPage.isAccountBreadcrumbDisplayed());
        AccountPage.clickOnAccountBreadcrumb();
        Assert.assertEquals(driver.getCurrentUrl(), Url.account, "Check that site is directed to account page");
    }



    // My Account
    @Test(priority = 2,dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest","testcases.AccountPageTest.loginWithValidDataTest"})
    public void clickOnMyAccountListGroupTest() {
        driver.get(AccountPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(AccountPage.isMyAccountListGroupDisplayed());
        AccountPage.clickOnMyAccountListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.account, "Check that site is directed to account page");
    }

    // Edit
    @Test(priority = 2,dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest","testcases.AccountPageTest.loginWithValidDataTest"})
    public void clickOnEditListGroupTest() {
        driver.get(AccountPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(AccountPage.isEditListGroupDisplayed());
        AccountPage.clickOnEditListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.editAccount, "Check that site is directed to edit account page");
    }

    // Password
    @Test(priority = 2,dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest","testcases.AccountPageTest.loginWithValidDataTest"})
    public void clickOnPasswordListGroupTest() {
        driver.get(AccountPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(AccountPage.isPasswordListGroupDisplayed());
        AccountPage.clickOnPasswordListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.changePassword, "Check that site is directed to change password page");
    }

    // Address Book
    @Test(priority = 2,dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest","testcases.AccountPageTest.loginWithValidDataTest"})
    public void clickOnAddressBookListGroupTest() {
        driver.get(AccountPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(AccountPage.isAddressBookListGroupDisplayed());
        AccountPage.clickOnAddressBookListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.addressBook, "Check that site is directed to address book page");
    }

    // Wishlist
    @Test(priority = 2,dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest","testcases.AccountPageTest.loginWithValidDataTest"})
    public void clickOnWishListListGroupTest() {
        driver.get(AccountPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(AccountPage.isWishListListGroupDisplayed());
        AccountPage.clickOnWishListListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.wishlist, "Check that site is directed to wishlist page");
    }

    // Order History
    @Test(priority = 2,dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest","testcases.AccountPageTest.loginWithValidDataTest"})
    public void clickOnOrderHistoryListGroupTest() {
        driver.get(AccountPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(AccountPage.isOrderHistoryListGroupDisplayed());
        AccountPage.clickOnOrderHistoryListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.order, "Check that site is directed to order page");
    }

    // Downloads
    @Test(priority = 2,dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest","testcases.AccountPageTest.loginWithValidDataTest"})
    public void clickOnDownloadsListGroupTest() {
        driver.get(AccountPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(AccountPage.isDownloadsListGroupDisplayed());
        AccountPage.clickOnDownloadsListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.downloads, "Check that site is directed to downloads page");
    }

    // Recurring Payments
    @Test(priority = 2,dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest","testcases.AccountPageTest.loginWithValidDataTest"})
    public void clickOnRecurringPaymentsListGroupTest() {
        driver.get(AccountPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(AccountPage.isRecurringPaymentsListGroupDisplayed());
        AccountPage.clickOnRecurringPaymentsListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.recurringPayments, "Check that site is directed to recurring payments page");
    }

    // Reward Points
    @Test(priority = 2,dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest","testcases.AccountPageTest.loginWithValidDataTest"})
    public void clickOnRewardPointsListGroupTest() {
        driver.get(AccountPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(AccountPage.isRewardPointsListGroupDisplayed());
        AccountPage.clickOnRewardPointsListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.reward, "Check that site is directed to reward page");
    }

    // Returns
    @Test(priority = 2,dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest","testcases.AccountPageTest.loginWithValidDataTest"})
    public void clickOnReturnsListGroupTest() {
        driver.get(AccountPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(AccountPage.isReturnsListGroupDisplayed());
        AccountPage.clickOnReturnsListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.returnRequests, "Check that site is directed to return requests page");
    }

    // Transactions
    @Test(priority = 2,dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest","testcases.AccountPageTest.loginWithValidDataTest"})
    public void clickOnTransactionsListGroupTest() {
        driver.get(AccountPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(AccountPage.isTransactionsListGroupDisplayed());
        AccountPage.clickOnTransactionsListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.transactions, "Check that site is directed to transactions page");
    }

    // Newsletter
    @Test(priority = 2,dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest","testcases.AccountPageTest.loginWithValidDataTest"})
    public void clickOnNewsletterListGroupTest() {
        driver.get(AccountPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(AccountPage.isNewsletterListGroupDisplayed());
        AccountPage.clickOnNewsletterListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.newsletter, "Check that site is directed to newsletter page");
    }

//    // Logout
//    @Test(priority = 3,dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest","testcases.AccountPageTest.loginWithValidDataTest"})
//    public void clickOnLogoutListGroupTest() {
//        driver.get(AccountPage.url);
//        driver.manage().window().setSize(WindowDimension.normalDimension);
//        Assert.assertTrue(AccountPage.isLogoutListGroupDisplayed());
//        AccountPage.clickOnLogoutListGroup();
//        Assert.assertEquals(driver.getCurrentUrl(), Url.logout, "Check that site is directed to logout page");
//    }



}
