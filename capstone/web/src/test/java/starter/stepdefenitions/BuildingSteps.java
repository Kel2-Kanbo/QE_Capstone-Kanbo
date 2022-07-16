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
    @When("I click building on home page")
    public void iClickBuildingOnHomePage() {
        buildingPage.toBuildingPage();
    }

    @Then("I can see list building")
    public void iCanSeeListBuilding() {
        buildingPage.onBuildingPage();
    }

    //scenario 2
    @When("admin click create new building")
    public void adminClickCreateNewBuilding() {
        buildingPage.clickCreateBuilding();
    }

    @And("admin fill name building")
    public void adminFillNameBuilding() {
        buildingPage.fillNameBuilding("building Gudang Garam");
    }

    @And("admin choose complex")
    public void adminChooseComplex() {
        buildingPage.chooseExistingComplex();
    }

    @And("admin fill address building")
    public void adminFillAddressBuilding() {
        buildingPage.fillAddressBuilding("jln.Merdeka 5");
    }

    @And("admin fill description")
    public void adminFillDescription() {
        buildingPage.fillDescriptionBuilding("bangunan dengan fasilitas tercanggih");
    }

    @And("admin click create")
    public void adminClickCreate() {
        buildingPage.clickAddBuilding();
    }

    @Then("admin success crete new building")
    public void adminSuccessCreteNewBuilding() {
        buildingPage.clickSuccessButton();
    }

    //scenario 3
    @And("admin choose facilities")
    public void adminChooseFacilities() {
        buildingPage.chooseExistingFacilitiesCategory();
    }

    @And("admin fill name facilities")
    public void adminFillNameFacilities() {
        buildingPage.fillNameFacilities("RSUD M.DJAMIL");
    }

    @And("admin fill duration and distance facilities")
    public void adminFillDurationAndDistanceFacilities() {
        buildingPage.fillDistanceFacilities("20");
    }

    @And("admin click add facilities")
    public void adminClickAddFacilities() {
        buildingPage.fillDurationFacilities("20");
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
    @And("admin not fill name building")
    public void adminNotFillNameBuilding() {
        buildingPage.fillNameBuilding("");
    }

    @And("admin not choose complex")
    public void adminNotChooseComplex() {
        buildingPage.NotchooseExistingComplex();
    }

    @And("admin not fill address building")
    public void adminNotFillAddressBuilding() {
        buildingPage.fillAddressBuilding("");
    }

    @And("admin not fill description")
    public void adminNotFillDescription() {
        buildingPage.fillDescriptionBuilding("");
    }

    @Then("admin fail to crete building and get message")
    public void adminFailToCreteBuildingAndGetMessage() {
        buildingPage.getErrorEmpty();
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

    @And("admin click close")
    public void adminClickClose() {

    }
}
