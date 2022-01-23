package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase extends AbstractTestNGCucumberTests {

    public static AppiumDriver driver;

    public static void Android_setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "10");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("deviceName", "cacann594d7pwoaq");
        caps.setCapability("app", System.getProperty("user.dir") + "/apps/ToDo_v1.24_apkpure.com.apk");
        caps.setCapability("noReset", true);

        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);
    }

    public static void tearDown() {
        if (null != driver) {
            driver.quit();
        }
    }
}
