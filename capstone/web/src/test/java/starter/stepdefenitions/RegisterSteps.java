package starter.stepdefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.RegisterPage;

import java.util.Random;

public class RegisterSteps {
    @Steps
    RegisterPage registerPage;

    //scenario 1
    @Given("admin on the register page")
    public void onRegisterPage(){
        registerPage.openPage();
        registerPage.clickRegisterIcon();
    }

    @When("admin input valid name")
    public void adminInputValidName(){
        registerPage.inputName("ahmad ramadhan");
    }

    @And("admin input valid username")
    public void adminInputValidUsername() {
        registerPage.inputUsername("ahmad");
    }

    @And("admin input valid email")
    public void adminInputValidEmail(){
        Random rand = new Random();
        int number = rand.nextInt(100000);
        registerPage.inputEmail("admin"+String.valueOf(number)+"@gmail.com");
    }

    @And("admin input valid password")
    public void adminInputValidPassword(){
        registerPage.inputPassword("Password!2");
    }

    @And("admin click register button")
    public void adminClickRegisterButton(){
        registerPage.clickRegisterButton();
    }

    @Then("admin success to create account")
    public void adminSuccessToCreateAccount(){
    }

    //scenario 2
    @When("admin not input name")
    public void adminNotInputName() {
        registerPage.inputUsername("");
    }

    @And("admin not input username")
    public void adminNotInputUsername() {
        registerPage.inputUsername("");
    }

    @And("admin not input email")
    public void adminNotInputEmail() {
        registerPage.inputEmail("");
    }

    //scenario 3
    @And("admin input email with not use @")
    public void adminInputEmailWithNotUse() {
        registerPage.inputEmail("admin.gmail.com");
    }

    //scenario 4
    @And("admin input invalid password")
    public void adminInputInvalidPassword() {
        registerPage.inputPassword("pass");
    }

    //scenario 6
    @And("admin not input password")
    public void adminNotInputPassword() {
        registerPage.inputPassword("");
    }

    @Then("admin fail to create account and get error message")
    public void adminFailToCreateAccountAndGetErrorMessage() {
    }

    //scenario 7
    @And("admin input registered email")
    public void adminInputRegisteredEmail() {
        registerPage.inputEmail("admin00@gmail.com");
    }

    @Then("admin fail to create account and get error message {string}")
    public void adminFailToCreateAccountAndGetErrorMessage(String message) {
    }

    //scenario 8
    @And("admin input registered username")
    public void adminInputRegisteredUsername() {
        registerPage.inputUsername("ahmad");
    }
}
