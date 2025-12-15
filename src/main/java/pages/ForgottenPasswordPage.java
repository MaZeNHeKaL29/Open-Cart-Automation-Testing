package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static utils.Driver.driver;

public class ForgottenPasswordPage extends BeforeLoginListGroup{

    static public String url = "https://awesomeqa.com/ui/index.php?route=account/forgotten";

    static public By homeBreadcrumb = By.cssSelector("#account-forgotten .breadcrumb a[href='https://awesomeqa.com/ui/index.php?route=common/home']");

    static public By accountBreadcrumb = By.cssSelector("#account-forgotten .breadcrumb a[href='https://awesomeqa.com/ui/index.php?route=account/account']");

    static public By forgottenPasswordBreadcrumb = By.cssSelector("#account-forgotten .breadcrumb a[href='https://awesomeqa.com/ui/index.php?route=account/forgotten']");


    static public By emailForm = By.cssSelector("#input-email");

    static public By continueButton = By.cssSelector(".pull-right input.btn[type='submit'][value='Continue']");

    static public By backButton = By.cssSelector(".pull-left a[href='https://awesomeqa.com/ui/index.php?route=account/login']");

    static public By errorMessage = By.cssSelector(".alert-danger");

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

    // Login Breadcrumb
    static public void clickOnForgottenPasswordBreadcrumb() {
        driver.findElement(forgottenPasswordBreadcrumb).click();
    }

    static public boolean isForgottenPasswordBreadcrumbDisplayed() {
        return driver.findElement(forgottenPasswordBreadcrumb).isDisplayed();
    }

    // Email
    static public void sendKeysToEmailForm(String value) {
        driver.findElement(emailForm).sendKeys(value);
    }

    static public boolean isEmailFormDisplayed() {
        return driver.findElement(emailForm).isDisplayed();
    }

    // Continue Button
    static public void clickOnContinueButton() {
        driver.findElement(continueButton).click();
    }

    static public boolean isContinueButtonDisplayed() {
        return driver.findElement(continueButton).isDisplayed();
    }

    // Back Button
    static public void clickOnBackButton() {
        driver.findElement(backButton).click();
    }

    static public boolean isBackButtonDisplayed() {
        return driver.findElement(backButton).isDisplayed();
    }

    public static ArrayList<String> getErrorMessages() {
        List<WebElement> errorElements = driver.findElements(errorMessage);
        ArrayList<String> errors = new ArrayList<>();

        for (WebElement webElement : errorElements) {
            errors.add(webElement.getText().trim());
        }

        return errors;
    }

}
