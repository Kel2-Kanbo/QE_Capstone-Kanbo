package test.mobile.stepdefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.mobile.pages.RoomPage;

public class RoomSteps {

    @Steps
    RoomPage roomPage;

    //Scenario 1
    @And ("user click view all room")
    public void clickViewAllRoom(){
        roomPage.clickViewRoom();
    }

    @And("user click existing room")
    public void userClickExistingRoom() {
        roomPage.clickExistingRoom();
    }

    @Then("user see detail about room")
    public void userSeeDetailAboutRoom() {
        Assert.assertTrue(roomPage.validateOnRoomPage());
    }

    //scenario 2
    @And("user click booking room")
    public void userClickBookingRoom() {
        roomPage.clickBookingButton();
    }

    @Then("user just completes the data")
    public void userJustCompletesTheData() {
        Assert.assertTrue(roomPage.onBookingPage());
    }
}
