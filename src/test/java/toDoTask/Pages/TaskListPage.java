package toDoTask.Pages;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import toDoTask.utilities.BrowserUtilities;
import toDoTask.utilities.Driver;

public class TaskListPage {

    private MobileElement taskTitle;
    private MobileElement müllTonnenIcon;

    public MobileElement getMüllTonnenIcon() {
        müllTonnenIcon = Driver.getDriver().findElement(By.id("com.example.yeshasprabhakar.todo:id/delete"));
        BrowserUtilities.waitForVisibility(müllTonnenIcon, 3);
        return müllTonnenIcon;
    }

    public MobileElement getTaskTitle(String text){
        taskTitle=Driver.getDriver().findElement(By.xpath("//*[@text='" + text + "']"));
        BrowserUtilities.waitForVisibility(taskTitle, 3);
        return taskTitle;
    }




}
