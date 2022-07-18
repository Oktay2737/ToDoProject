package toDoTask.step_definitions;


import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import toDoTask.Pages.StartPage;
import toDoTask.utilities.BrowserUtilities;
import toDoTask.utilities.Driver;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Task5StepsDefs {
    private int centerX =560;
    private int centerY=1500;
    private int red1,red2,green1,green2,blue1,blue2;

    @Given("User clicks DayNight mode")
    public void user_clicks_DayNight_mode() {

        MobileElement dayIcon = Driver.getDriver().findElement(By.id("com.example.yeshasprabhakar.todo:id/themeActionButton"));
            dayIcon.click();
    }

    @Then("the background should be dark")
    public void the_background_should_be_dark() throws IOException {
        BrowserUtilities.waitFor(3);
        System.out.println("Now dark screen must be seen");
        File scrFile = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.FILE);

        BufferedImage image = ImageIO.read(scrFile);
// Getting pixel color by position x and y
        int clr = image.getRGB(centerX,centerY);
        red1   = (clr & 0x00ff0000) >> 16;
        green1 = (clr & 0x0000ff00) >> 8;
        blue1  =  clr & 0x000000ff;

        Assert.assertEquals(0,red1);
        Assert.assertEquals(0,green1);
        Assert.assertEquals(0,blue1);

        System.out.println("rgb("+red1+", " +green1+", "+blue1+ ")");
    }

    @Then("User clicks DayNight mode again")
    public void user_clicks_DayNight_mode_again(){

        MobileElement nightIcon = Driver.getDriver().findElement(By.id("com.example.yeshasprabhakar.todo:id/themeActionButton"));
        nightIcon.click();
    }

    @Then("the background should be light")
    public void the_background_should_be_light() throws IOException {
        BrowserUtilities.waitFor(3);
        System.out.println("Now light screen must be seen");
        File scrFile = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.FILE);

        BufferedImage image = ImageIO.read(scrFile);
// Getting pixel color by position x and y
        int clr = image.getRGB(centerX,centerY);
        red2   = (clr & 0x00ff0000) >> 16;
        green2 = (clr & 0x0000ff00) >> 8;
        blue2  =  clr & 0x000000ff;

        Assert.assertEquals(255,red2);
        Assert.assertEquals(255,green2);
        Assert.assertEquals(255,blue2);

        System.out.println("rgb("+red2+", " +green2+", "+blue2+ ")");
    }

}
