package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static utils.Driver.driver;


public class HomePage {

    static public By addToCartButton = By.cssSelector(".button-group button[onclick*='cart.add']");

    static public By addToWishlistButton = By.cssSelector(".button-group button[onclick*='wishlist.add']");

    static public By addToCompareButton = By.cssSelector(".button-group button[onclick*='compare.add']");

    static public void addItemToCart(int itemNumber) {
        driver.findElements(addToCartButton).get(itemNumber - 1).click();
    }

    static public void addItemToWishlist(int itemNumber) {
        driver.findElements(addToWishlistButton).get(itemNumber - 1).click();
    }

    static public void addItemToCompare(int itemNumber) {
        driver.findElements(addToCompareButton).get(itemNumber - 1).click();
    }
}
