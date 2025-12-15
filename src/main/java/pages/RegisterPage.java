package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static utils.Driver.driver;

public class RegisterPage extends BeforeLoginListGroup{

    static public String url = "https://awesomeqa.com/ui/index.php?route=account/register";

    static public By homeBreadcrumb = By.cssSelector("#account-register .breadcrumb a[href='https://awesomeqa.com/ui/index.php?route=common/home']");

    static public By accountBreadcrumb = By.cssSelector("#account-register .breadcrumb a[href='https://awesomeqa.com/ui/index.php?route=account/account']");

    static public By registerBreadcrumb = By.cssSelector("#account-register .breadcrumb a[href='https://awesomeqa.com/ui/index.php?route=account/register']");

    static public By loginPageHyperLinkForm = By.cssSelector("#content a[href='https://awesomeqa.com/ui/index.php?route=account/login']");

    static public By firstNameForm = By.cssSelector("#input-firstname");

    static public By lastNameForm = By.cssSelector("#input-lastname");

    static public By emailForm = By.cssSelector("#input-email");

    static public By telephoneForm = By.cssSelector("#input-telephone");

    static public By passwordForm = By.cssSelector("#input-password");

    static public By confirmPasswordForm = By.cssSelector("#input-confirm");

    static public By subscribeToNewsletterYesRadioButton = By.xpath("//input[@type='radio' and @name='newsletter' and @value='1']");

    static public By subscribeToNewsletterNoRadioButton = By.xpath("//input[@type='radio' and @name='newsletter' and @value='0']");

    static public By agreeToPrivacyPolicyCheckbox = By.xpath("//input[@type='checkbox' and @name='agree' and @value='1']");

    static public By continueButton = By.xpath("//input[@type='submit' and @value='Continue']");

    static public By errorMessage = By.cssSelector(".text-danger");

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

    // Register Breadcrumb
    static public void clickOnRegisterBreadcrumb() {
        driver.findElement(registerBreadcrumb).click();
    }

    static public boolean isRegisterBreadcrumbDisplayed() {
        return driver.findElement(registerBreadcrumb).isDisplayed();
    }

    // Login Page Hyperlink Form
    static public void clickOnLoginPageHyperLinkForm() {
        driver.findElement(loginPageHyperLinkForm).click();
    }

    static public boolean isLoginPageHyperLinkFormDisplayed() {
        return driver.findElement(loginPageHyperLinkForm).isDisplayed();
    }

    // First Name
    static public void sendKeysToFirstNameForm(String value) {
        driver.findElement(firstNameForm).sendKeys(value);
    }

    static public boolean isFirstNameFormDisplayed() {
        return driver.findElement(firstNameForm).isDisplayed();
    }

    // Last Name
    static public void sendKeysToLastNameForm(String value) {
        driver.findElement(lastNameForm).sendKeys(value);
    }

    static public boolean isLastNameFormDisplayed() {
        return driver.findElement(lastNameForm).isDisplayed();
    }

    // Email
    static public void sendKeysToEmailForm(String value) {
        driver.findElement(emailForm).sendKeys(value);
    }

    static public boolean isEmailFormDisplayed() {
        return driver.findElement(emailForm).isDisplayed();
    }

    // Telephone
    static public void sendKeysToTelephoneForm(String value) {
        driver.findElement(telephoneForm).sendKeys(value);
    }

    static public boolean isTelephoneFormDisplayed() {
        return driver.findElement(telephoneForm).isDisplayed();
    }

    // Password
    static public void sendKeysToPasswordForm(String value) {
        driver.findElement(passwordForm).sendKeys(value);
    }

    static public boolean isPasswordFormDisplayed() {
        return driver.findElement(passwordForm).isDisplayed();
    }

    // Confirm Password
    static public void sendKeysToConfirmPasswordForm(String value) {
        driver.findElement(confirmPasswordForm).sendKeys(value);
    }

    static public boolean isConfirmPasswordFormDisplayed() {
        return driver.findElement(confirmPasswordForm).isDisplayed();
    }

    // Continue Button
    static public void clickOnContinueButton() {
        driver.findElement(continueButton).click();
    }

    static public boolean isContinueButtonDisplayed() {
        return driver.findElement(continueButton).isDisplayed();
    }

    // Subscribe To Newsletter Yes Radio Button
    static public void clickOnSubscribeToNewsletterYesRadioButton() {
        driver.findElement(subscribeToNewsletterYesRadioButton).click();
    }

    static public boolean isSubscribeToNewsletterYesRadioButtonDisplayed() {
        return driver.findElement(subscribeToNewsletterYesRadioButton).isDisplayed();
    }

    static public boolean isSubscribeToNewsletterYesRadioButtonSelected() {
        return driver.findElement(subscribeToNewsletterYesRadioButton).isSelected();
    }

    // Subscribe To Newsletter No Radio Button
    static public void clickOnSubscribeToNewsletterNoRadioButton() {
        driver.findElement(subscribeToNewsletterNoRadioButton).click();
    }

    static public boolean isSubscribeToNewsletterNoRadioButtonDisplayed() {
        return driver.findElement(subscribeToNewsletterNoRadioButton).isDisplayed();
    }

    static public boolean isSubscribeToNewsletterNoRadioButtonSelected() {
        return driver.findElement(subscribeToNewsletterNoRadioButton).isSelected();
    }

    // Agree To Privacy Policy Checkbox
    static public void clickOnAgreeToPrivacyPolicyCheckbox() {
        driver.findElement(agreeToPrivacyPolicyCheckbox).click();
    }

    static public boolean isAgreeToPrivacyPolicyCheckboxDisplayed() {
        return driver.findElement(agreeToPrivacyPolicyCheckbox).isDisplayed();
    }

    static public boolean isAgreeToPrivacyPolicyCheckboxSelected() {
        return driver.findElement(agreeToPrivacyPolicyCheckbox).isSelected();
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
