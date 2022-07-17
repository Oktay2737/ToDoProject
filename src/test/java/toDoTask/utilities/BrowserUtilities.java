package toDoTask.utilities;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtilities {

    /**
     * Performs a pause
     *
     * @param seconds
     */
    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Waits for the provided element to be visible on the page
     *
     * @param element
     * @param timeToWaitInSec
     * @return
     */
    public static MobileElement waitForVisibility(MobileElement element, int timeToWaitInSec) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeToWaitInSec);
        return (MobileElement) wait.until(ExpectedConditions.visibilityOf(element));


    }
    public static void waitForPresence(By by, int timeToWaitInSec) {

    }
    public static MobileElement getToastElement(int timeToWaitInSec ){
        By by=By.xpath("/hierarchy/android.widget.Toast");
        BrowserUtilities.waitForPresence(by,timeToWaitInSec);
        MobileElement toastMessage=Driver.getDriver().findElement(by);
        return toastMessage;
    }


}
