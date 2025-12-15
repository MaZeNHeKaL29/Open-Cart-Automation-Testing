package pages;

import org.openqa.selenium.By;

import static utils.Driver.driver;


public class CartPage {

    static public By checkoutButton = By.cssSelector(".btn[href*='checkout']");

    static public By continueShoppingButton = By.cssSelector(".btn[href*='home']");

    static public By removeItemFromCart = By.cssSelector(".btn.btn-danger[onclick*='remove'][data-toggle='tooltip']");

    static public By quantityItemValue = By.cssSelector("input[type='text'][name*='quantity']");

    static public By updateItemQuantity = By.cssSelector(".btn.btn-primary[data-original-title*='Update'][data-toggle='tooltip']");


    static public void clickOnCheckoutButton() {
        driver.findElement(checkoutButton).click();
    }

    static public boolean isCheckoutButtonDisplayed() {
        return driver.findElement(checkoutButton).isDisplayed();
    }

    static public void clickOncContinueShoppingButton() {
        driver.findElement(continueShoppingButton).click();
    }

    static public boolean isContinueShoppingButtonDisplayed() {
        return driver.findElement(continueShoppingButton).isDisplayed();
    }

    static public void removeItemFromCart(int itemNumber) {
        driver.findElements(removeItemFromCart).get(itemNumber - 1).click();
    }

    static public void clearQuantityItemValue(int itemNumber) {
        driver.findElements(quantityItemValue).get(itemNumber - 1).clear();
    }

    static public void changeQuantityItemValue(int itemNumber,int quantity) {
        driver.findElements(quantityItemValue).get(itemNumber - 1).sendKeys(Integer.toString(quantity));
    }

    static public void updateItemQuantity(int itemNumber) {
        driver.findElements(updateItemQuantity).get(itemNumber - 1).click();
    }
}
