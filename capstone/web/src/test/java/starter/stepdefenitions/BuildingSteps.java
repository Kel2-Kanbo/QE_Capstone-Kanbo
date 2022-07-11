package starter.stepdefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.BuildingPage;

public class BuildingSteps {

    @Steps
    BuildingPage buildingPage;

    //scenario 1
    @Given("I am on the home page")
    public void onTheHomePage(){
    }

    @When("I click building on home page")
    public void iClickBuildingOnHomePage() {
    }

    @Then("I can see list building")
    public void iCanSeeListBuilding() {
    }

    //scenario 2
    @When("admin click create new building")
    public void adminClickCreateNewBuilding() {
    }

    @And("admin fill new data building")
    public void adminFillNewDataBuilding() {
    }

    @And("admin click create")
    public void adminClickCreate() {
    }

    @Then("admin success crete new building")
    public void adminSuccessCreteNewBuilding() {
    }

    //scenario 3
    @When("admin fill same data building")
    public void adminFillSameDataBuilding() {
    }

    @Then("admin fail to create new building")
    public void adminFailToCreateNewBuilding() {
    }

    //scenario 4
    @When("admin click cancel")
    public void adminClickCancel() {
    }

    @Then("admin fail create building and back to building page")
    public void adminFailCreateBuildingAndBackToBuildingPage() {
    }

    //scenario 5
    @When("admin bot fill data building")
    public void adminBotFillDataBuilding() {
    }

    @Then("admin fail to crete building and get message")
    public void adminFailToCreteBuildingAndGetMessage() {
    }

    //scenario 6
    @When("i click delete on existing building")
    public void iClickDeleteOnExistingBuilding() {
    }

    @Then("i success delete building")
    public void iSuccessDeleteBuilding() {
    }

    //scenario 7
    @When("i fill search box with valid keyword")
    public void iFillSearchBoxWithValidKeyword() {
    }

    @Then("i get building with this name")
    public void iGetBuildingWithThisName() {
    }

    //scenario 8
    @When("i choose filter on building page")
    public void iChooseFilterOnBuildingPage() {
    }

    @Then("i see building by filter")
    public void iSeeBuildingByFilter() {
    }
}
