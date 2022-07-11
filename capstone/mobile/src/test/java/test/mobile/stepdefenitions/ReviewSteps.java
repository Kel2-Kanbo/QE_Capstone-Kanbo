package test.mobile.stepdefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.mobile.pages.ReviewPage;

public class ReviewSteps {

    @Steps
    ReviewPage reviewPage;

    //scenario 1
    @When("user click review on the room booking")
    public void clickReviewOnRoomBooking(){}

    @And("user give stars about room")
    public void userGiveStarsAboutRoom() {
    }

    @And("user fill review box")
    public void userFillReviewBox() {
    }

    @And("user click send review")
    public void userClickSendReview() {
    }

    @Then("user success to give review")
    public void userSuccessToGiveReview() {
    }

    //scenario 2
    @Given("user on  the detail room page")
    public void userOnTheDetailRoomPage() {
    }

    @When("user click view all on review")
    public void userClickViewAllOnReview() {
    }

    @Then("user see all reviews")
    public void userSeeAllReviews() {
    }

    //scenario 3
    @And("user not fill review box")
    public void userNotFillReviewBox() {
    }
}
