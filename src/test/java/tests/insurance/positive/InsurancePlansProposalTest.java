package tests.insurance.positive;

import org.junit.jupiter.api.Test;
import pages.insurance.InsurancePlansPage;
import tests.base.BaseTest;
import constants.Constant.Urls;

public class InsurancePlansProposalTest extends BaseTest {
    @Test
    public void isRedirectToApp() {
        basePage.goToUrl(Urls.INSURANCE_URL);

        InsurancePlansPage page = new InsurancePlansPage(driver);

        page.getHomeInsurance();

        page.getAQuickQuote();

        basePage.isQRCodeDisplayed();
    }
}
