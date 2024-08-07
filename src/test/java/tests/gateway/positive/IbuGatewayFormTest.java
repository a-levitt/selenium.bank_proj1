package tests.gateway.positive;

import constants.Constant;
import org.junit.jupiter.api.Test;
import pages.gateway.IbuGatewayFormPage;
import constants.Secure;
import tests.base.BaseTest;

public class IbuGatewayFormTest extends BaseTest {
    @Test
    public void fillFormTest() {
        basePage.goToUrl(Constant.Urls.IBU_GATEWAY_URL);

        IbuGatewayFormPage page = new IbuGatewayFormPage(driver)
                                            .enterName(Secure.formFillVariables.USERNAME)
                                            .enterPassword(Secure.formFillVariables.USER_PASSWORD)
                                            .clickForgotPassword();

        basePage.isRestorePasswordPopupVisible();
    }

}
