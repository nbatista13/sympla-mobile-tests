package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import java.util.List;

public class EventsResultPage extends BasePage{
    public EventsResultPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    public EventDescriptionPage selectSearchResult(){
        List<MobileElement> results = driver.findElements(By.id("com.sympla.tickets:id/sympla_event_title"));
        for (MobileElement greaseResult : results) {
            if (greaseResult.getText().contains("GREASE")) {
                greaseResult.click();
                break;
            }
        }

        return new EventDescriptionPage(driver);
    }
}
