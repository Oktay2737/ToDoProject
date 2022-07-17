package toDoTask.utilities;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {

    private static AppiumDriver<MobileElement> driver;

    public Driver() throws MalformedURLException, InterruptedException {
    }

    public static AppiumDriver<MobileElement> getDriver() {
        if (driver == null) {

            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            //we use android phone
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,ConfigurationReader.get("PlatformName"));
            //version of android
            desiredCapabilities.setCapability(MobileCapabilityType.VERSION,ConfigurationReader.get("Version"));
            //name of the device, if it is real device we need to pass UUID parameter
            desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,ConfigurationReader.get("DeviceName"));

            //either you specify app--> //path/to/app.apk
            //or if app is already installed, you need to specify appActivity and appPackage
            //this info you can find in the internet, at work - ask to developers

            // Set your application's package name.
            desiredCapabilities.setCapability("appPackage",ConfigurationReader.get("AppPackageName"));
            // Set your application's MainActivity i.e. the LAUNCHER activity name.
            desiredCapabilities.setCapability("appActivity",ConfigurationReader.get("AppActivityName"));

            desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,ConfigurationReader.get("AutomationName"));

        /*"http://localhost:4723/wd/hub" --> address of the appium server. If you have appium server on the same computer
        just use local host
        4723-->default port number
        we need to provide 2 parameters: URL of appium servers and desired capabilities

        */
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
            //close the app at the end
            driver.closeApp();
            driver.resetApp();
        }
    }

}
