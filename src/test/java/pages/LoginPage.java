package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePage{
    public LoginPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    public String getEntrarText(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        return driver.findElement(By.id("com.sympla.tickets:id/profile_login_enter")).getText();
    }
}
