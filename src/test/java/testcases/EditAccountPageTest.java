package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.EditAccountPage;
import pages.RegisterPage;
import utils.RandomStringGeneration;
import utils.Url;
import utils.WindowDimension;

import java.util.ArrayList;

import static utils.Driver.driver;

public class EditAccountPageTest extends TestSuiteSetup{

    @BeforeClass
    public void initEditAccountPageTest() {
        driver.get(EditAccountPage.url);
    }

    @Test(priority = 1,dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest","testcases.AccountPageTest.loginWithValidDataTest"})
    public void editFirstNameTest() {
        driver.get(EditAccountPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        EditAccountPage.clearFirstName();
        EditAccountPage.sendKeysToFirstName("Mazen");
        EditAccountPage.clickOnContinueButton();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl,Url.account,"Check That Site is directed to Account Page");
        String expectedSuccessMessage = "Success: Your account has been successfully updated.";
        ArrayList<String> successMessages = AccountPage.getSuccessMessages();

        boolean found = false;
        for (String success : successMessages) {
            System.out.println(success);
            if (success.equals(expectedSuccessMessage)) found = true;
        }

        Assert.assertTrue(found, "Check that success message appears");
    }

    @Test(priority = 1,dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest","testcases.AccountPageTest.loginWithValidDataTest"})
    public void editLastNameTest() {
        driver.get(EditAccountPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        EditAccountPage.clearLastName();
        EditAccountPage.sendKeysToLastName("Hekal");
        EditAccountPage.clickOnContinueButton();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl,Url.account,"Check That Site is directed to Account Page");
        String expectedSuccessMessage = "Success: Your account has been successfully updated.";
        ArrayList<String> successMessages = AccountPage.getSuccessMessages();

        boolean found = false;
        for (String success : successMessages) {
            System.out.println(success);
            if (success.equals(expectedSuccessMessage)) found = true;
        }

        Assert.assertTrue(found, "Check that success message appears");
    }

    @Test(priority = 1,dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest","testcases.AccountPageTest.loginWithValidDataTest"})
    public void editTelephoneTest() {
        driver.get(EditAccountPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        EditAccountPage.clearTelephone();
        EditAccountPage.sendKeysToTelephone("01145965634");
        EditAccountPage.clickOnContinueButton();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl,Url.account,"Check That Site is directed to Account Page");
        String expectedSuccessMessage = "Success: Your account has been successfully updated.";
        ArrayList<String> successMessages = AccountPage.getSuccessMessages();

        boolean found = false;
        for (String success : successMessages) {
            System.out.println(success);
            if (success.equals(expectedSuccessMessage)) found = true;
        }

        Assert.assertTrue(found, "Check that success message appears");
    }

    @Test(priority = 1,dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest","testcases.AccountPageTest.loginWithValidDataTest"})
    public void editEmailTest() {
        driver.get(EditAccountPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        EditAccountPage.clearEmail();
        EditAccountPage.sendKeysToEmail("example"+ RandomStringGeneration.generateRandomString() + "@example.com");
        EditAccountPage.clickOnContinueButton();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl,Url.account,"Check That Site is directed to Account Page");
        String expectedSuccessMessage = "Success: Your account has been successfully updated.";
        ArrayList<String> successMessages = AccountPage.getSuccessMessages();

        boolean found = false;
        for (String success : successMessages) {
            System.out.println(success);
            if (success.equals(expectedSuccessMessage)) found = true;
        }

        Assert.assertTrue(found, "Check that success message appears");
    }


    @Test(priority = 1,dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest","testcases.AccountPageTest.loginWithValidDataTest"})
    public void editDataTest() {
        driver.get(EditAccountPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        EditAccountPage.clearFirstName();
        EditAccountPage.sendKeysToFirstName("Mazen");
        EditAccountPage.clearLastName();
        EditAccountPage.sendKeysToLastName("Hekal");
        EditAccountPage.clearTelephone();
        EditAccountPage.sendKeysToTelephone("01145965634");
        EditAccountPage.clearEmail();
        EditAccountPage.sendKeysToEmail("example"+ RandomStringGeneration.generateRandomString() + "@example.com");
        EditAccountPage.clickOnContinueButton();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl,Url.account,"Check That Site is directed to Account Page");
        String expectedSuccessMessage = "Success: Your account has been successfully updated.";
        ArrayList<String> successMessages = AccountPage.getSuccessMessages();

        boolean found = false;
        for (String success : successMessages) {
            System.out.println(success);
            if (success.equals(expectedSuccessMessage)) found = true;
        }

        Assert.assertTrue(found, "Check that success message appears");
    }



    @Test(priority = 2,dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest","testcases.AccountPageTest.loginWithValidDataTest"})
    public void clickOnBackButtonTest() {
        driver.get(EditAccountPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        EditAccountPage.clickOnBackButton();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl,Url.account,"Check That Site is directed to Account Page");
    }



    // My Account
    @Test(priority = 3,dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest","testcases.AccountPageTest.loginWithValidDataTest"})
    public void clickOnMyAccountListGroupTest() {
        driver.get(EditAccountPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(AccountPage.isMyAccountListGroupDisplayed());
        AccountPage.clickOnMyAccountListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.account, "Check that site is directed to account page");
    }

    // Edit
    @Test(priority = 3,dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest","testcases.AccountPageTest.loginWithValidDataTest"})
    public void clickOnEditListGroupTest() {
        driver.get(EditAccountPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(AccountPage.isEditListGroupDisplayed());
        AccountPage.clickOnEditListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.editAccount, "Check that site is directed to edit account page");
    }

    // Password
    @Test(priority = 3,dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest","testcases.AccountPageTest.loginWithValidDataTest"})
    public void clickOnPasswordListGroupTest() {
        driver.get(EditAccountPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(AccountPage.isPasswordListGroupDisplayed());
        AccountPage.clickOnPasswordListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.changePassword, "Check that site is directed to change password page");
    }

    // Address Book
    @Test(priority = 3,dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest","testcases.AccountPageTest.loginWithValidDataTest"})
    public void clickOnAddressBookListGroupTest() {
        driver.get(EditAccountPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(AccountPage.isAddressBookListGroupDisplayed());
        AccountPage.clickOnAddressBookListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.addressBook, "Check that site is directed to address book page");
    }

    // Wishlist
    @Test(priority = 3,dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest","testcases.AccountPageTest.loginWithValidDataTest"})
    public void clickOnWishListListGroupTest() {
        driver.get(EditAccountPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(AccountPage.isWishListListGroupDisplayed());
        AccountPage.clickOnWishListListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.wishlist, "Check that site is directed to wishlist page");
    }

    // Order History
    @Test(priority = 3,dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest","testcases.AccountPageTest.loginWithValidDataTest"})
    public void clickOnOrderHistoryListGroupTest() {
        driver.get(EditAccountPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(AccountPage.isOrderHistoryListGroupDisplayed());
        AccountPage.clickOnOrderHistoryListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.order, "Check that site is directed to order page");
    }

    // Downloads
    @Test(priority = 3,dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest","testcases.AccountPageTest.loginWithValidDataTest"})
    public void clickOnDownloadsListGroupTest() {
        driver.get(EditAccountPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(AccountPage.isDownloadsListGroupDisplayed());
        AccountPage.clickOnDownloadsListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.downloads, "Check that site is directed to downloads page");
    }

    // Recurring Payments
    @Test(priority = 3,dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest","testcases.AccountPageTest.loginWithValidDataTest"})
    public void clickOnRecurringPaymentsListGroupTest() {
        driver.get(EditAccountPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(AccountPage.isRecurringPaymentsListGroupDisplayed());
        AccountPage.clickOnRecurringPaymentsListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.recurringPayments, "Check that site is directed to recurring payments page");
    }

    // Reward Points
    @Test(priority = 3,dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest","testcases.AccountPageTest.loginWithValidDataTest"})
    public void clickOnRewardPointsListGroupTest() {
        driver.get(EditAccountPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(AccountPage.isRewardPointsListGroupDisplayed());
        AccountPage.clickOnRewardPointsListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.reward, "Check that site is directed to reward page");
    }

    // Returns
    @Test(priority = 3,dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest","testcases.AccountPageTest.loginWithValidDataTest"})
    public void clickOnReturnsListGroupTest() {
        driver.get(EditAccountPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(AccountPage.isReturnsListGroupDisplayed());
        AccountPage.clickOnReturnsListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.returnRequests, "Check that site is directed to return requests page");
    }

    // Transactions
    @Test(priority = 3,dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest","testcases.AccountPageTest.loginWithValidDataTest"})
    public void clickOnTransactionsListGroupTest() {
        driver.get(EditAccountPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(AccountPage.isTransactionsListGroupDisplayed());
        AccountPage.clickOnTransactionsListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.transactions, "Check that site is directed to transactions page");
    }

    // Newsletter
    @Test(priority = 3,dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest","testcases.AccountPageTest.loginWithValidDataTest"})
    public void clickOnNewsletterListGroupTest() {
        driver.get(EditAccountPage.url);
        driver.manage().window().setSize(WindowDimension.normalDimension);
        Assert.assertTrue(AccountPage.isNewsletterListGroupDisplayed());
        AccountPage.clickOnNewsletterListGroup();
        Assert.assertEquals(driver.getCurrentUrl(), Url.newsletter, "Check that site is directed to newsletter page");
    }

//    // Logout
//    @Test(priority = 4,dependsOnMethods = {"testcases.RegisterPageTest.registerWithValidDataTest","testcases.AccountPageTest.loginWithValidDataTest"})
//    public void clickOnLogoutListGroupTest() {
//        driver.get(EditAccountPage.url);
//        driver.manage().window().setSize(WindowDimension.normalDimension);
//        Assert.assertTrue(AccountPage.isLogoutListGroupDisplayed());
//        AccountPage.clickOnLogoutListGroup();
//        Assert.assertEquals(driver.getCurrentUrl(), Url.logout, "Check that site is directed to logout page");
//    }

}
