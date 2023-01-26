package tests;

import io.appium.java_client.android.AndroidDriver;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import io.appium.java_client.MobileElement;
import org.junit.rules.TestName;
import pages.HomePage;
import support.BaseTest;
import support.DriverFactory;

import java.net.MalformedURLException;


public class UserNotLoggedInTest {

    private AndroidDriver<MobileElement> driver;

    @Rule
    public TestName testName = new TestName();

    @Before
    public void startAppium() throws MalformedURLException {
        driver = DriverFactory.createDriver();
    }

    @Test
    public void testSearchForEvent() throws MalformedURLException {
        String eventTitle = new HomePage(driver)
                .typeEventSearchBar()
                .clickSeachKeyboardButton()
                .selectSearchResult()
                .denyPopUpLocationInfo()
                .getEventTitleText();
        assertEquals("GREASE, O MUSICAL", eventTitle);
        new BaseTest()
                .createScreenShot(testName.getMethodName());

    }

    @Test
    public void testRequestLoginToFinishTheTicketPurchase() {
        String loginButton = new HomePage(driver)
                .typeEventSearchBar()
                .clickSeachKeyboardButton()
                .selectSearchResult()
                .denyPopUpLocationInfo()
                .clickComprarAgoraButton()
                .selectDate()
                .selectSession()
                .selectSector()
                .clickAvancarButton()
                .clickToCloseZoomInfo()
                .selectSeat()
                .clickComprarAgoraButton()
                .clickIrParaPagamentoButton()
                .getEntrarText();
        assertEquals("Entrar",loginButton);
    }

    /*@After
    public void tearDown() throws MalformedURLException {
        DriverFactory.createDriver().quit();
    }*/
}
