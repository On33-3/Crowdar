package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.constants.LogInPageConstants;
import lippia.web.services.LogInPageService;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import static java.lang.String.valueOf;


public class LogInSteps extends PageSteps {

    @Given("^the client enters the MyAccount page$")
    public void enterMyAccountPage() {
        LogInPageService.enterMyAccountPage();
    }

    @When("^the client logs in successfully$")
    public void logInSuccessful() {
        LogInPageService.logIn("sgroangie13@gmail.com", "asdasd4322321fds");
    }

    @Then("access the MyAccountPage-Dashboard after clicking the button:LOGIN")
    public void enterDashboardAfterLogIn() {
        Assert.assertNotNull(LogInPageConstants.DASHBOARD_BUTTON);
    }

    @When("^the client enters (.*) and (.*) on the logIn section$")
    public void logInFailed(String user, String password) {
        LogInPageService.logIn(user, password);
    }

    @Then("a (.*) is shown")
    public void verifyWarning(String warning) {
        LogInPageService.verifyWarning(warning);
    }

}
