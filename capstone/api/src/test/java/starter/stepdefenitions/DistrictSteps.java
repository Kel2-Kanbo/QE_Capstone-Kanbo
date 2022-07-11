package starter.stepdefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.manage.district.GetDistrict;
import starter.manage.district.PostDistrict;

public class DistrictSteps {

    @Steps
    GetDistrict getDistrict;

    @Steps
    PostDistrict postDistrict;


    @Given("admin set endpoint for login admin")
    public void adminSetEndpointForLoginAdmin() {
        postDistrict.adminSetEndpointLoginAsAdmin();
    }

    @When("admin input authorization")
    public void adminInputAuthorization() {
        postDistrict.adminInputAuthorization();
        postDistrict.adminSendAuthToAddDistrict();
    }

    //scenario1
    @Given("admin set endpoint for get district")
    public void adminSetEndpointGetDistrict(){
        getDistrict.setEndpointGetDistrict();
    }

    @When("admin send request district")
    public void adminSendRequestDistrict() {
        getDistrict.sendRequestDistrict();
    }

    @Then("admin get status code {int} on district")
    public void adminGetStatusCodeOnDistrict(int arg0) {
        getDistrict.getStatusCodeOnDistrict(arg0);
    }

    @And("admin get list district")
    public void adminGetListDistrict() {
        getDistrict.getListDistrict();
    }

    //scenario2
    @Given("admin set invalid endpoint for get district")
    public void adminSetInvalidEndpointForGetDistrict() {
        getDistrict.setInvalidEndpointForGetDistrict();
    }

    @When("admin send request invalid endpoint district")
    public void adminSendRequestInvalidEndpointDistrict() {
        getDistrict.sendRequestInvalidEndpointDistrict();
    }

    //scenario3
    @Given("admin set endpoint for add district")
    public void adminSetEndpointForAddDistrict() {
        postDistrict.setEndpointForAddDistrict();
    }

    @When("admin send POST HTTP request with valid data district")
    public void adminSendPOSTHTTPRequestWithValidDataDistrict() {
        postDistrict.sendPOSTHTTPRequestWithValidDataDistrict();
    }

    @And("admin get detail about district")
    public void adminGetDetailAboutDistrict() {
        postDistrict.getDetailAboutDistrict();
    }

    //scenario4
    @Given("admin set invalid endpoint for add district")
    public void adminSetInvalidEndpointForAddDistrict() {
        postDistrict.setInvalidEndpointForAddDistrict();
    }

    @When("admin send POST HTTP request with invalid enpoint district")
    public void adminSendPOSTHTTPRequestWithInvalidEnpointDistrict() {
        postDistrict.sendPOSTHTTPRequestWithInvalidEnpointDistrict();
    }

    //scenario5
    @When("admin send POST HTTP request with invalid input id city")
    public void adminSendPOSTHTTPRequestWithInvalidInputIdCity() {
        postDistrict.sendPOSTHTTPRequestWithInvalidInputIdCity();
    }

    @And("admin get error message after add district")
    public void adminGetErrorMessageAfterAddDistrict() {
        postDistrict.getErrorMessageAfterAddDistrict();
    }

    //scenario6
    @When("admin send POST HTTP request with input same name district")
    public void adminSendPOSTHTTPRequestWithInputSameNameDistrict() {
        postDistrict.sendPOSTHTTPRequestWithInputSameNameDistrict();
    }

    //scenario7
    @When("admin send POST HTTP request with input name by integer")
    public void adminSendPOSTHTTPRequestWithInputNameByInteger() {
        postDistrict.sendPOSTHTTPRequestWithInputNameByInteger();
    }


}
