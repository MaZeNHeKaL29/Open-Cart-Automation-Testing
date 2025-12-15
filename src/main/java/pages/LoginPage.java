package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static utils.Driver.driver;

public class LoginPage extends BeforeLoginListGroup{

    static public String url = "https://awesomeqa.com/ui/index.php?route=account/login";

    static public By homeBreadcrumb = By.cssSelector("#account-login .breadcrumb a[href='https://awesomeqa.com/ui/index.php?route=common/home']");

    static public By accountBreadcrumb = By.cssSelector("#account-login .breadcrumb a[href='https://awesomeqa.com/ui/index.php?route=account/account']");

    static public By loginBreadcrumb = By.cssSelector("#account-login .breadcrumb a[href='https://awesomeqa.com/ui/index.php?route=account/login']");

    static public By emailForm = By.cssSelector("#input-email");

    static public By passwordForm = By.cssSelector("#input-password");

    static public By forgottenPasswordHyperLinkForm = By.cssSelector(".form-group a[href='https://awesomeqa.com/ui/index.php?route=account/forgotten']");

    static public By loginButton = By.cssSelector("input.btn[type='submit'][value='Login']");

    static public By continueRegisterButton = By.cssSelector(".well .btn[href='https://awesomeqa.com/ui/index.php?route=account/register']");

    static public By errorMessage = By.cssSelector(".alert-danger");

    static public By successMessage = By.cssSelector(".alert-success");

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
    static public void clickOnLoginBreadcrumb() {
        driver.findElement(loginBreadcrumb).click();
    }

    static public boolean isLoginBreadcrumbDisplayed() {
        return driver.findElement(loginBreadcrumb).isDisplayed();
    }


    // Forgotten Password Hyperlink Form
    static public void clickOnForgottenPasswordHyperLinkForm() {
        driver.findElement(forgottenPasswordHyperLinkForm).click();
    }

    static public boolean isForgottenPasswordHyperLinkFormDisplayed() {
        return driver.findElement(forgottenPasswordHyperLinkForm).isDisplayed();
    }

    // Email
    static public void sendKeysToEmailForm(String value) {
        driver.findElement(emailForm).sendKeys(value);
    }

    static public boolean isEmailFormDisplayed() {
        return driver.findElement(emailForm).isDisplayed();
    }

    // Password
    static public void sendKeysToPasswordForm(String value) {
        driver.findElement(passwordForm).sendKeys(value);
    }

    static public boolean isPasswordFormDisplayed() {
        return driver.findElement(passwordForm).isDisplayed();
    }

    // Login Button
    static public void clickOnLoginButton() {
        driver.findElement(loginButton).click();
    }

    static public boolean isLoginButtonDisplayed() {
        return driver.findElement(loginButton).isDisplayed();
    }

    // Continue Register Button
    static public void clickOnContinueRegisterButton() {
        driver.findElement(continueRegisterButton).click();
    }

    static public boolean isContinueRegisterButtonDisplayed() {
        return driver.findElement(continueRegisterButton).isDisplayed();
    }

    public static ArrayList<String> getErrorMessages() {
        List<WebElement> errorElements = driver.findElements(errorMessage);
        ArrayList<String> errors = new ArrayList<>();

        for (WebElement webElement : errorElements) {
            errors.add(webElement.getText().trim());
        }

        return errors;
    }

    public static ArrayList<String> getSuccessMessages() {
        List<WebElement> errorElements = driver.findElements(successMessage);
        ArrayList<String> errors = new ArrayList<>();

        for (WebElement webElement : errorElements) {
            errors.add(webElement.getText().trim());
        }

        return errors;
    }

}
