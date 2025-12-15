package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Url;

import java.util.ArrayList;
import java.util.List;

import static utils.Driver.driver;

public class AccountPage extends AfterLoginListGroup {

    static public String url = Url.account;

    static public By editAccountHyperLink =By.cssSelector("#content .list-unstyled a[href='https://awesomeqa.com/ui/index.php?route=account/edit']");

    static public By changePasswordHyperLink =By.cssSelector("#content .list-unstyled a[href='https://awesomeqa.com/ui/index.php?route=account/password']");

    static public By addressBookHyperLink =By.cssSelector("#content .list-unstyled a[href='https://awesomeqa.com/ui/index.php?route=account/address']");

    static public By wishlistHyperLink =By.cssSelector("#content .list-unstyled a[href='https://awesomeqa.com/ui/index.php?route=account/wishlist']");

    static public By orderHistoryHyperLink =By.cssSelector("#content .list-unstyled a[href='https://awesomeqa.com/ui/index.php?route=account/order']");

    static public By downloadsHyperLink =By.cssSelector("#content .list-unstyled a[href='https://awesomeqa.com/ui/index.php?route=account/download']");

    static public By rewardHyperLink =By.cssSelector("#content .list-unstyled a[href='https://awesomeqa.com/ui/index.php?route=account/reward']");

    static public By returnRequestHyperLink =By.cssSelector("#content .list-unstyled a[href='https://awesomeqa.com/ui/index.php?route=account/return']");

    static public By transactionsHyperLink =By.cssSelector("#content .list-unstyled a[href='https://awesomeqa.com/ui/index.php?route=account/transaction']");

    static public By recurringPaymentsHyperLink =By.cssSelector("#content .list-unstyled a[href='https://awesomeqa.com/ui/index.php?route=account/recurring']");

    static public By registerAffiliateHyperLink =By.cssSelector("#content .list-unstyled a[href='https://awesomeqa.com/ui/index.php?route=account/affiliate/add']");

    static public By newsletterHyperLink =By.cssSelector("#content .list-unstyled a[href='https://awesomeqa.com/ui/index.php?route=account/newsletter']");

    static public By homeBreadcrumb = By.cssSelector("#account-account .breadcrumb a[href='https://awesomeqa.com/ui/index.php?route=common/home']");

    static public By accountBreadcrumb = By.cssSelector("#account-account .breadcrumb a[href='https://awesomeqa.com/ui/index.php?route=account/account']");

    static public By successMessage = By.cssSelector(".alert-success");


    // Edit Account HyperLink
    static public void clickOnEditAccountHyperLink() {
        driver.findElement(editAccountHyperLink).click();
    }

    static public boolean isEditAccountHyperLinkDisplayed() {
        return driver.findElement(editAccountHyperLink).isDisplayed();
    }

    // Change Password HyperLink
    static public void clickOnChangePasswordHyperLink() {
        driver.findElement(changePasswordHyperLink).click();
    }

    static public boolean isChangePasswordHyperLinkDisplayed() {
        return driver.findElement(changePasswordHyperLink).isDisplayed();
    }

    // Address Book HyperLink
    static public void clickOnAddressBookHyperLink() {
        driver.findElement(addressBookHyperLink).click();
    }

    static public boolean isAddressBookHyperLinkDisplayed() {
        return driver.findElement(addressBookHyperLink).isDisplayed();
    }

    // Wishlist HyperLink
    static public void clickOnWishlistHyperLink() {
        driver.findElement(wishlistHyperLink).click();
    }

    static public boolean isWishlistHyperLinkDisplayed() {
        return driver.findElement(wishlistHyperLink).isDisplayed();
    }

    // Order History HyperLink
    static public void clickOnOrderHistoryHyperLink() {
        driver.findElement(orderHistoryHyperLink).click();
    }

    static public boolean isOrderHistoryHyperLinkDisplayed() {
        return driver.findElement(orderHistoryHyperLink).isDisplayed();
    }

    // Downloads HyperLink
    static public void clickOnDownloadsHyperLink() {
        driver.findElement(downloadsHyperLink).click();
    }

    static public boolean isDownloadsHyperLinkDisplayed() {
        return driver.findElement(downloadsHyperLink).isDisplayed();
    }

    // Reward HyperLink
    static public void clickOnRewardHyperLink() {
        driver.findElement(rewardHyperLink).click();
    }

    static public boolean isRewardHyperLinkDisplayed() {
        return driver.findElement(rewardHyperLink).isDisplayed();
    }

    // Return Request HyperLink
    static public void clickOnReturnRequestHyperLink() {
        driver.findElement(returnRequestHyperLink).click();
    }

    static public boolean isReturnRequestHyperLinkDisplayed() {
        return driver.findElement(returnRequestHyperLink).isDisplayed();
    }

    // Transactions HyperLink
    static public void clickOnTransactionsHyperLink() {
        driver.findElement(transactionsHyperLink).click();
    }

    static public boolean isTransactionsHyperLinkDisplayed() {
        return driver.findElement(transactionsHyperLink).isDisplayed();
    }

    // Recurring Payments HyperLink
    static public void clickOnRecurringPaymentsHyperLink() {
        driver.findElement(recurringPaymentsHyperLink).click();
    }

    static public boolean isRecurringPaymentsHyperLinkDisplayed() {
        return driver.findElement(recurringPaymentsHyperLink).isDisplayed();
    }

    // Register Affiliate HyperLink
    static public void clickOnRegisterAffiliateHyperLink() {
        driver.findElement(registerAffiliateHyperLink).click();
    }

    static public boolean isRegisterAffiliateHyperLinkDisplayed() {
        return driver.findElement(registerAffiliateHyperLink).isDisplayed();
    }

    // Newsletter HyperLink
    static public void clickOnNewsletterHyperLink() {
        driver.findElement(newsletterHyperLink).click();
    }

    static public boolean isNewsletterHyperLinkDisplayed() {
        return driver.findElement(newsletterHyperLink).isDisplayed();
    }

    // Home Breadcrumb
    static public void clickOnHomeBreadcrumb() {
        driver.findElement(homeBreadcrumb).click();
    }

    static public boolean isHomeBreadcrumbDisplayed() {
        return driver.findElement(homeBreadcrumb).isDisplayed();
    }

    // Account Breadcrumb
    static public void clickOnAccountBreadcrumb() {
        driver.findElement(accountBreadcrumb).click();
    }

    static public boolean isAccountBreadcrumbDisplayed() {
        return driver.findElement(accountBreadcrumb).isDisplayed();
    }

    public static ArrayList<String> getSuccessMessages() {
        List<WebElement> successElements = driver.findElements(successMessage);
        ArrayList<String> success = new ArrayList<>();

        for (WebElement webElement : successElements) {
            success.add(webElement.getText().trim());
        }

        return success;
    }

}
