package test.mobile.stepdefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.mobile.pages.SearchPage;

public class SearchSteps {

    @Steps
    SearchPage searchPage;

    //scenario 1
    @When("user fill search box with keyword city name")
    public void fillSearchBoxWithValidKeyword(){}

    @Then("user see building by city name")
    public void userSeeBuildingByCityName() {
    }

    //scenario 2
    @When("user fill search box with invalid city name")
    public void userFillSearchBoxWithInvalidCityName() {
    }

    @Then("user failed to search building by invalid city name")
    public void userFailedToSearchBuildingByInvalidCityName() {
    }

    //scenario 3
    @When("user click search box")
    public void userClickSearchBox() {
    }

    @And("user click popular name city on the search box")
    public void userClickPopularNameCityOnTheSearchBox() {
    }

    @Then("user see building by popular city")
    public void userSeeBuildingByPopularCity() {
    }
}
