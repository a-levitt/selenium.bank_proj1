package pages.insurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class InsurancePlansPage extends BasePage {

    public InsurancePlansPage(WebDriver driver) {
        super(driver);
    }

    // https://www.bankofcyprus.com/en-gb/Personal/Digital_Channels/hidden/gic_homeinsurance_awareness/
    // ?nextScreen=home_insurance&utm_source=website&utm_medium=website&utm_campaign=Home

    //https://www.bankofcyprus.com/en-gb/Personal/Digital_Channels/hidden/qr-code-home-insurance/
    // ?nextScreen=home_insurance&utm_source=SM&utm_medium=SM&utm_campaign=Home

    private final By getProposalButton = By.xpath("(//a[@class='current-accounts-overlay-link'])[2]");
    private final By mobileAppRedirectButton = By.xpath("//a[@class='bp-image-banner-btn animated']");

    public InsurancePlansPage getHomeInsurance() {
        driver.findElement(getProposalButton).click();
        return this;
    }

    public InsurancePlansPage getAQuickQuote() {
        driver.findElement(mobileAppRedirectButton).click();
        return this;
    }
}
