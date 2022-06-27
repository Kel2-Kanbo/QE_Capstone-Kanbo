package test.mobile.stepdefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.mobile.pages.LoginPage;

public class LoginSteps {
    @Steps
    LoginPage loginPage;

    //scenario1
    @Given("android user on landing screen")
    public void onLandingPage(){
        boolean actual = loginPage.onLoginPage();
        Assert.assertTrue(actual);
    }

    @When("android user input valid email")
    public void inputValidEmail(){
        loginPage.inputEmail("dedeb1@gmail.com");
    }

    @And("android user input valid password")
    public void inputValidPassword(){
        loginPage.inputPassword("password!2");
    }

    @And("android user click login button")
    public void clickLoginButton(){
        loginPage.clickLoginButton();
    }

    @Then("android user see homepage")
    public void seeHomepage(){
        boolean actual = loginPage.onHomePage();
        Assert.assertTrue(actual);
    }

    @And("android user click profile")
    public void androidUserClickProfile() {
        loginPage.clickProfileTab();
    }

    @And("android user click logout")
    public void androidUserClickLogout() {
        loginPage.clickLogoutButton();
    }

    @Then("android user on login page")
    public void androidUserOnLoginPage() {
        loginPage.getMessageAfterLogout();
        loginPage.onLoginPage();
    }

    //scenario 2
    @When("android user not input email")
    public void androidUserNotInputEmail() {
        loginPage.inputEmail("");
    }

    @And("android user not input password")
    public void androidUserNotInputPassword() {
        loginPage.inputPassword("");
    }

    @Then("android user see error message on field")
    public void androidUserSeeErrorMessageOnField() {
        loginPage.getErrorMessageEmptyEmail();
        loginPage.getErrorMessageEmptyPassword();
    }

    //scenario 3
    @Then("android user see error message on email field")
    public void androidUserSeeErrorMessageOnEmailField() {
        loginPage.getErrorMessageEmptyEmail();
    }

    //scenario 4
    @Then("android user see error message on password field")
    public void userSeeErrorMessageOnPasswordField() {
        loginPage.getErrorMessageEmptyPassword2();
    }

    //scenario5
    @When("android user input not registered email")
    public void androidUserInputNotRegisteredEmail() {
        loginPage.inputEmail("ucok123@gmail.com");
    }

    @And("android user input password")
    public void androidUserInputPassword() {
        loginPage.inputPassword("passwrod!2");
    }

    @And("android user tap login button")
    public void androidUserTapLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("android user see error message not registered email")
    public void androidUserSeeErrorMessageNotRegisteredEmail() {
        loginPage.getErrorNotRegisteredEmail();
    }

    //scenario 6
    @And("android user input invalid password")
    public void androidUserInputInvalidPassword() {
        loginPage.inputPassword("pass");
    }

    @Then("android user see error message invalid password")
    public void androidUserSeeErrorMessageInvalidPassword() {
        loginPage.getErrorInvalidPassword();
    }

    //scenario 7
    @And("android user input wrong password")
    public void androidUserInputWrongPassword() {
        loginPage.inputPassword("password12");
    }

    @Then("android user see error message wrong password")
    public void androidUserSeeErrorMessageWrongPassword() {
        loginPage.getErrorInvalidPassword();
    }
}
