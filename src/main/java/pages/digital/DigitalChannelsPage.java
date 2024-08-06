package pages.digital;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.insurance.InsurancePlansPage;

import java.util.prefs.BackingStoreException;

public class DigitalChannelsPage extends BasePage {
    public DigitalChannelsPage(WebDriver driver) {
        super(driver);
    }

    private final By getCarInsurance = By.xpath("//a[normalize-space()='Get your car insurance']");
    private final By getQuoteButton = By.xpath("//a[@class='bp-image-banner-btn animated']");

    public DigitalChannelsPage getCarInsuranceBanner() {
        driver.findElement(getCarInsurance).click();
        return this;
    }

    public DigitalChannelsPage getAQuote() {
        driver.findElement(getQuoteButton).click();
        return this;
    }


}
