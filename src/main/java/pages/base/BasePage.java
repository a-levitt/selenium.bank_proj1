package pages.base;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static constants.Constant.TimeoutVariables.EXPLICIT_WAIT;

public class BasePage {

    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public final By MobileAppQR = By.xpath("//div[@class='time-check-wrap animated']");
    public final By passwordForm = By.xpath("//mat-dialog-container[@id='mat-dialog-1']");
    public final By popUpTitleText = By.xpath("//mat-card-title[@class='mat-card-title']");

    /**
     * Navigate to specific URL
     * */
    public void goToUrl(String url) {
        driver.get(url);
    }

    /**
     * Wait until the element is visible
     * !Do not use with Implicit waits!
     */
    public WebElement waitForElement(WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT))
                .until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public void isQRCodeDisplayed() {
        WebElement qrCode = driver.findElement(MobileAppQR);
        waitForElement(qrCode);
    }

    public void isRestorePasswordPopupVisible() {
        WebElement restorePasswordForm = driver.findElement(passwordForm);
        waitForElement(restorePasswordForm);
        WebElement title = driver.findElement(popUpTitleText);
        Assertions.assertEquals("One Time Password (OTP) Generator", title);
    }
}
