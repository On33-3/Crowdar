package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LogInPageService;
import lippia.web.services.RegistrationService;

public class RegistrationStep {

    @When("^the client enters email and password$")
    public void putEmailAndPass() {

        RegistrationService.putEmailAndPass("awdawdaw@awdaw.com", "sadasd324532");
    }

    @And("^the client click on register button$")
    public void clickOnRegisterButton() {
        RegistrationService.clickOnRegisterButton();
    }

    @Then("^the client sees a welcome message$")
    public void verifyWelcomeMessage() {
        RegistrationService.verifyWelcomeMessage();
    }



    @When("^the client enters (.*) and (.*) on the Register section$")
    public void putEmailAndPassByVariables(String email,String pass) {

        RegistrationService.putEmailAndPassByVariables( email,  pass);

    }

    @Then("^a (.*) is shown on registration section$")
    public void verifyMessageWarnings (String warning){
        RegistrationService.verifyMessageWarnings(warning);

    }

}
