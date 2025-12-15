package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static utils.Driver.driver;

import java.time.Duration;

public class HeaderComponent {
    static public String url = "https://awesomeqa.com/ui/index.php?route=common/home";

    static public By currencyDropdown = By.cssSelector(".btn.btn-link.dropdown-toggle");

    static public By currencyEuro = By.cssSelector("[name='EUR']");

    static public By currencyPoundSterling = By.cssSelector("[name='GBP']");

    static public By currencyUSDollar = By.cssSelector("[name='USD']");

    static public By cartTotalText = By.cssSelector("#cart-total");

    static public By contactButton = By.cssSelector(".fa-phone");

    static public By userButton = By.cssSelector(".fa-user");

    static public By userRegister = By.cssSelector("#top-links > ul > li.dropdown.open > ul > li:nth-child(1) > a");

    static public By userLogin = By.cssSelector("#top-links > ul > li.dropdown.open > ul > li:nth-child(2) > a");

    static public By userMyAccount = By.cssSelector("#top-links > ul > li.dropdown.open > ul > li:nth-child(1) > a");

    static public By userOrderHistory = By.cssSelector("#top-links > ul > li.dropdown.open > ul > li:nth-child(2) > a");

    static public By userTransactions = By.cssSelector("#top-links > ul > li.dropdown.open > ul > li:nth-child(3) > a");

    static public By userDownloads = By.cssSelector("#top-links > ul > li.dropdown.open > ul > li:nth-child(4) > a");

    static public By userLogout = By.cssSelector("#top-links > ul > li.dropdown.open > ul > li:nth-child(5) > a");

    static public By wishlistButton = By.cssSelector(".fa-heart");

    static public By cartButton = By.cssSelector(".fa-shopping-cart");

    static public By checkoutButton = By.cssSelector(".fa-share");

    static public By openCartHomLogo = By.cssSelector("[title='TheTestingAcademy eCommerce']");

    static public By cartTotalButton = By.cssSelector(".btn.btn-inverse.btn-block.btn-lg.dropdown-toggle");

    static public By cartTotalDropdown = By.cssSelector("#cart > ul");

    static public By categoriesNavBar = By.cssSelector(".fa.fa-bars");

    static public By searchInputText = By.cssSelector("#search > [name='search']");

    static public By searchButton = By.cssSelector("#search  [type='button']");

    static public By categoryDesktop = By.cssSelector("#menu .dropdown:nth-child(1) > a");

    static public By categoryDesktopPC = By.cssSelector("#menu [href='https://awesomeqa.com/ui/index.php?route=product/category&path=20_26']");

    static public By categoryDesktopMac = By.cssSelector("#menu [href='https://awesomeqa.com/ui/index.php?route=product/category&path=20_27']");

    static public By categoryShowAllDesktops = By.cssSelector("#menu > div.collapse.navbar-collapse.navbar-ex1-collapse > ul > li:nth-child(1) > div > a");

    static public By categoryLaptops_Notebooks = By.cssSelector("#menu .dropdown:nth-child(2) > a");

    static public By categoryLaptops_NotebooksMacs = By.cssSelector("#menu [href='https://awesomeqa.com/ui/index.php?route=product/category&path=18_46']");

    static public By categoryLaptops_NotebooksWindows = By.cssSelector("#menu > div.collapse.navbar-collapse.navbar-ex1-collapse > ul > li:nth-child(2) > div > div > ul > li:nth-child(2) > a");

    static public By categoryShowAllLaptopsAndNotebooks = By.cssSelector("#menu > div.collapse.navbar-collapse.navbar-ex1-collapse > ul > li:nth-child(2) > div > a");

    static public By categoryComponents = By.cssSelector("#menu .dropdown:nth-child(3) > a");

    static public By categoryComponentsMiceAndTrackballs = By.cssSelector("#menu > div.collapse.navbar-collapse.navbar-ex1-collapse > ul > li:nth-child(3) > div > div > ul > li:nth-child(1) > a");

    static public By categoryComponentsMonitors = By.cssSelector("#menu > div.collapse.navbar-collapse.navbar-ex1-collapse > ul > li:nth-child(3) > div > div > ul > li:nth-child(2) > a");

