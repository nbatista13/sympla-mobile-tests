package support;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;

public class BaseTest {


    public static void createScreenShot(String methodName) {
        try {
            File image = ((TakesScreenshot) DriverFactory.createDriver()).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(image, new File("C:\\projects\\test-report\\sympla\\" + Generator.dateTimeForFile() + methodName + ".png"));
        } catch (IOException e) {
            System.out.println("There were problems copying the file to the folder " + e.getMessage());
        }

    }

}
