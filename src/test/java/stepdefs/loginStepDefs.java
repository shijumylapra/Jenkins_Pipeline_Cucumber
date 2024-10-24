package stepdefs;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;


public class loginStepDefs
{
    WebDriver webDrv = Hooks.wDriver;
    WebElement LoginLink,UserName,Password,LoginBtn,Error;

    @Given("I have launched the application")
    public void i_have_launched_the_application()
    {
        webDrv.get("https://simplilearn.com/");
        webDrv.manage().window().maximize();
        webDrv.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //Custom Report
        Hooks.Etest.log(LogStatus.PASS,"Application Launched");
    }

    @Given("I click on the Login link")
    public void i_click_on_the_Login_link()
    {
        LoginLink = webDrv.findElement(By.linkText("Log in"));
        LoginLink.click();
        //Custom Report
        Hooks.Etest.log(LogStatus.PASS,"Clicked on Login button");
    }

    @When("I enter the Username")
    public void i_enter_the_Username() {
        UserName = webDrv.findElement(By.name("user_login"));
        UserName.sendKeys("shiju@yahoo.com.com");
        //Custom Report
        Hooks.Etest.log(LogStatus.PASS,"Enter Username");
    }

    @When("I enter the Password")
    public void i_enter_the_Password() {
        Password = webDrv.findElement(By.id("password"));
        Password.sendKeys("!965@Agbcf");
        //Custom Report
        Hooks.Etest.log(LogStatus.PASS,"Enter Password");
    }

    @When("I click on the Login button")
    public void i_click_on_the_Login_button() {
        LoginBtn = webDrv.findElement(By.name("btn_login"));
        LoginBtn.click();
        //Custom Report
        Hooks.Etest.log(LogStatus.PASS,"Login Button Clicked");

    }

    @When("I enter the user name as {string}")
    public void i_enter_the_user_name_as(String Uname) {
        // Write code here that turns the phrase above into concrete actions
        UserName = webDrv.findElement(By.name("user_login"));
        UserName.sendKeys(Uname);
    }

    @When("I enter the password as {string}")
    public void i_enter_the_password_as(String Pword) {
        // Write code here that turns the phrase above into concrete actions
        Password = webDrv.findElement(By.id("password"));
        Password.sendKeys(Pword);
    }

    @Then("I should get the error message as {string}")
    public void i_should_get_the_error_message_as(String expMsg) {
        Error = webDrv.findElement(By.className("error_msg"));
        String actMsg = Error.getText();
        Assert.assertEquals(expMsg, actMsg);

    }
    @Then("I see the below login options present on the screen")
    public void i_see_the_below_login_options_present_on_the_screen(List<String> loginOptions) {

        for (String option : loginOptions) {

            WebElement otherOptions = webDrv.findElement(By.xpath("//span[text()='" + option + "']"));
            Assert.assertTrue(otherOptions.isDisplayed());
        }
    }



}
