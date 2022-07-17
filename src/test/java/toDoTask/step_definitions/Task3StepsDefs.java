package toDoTask.step_definitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import toDoTask.utilities.BrowserUtilities;



public class Task3StepsDefs {
    @Then("{string} message must be seen on the screen")
    public void message_must_be_seen_on_the_screen(String failureMessage){
        String toastMessage=BrowserUtilities.getToastElement(6).getText();
        Assert.assertEquals(failureMessage,toastMessage);
    }
}
