package testcases;

import org.openqa.selenium.Dimension;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HeaderComponent;
import utils.WindowDimension;

import static utils.Driver.driver;

public class HeaderComponentTest extends TestSuiteSetup {

    @BeforeClass
    public void initHeaderComponentTest() {
        driver.get(HeaderComponent.url);
    }

    @Test(priority = 1)
    public void clickOnCurrencyDropdownTest() {
        HeaderComponent.clickOnCurrencyDropdown();
        Assert.assertTrue(HeaderComponent.isCurrencyEuroDisplayed());
        Assert.assertTrue(HeaderComponent.isCurrencyPoundSterlingDisplayed());
        Assert.assertTrue(HeaderComponent.isCurrencyUSDollarDisplayed());
        HeaderComponent.clickOnCurrencyDropdown();
        Assert.assertFalse(HeaderComponent.isCurrencyEuroDisplayed());
        Assert.assertFalse(HeaderComponent.isCurrencyPoundSterlingDisplayed());
        Assert.assertFalse(HeaderComponent.isCurrencyUSDollarDisplayed());
    }

    @Test(priority = 1, dependsOnMethods = {"clickOnCurrencyDropdownTest"})
    public void changeCurrencyEuroTest() {
        HeaderComponent.clickOnCurrencyDropdown();
        HeaderComponent.clickOnCurrencyEuro();
        Assert.assertEquals(HeaderComponent.getCartTotalText(), "0 item(s) - 0.00€");
    }

    @Test(priority = 1, dependsOnMethods = {"clickOnCurrencyDropdownTest"})
    public void changeCurrencyPoundSterlingTest() {
        HeaderComponent.clickOnCurrencyDropdown();
        HeaderComponent.clickOnCurrencyPoundSterling();
        Assert.assertEquals(HeaderComponent.getCartTotalText(), "0 item(s) - £0.00");
    }

    @Test(priority = 1, dependsOnMethods = {"clickOnCurrencyDropdownTest"})
    public void changeCurrencyUSDollarTest() {
        HeaderComponent.clickOnCurrencyDropdown();
        HeaderComponent.clickOnCurrencyUSDollar();
        Assert.assertEquals(HeaderComponent.getCartTotalText(), "0 item(s) - $0.00");
    }

    @Test(priority = 1)
    public void clickOnContactButtonTest() {
        HeaderComponent.clickOnContactButton();
        Assert.assertEquals(driver.getCurrentUrl(), "https://awesomeqa.com/ui/index.php?route=information/contact");
    }

    @Test(priority = 1)
    public void clickOnOpenCartHomeLogoTest() {
        HeaderComponent.clickOnOpenCartHomeLogo();
        Assert.assertEquals(driver.getCurrentUrl(), "https://awesomeqa.com/ui/index.php?route=common/home");
    }

    @Test(priority = 2)
    public void searchTest() {
        String inputToSearch = "iphone";
        HeaderComponent.sendKeysToSearchInputText(inputToSearch);
        HeaderComponent.clickOnSearchButton();
        Assert.assertEquals(driver.getCurrentUrl(), "https://awesomeqa.com/ui/index.php?route=product/search&search=" + inputToSearch);
    }

    @Test(priority = 2)
    public void clickOnCartTotalButtonTest(){
        HeaderComponent.clickOnCartTotalButton();
        Assert.assertTrue(HeaderComponent.isCartTotalDropdownDisplayed());
        HeaderComponent.clickOnCartTotalButton();
        Assert.assertFalse(HeaderComponent.isCartTotalDropdownDisplayed());
    }

    @Test(priority = 3)
    public void hoverCategoryDesktopTest()
    {
        driver.manage().window().setSize(WindowDimension.normalDimension);
        HeaderComponent.hoverOnCategoryDesktop();
        Assert.assertTrue(HeaderComponent.isCategoryDesktopPCDisplayed());
        Assert.assertTrue(HeaderComponent.isCategoryDesktopMacDisplayed());
        Assert.assertTrue(HeaderComponent.isCategoryShowAllDesktopsDisplayed());
    }

