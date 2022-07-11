package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject {
    private By nameField(){
        return By.xpath("(//input[@class='peer m-0 css-1hktf9i'])[1]");
    }

    private By usernameField(){
        return By.xpath("(//input[@class='peer m-0 css-1hktf9i'])[2]");
    }
    private By emailField(){
        return By.xpath("(//input[@class='peer m-0 css-1hktf9i'])[3]");
    }

    private By passFiled(){
        return By.xpath("(//input[@class='peer m-0 css-1hktf9i'])[4]");
    }

//    private By showPassword(){
//        return By.name("M396 512a112 112 0 1 0 224 0 112 112 0 1 0-224 0zm546.2-25.8C847.4 286.5 704.1 186 512 186c-192.2 0-335.4 100.5-430.2 300.3a60.3 60.3 0 0 0 0 51.5C176.6 737.5 319.9 838 512 838c192.2 0 335.4-100.5 430.2-300.3 7.7-16.2 7.7-35 0-51.5zM508 688c-97.2 0-176-78.8-176-176s78.8-176 176-176 176 78.8 176 176-78.8 176-176 176z");
//    }

    private By registerButton(){
        return By.xpath("//button[text()='Register']");
    }

    private By toRegisterPage(){
        return By.xpath("//a[text()='Register']");
    }
    private By errorMessageName(){
        return By.className("(//p[text()='Must contain at least 4 characters'])[1]");
    }
    private By errorMessageUsername(){
        return By.className("(//p[text()='Must contain at least 4 characters'])[2]");
    }
    private By errorMessageEmail(){
        return By.className("//p[text()='Email must be valid']");
    }
    private By errorMessagePassword(){
        return By.className("//p[text()='Must contain at least 6 or more characters']");
    }
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

//    @Step
//    public void clickShowPass(){
//        $(showPassword()).click();
//    }

    @Step
    public void clickRegisterButton(){
        $(registerButton()).click();
    }
//    @Step
//    public boolean validationSuccessRegister() {
//
//    }

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
    public boolean getErrorPassword(){
        return $(errorMessagePassword()).isDisplayed();
    }
}
