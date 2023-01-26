package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class OrderReviewPage extends BasePage {
    public OrderReviewPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    public LoginPage clickIrParaPagamentoButton (){
        driver.findElement(By.id("continueButton")).click();

        return new LoginPage(driver);
    }
}
