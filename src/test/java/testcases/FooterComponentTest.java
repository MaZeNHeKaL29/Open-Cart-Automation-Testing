package testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.FooterComponent;

import static utils.Driver.driver;

public class FooterComponentTest extends TestSuiteSetup {


    @BeforeClass
    public void initFooterComponentTest() {
        driver.get(FooterComponent.url);
    }

    @Test(priority = 1)
    public void informationAboutUsTest()
    {
        FooterComponent.clickOnInformationAboutUs();
        Assert.assertEquals(driver.getCurrentUrl(),"https://awesomeqa.com/ui/index.php?route=information/information&information_id=4");
    }

    @Test(priority = 1)
    public void informationDeliveryInformationTest(){
        FooterComponent.clickOnInformationDeliveryInformation();
        Assert.assertEquals(driver.getCurrentUrl(),"https://awesomeqa.com/ui/index.php?route=information/information&information_id=6");
    }

    @Test(priority = 1)
    public void informationPrivacyPolicyTest(){
        FooterComponent.clickOnInformationPrivacyPolicy();
        Assert.assertEquals(driver.getCurrentUrl(),"https://awesomeqa.com/ui/index.php?route=information/information&information_id=3");
    }

    @Test(priority = 1)
    public void informationTerms_ConditionsTest(){
        FooterComponent.clickOnInformationTerms_Conditions();
        Assert.assertEquals(driver.getCurrentUrl(),"https://awesomeqa.com/ui/index.php?route=information/information&information_id=5");
    }

    @Test(priority = 2)
    public void customerServiceContactUsTest(){
        FooterComponent.clickOnCustomerServiceContactUs();
        Assert.assertEquals(driver.getCurrentUrl(),"https://awesomeqa.com/ui/index.php?route=information/contact");
    }

    @Test(priority = 2)
    public void customerServiceReturnsTest(){
        FooterComponent.clickOnCustomerServiceReturns();
        Assert.assertEquals(driver.getCurrentUrl(),"https://awesomeqa.com/ui/index.php?route=account/return/add");
    }

    @Test(priority = 2)
    public void customerServiceSiteMapTest(){
        FooterComponent.clickOnCustomerServiceSiteMap();
        Assert.assertEquals(driver.getCurrentUrl(),"https://awesomeqa.com/ui/index.php?route=information/sitemap");
    }

    @Test(priority = 3)
    public void extrasBrandsTest(){
        FooterComponent.clickOnExtrasBrands();
        Assert.assertEquals(driver.getCurrentUrl(),"https://awesomeqa.com/ui/index.php?route=product/manufacturer");
    }

    @Test(priority = 3)
    public void extrasGiftCertificatesTest(){
        FooterComponent.clickOnExtrasGiftCertificates();
        Assert.assertEquals(driver.getCurrentUrl(),"https://awesomeqa.com/ui/index.php?route=account/voucher");
    }

    @Test(priority = 3)
    public void extrasAffiliateTest(){
        FooterComponent.clickOnExtrasAffiliate();
        Assert.assertEquals(driver.getCurrentUrl(),"https://awesomeqa.com/ui/index.php?route=affiliate/login");
    }

    @Test(priority = 3)
    public void extrasSpecialsTest(){
        FooterComponent.clickOnExtrasSpecials();
        Assert.assertEquals(driver.getCurrentUrl(),"https://awesomeqa.com/ui/index.php?route=product/special");
    }


}
