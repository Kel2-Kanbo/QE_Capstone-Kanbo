package starter.stepdefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import starter.pages.ComplexPage;

public class ComplexSteps {
    @Steps
    ComplexPage complexPage;

    //scenario 1
    @Given("admin on the home page")
    public void adminOnTheHomePage() {
        complexPage.validationOnHomepage();
    }

    @When("admin click complex")
    public void adminClickComplex() {
        complexPage.clickComplex();
    }

    @Then("admin success to see existing complex")
    public void adminSuccessToSeeExistingComplex() {
        complexPage.validationOnComplexPage();
    }

    //scenario 2
    @When("admin click create new complex")
    public void adminClickCreateNewComplex() {
        complexPage.clickCreateNewComplex();
    }

    @And("admin fill new data complex")
    public void adminFillNewDataComplex() {
        complexPage.fillName("mawar hitam");
        complexPage.fillAddress("jln.proklamasi");
    }

    @And("admin choose province")
    public void adminChooseProvince() {
        complexPage.chooseExistingProvince();
    }

    @And("admin choose city")
    public void adminChooseCity() {
        complexPage.chooseExistingCity();
    }

    @And("admin choose district")
    public void adminChooseDistrict() {
        complexPage.chooseExistingDistrict();
    }

    @And("admin click create complex")
    public void adminClickCreateComplex() {
        complexPage.clickAddComplex();
    }

    @And("admin click success complex")
    public void clickSuccessComplex() {
        complexPage.clickSuccessButton();
    }

    @Then("admin success create new complex")
    public void adminSuccessCreateNewComplex() {
        boolean actual = complexPage.validationOnComplexPage();
        Assert.assertTrue(actual);
    }

    //scenario 3
    @And("admin fill new data with not fill name complex")
    public void adminFillNewDataWithNotFillNameComplex() {
        complexPage.fillName("");
    }

    @Then("admin failed to create complex with not fill name complex")
    public void adminFailedToCreateComplexWithNotFillNameComplex() {
        complexPage.getErrorNoName();
    }

    //scenario 4
    @And("admin fill complex name")
    public void adminFillComplexName() {
        complexPage.fillName("mawar hijau");
        complexPage.fillAddress("jln.A.Yani");
    }

    @And("admin not choose city and district")
    public void adminNotChooseCityAndDistrict() {
        complexPage.NotChooseExistingCity();
        complexPage.NotChooseExistingDistrict();
    }

    @Then("admin failed to create complex with not choose city")
    public void adminFailedToCreateComplexWithNotChooseCity() {
        boolean actual =  complexPage.getErrorNoCity();
        Assert.assertTrue(actual);
    }

    @And("admin failed to create complex with not choose distrit")
    public void adminFailedToCreateComplexWithNotChooseDistrit() {
        boolean actual = complexPage.getErrorNoDistrict();
        Assert.assertTrue(actual);
    }

    //scenario 5
    @And("admin not choose province")
    public void adminNotChooseProvince() {
        complexPage.notChooseExistingProvince();
    }

    @Then("admin failed to create complex with not choose province")
    public void adminFailedToCreateComplexWithNotChooseProvince() {
        boolean actual = complexPage.getErrorNoProvince();
        Assert.assertTrue(actual);
    }

    //scenario 6
    @And("admin not fill data complex")
    public void adminNotFillDataComplex() {
        complexPage.fillName("");
        complexPage.fillAddress("");
    }

    @And("admin not choose province,city,district")
    public void adminNotChooseProvinceCityDistrict() {
        complexPage.notChooseExistingProvince();
        complexPage.NotChooseExistingCity();
        complexPage.NotChooseExistingDistrict();
    }

    @Then("admin failed create complex with empty data")
    public void adminFailedCreateComplexWithEmptyData() {
        boolean actual = complexPage.getErrorEmptyData();
        Assert.assertTrue(actual);
    }

    //scenario 7
    @And("admin click cancel after fill data complex")
    public void adminClickCancelAfterFillDataComplex() {
        complexPage.clickCancelOnComplex();
    }

    @Then("admin failed to create complex with click cancel")
    public void adminFailedToCreateComplexWithClickCancel() {
        boolean actual = complexPage.validationOnComplexPage();
        Assert.assertTrue(actual);
    }

    //scenario 8
    @When("i click delete existing complex")
    public void iClickDeleteExistingComplex() {
        complexPage.clickDeleteButton();
    }

    @And("i click confirm delete")
    public void iClickConfirmDelete() {
        complexPage.clickConfirmDelete();
    }

    @Then("i success delete complex")
    public void iSuccessDeleteComplex() {
    }

    //scenario 9
    @And("admin click edit button on complex")
    public void adminClickEditButtonOnComplex() {
        complexPage.clickEditButton();
    }

    @And("admin edit data complex")
    public void adminEditDataComplex() {
    }

    @Then("admin success edit complex")
    public void adminSuccessEditComplex() {
    }
}
