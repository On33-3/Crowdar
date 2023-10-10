package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.HomePageService;

public class HomePageSteps extends PageSteps {

    @Given("^the client enters the home page$")
    public void home() {
        HomePageService.goToHomePage();
    }

    @When("^the client clicks on Shop Menu button$")
    public void clickShopMenuButton() {
        HomePageService.clickShopMenuButton();
    }

    @And("^the client clicks on Home button$")
    public void clickHomeButton() {
        HomePageService.clickHomeButton();
    }

    @And("^the client clicks on one of the 3 arrivals picture$")
    public void clicksAnArrivalPicture() {
        HomePageService.clicksAnArrivalPicture();
    }

    @And("^the client clicks on Description tab$")
    public void clicksOnDescriptionTab(){
        HomePageService.clicksOnDescriptionTab();
    }
    @And("^the client clicks on reviews tab$")
    public void clicksOnReviewTab(){
        HomePageService.clicksOnReviewTab();
    }
    @Then("the client is taken to a screen where they can add the book to their basket")
    public void verifyAddToBasketButton() {
        HomePageService.verifyAddToBasketButton();
    }

    @Then("the client should see the description of the selected book")
    public void verifyDescriptionTab() {
        HomePageService.verifyDescriptionTab();
    }

    @Then("the client should see the reviews of the selected book")
    public void verifyReviewTab() {
        HomePageService.verifyReviewTab();
    }
}
