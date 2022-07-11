package starter.stepdefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.ReviewPage;

public class ReviewSteps {
    @Steps
    ReviewPage reviewPage;

    //scenario 1
    @When("admin click review")
    public void clickReview(){

    }

    @Then("admin see all review")
    public void adminSeeAllReview() {
    }

    //scenario 2
    @When("admin click reply review")
    public void adminClickReplyReview() {
    }

    @And("admin write reply")
    public void adminWriteReply() {
    }

    @And("admin send reply")
    public void adminSendReply() {
    }

    @Then("admin success to send reply review")
    public void adminSuccessToSendReplyReview() {
    }

    //scenario 3
    @When("admin fill username om search box")
    public void adminFillUsernameOmSearchBox() {
    }

    @Then("admin success find review by username")
    public void adminSuccessFindReviewByUsername() {
    }

    //scenario 4
    @When("i choose filter on review page")
    public void iChooseFilterOnReviewPage() {
    }

    @Then("i see list review by filter")
    public void iSeeListReviewByFilter() {
    }
}
