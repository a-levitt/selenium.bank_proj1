package pages.gateway;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;


public class IbuGatewayFormPage extends BasePage {
    public IbuGatewayFormPage(WebDriver driver) {
        super(driver);
    }

    private final By EnterUsernameField = By.xpath("//input[@id='username']");
    private final By EnterPasswordField = By.xpath("//input[@id='password']");
    private final By forgotPasswordButton = By.xpath("//button[@class='mat-button ng-star-inserted']");
    private final By nameFieldRequiredAlert = By.xpath("//mat-error[@id='mat-error-0']");
    private final By passwordFieldRequiredAlert = By.xpath("//mat-error[@id='mat-error-1']");

    public IbuGatewayFormPage enterName(String name) {
        driver.findElement(EnterUsernameField).sendKeys(name);
        return this;
    }

    public IbuGatewayFormPage enterPassword(String password) {
        driver.findElement(EnterPasswordField).sendKeys(password);
        return this;
    }

    public IbuGatewayFormPage focusName() {
        driver.findElement(EnterUsernameField).click();
        return this;
    }

    public IbuGatewayFormPage focusPassword() {
        driver.findElement(EnterPasswordField).click();
        return this;
    }

    public IbuGatewayFormPage clickForgotPassword() {
        driver.findElement(forgotPasswordButton).click();
        return this;
    }

    public IbuGatewayFormPage checkFillAlerts() {
        WebElement nameAlert = driver.findElement(nameFieldRequiredAlert);
        WebElement passwordAlert = driver.findElement(passwordFieldRequiredAlert);

        waitForElement(nameAlert);
        waitForElement(passwordAlert);
        String nameAlertText = nameAlert.getText();
        String passwordAlertText = passwordAlert.getText();

        Assertions.assertEquals("User name is required", nameAlertText);
        Assertions.assertEquals("Password is required", passwordAlertText);

        return this;
    }

}
