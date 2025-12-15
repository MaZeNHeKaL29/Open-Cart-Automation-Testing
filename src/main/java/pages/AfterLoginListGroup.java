package pages;

import org.openqa.selenium.By;

import static utils.Driver.driver;

public abstract class AfterLoginListGroup {

    static public By myAccountListGroup = By.cssSelector("#column-right .list-group a[href='https://awesomeqa.com/ui/index.php?route=account/account']");

    static public By editListGroup = By.cssSelector("#column-right .list-group a[href='https://awesomeqa.com/ui/index.php?route=account/edit']");

    static public By passwordListGroup = By.cssSelector("#column-right .list-group a[href='https://awesomeqa.com/ui/index.php?route=account/password']");

    static public By addressBookListGroup = By.cssSelector("#column-right .list-group a[href='https://awesomeqa.com/ui/index.php?route=account/address']");

    static public By wishListListGroup = By.cssSelector("#column-right .list-group a[href='https://awesomeqa.com/ui/index.php?route=account/wishlist']");

    static public By orderHistoryListGroup = By.cssSelector("#column-right .list-group a[href='https://awesomeqa.com/ui/index.php?route=account/order']");

    static public By downloadsListGroup = By.cssSelector("#column-right .list-group a[href='https://awesomeqa.com/ui/index.php?route=account/download']");

    static public By recurringPaymentsListGroup = By.cssSelector("#column-right .list-group a[href='https://awesomeqa.com/ui/index.php?route=account/recurring']");

    static public By rewardPointsListGroup = By.cssSelector("#column-right .list-group a[href='https://awesomeqa.com/ui/index.php?route=account/reward']");

    static public By returnsListGroup = By.cssSelector("#column-right .list-group a[href='https://awesomeqa.com/ui/index.php?route=account/return']");

    static public By transactionsListGroup = By.cssSelector("#column-right .list-group a[href='https://awesomeqa.com/ui/index.php?route=account/transaction']");

    static public By newsletterListGroup = By.cssSelector("#column-right .list-group a[href='https://awesomeqa.com/ui/index.php?route=account/newsletter']");

    static public By logoutListGroup = By.cssSelector("#column-right .list-group a[href='https://awesomeqa.com/ui/index.php?route=account/logout']");


    // My Account List Group
    static public void clickOnMyAccountListGroup() {
        driver.findElement(myAccountListGroup).click();
    }

    static public boolean isMyAccountListGroupDisplayed() {
        return driver.findElement(myAccountListGroup).isDisplayed();
    }

    // Edit List Group
    static public void clickOnEditListGroup() {
        driver.findElement(editListGroup).click();
    }

    static public boolean isEditListGroupDisplayed() {
        return driver.findElement(editListGroup).isDisplayed();
    }

    // Password List Group
    static public void clickOnPasswordListGroup() {
        driver.findElement(passwordListGroup).click();
    }

    static public boolean isPasswordListGroupDisplayed() {
        return driver.findElement(passwordListGroup).isDisplayed();
    }

    // Address Book List Group
    static public void clickOnAddressBookListGroup() {
        driver.findElement(addressBookListGroup).click();
    }

    static public boolean isAddressBookListGroupDisplayed() {
        return driver.findElement(addressBookListGroup).isDisplayed();
    }

    // Wish List List Group
    static public void clickOnWishListListGroup() {
        driver.findElement(wishListListGroup).click();
    }

    static public boolean isWishListListGroupDisplayed() {
        return driver.findElement(wishListListGroup).isDisplayed();
    }

    // Order History List Group
    static public void clickOnOrderHistoryListGroup() {
        driver.findElement(orderHistoryListGroup).click();
    }

    static public boolean isOrderHistoryListGroupDisplayed() {
        return driver.findElement(orderHistoryListGroup).isDisplayed();
    }

    // Downloads List Group
    static public void clickOnDownloadsListGroup() {
        driver.findElement(downloadsListGroup).click();
    }

    static public boolean isDownloadsListGroupDisplayed() {
        return driver.findElement(downloadsListGroup).isDisplayed();
    }

    // Recurring Payments List Group
    static public void clickOnRecurringPaymentsListGroup() {
        driver.findElement(recurringPaymentsListGroup).click();
    }

    static public boolean isRecurringPaymentsListGroupDisplayed() {
        return driver.findElement(recurringPaymentsListGroup).isDisplayed();
    }

    // Reward Points List Group
    static public void clickOnRewardPointsListGroup() {
        driver.findElement(rewardPointsListGroup).click();
    }

    static public boolean isRewardPointsListGroupDisplayed() {
        return driver.findElement(rewardPointsListGroup).isDisplayed();
    }

    // Returns List Group
    static public void clickOnReturnsListGroup() {
        driver.findElement(returnsListGroup).click();
    }

    static public boolean isReturnsListGroupDisplayed() {
        return driver.findElement(returnsListGroup).isDisplayed();
    }

    // Transactions List Group
    static public void clickOnTransactionsListGroup() {
        driver.findElement(transactionsListGroup).click();
    }

    static public boolean isTransactionsListGroupDisplayed() {
        return driver.findElement(transactionsListGroup).isDisplayed();
    }

    // Newsletter List Group
    static public void clickOnNewsletterListGroup() {
        driver.findElement(newsletterListGroup).click();
    }

    static public boolean isNewsletterListGroupDisplayed() {
        return driver.findElement(newsletterListGroup).isDisplayed();
    }

    // Logout List Group
    static public void clickOnLogoutListGroup() {
        driver.findElement(logoutListGroup).click();
    }

    static public boolean isLogoutListGroupDisplayed() {
        return driver.findElement(logoutListGroup).isDisplayed();
    }


}
