package toDoTask.step_definitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import toDoTask.Pages.DialogPage;
import toDoTask.Pages.StartPage;


public class Task2StepsDefs {
    DialogPage dialogPage=new DialogPage();
    StartPage startPage=new StartPage();

    @Then("User clicks cancel button")
    public void user_clicks_cancel_button() {
        dialogPage.getCancelButton().click();
    }

    @Then("No new task was added, users see {string} text at the top.")
    public void no_new_task_was_added_users_see_text_at_the_top(String appMessage){
        String textOfFirstPage = startPage.getFirstPageText().getText();
        Assert.assertTrue(textOfFirstPage.contains(appMessage));
    }

}
