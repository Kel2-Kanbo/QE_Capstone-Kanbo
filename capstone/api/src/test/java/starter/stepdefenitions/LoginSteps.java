package starter.stepdefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.apache.commons.io.output.AppendableOutputStream;
import starter.login.Post;

public class LoginSteps {
    @Steps
    Post post;

    @Given("user set endpoint for login")
    public void setEndpointsLogin(){
        post.setEndpointsLogin();
    }

    @When("user send POST HTTP request with valid data")
    public void userSendPOSTHTTPRequestWithValidData() {
        post.sendPostHttpRequest();
    }

    @Then("user see status code {int}")
    public void userSeeStatusCode(int arg0) {
        post.receiveValidResponseCode();
    }

    @And("get valid data")
    public void getValidData() {
        post.receiveValidData();
    }

    //scenario 2
    @When("user send POST HTTP request with empty data")
    public void userSendPOSTHTTPRequestWithEmptyData() {
        post.sendPostWithEmptyData();
    }

    @Then("user see status code {int} and fail to login")
    public void userSeeStatusCodeAndFailToLogin(int arg0) {
        post.receiveResponseCode(400);
    }

    @And("user get error message")
    public void userGetErrorMessage() {
        post.getErrorMessage();
    }

    //scenario 3
    @When("user send POST HTTP request with not register email")
    public void userSendPOSTHTTPRequestWithNotRegisterEmail() {
        post.userSendPOSTHTTPRequestWithNotRegisterEmail();
    }

    @Then("user see status code {int} after login")
    public void userSeeStatusCodeAfterLogin(int arg0) {
        post.receiveResponseCode401();
    }

    @And("user get error message unauthorized")
    public void userGetErrorMessageUnauthorized() {
        post.getErrorMessageUnauthorized();
    }

    //scenario 4
    @When("user send POST HTTP request with invalid password")
    public void userSendPOSTHTTPRequestWithInvalidPassword() {
        post.userSendPOSTHTTPRequestWithInvalidPassword();
    }

    //scenario 5
    @Given("user set invalid endpoint for login")
    public void userSetInvalidEndpointForLogin() {
        post.userSetInvalidEndpointForLogin();
    }

    @When("user send POST HTTP request")
    public void userSendPOSTHTTPRequest() {
        post.userSendPOSTHTTPRequest();
    }

    @Then("user get status code {int}")
    public void userGetStatusCode(int arg0) {
        post.userGetStatusCode(404);
    }

    @And("user get error message not found")
    public void userGetErrorMessageNotFound() {
        post.userGetErrorMessageNotFound();
    }

    //scenario 6
    @When("user send POST HTTP request with empty email")
    public void userSendPOSTHTTPRequestWithEmptyEmail() {
        post.userSendPOSTHTTPRequestWithEmptyEmail();
    }

    //scenario 7
    @When("user send POST HTTP request with empty password")
    public void userSendPOSTHTTPRequestWithEmptyPassword() {
        post.userSendPOSTHTTPRequestWithEmptyPassword();
    }

    //scenario 8
    @When("user send POST HTTP request with not use @")
    public void userSendPOSTHTTPRequestWithNotUse() {
        post.userSendPOSTHTTPRequestWithNotUse();
    }

    //scenario 9
    @When("user send POST HTTP request with not use domain")
    public void userSendPOSTHTTPRequestWithNotUseDomain() {
        post.userSendPOSTHTTPRequestWithNotUseDomain();
    }

    //scenario 10
    @Given("admin set endpoint for login")
    public void adminSetEndpointForLogin() {
        post.SetEndpointForLoginAdmin();
    }

    @When("admin send POST HTTP request with valid data")
    public void adminSendPOSTHTTPRequestWithValidData() {
        post.SendPOSTHTTPRequestWithValidDataAdmin();
    }

    @And("admin get valid data")
    public void adminGetValidData() {
        post.aGetValidDataAdmin();
    }

    @Then("admin get status code {int}")
    public void adminGetStatusCode(int arg0) {
        post.adminGetStatusCode(200);
    }
}
