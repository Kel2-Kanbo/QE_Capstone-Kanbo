package starter.stepdefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.RoomPage;

public class RoomSteps {
    @Steps
    RoomPage roomPage;

    //scenario 1
    @Given("user on the home page")
    public void onTheHomePage(){
    }

    @When("i click room")
    public void iClickRoom() {
    }

    @Then("i success see list room")
    public void iSuccessSeeListRoom() {
    }

    //scenario 2
    @When("i click create new room")
    public void iClickCreateNewRoom() {
    }

    @And("i fill new data room")
    public void iFillNewDataRoom() {
    }

    @And("i click create room")
    public void iClickCreateRoom() {
    }

    @Then("i success create new room")
    public void iSuccessCreateNewRoom() {
    }

    //scenario 3
    @And("i not fill new data room")
    public void iNotFillNewDataRoom() {
    }

    @Then("i failed create new room with empty data")
    public void iFailedCreateNewRoomWithEmptyData() {
    }

    //scenario 4
    @And("i fill same data room")
    public void iFillSameDataRoom() {
    }

    @Then("i failed to create room with same data")
    public void iFailedToCreateRoomWithSameData() {
    }

    //scenario 5
    @When("i click delete existing room")
    public void iClickDeleteExistingRoom() {
    }

    @Then("i success delete room")
    public void iSuccessDeleteRoom() {
    }

    //scenario 6
    @When("i fill search box with valid keyword room")
    public void iFillSearchBoxWithValidKeywordRoom() {
    }

    @Then("i get room with this name")
    public void iGetRoomWithThisName() {
    }

    //scenario
    @When("i choose filter on room page")
    public void iChooseFilterOnRoomPage() {
    }

    @Then("i see list room by filter")
    public void iSeeListRoomByFilter() {
    }
}
