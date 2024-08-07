package common;

public class Config {

    /**
     * Specify the browser for tests:
     * CHROME
     * MOZILLA
     * */
    public static final String BROWSER = "CHROME";

    /**
     *  Clear browser cookies and local storage (after each test)
     * */
    public static final Boolean CLEAR_COOKIES = false;

    /**
     * Keep browser open after all tests/scenario
     * */
    public static final Boolean HOLD_BROWSER_OPEN = false;
}