    static public By categoryComponentsPrinters = By.cssSelector("#menu > div.collapse.navbar-collapse.navbar-ex1-collapse > ul > li:nth-child(3) > div > div > ul > li:nth-child(3) > a");

    static public By categoryComponentsScanners = By.cssSelector("#menu > div.collapse.navbar-collapse.navbar-ex1-collapse > ul > li:nth-child(3) > div > div > ul > li:nth-child(4) > a");

    static public By categoryComponentsWebCameras = By.cssSelector("#menu > div.collapse.navbar-collapse.navbar-ex1-collapse > ul > li:nth-child(3) > div > div > ul > li:nth-child(5) > a");

    static public By categoryShowAllComponents = By.cssSelector("#menu > div.collapse.navbar-collapse.navbar-ex1-collapse > ul > li:nth-child(3) > div > a");

    static public By categoryTablets = By.cssSelector("#menu [href='https://awesomeqa.com/ui/index.php?route=product/category&path=57']");

    static public By categorySoftware = By.cssSelector("#menu [href='https://awesomeqa.com/ui/index.php?route=product/category&path=17']");

    static public By categoryPhones_PDAs = By.cssSelector("#menu [href='https://awesomeqa.com/ui/index.php?route=product/category&path=24']");

    static public By categoryCameras = By.cssSelector("#menu [href='https://awesomeqa.com/ui/index.php?route=product/category&path=33']");

    static public By categoryMP3Players = By.cssSelector("#menu .dropdown .dropdown-toggle[href='https://awesomeqa.com/ui/index.php?route=product/category&path=34']");

    static public By categoryMP3Playerstest11 = By.cssSelector("#menu > div.collapse.navbar-collapse.navbar-ex1-collapse > ul > li:nth-child(8) > div > div > ul:nth-child(1) > li:nth-child(1) > a");

    static public By categoryMP3Playerstest12 = By.cssSelector("#menu > div.collapse.navbar-collapse.navbar-ex1-collapse > ul > li:nth-child(8) > div > div > ul:nth-child(1) > li:nth-child(2) > a");

    static public By categoryMP3Playerstest15 = By.cssSelector("#menu > div.collapse.navbar-collapse.navbar-ex1-collapse > ul > li:nth-child(8) > div > div > ul:nth-child(1) > li:nth-child(3) > a");

    static public By categoryMP3Playerstest16 = By.cssSelector("#menu > div.collapse.navbar-collapse.navbar-ex1-collapse > ul > li:nth-child(8) > div > div > ul:nth-child(1) > li:nth-child(4) > a");

    static public By categoryMP3Playerstest17 = By.cssSelector("#menu > div.collapse.navbar-collapse.navbar-ex1-collapse > ul > li:nth-child(8) > div > div > ul:nth-child(1) > li:nth-child(5) > a");

    static public By categoryMP3Playerstest18 = By.cssSelector("#menu > div.collapse.navbar-collapse.navbar-ex1-collapse > ul > li:nth-child(8) > div > div > ul:nth-child(2) > li:nth-child(1) > a");

    static public By categoryMP3Playerstest19 = By.cssSelector("#menu > div.collapse.navbar-collapse.navbar-ex1-collapse > ul > li:nth-child(8) > div > div > ul:nth-child(2) > li:nth-child(2) > a");

    static public By categoryMP3Playerstest20 = By.cssSelector("#menu > div.collapse.navbar-collapse.navbar-ex1-collapse > ul > li:nth-child(8) > div > div > ul:nth-child(2) > li:nth-child(3) > a");

    static public By categoryMP3Playerstest21 = By.cssSelector("#menu > div.collapse.navbar-collapse.navbar-ex1-collapse > ul > li:nth-child(8) > div > div > ul:nth-child(2) > li:nth-child(4) > a");

    static public By categoryMP3Playerstest22 = By.cssSelector("#menu > div.collapse.navbar-collapse.navbar-ex1-collapse > ul > li:nth-child(8) > div > div > ul:nth-child(2) > li:nth-child(5) > a");

    static public By categoryMP3Playerstest23 = By.cssSelector("#menu > div.collapse.navbar-collapse.navbar-ex1-collapse > ul > li:nth-child(8) > div > div > ul:nth-child(3) > li:nth-child(1) > a");