    @Test(priority = 3)
    public void hoverCategoryLaptops_NotebooksTest()
    {
        driver.manage().window().setSize(WindowDimension.normalDimension);
        HeaderComponent.hoverOnCategoryLaptops_Notebooks();
        Assert.assertTrue(HeaderComponent.isCategoryLaptops_NotebooksMacsDisplayed());
        Assert.assertTrue(HeaderComponent.isCategoryLaptops_NotebooksWindowsDisplayed());
        Assert.assertTrue(HeaderComponent.isCategoryShowAllLaptopsAndNotebooksDisplayed());
    }

    @Test(priority = 3)
    public void hoverCategoryComponentsTest()
    {
        driver.manage().window().setSize(WindowDimension.normalDimension);
        HeaderComponent.hoverOnCategoryComponents();
        Assert.assertTrue(HeaderComponent.isCategoryComponentsMonitorsDisplayed());
        Assert.assertTrue(HeaderComponent.isCategoryComponentsPrintersDisplayed());
        Assert.assertTrue(HeaderComponent.isCategoryComponentsScannersDisplayed());
        Assert.assertTrue(HeaderComponent.isCategoryComponentsMiceAndTrackballsDisplayed());
        Assert.assertTrue(HeaderComponent.isCategoryComponentsWebCamerasDisplayed());
        Assert.assertTrue(HeaderComponent.isCategoryShowAllComponentsDisplayed());
    }

    @Test(priority = 3)
    public void hoverCategoryMP3PlayersTest()
    {
        driver.manage().window().setSize(WindowDimension.normalDimension);
        HeaderComponent.hoverOnCategoryMP3Players();
        Assert.assertTrue(HeaderComponent.isCategoryMP3Playerstest4Displayed());
        Assert.assertTrue(HeaderComponent.isCategoryMP3Playerstest5Displayed());
        Assert.assertTrue(HeaderComponent.isCategoryMP3Playerstest6Displayed());
        Assert.assertTrue(HeaderComponent.isCategoryMP3Playerstest7Displayed());
        Assert.assertTrue(HeaderComponent.isCategoryMP3Playerstest8Displayed());
        Assert.assertTrue(HeaderComponent.isCategoryMP3Playerstest9Displayed());
        Assert.assertTrue(HeaderComponent.isCategoryMP3Playerstest11Displayed());
        Assert.assertTrue(HeaderComponent.isCategoryMP3Playerstest12Displayed());
        Assert.assertTrue(HeaderComponent.isCategoryMP3Playerstest15Displayed());
        Assert.assertTrue(HeaderComponent.isCategoryMP3Playerstest16Displayed());
        Assert.assertTrue(HeaderComponent.isCategoryMP3Playerstest17Displayed());
        Assert.assertTrue(HeaderComponent.isCategoryMP3Playerstest18Displayed());
        Assert.assertTrue(HeaderComponent.isCategoryMP3Playerstest19Displayed());
        Assert.assertTrue(HeaderComponent.isCategoryMP3Playerstest20Displayed());
        Assert.assertTrue(HeaderComponent.isCategoryMP3Playerstest21Displayed());
        Assert.assertTrue(HeaderComponent.isCategoryMP3Playerstest22Displayed());
        Assert.assertTrue(HeaderComponent.isCategoryMP3Playerstest23Displayed());
        Assert.assertTrue(HeaderComponent.isCategoryMP3Playerstest24Displayed());
        Assert.assertTrue(HeaderComponent.isCategoryShowAllMP3PlayersDisplayed());
    }

    @Test(priority = 4)
    public void categoryNavBarMobileTest()
    {
        driver.get(HeaderComponent.url);
        driver.manage().window().setSize(new Dimension(414,896));
        HeaderComponent.waitForCategoriesNavBarToBeVisible();
        Assert.assertTrue(HeaderComponent.isCategoriesNavBarDisplayed());
        HeaderComponent.clickOnCategoriesNavBar();
        Assert.assertTrue(HeaderComponent.isCategoryDesktopDisplayed());
        Assert.assertTrue(HeaderComponent.isCategoryLaptops_NotebooksDisplayed());
        Assert.assertTrue(HeaderComponent.isCategoryComponentsDisplayed());
        Assert.assertTrue(HeaderComponent.isCategoryTabletsDisplayed());
        Assert.assertTrue(HeaderComponent.isCategorySoftwareDisplayed());
        Assert.assertTrue(HeaderComponent.isCategoryPhones_PDAsDisplayed());
        Assert.assertTrue(HeaderComponent.isCategoryMP3PlayersDisplayed());
    }
}
