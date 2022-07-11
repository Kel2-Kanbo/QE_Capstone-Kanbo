package starter.stepdefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.CustomerPage;

public class CustomerSteps {
    @Steps
    CustomerPage customerPage;

    //scenario 1
    @And("admin click customer")
    public void clcikCustomer(){
    }

    @Then("admin see list customer")
    public void adminSeeListCustomer() {
    }

    //scenario 2
    @When("i click delete customer")
    public void iClickDeleteCustomer() {
    }

    @Then("i success to delete customer")
    public void iSuccessToDeleteCustomer() {
    }

    //scenario 3
    @When("i input search box with customer name")
    public void iInputSearchBoxWithCustomerName() {
    }

    @Then("i see customer with this name")
    public void iSeeCustomerWithThisName() {
    }

    //scenario 4
    @When("i fill search box with valid keyword customer")
    public void iFillSearchBoxWithValidKeywordCustomer() {
    }

    @Then("i get customer with this name")
    public void iGetCustomerWithThisName() {
    }

    //scenario 5
    @When("i choose filter on customer page")
    public void iChooseFilterOnCustomerPage() {
    }

    @Then("i see list customer by filter")
    public void iSeeListCustomerByFilter() {
    }
}
