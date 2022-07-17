package toDoTask.utilities;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {

    private static AppiumDriver<MobileElement> driver;

    public Driver() {
    }

    public static AppiumDriver<MobileElement> getDriver() {
        if (driver == null) {

            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,ConfigurationReader.get("PlatformName"));
            desiredCapabilities.setCapability(MobileCapabilityType.VERSION,ConfigurationReader.get("Version"));
            desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,ConfigurationReader.get("DeviceName"));


            desiredCapabilities.setCapability("appPackage",ConfigurationReader.get("AppPackageName"));

            desiredCapabilities.setCapability("appActivity",ConfigurationReader.get("AppActivityName"));

            desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,ConfigurationReader.get("AutomationName"));


            try {
                driver = new AppiumDriver<>(new URL(ConfigurationReader.get("AppiumUrl")), desiredCapabilities);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.closeApp();
            driver.resetApp();
        }
    }

}
