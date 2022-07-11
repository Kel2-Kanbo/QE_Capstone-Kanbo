package starter.stepdefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;

public class LoginSteps {

    @Steps
    LoginPage loginPage;

    //scenario 1

    @Given("i am on the login page")
    public void onLoginPage(){
        loginPage.openPage();
        loginPage.validationOnloginPage();
    }

    @When("i input valid email")
    public void inputValidEmail(){
        loginPage.inputEmail("debbb@gmail.com");
    }

    @And("i input valid password")
    public void inputValidPassword(){
        loginPage.inputPassword("password!2");
    }

    @And("i click login button")
    public void clickLoginButton(){
        loginPage.clickLoginButton();
    }

    @Then("i success login")
    public void successLogin(){
        loginPage.validationOnHomepage();
    }

    //scenario 2
    @When("i not input username and password")
    public void notInputUsernamePassword(){
        loginPage.inputPassword("");
        loginPage.inputEmail("");
    }

    @Then("i get error message {string}")
    public void iGetErrorMessage(String message) {
    }

    //scenario 3
    @When("i not input email")
    public void iNotInputEmail() {
        loginPage.inputEmail("");
    }

    @Then("i failed to login and get error message")
    public void iFailedToLoginAndGetErrorMessage() {
    }

    //scenario 4
    @And("i not input password")
    public void iNotInputPassword() {
        loginPage.inputPassword("");
    }

    //scenario 5
    @When("i input invalid email")
    public void iInputInvalidEmail() {
        loginPage.inputEmail("debb@fsg");
    }

    @Then("i fail to login and get error message invalid email")
    public void iFailToLoginAndGetErrorMessageInvalidEmail() {
        loginPage.getErrorMessageEmailInvalid();
    }

    //scenario 6
    @And("i input wrong password")
    public void iInputWrongPassword() {
        loginPage.inputPassword("password12");
    }

    @Then("i failed to login and get error message on password")
    public void iFailedToLoginAndGetErrorMessageOnPassword() {
    }

    //scenario 7
    @When("i input invalid email with not use domain")
    public void iInputInvalidEmailWithNotUseDomain() {
        loginPage.inputEmail("dedeb123@");
    }

    //scenario 8
    @When("i input invalid password")
    public void inputInvalidPassword(){
        loginPage.inputPassword("dedeb");
    }

    @Then("i failed to login and get error message less char on password")
    public void iFailedToLoginAndGetErrorMessageLessCharOnPassword() {
        loginPage.getErrorMessagePasswordLessChar();
    }

}
