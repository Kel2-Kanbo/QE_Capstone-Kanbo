package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject {
    private By nameField(){
        return By.xpath("//input[@placeholder='Name']");
    }

    private By usernameField(){
        return By.xpath("//input[@name='username']");
    }
    private By emailField(){
        return By.xpath("//input[@placeholder='Email']");
    }

    private By passFiled(){
        return By.xpath("//input[@name='password']");
    }

    private By showPassword(){
        return By.xpath("//*[name()='path' and contains(@d,'M396 512a1')]");
    }

    private By registerButton(){
        return By.xpath("//button[text()='Register']");
    }

    private By suksesRegister(){
        return By.xpath("//button[normalize-space()='OK']");
    }

    private By verifyEmail(){
        return By.xpath("//button[@class='cursor-pointer text-lg font-bold text-center bg-secondary-softblue css-1kj4gdy']");
    }

    private By toRegisterPage(){
        return By.xpath("//a[text()='Register']");
    }

    private By loginPage(){
        return By.xpath("//button[.='Login']");
    }

    private By errorMessageName(){
        return By.xpath("(//p[text()='Must contain at least 4 characters'])[1]");
    }

    private By errorMessageUsername(){
        return By.xpath("(//p[text()='Must contain at least 4 characters'])[2]");
    }

    private By errorMessageEmail(){
        return By.xpath("//p[text()='Email must be valid']");
    }

    private By errorMessagePassword(){
        return By.xpath("//p[text()='Must contain at least 6 or more characters']");
    }

    private By registeredUsername(){
        return By.xpath("//div[@role='dialog']");
    }

    private By registeredEmail(){
        return By.xpath("//div[.='Error: Email is Already in User !']");
    }

    private By invalidEmail(){
        return By.xpath("//h2[.='Register Failed']");
    }



    //function
    @Step
    public void openPage(){
        open();
    }

    @Step
    public void clickRegisterIcon(){
        $(toRegisterPage()).click();
    }

    @Step
    public void inputName(String Name){
        $(nameField()).type(Name);
    }
    @Step
    public void inputUsername(String Username){
        $(usernameField()).type(Username);
    }

    @Step
    public void inputEmail(String email){
        $(emailField()).type(email);
    }
    @Step
    public void inputPassword(String Password){
        $(passFiled()).type(Password);
    }

    @Step
    public void clickShowPass(){
        $(showPassword()).click();
    }

    @Step
    public void clickRegisterButton(){
        $(registerButton()).click();
    }

    @Step
    public void clickSuccessRegister(){
        $(suksesRegister()).click();
    }

    @Step
    public void verifyEmailafterLogin() {
        $(verifyEmail()).click();
    }

    @Step
    public boolean onLoginPage(){
        return $(loginPage()).isDisplayed();
    }

    @Step
    public boolean getErrorMessageName(){
        return $(errorMessageName()).isDisplayed();
    }

    @Step
    public boolean getErrorMessageUsername(){
        return $(errorMessageUsername()).isDisplayed();
    }

    @Step
    public boolean getErrorMessageEmail(){
        return $(errorMessageEmail()).isDisplayed();
    }

    @Step
    public boolean getErrorInvalidEmail(){
        return $(invalidEmail()).isDisplayed();
    }

    @Step
    public boolean getErrorPassword(){
        return $(errorMessagePassword()).isDisplayed();
    }

    @Step
    public boolean getErrorRegisteredEmail(){
        return $(registeredEmail()).isDisplayed();
    }

    @Step
    public boolean getRegisteredUsername(){
        return $(registeredUsername()).isDisplayed();
    }
}
