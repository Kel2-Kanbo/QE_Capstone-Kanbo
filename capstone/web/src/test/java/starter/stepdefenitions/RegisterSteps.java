package starter.stepdefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
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
        Random rand = new Random();
        int number = rand.nextInt(100000);
        registerPage.inputUsername("ahmad"+String.valueOf(number));
    }

    @And("admin input valid email")
    public void adminInputValidEmail(){
        Random rand = new Random();
        int number = rand.nextInt(100000);
        registerPage.inputEmail("admin"+String.valueOf(number)+"@gmail.com");
    }

    @And("admin input valid password")
    public void adminInputValidPassword(){
        registerPage.inputPassword("password12");
        registerPage.clickShowPass();
    }

    @And("admin click register button")
    public void adminClickRegisterButton(){
        registerPage.clickRegisterButton();
    }

    @And("click success register")
    public void clickSuccessRegister() {
        registerPage.clickSuccessRegister();
    }

    @And("admin verify email")
    public void adminVerifyEmail() {
        registerPage.verifyEmailafterLogin();
    }

    @Then("admin success to create account and back to login page")
    public void adminSuccessToCreateAccountAndBackToLoginPage() {
        registerPage.onLoginPage();
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

    @And("admin not input password")
    public void adminNotInputPassword() {
        registerPage.inputPassword("");
    }

    @Then("admin fail to create account and get error message name")
    public void adminFailToCreateAccountAndGetErrorMessageName() {
        boolean actual = registerPage.getErrorMessageName();
        Assert.assertTrue(actual);
    }

    //scenario 3
    @And("admin input email with not use @")
    public void adminInputEmailWithNotUse() {
        registerPage.inputEmail("admin.gmail.com");
    }

    @Then("admin fail to create account and get error message invalid email")
    public void adminFailToCreateAccountAndGetErrorMessageInvalidEmail() {
        boolean actual = registerPage.getErrorInvalidEmail();
        Assert.assertTrue(actual);
    }

    //scenario 4
    @And("admin input invalid password")
    public void adminInputInvalidPassword() {
        registerPage.inputPassword("pass");
    }

    //scenario 5
    @Then("admin fail to create account and get error message email")
    public void adminFailToCreateAccountAndGetErrorMessageEmail() {
        boolean actual = registerPage.getErrorMessageEmail();
        Assert.assertTrue(actual);
    }

    //scenario 6
    @Then("admin fail to create account and get error message empty username")
    public void adminFailToCreateAccountAndGetErrorMessageEmptyUsername() {
        boolean actual = registerPage.getErrorMessageUsername();
        Assert.assertTrue(actual);
    }

    //scenario 7
    @Then("admin fail to create account and get error message password")
    public void adminFailToCreateAccountAndGetErrorMessagePassword() {
        boolean actual = registerPage.getErrorPassword();
        Assert.assertTrue(actual);
    }

    //scenario 8
    @And("admin input registered email")
    public void adminInputRegisteredEmail() {
        registerPage.inputEmail("admin002@gmail.com");
    }

    @Then("admin fail to create account and get error message email is ready")
    public void adminFailToCreateAccountAndGetErrorMessageEmailIsReady() {
        boolean actual = registerPage.getErrorRegisteredEmail();
        Assert.assertTrue(actual);
    }

    //scenario 9
    @And("admin input registered username")
    public void adminInputRegisteredUsername() {
        registerPage.inputUsername("admin002");
    }

    @Then("admin fail to create account and get error message username is ready")
    public void adminFailToCreateAccountAndGetErrorMessageUsernameIsReady() {
        boolean actual = registerPage.getRegisteredUsername();
        Assert.assertTrue(actual);
    }
}
