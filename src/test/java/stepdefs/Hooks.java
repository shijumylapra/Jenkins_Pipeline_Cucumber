package stepdefs;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.AfterClass;
import javax.naming.ldap.ExtendedRequest;
import java.time.Duration;

public class Hooks
{
    //ExtendReport is Custom Report for TestNG, Cucumber project
    public static ExtentReports Ereport = new ExtentReports("ExtentReport.html",false);
    public static ExtentTest Etest;

    public static WebDriver wDriver;
    //Every scenario before Hook and after Hook will execute
    //just like before method and after method
    @Before
    public void SetUp(Scenario Snr )
    {
        Etest = Ereport.startTest(Snr.getName());
        wDriver = new ChromeDriver();
   }

    @After
    public void TearDown()
    {
        wDriver.quit();
        Ereport.endTest(Etest);
        Ereport.close();

    }

}

