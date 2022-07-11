package test.mobile.stepdefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.mobile.pages.BuildingPage;

public class BuildingSteps {

    @Steps
    BuildingPage buildingPage;

    //scenario 1
    @Given("user on the home page")
    public void onTheHomePage(){}

    @When("user click existing building on the home page")
    public void userClickExistingBuildingOnTheHomePage() {
    }

    @Then("user see detail building")
    public void userSeeDetailBuilding() {
    }

    //scenario 2
    @And("user see list room on building")
    public void userSeeListRoomOnBuilding() {
    }

    //scenario 3
    @Given("user on the building page")
    public void userOnTheBuildingPage() {
    }

    @When("user click nearby facilities")
    public void userClickNearbyFacilities() {
    }

    @Then("user see pop up menu about nearby facilities")
    public void userSeePopUpMenuAboutNearbyFacilities() {
    }
}
