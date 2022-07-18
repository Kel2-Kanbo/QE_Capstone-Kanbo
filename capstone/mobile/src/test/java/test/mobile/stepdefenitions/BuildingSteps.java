package test.mobile.stepdefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.mobile.pages.BuildingPage;

public class BuildingSteps {

    @Steps
    BuildingPage buildingPage;

    //scenario 1
    @Given("user on the home page")
    public void onTheHomePage(){
        buildingPage.onTheHomePage();
    }

    @When("user click existing building on the home page")
    public void userClickExistingBuildingOnTheHomePage() {
        buildingPage.clickBuilding();
    }

    @Then("user see detail building")
    public void userSeeDetailBuilding() {
        Assert.assertTrue(buildingPage.onPageBuilding());
    }

    @And("user see list room on building")
    public void userSeeListRoomOnBuilding() {
        Assert.assertTrue(buildingPage.seeListRoom());
    }

    //scenario 2
    @Given("user on the building page")
    public void userOnTheBuildingPage() {
        buildingPage.onPageBuilding();
    }

    @When("user click nearby facilities")
    public void userClickNearbyFacilities() {
        buildingPage.clickNearby();
    }

    @Then("user see pop up menu about nearby facilities")
    public void userSeePopUpMenuAboutNearbyFacilities() {
        Assert.assertTrue(buildingPage.getPopUpNearby());
    }
}
