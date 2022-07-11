package test.mobile.stepdefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.mobile.pages.BookingPage;

public class BookingSteps {

    @Steps
    BookingPage bookingPage;

    //scenario 1
    @When("user click booking room on home page")
    public void clickBookingRoomOnHomePage(){}

    @Then("user see room on booking page")
    public void userSeeRoomOnBookingPage() {
    }

    //scenario 2
    @Given("user on the booking page")
    public void userOnTheBookingPage() {
    }

    @When("user click checkout")
    public void userClickCheckout() {
    }

    @And("user fill data and choose payment")
    public void userFillDataAndChoosePayment() {
    }

    @Then("user success to booking room on booking page")
    public void userSuccessToBookingRoomOnBookingPage() {
    }

    //scenario 3
    @When("user click history")
    public void userClickHistory() {
    }

    @Then("user see all history booking room")
    public void userSeeAllHistoryBookingRoom() {
    }
}
