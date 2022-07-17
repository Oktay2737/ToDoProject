package toDoTask.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import toDoTask.utilities.Driver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;


public class BeforeAfterClass {

    @Before
    public void setUp() throws MalformedURLException, InterruptedException {
        Driver.getDriver();
        System.out.println("\tCONNECTED");
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(Scenario scenario) throws MalformedURLException, InterruptedException {

        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","ScreenShot");
        }

        Driver.closeDriver();
        System.out.println("\tCLOSED");

    }

}