    static public By categoryMP3Playerstest24 = By.cssSelector("#menu > div.collapse.navbar-collapse.navbar-ex1-collapse > ul > li:nth-child(8) > div > div > ul:nth-child(3) > li:nth-child(2) > a");

    static public By categoryMP3Playerstest4 = By.cssSelector("#menu > div.collapse.navbar-collapse.navbar-ex1-collapse > ul > li:nth-child(8) > div > div > ul:nth-child(3) > li:nth-child(3) > a");

    static public By categoryMP3Playerstest5 = By.cssSelector("#menu > div.collapse.navbar-collapse.navbar-ex1-collapse > ul > li:nth-child(8) > div > div > ul:nth-child(3) > li:nth-child(4) > a");

    static public By categoryMP3Playerstest6 = By.cssSelector("#menu > div.collapse.navbar-collapse.navbar-ex1-collapse > ul > li:nth-child(8) > div > div > ul:nth-child(3) > li:nth-child(5) > a");

    static public By categoryMP3Playerstest7 = By.cssSelector("#menu > div.collapse.navbar-collapse.navbar-ex1-collapse > ul > li:nth-child(8) > div > div > ul:nth-child(4) > li:nth-child(1) > a");

    static public By categoryMP3Playerstest8 = By.cssSelector("#menu > div.collapse.navbar-collapse.navbar-ex1-collapse > ul > li:nth-child(8) > div > div > ul:nth-child(4) > li:nth-child(2) > a");

    static public By categoryMP3Playerstest9 = By.cssSelector("#menu > div.collapse.navbar-collapse.navbar-ex1-collapse > ul > li:nth-child(8) > div > div > ul:nth-child(4) > li:nth-child(3) > a");

    static public By categoryShowAllMP3Players = By.cssSelector("[href='https://awesomeqa.com/ui/index.php?route=product/category&path=34'].see-all");

    static public void clickOnCurrencyDropdown() {
        driver.findElement(currencyDropdown).click();
    }

    static public boolean isCurrencyEuroDisplayed() {
        return driver.findElement(currencyEuro).isDisplayed();
    }

    static public boolean isCurrencyPoundSterlingDisplayed() {
        return driver.findElement(currencyPoundSterling).isDisplayed();
    }

    static public boolean isCurrencyUSDollarDisplayed() {
        return driver.findElement(currencyUSDollar).isDisplayed();
    }

    static public void clickOnCurrencyEuro() {
        driver.findElement(currencyEuro).click();
    }

    static public void clickOnCurrencyPoundSterling() {
        driver.findElement(currencyPoundSterling).click();
    }

    static public void clickOnCurrencyUSDollar() {
        driver.findElement(currencyUSDollar).click();
    }

    static public String getCartTotalText() {
        return driver.findElement(cartTotalText).getText();
    }

    static public void clickOnContactButton() {
        driver.findElement(contactButton).click();
    }

    static public void clickOnUserButton() {
        driver.findElement(userButton).click();
    }

    static public void clickOnWishlistButton() {
        driver.findElement(wishlistButton).click();
    }

    static public void clickOnCartButton() {
        driver.findElement(cartButton).click();
    }

    static public void clickOnCheckoutButton() {
        driver.findElement(checkoutButton).click();
    }

    static public void clickOnUserRegister() {
        driver.findElement(userRegister).click();
    }

    static public void clickOnUserLogin() {
        driver.findElement(userLogin).click();
    }

    static public boolean isUserRegisterDisplayed() {
        return driver.findElement(userRegister).isDisplayed();
    }

    static public boolean isUserLoginDisplayed() {
        return driver.findElement(userLogin).isDisplayed();
    }


    static public void clickOnUserMyAccount() {
        driver.findElement(userMyAccount).click();
    }

    static public boolean isUserMyAccountDisplayed() {
        return driver.findElement(userMyAccount).isDisplayed();
    }


    static public void clickOnUserOrderHistory() {
        driver.findElement(userOrderHistory).click();
    }

    static public boolean isUserOrderHistoryDisplayed() {
        return driver.findElement(userOrderHistory).isDisplayed();
    }


    static public void clickOnUserTransactions() {
        driver.findElement(userTransactions).click();
    }

    static public boolean isUserTransactionsDisplayed() {
        return driver.findElement(userTransactions).isDisplayed();
    }

