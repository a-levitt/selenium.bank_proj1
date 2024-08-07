package tests.gateway.negative;


import constants.Constant;
import constants.Secure;
import pages.gateway.IbuGatewayFormPage;
import tests.base.BaseTest;

public class IbuGatewayFormNegativeTest extends BaseTest {
    public void checkRequiredFields() {
        basePage.goToUrl(Constant.Urls.IBU_GATEWAY_URL);

        IbuGatewayFormPage page = new IbuGatewayFormPage(driver)
                .focusName()
                .focusPassword()
                .focusName()
                .checkFillAlerts();
    }
}
