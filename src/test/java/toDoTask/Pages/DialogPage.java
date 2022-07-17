package toDoTask.Pages;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import toDoTask.utilities.BrowserUtilities;
import toDoTask.utilities.Driver;



public class DialogPage {
    private MobileElement dialogWindow;
    private MobileElement textfeld;
    private MobileElement doneButton;
    private MobileElement cancelButton;


    public MobileElement getCancelButton() {
        cancelButton = Driver.getDriver().findElement(By.id("android:id/button2"));
        BrowserUtilities.waitForVisibility(cancelButton,3);
        return cancelButton;
    }
    public MobileElement getTextfeld() {
        textfeld = Driver.getDriver().findElement(By.xpath("//*[@text='My Task']"));
        BrowserUtilities.waitForVisibility(textfeld, 3);
        return textfeld;
    }
    public MobileElement getDoneButton() {
        doneButton = Driver.getDriver().findElement(By.id("android:id/button1"));
        BrowserUtilities.waitForVisibility(doneButton, 6);
        return doneButton;
    }
    public MobileElement getDialogWindow() {
        dialogWindow = Driver.getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout"));
        BrowserUtilities.waitForVisibility(dialogWindow, 3);
        BrowserUtilities.waitFor(2);
        return dialogWindow;

    }


}
