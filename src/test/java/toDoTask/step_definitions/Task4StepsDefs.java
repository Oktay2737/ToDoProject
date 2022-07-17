package toDoTask.step_definitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import toDoTask.Pages.TaskListPage;
import toDoTask.utilities.BrowserUtilities;

public class Task4StepsDefs {
    TaskListPage taskListPage = new TaskListPage();

    @Then("user clicks trash icon")

    public void user_clicks_trash_icon() {

        taskListPage.getMüllTonnenIcon().click();
        BrowserUtilities.waitFor(2);

    }

    @Then("{string} text should be seen on the screen")
    public void text_should_be_seen_on_the_screen(String deleteMessage) {
        String actualToastText =BrowserUtilities.getToastElement(6).getText();
        Assert.assertEquals(deleteMessage, actualToastText);

    }

    @Then("new Task must be deleted and {string} task must not be able to seen on the list")
    public void new_Task_must_be_deleted_and_task_must_not_be_able_to_seen_on_the_list(String text) {
        try {
           taskListPage.getTaskTitle(text);
        } catch (NoSuchElementException e) {
            System.out.println("The task can not be found in the list");
        }
    }
}
