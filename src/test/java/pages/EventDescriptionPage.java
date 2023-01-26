package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.time.Duration;
import java.util.List;
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

    public void scroll(double start, double end){
        Dimension size = driver.manage().window().getSize();

        int x = size.width/2;
        int start_y =(int) (size.height * start);
        int end_y =(int) (size.height * end);

        new TouchAction(driver)
                .press(x, start_y)
                .waitAction(Duration.ofMillis(500))
                .moveTo(x, end_y)
                .release()
                .perform();
    }

    public EventDescriptionPage clickComprarAgoraButton() {
        scroll(0.9,0.1);
        List<MobileElement> elements = driver.findElements(By.className("android.widget.Button"));
        for (MobileElement purchaseButton : elements) {
            if (purchaseButton.getText().equals("COMPRAR AGORA")) {
                purchaseButton.click();
                break;
            }

        }
        return this;
    }

    public EventDescriptionPage selectDate() {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[9]/android.view.View[5]/android.widget.Button")).click();
        return this;
    }

    public SectorPage selectSession() {
        List<MobileElement> elements = driver.findElements(By.className("android.widget.Button"));
        for (MobileElement purchaseButton : elements) {
            if (purchaseButton.getText().equals("21H00")) {
                purchaseButton.click();
                break;
            }

        }

        return new SectorPage(driver);
    }
}