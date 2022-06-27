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

    @Given("admin set endpoint for register")
    public void adminSetEndpointForRegister() {
        postRegist.setEndpointsRegister();
    }

    @When("admin send create account with valid data")
    public void adminSendCreateAccountWithValidData() {
        postRegist.sendCreateAccountWithValidData();
    }

    @Then("admin see status code {int} after send register")
    public void adminSeeStatusCodeAfterSendRegister(int arg0) {
        postRegist.seeResponseCodeAfterRegist();
    }
    @And("admin see new detail account")
    public void adminSeeNewDetailAccount() {
        postRegist.userSeeDetailData();
    }

    //scenario 2
    @When("admin send POST HTTP request with empty data register")
    public void adminSendPOSTHTTPRequestWithEmptyDataRegister() {
        postRegist.sendPostWithEmptyDataRegister();
    }
    @Then("admin see status code {int} and fail to create account")
    public void adminSeeStatusCodeAndFailToCreateAccount(int arg0) {
        postRegist.receiveResponseCode400();
    }
    @And("admin get error message after regist")
    public void adminGetErrorMessageAfterRegist() {
        postRegist.getErrorMessageRegist();
    }

    //scenario 3
    @When("admin send POST HTTP request with empty email")
    public void adminSendPOSTHTTPRequestWithEmptyEmail() {
        postRegist.sendPOSTHTTPRequestWithEmptyEmail();
    }

    //scenario 4
    @When("admin send POST HTTP request with invalid email register")
    public void adminSendPOSTHTTPRequestWithInvalidEmailRegister() {
        postRegist.sendPOSTHTTPRequestWithInvalidEmailRegister();
    }

    //scenario 5
    @When("admin send POST HTTP request with not use domain email")
    public void adminSendPOSTHTTPRequestWithNotUseDomainEmail() {
        postRegist.sendPOSTHTTPRequestWithNotUseDomainEmail();
    }

    //scenario 6
    @When("admin send POST HTTP request with empty username")
    public void adminSendPOSTHTTPRequestWithEmptyUsername() {
        postRegist.sendPOSTHTTPRequestWithEmptyUsername();
    }

    //scenario 7
    @When("admin send POST HTTP request with fill number on username field")
    public void adminSendPOSTHTTPRequestWithFillNumberOnUsernameField() {
        postRegist.sendPOSTHTTPRequestWithFillNumberOnUsernameField();
    }

    //scenario 8
    @When("admin send POST HTTP request with fill letter on username field")
    public void adminSendPOSTHTTPRequestWithFillLetterOnUsernameField() {
        postRegist.SendPOSTHTTPRequestWithFillLetterOnUsernameField();
    }

    //scenario 9
    @When("admin send POST HTTP request with empty password")
    public void adminSendPOSTHTTPRequestWithEmptyPassword() {
        postRegist.SendPOSTHTTPRequestWithEmptyPassword();
    }

    //scenario 10
    @When("admin send POST HTTP request with invalid password")
    public void adminSendPOSTHTTPRequestWithInvalidPassword() {
        postRegist.SendPOSTHTTPRequestWithInvalidPassword();
    }

    //scenario 11
    @When("admin send POST HTTP request with fill password with number")
    public void adminSendPOSTHTTPRequestWithFillPasswordWithNumber() {
        postRegist.SendPOSTHTTPRequestWithFillPasswordWithNumber();
    }

    //scenario 12
    @When("admin send POST HTTP request with fill password with letter")
    public void adminSendPOSTHTTPRequestWithFillPasswordWithLetter() {
        postRegist.SendPOSTHTTPRequestWithFillPasswordWithLetter();
    }

    //scenario 13
    @When("admin send POST HTTP request with fill password with combination char")
    public void adminSendPOSTHTTPRequestWithFillPasswordWithCombinationChar() {
        postRegist.SendPOSTHTTPRequestWithFillPasswordWithCombinationChar();
    }

    //scenario 14
    @When("admin send POST HTTP request with registered email")
    public void adminSendPOSTHTTPRequestWithRegisteredEmail() {
        postRegist.SendPOSTHTTPRequestWithRegisteredEmail();
    }

    @And("admin get error message email is already taken")
    public void adminGetErrorMessageEmailIsAlreadyTaken() {
        postRegist.GetErrorMessageEmail();
    }

    //scenario17
    @When("admin send POST HTTP request with maks random char")
    public void adminSendPOSTHTTPRequestWithMaksRandomChar() {
        postRegist.SendPOSTHTTPRequestWithMaksRandomChar();
    }

    //scenario 15
    @When("admin send POST HTTP request with registered username")
    public void adminSendPOSTHTTPRequestWithRegisteredUsername() {
        postRegist.SendPOSTHTTPRequestWithRegisteredUsername();
    }

    @And("admin get error message username is already")
    public void adminGetErrorMessageUsernameIsAlready() {
        postRegist.GetErrorMessageUser();
    }

    //scenario 16
    @Given("admin set invalid endpoint for register")
    public void adminSetInvalidEndpointForRegister() {
        postRegist.SetInvalidEndpointForRegister();
    }

    @When("admin send create account")
    public void adminSendCreateAccount() {
        postRegist.SendCreateAccount();
    }

    @Then("admin see status code {int}")
    public void adminSeeStatusCode(int arg0) {
        postRegist.adminSeeStatusCode(404);
    }

    @And("admin get error message not found")
    public void adminGetErrorMessageNotFound() {
        postRegist.GetErrorMessageNotFound();
    }
}
