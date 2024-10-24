package stepdefs;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        //plugin = {"pretty"},// console output
        plugin = {"pretty","html:target/html-cucumber"},// console output
        features = "src/test/java/features", // Generate HTML report under target folder
        glue = "stepdefs",
        tags = {"@user_login"} // this tags called scenario level tags
        // Run single tag
        // tags = {"not @Ignore"} // (Ignore any particular Scenarios file)
        // Run all Scenarios from all feature files everything other than Ignore
        //tags = {"@Calculator"} // this tags called feature level tags
        // (run entire feature file)
        // tags = {"@user_login and not @Ignore"} // (run entire scenario from feature file other than ignore)
        //tags = {"@US_1001 and @Regression"} //Scenarios with multiple tags (@US_1001 and @Regression)// tags = {"@US_1001 and @Regression"} //Scenarios with multiple tags (@US_1001 and @Regression)
        //tags = {"@Calculator and @user_login"}this tags will run both feature files
)

public class TestRunner {
}
