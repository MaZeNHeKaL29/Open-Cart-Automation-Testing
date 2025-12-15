package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Url;

import java.time.Duration;

import static utils.Driver.driver;

public class CheckoutPage {

    static public String url =Url.checkout;

    static public By firstName = By.cssSelector("[name='firstname']");

    static public By lastName = By.cssSelector("[name='lastname']");

    static public By company = By.cssSelector("[name='company']");

    static public By address_1 = By.cssSelector("[name='address_1']");

    static public By address_2 = By.cssSelector("[name='address_2']");

    static public By city = By.cssSelector("[name='city']");

    static public By postCode = By.cssSelector("[name='postcode']");

    static public By country = By.cssSelector("[name='country_id']");

    static public By region = By.cssSelector("[name='zone_id']");

    static public By continueDetailsButton = By.cssSelector("#button-payment-address[value='Continue']");

    static public void sendKeysToFirstName(String value) {
        waitForVisible(firstName);
        driver.findElement(firstName).sendKeys(value);
    }

    static public void sendKeysToLastName(String value) {
        waitForVisible(lastName);
        driver.findElement(lastName).sendKeys(value);
    }

    static public void sendKeysToCompany(String value) {
        waitForVisible(company);
        driver.findElement(company).sendKeys(value);
    }

    static public void sendKeysToAddress1(String value) {
        waitForVisible(address_1);
        driver.findElement(address_1).sendKeys(value);
    }

    static public void sendKeysToAddress2(String value) {
        waitForVisible(address_2);
        driver.findElement(address_2).sendKeys(value);
    }

    static public void sendKeysToCity(String value) {
        waitForVisible(city);
        driver.findElement(city).sendKeys(value);
    }

    static public void sendKeysToPostCode(String value) {
        waitForVisible(postCode);
        driver.findElement(postCode).sendKeys(value);
    }


    static public void selectCountry(String countryName) {
        waitForVisible(country);
        Select select = new Select(driver.findElement(country));
        select.selectByVisibleText(countryName);
    }

    static public void clickOnRegion() {
        waitForVisible(region);
        driver.findElement(region).click();
    }

    static public void selectRegion(int index) {
        waitForVisible(region);
        Select select = new Select(driver.findElement(region));
        select.selectByIndex(index + 1);
    }


    static public void clickOnContinueDetailsButton() {
        driver.findElement(continueDetailsButton).click();
    }

    static private void waitForVisible(By element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }


}
