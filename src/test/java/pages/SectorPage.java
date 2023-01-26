package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import java.util.List;

public class SectorPage extends BasePage {

    public SectorPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    public SectorPage selectSector() {
        List<MobileElement> elements = driver.findElements(By.className("android.view.View"));
        for (MobileElement purchaseButton : elements) {
            if (purchaseButton.getText().equals("Plateia")) {
                purchaseButton.click();
                break;
            }
        }
        return this;

    }

    public SelectSeatPage clickAvancarButton() {
        List<MobileElement> elements = driver.findElements(By.className("android.widget.Button"));
        for (MobileElement avancarButton : elements) {
            if (avancarButton.getText().equals("AVANÇAR")) {
                avancarButton.click();
                break;
            }
        }
        return new SelectSeatPage(driver);
    }


}
