package testcases;

import com.epam.healenium.SelfHealingDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import utils.WindowDimension;

import static utils.Driver.driver;
import static utils.Driver.originalDriver;

public class TestSuiteSetup {

    @BeforeSuite
    public void initDriver() {
        //originalDriver = new EdgeDriver();
        //driver = SelfHealingDriver.create(originalDriver);
        driver = new EdgeDriver();
        driver.manage().window().setSize(WindowDimension.normalDimension);
    }

    @AfterSuite
    public void clearCookies() {
        driver.manage().deleteAllCookies();
    }
}
