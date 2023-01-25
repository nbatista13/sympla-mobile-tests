package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage {
    public HomePage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }
    public HomePage typeEventSearchBar() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementById("com.sympla.tickets:id/search_bar_text").sendKeys("Grease");

        return this;

    }
    public EventsResultPage clickSeachKeyboardButton() {
        driver.findElementById("com.sympla.tickets:id/search_bar_text").click();
        driver.pressKeyCode(66);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return new EventsResultPage(driver);

    }
}
