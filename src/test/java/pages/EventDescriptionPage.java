package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class EventDescriptionPage extends BasePage {
    public EventDescriptionPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    public EventDescriptionPage denyPopUpLocationInfo() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        if (driver.findElement(By.id("com.sympla.tickets:id/button_denied_permission")).isDisplayed()) {
            MobileElement denyButton = driver.findElement(By.id("com.sympla.tickets:id/button_denied_permission"));
            denyButton.click();
        }
        return this;
    }

    public String getEventTitleText() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]")).getText();
    }
}