package tests.base;

import common.CommonActions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.base.BasePage;
//import pages.digital.DigitalChannelsPage;
//import pages.digital.DigitalPage;
//import pages.insurance.InsurancePage;
//import pages.gateway.IbuGatewayPage;

import java.io.File;
import java.util.Objects;

import static common.Config.*;

@ExtendWith(Listener.class)
@Execution(ExecutionMode.CONCURRENT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    //protected InsurancePage insurancePage = new InsurancePage(driver);
    //protected DigitalPage digitalPage = new DigitalPage(driver);
    //protected IbuGatewayPage ibuGatewayPage = new IbuGatewayPage(driver);
    private static final Logger LOGGER = LoggerFactory.getLogger(BaseTest.class);

    static {
        if (CLEAR_REPORTS) {
            File allureResults = new File("allure-results");
            File failedScreenshots = new File("build/reports/tests");
            if (allureResults.isDirectory()) {
                for (File item : Objects.requireNonNull(allureResults.listFiles())) {
                    item.delete();
                }
            }
            for (File screenshot : Objects.requireNonNull(failedScreenshots.listFiles())) {
                screenshot.delete();
            }

            LOGGER.info("Old screenshots and reports deleted");
        }
    }


    @AfterEach
    void clearCookiesAndLocalStorage() {
        if (CLEAR_COOKIES) {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }

    @AfterAll
    void close() {
        if (!HOLD_BROWSER_OPEN) {
            driver.close();
        }
    }
}
