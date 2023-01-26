package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import java.util.List;

public class SelectSeatPage extends BasePage {
    public SelectSeatPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    public SelectSeatPage clickToCloseZoomInfo (){
        driver.findElement(By.className("android.widget.Image")).click();
        return this;
    }

    public SelectSeatPage selectSeat (){
        List<MobileElement> mapSeat = driver.findElements(By.className("android.widget.Image"));
        MobileElement ticketTypeFull = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.app.Dialog/android.view.View[2]/android.view.View[1]/android.view.View[4]/android.widget.Button/android.view.View/android.widget.Image"));
        for (MobileElement seat : mapSeat) {
            seat.click();
            if (ticketTypeFull.isDisplayed()) {
                ticketTypeFull.click();
                break;
            }

        }
        return this;
    }

    public OrderReviewPage clickComprarAgoraButton (){
        driver.findElement(By.id("book")).click();

        return new OrderReviewPage(driver);
    }

}
