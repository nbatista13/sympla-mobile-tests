package tests;

import io.appium.java_client.android.AndroidDriver;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import io.appium.java_client.MobileElement;
import pages.HomePage;
import support.DriverFactory;
import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class symplausernotloggedin {
    private AndroidDriver<MobileElement> driver;

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
    }

    @After
    public void tearDown() {
        driver.quit();

    }
}
