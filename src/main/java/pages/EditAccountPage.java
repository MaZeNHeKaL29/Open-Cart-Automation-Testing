package pages;

import org.openqa.selenium.By;
import utils.Url;

import static utils.Driver.driver;


public class EditAccountPage extends AfterLoginListGroup{

    static public String url = Url.editAccount;

    static public By firstName = By.cssSelector("#input-firstname");

    static public By lastName = By.cssSelector("#input-lastname");

    static public By email = By.cssSelector("#input-email");

    static public By telephone = By.cssSelector("#input-telephone");

    static public By continueButton = By.cssSelector("#content .btn[value='Continue']");

    static public By backButton = By.cssSelector("#content .pull-left .btn");

    static public void sendKeysToFirstName(String value) {
        driver.findElement(firstName).sendKeys(value);
    }

    static public void clearFirstName() {
        driver.findElement(firstName).clear();
    }

    static public void sendKeysToLastName(String value) {
        driver.findElement(lastName).sendKeys(value);
    }

    static public void clearLastName() {
        driver.findElement(lastName).clear();
    }

    static public void sendKeysToEmail(String value) {
        driver.findElement(email).sendKeys(value);
    }

    static public void clearEmail() {
        driver.findElement(email).clear();
    }

    static public void sendKeysToTelephone(String value) {
        driver.findElement(telephone).sendKeys(value);
    }

    static public void clearTelephone() {
        driver.findElement(telephone).clear();
    }

    static public void clickOnContinueButton() {
        driver.findElement(continueButton).click();
    }

    static public void clickOnBackButton() {
        driver.findElement(backButton).click();
    }



}
