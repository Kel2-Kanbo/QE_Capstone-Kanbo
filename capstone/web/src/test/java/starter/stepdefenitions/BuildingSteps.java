package starter.stepdefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
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
        boolean actual = buildingPage.onBuildingPage();
        Assert.assertTrue(actual);
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

    @And("admin click success add")
    public void adminClickSuccessAdd() {
        buildingPage.clickSuccessButton();
    }

    @Then("admin success crete new building")
    public void adminSuccessCreteNewBuilding() {
        boolean actual = buildingPage.validationOnBuildingPage();
        Assert.assertTrue(actual);
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
        buildingPage.fillDurationFacilities("20");
    }

    @And("admin click add facilities")
    public void adminClickAddFacilities() {
        buildingPage.clickAddFacilities();
        buildingPage.clickConfirmFacilities();
    }

    //scenario 5
    @And("admin click close")
    public void adminClickClose() {
        buildingPage.clickCancelButton();
    }

    @Then("admin fail add building and back to building page")
    public void adminFailAddBuildingAndBackToBuildingPage() {
        boolean actual = buildingPage.validationOnBuildingPage();
        Assert.assertTrue(actual);
    }

    //scenario 6
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
        boolean actual = buildingPage.getErrorEmpty();
        Assert.assertTrue(actual);
    }

    //scenario 7
    @When("i click delete on existing building")
    public void iClickDeleteOnExistingBuilding() {
        buildingPage.clickDeleteButton();
    }

    @Then("i success delete building")
    public void iSuccessDeleteBuilding() {
        boolean actual = buildingPage.getErrorMessageDelete();
        Assert.assertTrue(actual);
    }

    //scenario 8
    @And("admin click update button building")
    public void adminClickUpdateButtonBuilding() {
        buildingPage.clickEdtButton();
    }

    @And("admin edit or update data building")
    public void adminEditOrUpdateDataBuilding() {
        buildingPage.fillNameBuilding("sampoerna");
    }

    @And("admin click update building")
    public void adminClickUpdateBuilding() {
        buildingPage.clickUpdateButton();
    }

    @And("admin click success update building")
    public void adminClickSuccessUpdateBuilding() {
        buildingPage.confirmUpdateButton();
    }

    @Then("admin success update building")
    public void adminSuccessUpdateBuilding() {
        boolean actual = buildingPage.validationNameUpdate();
        Assert.assertTrue(actual);
    }
}
