package toDoTask.step_definitions;


import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import toDoTask.Pages.StartPage;
import toDoTask.utilities.BrowserUtilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import toDoTask.utilities.Driver;

public class Task5StepsDefs {
    StartPage startPage=new StartPage();

    @Given("User clicks DayNight mode")
    public void user_clicks_DayNight_mode() {

        MobileElement dayIcon = Driver.getDriver().findElement(By.id("com.example.yeshasprabhakar.todo:id/themeActionButton"));
            dayIcon.click();
    }

    @Then("the background should be dark")
    public void the_background_should_be_dark(){
        BrowserUtilities.waitFor(3);
        System.out.println("Now dark screen must be seen");
    }

    @Then("User clicks DayNight mode again")
    public void user_clicks_DayNight_mode_again(){

        MobileElement nightIcon = Driver.getDriver().findElement(By.id("com.example.yeshasprabhakar.todo:id/themeActionButton"));
        nightIcon.click();
    }

    @Then("the background should be light")
    public void the_background_should_be_light(){
        BrowserUtilities.waitFor(3);
        System.out.println("Now light screen must be seen");
    }

}
