package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    //element
    private By emailField(){
        return By.xpath("(//input[@class='peer css-1hktf9i'])[1]");
    }

    private By passwordField(){
        return By.xpath("(//input[@class='peer css-1hktf9i'])[2]");
    }

    private By loginButton(){
        return By.xpath("//button[text()='Login']");
    }

    private By onHomePage(){
        return By.className("v-toolbar__title");
    }

    private By errorMessageEmail(){
        return By.xpath("//p[text()='Email must be valid']");
    }

    private By errorMessagePasswordLessChar(){
        return By.xpath("//p[text()='Must contain at least 6 or more characters']");
    }

    private By errorMessageNotRecord(){
        return By.className("v-alert__content");
    }

    //function

    @Step
    public void openPage(){
        open();
    }

    @Step
    public void validationOnloginPage(){
        $(loginButton()).isDisplayed();
    }

    @Step
    public void inputEmail(String email){
        $(emailField()).type(email);
    }

    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }

    @Step
    public void clickLoginButton(){
        $(loginButton()).click();
    }

    @Step
    public boolean validationOnHomepage(){
        return $(onHomePage()).isDisplayed();
    }

    @Step
    public boolean getErrorMessageEmailInvalid(){
        return $(errorMessageEmail()).isDisplayed();
    }

    @Step
    public boolean getErrorMessagePasswordLessChar(){
        return $(errorMessagePasswordLessChar()).isDisplayed();
    }

    @Step
    public boolean getMessageNoRecord(){
        return $(errorMessageNotRecord()).isDisplayed();
    }
}