    static public void clickOnUserDownloads() {
        driver.findElement(userDownloads).click();
    }

    static public boolean isUserDownloadsDisplayed() {
        return driver.findElement(userDownloads).isDisplayed();
    }

    static public void clickOnUserLogout() {
        driver.findElement(userLogout).click();
    }

    static public boolean isUserLogoutDisplayed() {
        return driver.findElement(userLogout).isDisplayed();
    }


    static public void clickOnOpenCartHomeLogo() {
        driver.findElement(openCartHomLogo).click();
    }

    static public void clickOnCartTotalButton() {
        driver.findElement(cartTotalButton).click();
    }

    static public boolean isCartTotalDropdownDisplayed() {
        return driver.findElement(cartTotalDropdown).isDisplayed();
    }


    static public void sendKeysToSearchInputText(String search) {
        driver.findElement(searchInputText).sendKeys(search);
    }

    static public void clickOnSearchButton() {
        driver.findElement(searchButton).click();
    }

    static public void clickOnCategoriesNavBar() {
        driver.findElement(categoriesNavBar).click();
    }

    static public boolean isCategoriesNavBarDisplayed() {
        return driver.findElement(categoriesNavBar).isDisplayed();
    }

    static public void waitForCategoriesNavBarToBeVisible() {
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(categoriesNavBar));
    }

    static public void clickOnCategoryDesktop() {
        driver.findElement(categoryDesktop).click();
    }

    static public void hoverOnCategoryDesktop() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(categoryDesktop)).perform();
    }

    static public boolean isCategoryDesktopDisplayed() {
        return driver.findElement(categoryDesktop).isDisplayed();
    }

    static public void clickOnCategoryDesktopPC() {
        driver.findElement(categoryDesktopPC).click();
    }

    static public boolean isCategoryDesktopPCDisplayed() {
        return driver.findElement(categoryDesktopPC).isDisplayed();
    }

    static public void clickOnCategoryDesktopMac() {
        driver.findElement(categoryDesktopMac).click();
    }

    static public boolean isCategoryDesktopMacDisplayed() {
        return driver.findElement(categoryDesktopMac).isDisplayed();
    }


    static public void clickOnCategoryShowAllDesktops() {
        driver.findElement(categoryShowAllDesktops).click();
    }

    static public boolean isCategoryShowAllDesktopsDisplayed() {
        return driver.findElement(categoryShowAllDesktops).isDisplayed();
    }


    static public void clickOnCategoryLaptops_Notebooks() {
        driver.findElement(categoryLaptops_Notebooks).click();
    }

    static public void hoverOnCategoryLaptops_Notebooks() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(categoryLaptops_Notebooks)).perform();
    }

    static public boolean isCategoryLaptops_NotebooksDisplayed() {
        return driver.findElement(categoryLaptops_Notebooks).isDisplayed();
    }


    static public void clickOnCategoryLaptops_NotebooksMacs() {
        driver.findElement(categoryLaptops_NotebooksMacs).click();
    }

    static public boolean isCategoryLaptops_NotebooksMacsDisplayed() {
        return driver.findElement(categoryLaptops_NotebooksMacs).isDisplayed();
    }


    static public void clickOnCategoryLaptops_NotebooksWindows() {
        driver.findElement(categoryLaptops_NotebooksWindows).click();
    }

    static public boolean isCategoryLaptops_NotebooksWindowsDisplayed() {
        return driver.findElement(categoryLaptops_NotebooksWindows).isDisplayed();
    }


    static public void clickOnCategoryShowAllLaptopsAndNotebooks() {
        driver.findElement(categoryShowAllLaptopsAndNotebooks).click();
    }

    static public boolean isCategoryShowAllLaptopsAndNotebooksDisplayed() {
        return driver.findElement(categoryShowAllLaptopsAndNotebooks).isDisplayed();
    }


    static public void clickOnCategoryComponents() {
        driver.findElement(categoryComponents).click();
    }

    static public void hoverOnCategoryComponents() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(categoryComponents)).perform();
    }

    static public boolean isCategoryComponentsDisplayed() {
        return driver.findElement(categoryComponents).isDisplayed();
    }


    static public void clickOnCategoryComponentsMiceAndTrackballs() {
        driver.findElement(categoryComponentsMiceAndTrackballs).click();
    }

    static public boolean isCategoryComponentsMiceAndTrackballsDisplayed() {
        return driver.findElement(categoryComponentsMiceAndTrackballs).isDisplayed();
    }


    static public void clickOnCategoryComponentsMonitors() {
        driver.findElement(categoryComponentsMonitors).click();
    }

    static public boolean isCategoryComponentsMonitorsDisplayed() {
        return driver.findElement(categoryComponentsMonitors).isDisplayed();
    }


    static public void clickOnCategoryComponentsPrinters() {
        driver.findElement(categoryComponentsPrinters).click();
    }

    static public boolean isCategoryComponentsPrintersDisplayed() {
        return driver.findElement(categoryComponentsPrinters).isDisplayed();
    }


    static public void clickOnCategoryComponentsScanners() {
        driver.findElement(categoryComponentsScanners).click();
    }

    static public boolean isCategoryComponentsScannersDisplayed() {
        return driver.findElement(categoryComponentsScanners).isDisplayed();
    }


    static public void clickOnCategoryComponentsWebCameras() {
        driver.findElement(categoryComponentsWebCameras).click();
    }

    static public boolean isCategoryComponentsWebCamerasDisplayed() {
        return driver.findElement(categoryComponentsWebCameras).isDisplayed();
    }


    static public void clickOnCategoryShowAllComponents() {
        driver.findElement(categoryShowAllComponents).click();
    }

    static public boolean isCategoryShowAllComponentsDisplayed() {
        return driver.findElement(categoryShowAllComponents).isDisplayed();
    }


    static public void clickOnCategoryTablets() {
        driver.findElement(categoryTablets).click();
    }

    static public void hoverOnCategoryTablets() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(categoryTablets)).perform();
    }

    static public boolean isCategoryTabletsDisplayed() {
        return driver.findElement(categoryTablets).isDisplayed();
    }


    static public void clickOnCategorySoftware() {
        driver.findElement(categorySoftware).click();
    }

    static public void hoverOnCategorySoftware() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(categorySoftware)).perform();
    }

    static public boolean isCategorySoftwareDisplayed() {
        return driver.findElement(categorySoftware).isDisplayed();
    }

    static public void clickOnCategoryPhones_PDAs() {
        driver.findElement(categoryPhones_PDAs).click();
    }

    static public void hoverOnCategoryPhones_PDAs() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(categoryPhones_PDAs)).perform();
    }

    static public boolean isCategoryPhones_PDAsDisplayed() {
        return driver.findElement(categoryPhones_PDAs).isDisplayed();
    }


    static public void clickOnCategoryCameras() {
        driver.findElement(categoryCameras).click();
    }

    static public void hoverOnCategoryCameras() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(categoryCameras)).perform();
    }

    static public boolean isCategoryCamerasDisplayed() {
        return driver.findElement(categoryCameras).isDisplayed();
    }


    static public void clickOnCategoryMP3Players() {
        driver.findElement(categoryMP3Players).click();
    }


    static public void hoverOnCategoryMP3Players() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(categoryMP3Players)).perform();
    }

    static public boolean isCategoryMP3PlayersDisplayed() {
        return driver.findElement(categoryMP3Players).isDisplayed();
    }


    static public void clickOnCategoryMP3Playerstest11() {
        driver.findElement(categoryMP3Playerstest11).click();
    }

    static public boolean isCategoryMP3Playerstest11Displayed() {
        return driver.findElement(categoryMP3Playerstest11).isDisplayed();
    }


    static public void clickOnCategoryMP3Playerstest12() {
        driver.findElement(categoryMP3Playerstest12).click();
    }

    static public boolean isCategoryMP3Playerstest12Displayed() {
        return driver.findElement(categoryMP3Playerstest12).isDisplayed();
    }


    static public void clickOnCategoryMP3Playerstest15() {
        driver.findElement(categoryMP3Playerstest15).click();
    }

    static public boolean isCategoryMP3Playerstest15Displayed() {
        return driver.findElement(categoryMP3Playerstest15).isDisplayed();
    }


    static public void clickOnCategoryMP3Playerstest16() {
        driver.findElement(categoryMP3Playerstest16).click();
    }

    static public boolean isCategoryMP3Playerstest16Displayed() {
        return driver.findElement(categoryMP3Playerstest16).isDisplayed();
    }


    static public void clickOnCategoryMP3Playerstest17() {
        driver.findElement(categoryMP3Playerstest17).click();
    }

    static public boolean isCategoryMP3Playerstest17Displayed() {
        return driver.findElement(categoryMP3Playerstest17).isDisplayed();
    }


    static public void clickOnCategoryMP3Playerstest18() {
        driver.findElement(categoryMP3Playerstest18).click();
    }

    static public boolean isCategoryMP3Playerstest18Displayed() {
        return driver.findElement(categoryMP3Playerstest18).isDisplayed();
    }


    static public void clickOnCategoryMP3Playerstest19() {
        driver.findElement(categoryMP3Playerstest19).click();
    }

    static public boolean isCategoryMP3Playerstest19Displayed() {
        return driver.findElement(categoryMP3Playerstest19).isDisplayed();
    }


    static public void clickOnCategoryMP3Playerstest20() {
        driver.findElement(categoryMP3Playerstest20).click();
    }

    static public boolean isCategoryMP3Playerstest20Displayed() {
        return driver.findElement(categoryMP3Playerstest20).isDisplayed();
    }


    static public void clickOnCategoryMP3Playerstest21() {
        driver.findElement(categoryMP3Playerstest21).click();
    }

    static public boolean isCategoryMP3Playerstest21Displayed() {
        return driver.findElement(categoryMP3Playerstest21).isDisplayed();
    }


    static public void clickOnCategoryMP3Playerstest22() {
        driver.findElement(categoryMP3Playerstest22).click();
    }

    static public boolean isCategoryMP3Playerstest22Displayed() {
        return driver.findElement(categoryMP3Playerstest22).isDisplayed();
    }


    static public void clickOnCategoryMP3Playerstest23() {
        driver.findElement(categoryMP3Playerstest23).click();
    }

    static public boolean isCategoryMP3Playerstest23Displayed() {
        return driver.findElement(categoryMP3Playerstest23).isDisplayed();
    }


    static public void clickOnCategoryMP3Playerstest24() {
        driver.findElement(categoryMP3Playerstest24).click();
    }

    static public boolean isCategoryMP3Playerstest24Displayed() {
        return driver.findElement(categoryMP3Playerstest24).isDisplayed();
    }


    static public void clickOnCategoryMP3Playerstest4() {
        driver.findElement(categoryMP3Playerstest4).click();
    }

    static public boolean isCategoryMP3Playerstest4Displayed() {
        return driver.findElement(categoryMP3Playerstest4).isDisplayed();
    }


    static public void clickOnCategoryMP3Playerstest5() {
        driver.findElement(categoryMP3Playerstest5).click();
    }

    static public boolean isCategoryMP3Playerstest5Displayed() {
        return driver.findElement(categoryMP3Playerstest5).isDisplayed();
    }


    static public void clickOnCategoryMP3Playerstest6() {
        driver.findElement(categoryMP3Playerstest6).click();
    }

    static public boolean isCategoryMP3Playerstest6Displayed() {
        return driver.findElement(categoryMP3Playerstest6).isDisplayed();
    }


    static public void clickOnCategoryMP3Playerstest7() {
        driver.findElement(categoryMP3Playerstest7).click();
    }

    static public boolean isCategoryMP3Playerstest7Displayed() {
        return driver.findElement(categoryMP3Playerstest7).isDisplayed();
    }


    static public void clickOnCategoryMP3Playerstest8() {
        driver.findElement(categoryMP3Playerstest8).click();
    }

    static public boolean isCategoryMP3Playerstest8Displayed() {
        return driver.findElement(categoryMP3Playerstest8).isDisplayed();
    }


    static public void clickOnCategoryMP3Playerstest9() {
        driver.findElement(categoryMP3Playerstest9).click();
    }

    static public boolean isCategoryMP3Playerstest9Displayed() {
        return driver.findElement(categoryMP3Playerstest9).isDisplayed();
    }


    static public void clickOnCategoryShowAllMP3Players() {
        driver.findElement(categoryShowAllMP3Players).click();
    }

    static public boolean isCategoryShowAllMP3PlayersDisplayed() {
        return driver.findElement(categoryShowAllMP3Players).isDisplayed();
    }

}
