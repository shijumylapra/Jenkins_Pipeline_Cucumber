package stepdefs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class stringStepDefs
{
    String name1, name2,actresult;
    @Given("First string is {string}")
    public void first_string_is(String str)
    {
        this.name1=str;
    }

    @Given("Second string is {string}")
    public void second_string_is(String str)
    {
        this.name2=str;
    }

    @When("Compare two strings")
    public void compare_two_strings()
    {
        if(name1.equals(name2))
        {
            actresult = "matching";
        }
        else
        {
            actresult = "mismatching";
        }
    }

    @Then("I should get the result as {string}")
    public void i_should_get_the_result_as(String expresult)
    {
        Assert.assertEquals(expresult,actresult);
    }


}
