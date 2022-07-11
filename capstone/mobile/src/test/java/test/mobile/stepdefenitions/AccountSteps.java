package test.mobile.stepdefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.mobile.pages.AccountPage;

public class AccountSteps {
    @Steps
    AccountPage accountPage;

    //scenario 1
    @Given("user on the account page")
    public void onTheAccountPage(){}

    @When("user click personal information")
    public void userClickPersonalInformation() {
    }

    @Then("user see personal information")
    public void userSeePersonalInformation() {
    }

    //scenario 2
    @And("user edit email")
    public void userEditEmail() {
    }

    @And("user reset location")
    public void userResetLocation() {
    }

    @And("user click save")
    public void userClickSave() {
    }

    @Then("user success update personal information")
    public void userSuccessUpdatePersonalInformation() {
    }

    //scenario 3
    @And("user delete email")
    public void userDeleteEmail() {
    }

    @Then("user failed to update personal information")
    public void userFailedToUpdatePersonalInformation() {
    }

    //scenario 4
    @When("user click transaction history")
    public void userClickTransactionHistory() {
    }

    @Then("user see all transaction history")
    public void userSeeAllTransactionHistory() {
    }

    //scenario 5
    @When("user click privacy")
    public void userClickPrivacy() {
    }

    @Then("user see all about privacy")
    public void userSeeAllAboutPrivacy() {
    }

    //scenario 6
    @When("user click setting")
    public void userClickSetting() {
    }

    @Then("user see all about setting")
    public void userSeeAllAboutSetting() {
    }

    //scenario 7
    @When("user click logout")
    public void userClickLogout() {
    }

    @And("user click logout on pop up bar")
    public void userClickLogoutOnPopUpBar() {
    }

    @Then("user success to logout and back to login page")
    public void userSuccessToLogoutAndBackToLoginPage() {
    }
}
