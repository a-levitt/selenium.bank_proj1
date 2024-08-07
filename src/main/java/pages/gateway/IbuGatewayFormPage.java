package pages.gateway;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;


public class IbuGatewayFormPage extends BasePage {
    public IbuGatewayFormPage(WebDriver driver) {
        super(driver);
    }

    private final By EnterUsernameField = By.xpath("//input[@id='username']");
    private final By EnterPasswordField = By.xpath("//input[@id='password']");
    private final By forgotPasswordButton = By.xpath("//button[@class='mat-button ng-star-inserted']");

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


}
