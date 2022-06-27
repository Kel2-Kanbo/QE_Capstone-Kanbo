package starter.stepdefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.manage.city.GetCity;
import starter.manage.city.PostCity;

public class CitySteps {

    @Steps
    GetCity getCity;

    @Steps
    PostCity postCity;

    //scenario1
    @Given("admin set endpoint for get city")
    public void adminSetEndpointForGetCity(){
        getCity.setEndpointForGetCity();
    }

    @When("admin send request")
    public void adminSendRequest() {
        getCity.sendRequest();
    }

    @And("admin get list city")
    public void adminGetListCity() {
        getCity.getListCity();
    }

    //scenario2
    @Given("admin set invalid endpoint for get city")
    public void adminSetInvalidEndpointForGetCity() {
        getCity.setInvalidEndpointForGetCity();
    }

    @When("admin send request invalid endpoint")
    public void adminSendRequestInvalidEndpoint() {
        getCity.sendRequestInvalidEndpoint();
    }

    @And("admin get error message")
    public void adminGetErrorMessage() {
        getCity.getErrorMessage();
    }

    //scenario3
    @Given("admin set endpoint for add city")
    public void adminSetEndpointForAddCity() {
        postCity.setInvalidEndpointForAddCity();
    }

    @When("admin send POST HTTP request with valid data city")
    public void adminSendPOSTHTTPRequestWithValidDataCity() {
        postCity.sendPOSTHTTPRequestWithValidDataCity();
    }

    @And("admin get detail about city")
    public void adminGetDetailAboutCity() {
        postCity.getDetailAboutCity();
    }

    //scenario4
    @Given("admin set invalid endpoint for add city")
    public void adminSetInvalidEndpointForAddCity() {
        postCity.setInvalidEndpointForAddCity();
    }

    @When("admin send POST HTTP request with invalid enpoint")
    public void adminSendPOSTHTTPRequestWithInvalidEnpoint() {
        postCity.sendPOSTHTTPRequestWithInvalidEnpoint();
    }

    //scenario5
    @When("admin send POST HTTP request with invalid input data")
    public void adminSendPOSTHTTPRequestWithInvalidInputData() {
        postCity.sendPOSTHTTPRequestWithInvalidInputData();
    }

    @And("admin get error message after add city")
    public void adminGetErrorMessageAfterAddCity() {
    }

    //scenario6
    @When("admin send POST HTTP request with same name")
    public void adminSendPOSTHTTPRequestWithSameName() {
        postCity.sendPOSTHTTPRequestWithSameName();
    }

    @Then("admin get status code {int} on city")
    public void adminGetStatusCodeOnCity(int arg0) {
        postCity.getStatusCodeOnCity(arg0);
    }
}
