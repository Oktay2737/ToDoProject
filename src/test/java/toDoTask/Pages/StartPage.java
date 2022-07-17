package toDoTask.Pages;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import toDoTask.utilities.BrowserUtilities;
import toDoTask.utilities.Driver;



public class StartPage {

    private MobileElement plusButton;
    private MobileElement firstPageText;

    public MobileElement getPlusButton() {
        plusButton = Driver.getDriver().findElement(By.id("com.example.yeshasprabhakar.todo:id/fab"));
        BrowserUtilities.waitForVisibility(plusButton, 3);
        return plusButton;
    }
    public MobileElement getFirstPageText(){
        firstPageText = Driver.getDriver().findElement(By.xpath("//*[@text='What do you want to do today?\n" + "You can create new ToDo \n" + "using + button\n" + "\n" + "']"));
        BrowserUtilities.waitForVisibility(firstPageText, 3);
        return firstPageText;
    }





}
