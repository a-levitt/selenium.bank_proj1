package tests.digital.positive;

import org.junit.jupiter.api.Test;
import pages.digital.DigitalChannelsPage;
import tests.base.BaseTest;
import constants.Constant.Urls;

public class DigitalChannelsTest extends BaseTest {
    @Test
    public void isRedirectToApp() {
        basePage.goToUrl(Urls.DIGITAL_CHANNELS_URL);

        DigitalChannelsPage page = new DigitalChannelsPage(driver);

        page.getCarInsuranceBanner();

        page.getAQuote();

        basePage.isQRCodeDisplayed();
    }
}
