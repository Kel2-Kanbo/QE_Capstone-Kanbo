package starter.stepdefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.register.PostRegist;


public class RegistStep {
    @Steps
    PostRegist postRegist;

    @Given("user set endpoint for register")
    public void userSetEndpointForRegister() {
        postRegist.setEndpointsRegister();
    }

    @When("user send create account with valid data")
    public void userSendCreateAccountWithValidData() {
        postRegist.sendCreateAccountWithValidData();
    }

    @Then("user see status code {int} after send register")
    public void userSeeStatusCodeAfterSendRegister(int arg0) {
        postRegist.seeResponseCodeAfterRegist();
    }
    @And("user see new detail account")
    public void userSeeNewDetailAccount() {
        postRegist.userSeeDetailData();
    }

    //scenario 2
    @When("user send POST HTTP request with empty data register")
    public void userSendPOSTHTTPRequestWithEmptyDataRegister() {
        postRegist.sendPostWithEmptyDataRegister();
    }
    @Then("user see status code {int} and fail to create account")
    public void userSeeStatusCodeAndFailToCreateAccount(int arg0) {
        postRegist.receiveResponseCode400();
    }
    @And("user get error message after regist")
    public void userGetErrorMessageAfterRegist() {
        postRegist.getErrorMessageRegist();
    }
}
