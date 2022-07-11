package test.mobile.stepdefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.mobile.pages.RoomPage;

public class RoomSteps {

    @Steps
    RoomPage roomPage;

    //Scenario 1
    @When("user click room")
    public void clickRoom(){}

    @Then("user see list room on building page")
    public void userSeeListRoomOnBuildingPage() {
    }

    //Scenario 2
    @Given("user on the room page")
    public void userOnTheRoomPage() {
    }

    @When("user click existing room")
    public void userClickExistingRoom() {
    }

    @Then("user see detail about room")
    public void userSeeDetailAboutRoom() {
    }

    //scenario 3
    @Given("on the room page the selected")
    public void onTheRoomPageTheSelected() {
    }

    @When("user click booking room")
    public void userClickBookingRoom() {
    }

    @And("user fill data and pay")
    public void userFillDataAndPay() {
    }

    @Then("user success to booking room")
    public void userSuccessToBookingRoom() {
    }
}
