package starter.stepdefenitions;

import com.beust.ah.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
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
        loginPage.inputEmail("admin002@gmail.com");
    }

    @And("i input valid password")
    public void inputValidPassword(){
        loginPage.showPass();
        loginPage.inputPassword("password12");
    }

    @And("i click login button")
    public void clickLoginButton(){
        loginPage.clickLoginButton();
    }

    @Then("i success login")
    public void successLogin(){
        boolean actual = loginPage.validationDialog();
        Assert.assertTrue(actual);

        loginPage.clickSuccessButton();

    }
    @And("i see homepage")
    public void iSeeHomepage() {
        boolean actual = loginPage.validationOnHomepage();
        Assert.assertTrue(actual);
    }

    //scenario 2
    @When("i not input username and password")
    public void notInputUsernamePassword(){
        loginPage.inputPassword("");
        loginPage.inputEmail("");
    }

    @Then("admin fail to create account and get error message empty email")
    public void adminFailToCreateAccountAndGetErrorMessageEmptyEmail() {
        boolean actual = loginPage.getErrorMessageEmailInvalid();
        Assert.assertTrue(actual);
    }

    @And("admin fail to create account and get error message empty password")
    public void adminFailToCreateAccountAndGetErrorMessageEmptyPassword() {
        boolean actual = loginPage.getErrorMessagePasswordLessChar();
        Assert.assertTrue(actual);
    }

    //scenario 3
    @When("i not input email")
    public void iNotInputEmail() {
        loginPage.inputEmail("");
    }

    @Then("i failed to login and get error message")
    public void iFailedToLoginAndGetErrorMessage() {
        boolean actual = loginPage.getErrorMessageEmailInvalid();
        Assert.assertTrue(actual);
    }

    //scenario 4
    @And("i not input password")
    public void iNotInputPassword() {
        loginPage.inputPassword("");
    }

    @Then("i failed to login and get error message less char on password")
    public void iFailedToLoginAndGetErrorMessageLessCharOnPassword() {
        boolean actual = loginPage.getErrorMessagePasswordLessChar();
        Assert.assertTrue(actual);
    }

    //scenario 5
    @When("i input invalid email")
    public void iInputInvalidEmail() {
        loginPage.inputEmail("debb@tr");
    }

    @Then("i fail to login and get error message invalid email")
    public void iFailToLoginAndGetErrorMessageInvalidEmail() {
        boolean actual = loginPage.getInvalidEmailMessage();
        Assert.assertTrue(actual);
    }

    //scenario 6
    @And("i input wrong password")
    public void iInputWrongPassword() {
        loginPage.inputPassword("password1232");
    }

    @Then("i failed to login and get error message on password")
    public void iFailedToLoginAndGetErrorMessageOnPassword() {
        boolean actual = loginPage.getMessageNoRecord();
        Assert.assertTrue(actual);
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


    //scenario 9
    @And("i click logout button")
    public void iClickLogoutButton() {
        loginPage.clickLogout();
    }

    @And("i click confirm logout")
    public void iClickConfirmLogout() {
        loginPage.clickConfirmLogout();
        loginPage.clickSuccessLogout();
    }
}
