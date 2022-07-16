package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    //element
    private By emailField(){
        return By.xpath("//input[@placeholder='Email']");
    }

    private By passwordField(){
        return By.xpath("//input[@id='1']");
    }

    private By loginButton(){
        return By.xpath("//button[.='Login']");
    }

    private By showPassword(){
        return By.xpath("//*[name()='path' and contains(@d,'M396 512a1')]");
    }

    private By suksesButton(){
        return By.xpath("//button[text()='OK']");
    }

    private By onHomePage(){
        return By.xpath("//span[text()='logout']");
    }

    private By errorMessageEmail(){
        return By.xpath("//p[text()='Email must be valid']");
    }

    private By errorMessagePasswordLessChar(){
        return By.xpath("//p[text()='Must contain at least 6 or more characters']");
    }

    private By errorMessageNotRecord(){
        return By.xpath("//h2[contains(.,'Account not found')]");
    }

    private By dialogSuccess(){
        return By.xpath("//div[@role='dialog']");
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
    public boolean validationDialog(){
        return $(dialogSuccess()).isDisplayed();
    }

    @Step
    public void clickSuccessButton(){
        $(suksesButton()).click();
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
    @Step
    public void showPass(){
        $(showPassword()).click();
    }
}
