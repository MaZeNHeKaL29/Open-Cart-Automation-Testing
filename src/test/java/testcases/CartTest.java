package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HeaderComponent;
import pages.HomePage;
import pages.SearchPage;
import utils.Url;

import static utils.Driver.driver;


public class CartTest extends TestSuiteSetup{

    @Test(priority = 1)
    public void addFirstItemInHomeToCartAndThenRemoveTest() {
        driver.get(Url.home);
        HomePage.addItemToCart(1);
        driver.get(Url.cart);
        Assert.assertTrue(CartPage.isCheckoutButtonDisplayed());
        CartPage.removeItemFromCart(1);
    }

    @Test(priority = 1)
    public void addThirdItemInHomeToCartAndThenRemoveTest() {
        driver.get(Url.home);
        HomePage.addItemToCart(3);
        driver.get(Url.cart);
        driver.get(Url.cart);
        Assert.assertTrue(CartPage.isCheckoutButtonDisplayed());
        CartPage.removeItemFromCart(1);
    }

    @Test(priority = 1)
    public void searchAndAddItemToCartAndThenRemoveTest() {
        driver.get(Url.home);
        HeaderComponent.sendKeysToSearchInputText("macbook");
        SearchPage.addItemToCart(1);
        driver.get(Url.cart);
        Assert.assertTrue(CartPage.isCheckoutButtonDisplayed());
        CartPage.removeItemFromCart(1);
    }

    @Test(priority = 1)
    public void updateQuantityInCartAndThenRemoveTest() {
        driver.get(Url.home);
        HomePage.addItemToCart(1);
        driver.get(Url.cart);
        Assert.assertTrue(CartPage.isCheckoutButtonDisplayed());
        CartPage.clearQuantityItemValue(1);
        CartPage.changeQuantityItemValue(1,3);
        CartPage.updateItemQuantity(1);
    }


}
