package starter.stepdefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.ComplexPage;

public class ComplexSteps {
    @Steps
    ComplexPage complexPage;

    //scenario 1
    @Given("admin on the home page")
    public void adminOnTheHomePage() {
    }

    @When("admin click complex")
    public void adminClickComplex() {
    }

    @Then("admin success to see existing complex")
    public void adminSuccessToSeeExistingComplex() {
    }

    //scenario 2
    @When("admin click create new complex")
    public void adminClickCreateNewComplex() {
    }

    @And("admin fill new data complex")
    public void adminFillNewDataComplex() {
    }

    @And("admin click create complex")
    public void adminClickCreateComplex() {
    }

    @Then("admin success create new complex")
    public void adminSuccessCreateNewComplex() {
    }

    //scenario 3
    @And("admin fill new data with not fill name complex")
    public void adminFillNewDataWithNotFillNameComplex() {
    }

    @Then("admin failed to create complex with not fill name complex")
    public void adminFailedToCreateComplexWithNotFillNameComplex() {
    }

    //scenario 4
    @And("admin fill complex name")
    public void adminFillComplexName() {
    }

    @And("admin choose province")
    public void adminChooseProvince() {
    }

    @And("admin not choose city and district")
    public void adminNotChooseCityAndDistrict() {
    }

    @Then("admin failed to create complex with not choose city district")
    public void adminFailedToCreateComplexWithNotChooseCityDistrict() {
    }

    //scenario 5
    @And("admin not choose province")
    public void adminNotChooseProvince() {
    }

    @Then("admin failed to create complex with not choose province")
    public void adminFailedToCreateComplexWithNotChooseProvince() {
    }

    //scenario 6
    @And("admin not fill data complex")
    public void adminNotFillDataComplex() {
    }

    @Then("admin failed create complex with empty data")
    public void adminFailedCreateComplexWithEmptyData() {
    }

    //scenario 7
    @And("admin click cancel after fill data complex")
    public void adminClickCancelAfterFillDataComplex() {
    }

    @Then("admin failed to create complex with click cancel")
    public void adminFailedToCreateComplexWithClickCancel() {
    }

    //scenario 8
    @When("i click delete existing complex")
    public void iClickDeleteExistingComplex() {
    }

    @Then("i success delete complex")
    public void iSuccessDeleteComplex() {
    }

    //scenario 9
    @When("i fill search box with valid keyword complex")
    public void iFillSearchBoxWithValidKeywordComplex() {
    }

    @Then("i get complex with this name")
    public void iGetComplexWithThisName() {
    }

    //scenario 10
    @When("i choose filter on complex page")
    public void iChooseFilterOnComplexPage() {
    }

    @Then("i see list complex by filter")
    public void iSeeListComplexByFilter() {
    }
}
