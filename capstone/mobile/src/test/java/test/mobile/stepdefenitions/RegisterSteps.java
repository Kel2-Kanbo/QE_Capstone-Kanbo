package test.mobile.stepdefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.mobile.pages.RegisterPage;

import java.util.Random;

public class RegisterSteps {
    @Steps
    RegisterPage registerPage;

    //scenario 1
    @Given("android user on landing screen login page")
    public void androidUserOnLandingScreenLoginPage() {
        registerPage.onTheLoginPage();
    }

    @When("android user click to register")
    public void userClickToRegister(){
        registerPage.clickToRegister();
    }

    @And("user input name")
    public void userInputName() throws InterruptedException {
        registerPage.inputName("ucup");
    }
    @And("user input username")
    public void userInputUsername() {
        Random rand = new Random();
        int number = rand.nextInt(1000);
        registerPage.inputUsername("user"+String.valueOf(number));
    }

    @And("user input email")
    public void userInputEmail() {
        Random rand = new Random();
        int number = rand.nextInt(1000);
        registerPage.inputEmail("user"+String.valueOf(number)+"@gmail.com");
    }

    @And("user input password")
    public void userInputPassword() {
        registerPage.inputPassword("password!2");
    }

    @And("user input confirm password")
    public void userInputConfirmPassword() {
        registerPage.inputConfirmPassword("password!2");
    }

    @And("user click register button")
    public void userClickRegisterButton() {
        registerPage.clickRegisterButton();
    }

    @And("user click confirm email")
    public void userClickConfirmEmail() {
        registerPage.verifyEmail();
    }

    @Then("user back to login page")
    public void userBackToLoginPage() {
        registerPage.backApp();
        registerPage.onTheLoginPage();
    }

    //scenario 2
    @And("user not input name")
    public void userNotInputName() {
        registerPage.inputName("");
    }

    @And("user not input email")
    public void userNotInputEmail() {
        registerPage.inputEmail("");
    }

    @And("user not input password")
    public void userNotInputPassword() {
        registerPage.inputPassword("");
    }

    @Then("user get error message")
    public void userGetErrorMessage() {
        registerPage.errorMessageNoName();
        registerPage.errorMessageNoUserame();
        registerPage.errorMessageNoEmail();
        registerPage.errorMessageNoPassword();
        registerPage.errorMessageNoConfirmPassword();
    }
    //scenario 3
    @And("user input email with not input @")
    public void userInputEmailWithNotInput() {
        registerPage.inputEmail("dedeb1gmail.com");
    }

    @Then("user get error message invalid email")
    public void userGetErrorMessageInvalidEmail() {
        registerPage.getErrorInvalidEmail();
    }

    //scenario 4
    @And("user input password with input password less than six char")
    public void userInputPasswordWithInputPasswordLessThanSixChar() {
        registerPage.inputPassword("123456");
    }
    @Then("user get error message invalid password")
    public void userGetErrorMessageInvalidPassword() {
        registerPage.getErrorInvalidPassword();
        registerPage.getErrorNotSamePassword();
    }

    //scenario 5
    @Then("user get error message empty email")
    public void getErrorMessageEmptyEmail() {
        registerPage.errorMessageNoEmail2();
    }

    //scenario 6
    @And("user not input username")
    public void userNotInputUsername() {
        registerPage.inputUsername("");
    }
    @Then("user get error message empty username")
    public void userGetErrorMessageEmptyUsername() {
        registerPage.errorMessageNoUserame2();
    }

    //scenario 7
    @Then("user get error message empty password")
    public void userGetErrorMessageEmptyPassword() {
        registerPage.errorMessageNoPassword2();
    }

    //scenario 8
    @Then("user get error message empty name")
    public void userGetErrorMessageEmptyName() {
        registerPage.errorMessageNoName();
    }

    //scenario 9
    @And("user not input confirm password")
    public void userNotInputConfirmPassword() {
        registerPage.inputConfirmPassword("");
    }
    @Then("user get error message empty confirm password")
    public void userGetErrorMessageEmptyConfirmPassword() {
        registerPage.errorMessageNoConfirmPassword2();
    }

    //scenario 10
    @And("user input registered username")
    public void userInputRegisteredUsername() {
        registerPage.inputUsername("dedeb1");
    }
    @Then("user get error message username is already taken")
    public void userGetErrorMessageUsernameIsAlreadyTaken() {
        registerPage.errorMessageRegisteredUsername();
    }

    //scenario 11
    @And("user input registered email")
    public void userInputRegisteredEmail() {
        registerPage.inputEmail("dedeb1@gmail.com");
    }

    @Then("user get error message {string}")
    public void userGetErrorMessage(String error) {
        registerPage.errorMessageRegisteredEmail();
    }

    //scenario 12
    @And("user input different confirm password")
    public void userInputDifferentConfirmPassword() {
        registerPage.inputConfirmPassword("123456789");
    }

    @Then("user get error message password not same")
    public void userGetErrorMessagePasswordNotSame() {
        registerPage.getErrorNotSamePassword();
    }

    //scenario13
    @And("user input password with input max char password")
    public void userInputPasswordWithInputMaxCharPassword() {
        registerPage.inputPassword("1234567890qwertyuiopasdfghjklzxcvbnm,./l;'[]=");
    }
    @And("user input confirm password max char")
    public void userInputConfirmPasswordMaxChar() {
        registerPage.inputConfirmPassword("1234567890qwertyuiopasdfghjklzxcvbnm,./l;'[]=");
    }

    @Then("user get error message password max char")
    public void userGetErrorMessagePasswordMaxChar() {
        registerPage.getErrorMaxCharPass();
    }

    //scenario14
    @And("user input email with input email not use domain")
    public void userInputEmailWithInputEmailNotUseDomain() {
        registerPage.inputEmail("adeb@gmail");
    }

    @Then("user get error message not use domain")
    public void userGetErrorMessageNotUseDomain() {
        registerPage.getErrorInvalidEmail();
    }

}
