package pages;

import org.openqa.selenium.By;

import static utils.Driver.driver;

public class FooterComponent {
    static public String url = "https://awesomeqa.com/ui/index.php?route=common/home";

    static public By informationAboutUs = By.cssSelector("body > footer > div > div > div:nth-child(1) > ul > li:nth-child(1) > a");

    static public By informationDeliveryInformation = By.cssSelector("body > footer > div > div > div:nth-child(1) > ul > li:nth-child(2) > a");

    static public By informationPrivacyPolicy = By.cssSelector("body > footer > div > div > div:nth-child(1) > ul > li:nth-child(3) > a");

    static public By informationTerms_Conditions = By.cssSelector("body > footer > div > div > div:nth-child(1) > ul > li:nth-child(4) > a");

    static public By customerServiceContactUs = By.cssSelector("body > footer > div > div > div:nth-child(2) > ul > li:nth-child(1) > a");

    static public By customerServiceReturns = By.cssSelector("body > footer > div > div > div:nth-child(2) > ul > li:nth-child(2) > a");

    static public By customerServiceSiteMap = By.cssSelector("body > footer > div > div > div:nth-child(2) > ul > li:nth-child(3) > a");

    static public By extrasBrands = By.cssSelector("body > footer > div > div > div:nth-child(3) > ul > li:nth-child(1) > a");

    static public By extrasGiftCertificates = By.cssSelector("body > footer > div > div > div:nth-child(3) > ul > li:nth-child(2) > a");

    static public By extrasAffiliate = By.cssSelector("body > footer > div > div > div:nth-child(3) > ul > li:nth-child(3) > a");

    static public By extrasSpecials = By.cssSelector("body > footer > div > div > div:nth-child(3) > ul > li:nth-child(4) > a");

    static public By myAccountMyAccount = By.cssSelector("body > footer > div > div > div:nth-child(4) > ul > li:nth-child(1) > a");

    static public By myAccountOrderHistory = By.cssSelector("body > footer > div > div > div:nth-child(4) > ul > li:nth-child(2) > a");

    static public By myAccountWishList = By.cssSelector("body > footer > div > div > div:nth-child(4) > ul > li:nth-child(3) > a");

    static public By myAccountNewsletter = By.cssSelector("body > footer > div > div > div:nth-child(4) > ul > li:nth-child(4) > a");

    static public By openCart = By.cssSelector("body > footer > div > p > a");

    static public void clickOnInformationAboutUs() {
        driver.findElement(informationAboutUs).click();
    }

    static public void clickOnInformationDeliveryInformation() {
        driver.findElement(informationDeliveryInformation).click();
    }

    static public void clickOnInformationPrivacyPolicy() {
        driver.findElement(informationPrivacyPolicy).click();
    }

    static public void clickOnInformationTerms_Conditions() {
        driver.findElement(informationTerms_Conditions).click();
    }

    static public void clickOnCustomerServiceContactUs() {
        driver.findElement(customerServiceContactUs).click();
    }

    static public void clickOnCustomerServiceReturns() {
        driver.findElement(customerServiceReturns).click();
    }

    // Customer Service - Site Map
    static public void clickOnCustomerServiceSiteMap() {
        driver.findElement(customerServiceSiteMap).click();
    }

    static public void clickOnExtrasBrands() {
        driver.findElement(extrasBrands).click();
    }

    static public void clickOnExtrasGiftCertificates() {
        driver.findElement(extrasGiftCertificates).click();
    }

    static public void clickOnExtrasAffiliate() {
        driver.findElement(extrasAffiliate).click();
    }

    static public void clickOnExtrasSpecials() {
        driver.findElement(extrasSpecials).click();
    }

    static public void clickOnMyAccountMyAccount() {
        driver.findElement(myAccountMyAccount).click();
    }

    static public void clickOnMyAccountOrderHistory() {
        driver.findElement(myAccountOrderHistory).click();
    }

    static public void clickOnMyAccountWishList() {
        driver.findElement(myAccountWishList).click();
    }

    static public void clickOnMyAccountNewsletter() {
        driver.findElement(myAccountNewsletter).click();
    }

    static public void clickOnOpenCart() {
        driver.findElement(openCart).click();
    }


}
