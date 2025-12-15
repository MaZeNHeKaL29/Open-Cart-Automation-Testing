package pages;

import org.openqa.selenium.By;

import static utils.Driver.driver;

public abstract class BeforeLoginListGroup {

    static public By loginListGroup = By.cssSelector("#column-right .list-group a[href='https://awesomeqa.com/ui/index.php?route=account/login']");

    static public By registerListGroup = By.cssSelector("#column-right .list-group a[href='https://awesomeqa.com/ui/index.php?route=account/register']");

    static public By forgottenPasswordListGroup = By.cssSelector("#column-right .list-group a[href='https://awesomeqa.com/ui/index.php?route=account/forgotten']");

    static public By myAccountListGroup = By.cssSelector("#column-right .list-group a[href='https://awesomeqa.com/ui/index.php?route=account/account']");

    static public By addressBookListGroup = By.cssSelector("#column-right .list-group a[href='https://awesomeqa.com/ui/index.php?route=account/address']");

    static public By wishlistListGroup = By.cssSelector("#column-right .list-group a[href='https://awesomeqa.com/ui/index.php?route=account/wishlist']");

    static public By orderHistoryListGroup = By.cssSelector("#column-right .list-group a[href='https://awesomeqa.com/ui/index.php?route=account/order']");

    static public By rewardPointListGroup = By.cssSelector("#column-right .list-group a[href='https://awesomeqa.com/ui/index.php?route=account/reward']");

    static public By transactionsListGroup = By.cssSelector("#column-right .list-group a[href='https://awesomeqa.com/ui/index.php?route=account/transaction']");

    static public By newsletterListGroup = By.cssSelector("#column-right .list-group a[href='https://awesomeqa.com/ui/index.php?route=account/newsletter']");


    // Login List Group
    static public void clickOnLoginListGroup() {
        driver.findElement(loginListGroup).click();
    }

    static public boolean isLoginListGroupDisplayed() {
        return driver.findElement(loginListGroup).isDisplayed();
    }

    // Register List Group
    static public void clickOnRegisterListGroup() {
        driver.findElement(registerListGroup).click();
    }

    static public boolean isRegisterListGroupDisplayed() {
        return driver.findElement(registerListGroup).isDisplayed();
    }

    // Forgotten Password List Group
    static public void clickOnForgottenPasswordListGroup() {
        driver.findElement(forgottenPasswordListGroup).click();
    }

    static public boolean isForgottenPasswordListGroupDisplayed() {
        return driver.findElement(forgottenPasswordListGroup).isDisplayed();
    }

    // My Account List Group
    static public void clickOnMyAccountListGroup() {
        driver.findElement(myAccountListGroup).click();
    }

    static public boolean isMyAccountListGroupDisplayed() {
        return driver.findElement(myAccountListGroup).isDisplayed();
    }

    // Address Book List Group
    static public void clickOnAddressBookListGroup() {
        driver.findElement(addressBookListGroup).click();
    }

    static public boolean isAddressBookListGroupDisplayed() {
        return driver.findElement(addressBookListGroup).isDisplayed();
    }

    // Wishlist List Group
    static public void clickOnWishlistListGroup() {
        driver.findElement(wishlistListGroup).click();
    }

    static public boolean isWishlistListGroupDisplayed() {
        return driver.findElement(wishlistListGroup).isDisplayed();
    }

    // Order History List Group
    static public void clickOnOrderHistoryListGroup() {
        driver.findElement(orderHistoryListGroup).click();
    }

    static public boolean isOrderHistoryListGroupDisplayed() {
        return driver.findElement(orderHistoryListGroup).isDisplayed();
    }

    // Reward Point List Group
    static public void clickOnRewardPointListGroup() {
        driver.findElement(rewardPointListGroup).click();
    }

    static public boolean isRewardPointListGroupDisplayed() {
        return driver.findElement(rewardPointListGroup).isDisplayed();
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

}
