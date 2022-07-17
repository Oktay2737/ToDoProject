package toDoTask.step_definitions;


import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import toDoTask.Pages.DialogPage;
import toDoTask.Pages.StartPage;
import toDoTask.Pages.TaskListPage;
import toDoTask.utilities.BrowserUtilities;


public class Task1StepsDefs {

    TaskListPage taskListPage = new TaskListPage();
    DialogPage dialogPage = new DialogPage();
    StartPage startPage = new StartPage();

    @Given("User clicks plus button")
    public void user_clicks_plus_button() {
        BrowserUtilities.waitFor(1);
        startPage.getPlusButton().click();
    }

    @Then("The Dialog window must be oppened")
    public void the_Dialog_window_must_be_oppened() {
        BrowserUtilities.waitFor(2);
       MobileElement dp=dialogPage.getDialogWindow();
       BrowserUtilities.waitFor(2);
      Assert.assertTrue(dp.isDisplayed());
    }

    @Then("User writes {string} in to the Text field")
    public void user_writes_in_to_the_Text_field(String text) {

        dialogPage.getTextfeld().sendKeys(text);
    }

    @Then("user clicks done button")
    public void user_clicks_done_button() {
        dialogPage.getDoneButton().click();
    }

    @Then("new Task must be created and {string} task must be seen on the task list")
    public void new_Task_must_be_created_and_task_must_be_seen_on_the_task_list(String text) {
        String actual = taskListPage.getTaskTitle(text).getText();
        Assert.assertEquals(actual, text);

    }

}
