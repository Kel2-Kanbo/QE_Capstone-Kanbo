package test.mobile.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.mobile.pageobject.BasePageObject;


public class LoginPage extends BasePageObject {
    public void timeDelay(long t) {
        try {
            Thread.sleep(t);
        } catch (InterruptedException e) {}
    }

    private By homePage(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Let's find your place for work\"]");
    }
    private By loginPage(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Login to continue!\"]");
    }

    private By emailField() {
        return MobileBy.xpath("//android.widget.EditText[1]");
    }

    private By passwordField() {
        return MobileBy.xpath("//android.widget.EditText[2]");
    }
    private By loginButton(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Login\"]");
    }

    private By errorMessageInvalidEmail(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"This field requires a valid email address.\"]");
    }
    private By errorMessageEmptyemail(){
        return MobileBy.xpath( "//android.view.View[@content-desc=\"Can not be empty\"]");
    }
    private By errorMessageEmptypassword(){
        return MobileBy.xpath("(//android.view.View[@content-desc=\"Can not be empty\"])[2]");
    }
    private By errorMessageEmptypassword2(){
        return MobileBy.AccessibilityId("Can not be empty");
    }
    private By errorMessagePassIsLessMaxChar(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Email atau password tidak sesuai\"]");
    }
    private By errorNotRegisteredEmail(){
        return MobileBy.AccessibilityId("Email atau password tidak sesuai");
    }
    private By profilTab(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Profile Tab 4 of 4\"]");
    }
    private By logotuButton(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Log Out\"]");
    }
    private By messageLogout(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"You've been signed out!\"]");
    }

    @Step
    public boolean onHomePage(){
        return waitUntilVisible(homePage()).isDisplayed();
    }

    @Step
    public boolean onLoginPage(){
        return waitUntilVisible(loginPage()).isDisplayed();
    }

    @Step
    public void clickLoginButton() {
        onClick(loginButton());
    }

    @Step
    public void inputEmail(String email){
        onClick(emailField());
        onType(emailField(),email);
    }

    @Step
    public void inputPassword(String password){
        onClick(passwordField());
        onType(passwordField(),password);
    }

    @Step
    public void clickProfileTab(){
        timeDelay(2000);
        onClick(profilTab());
    }
    @Step
    public void clickLogoutButton(){
        onClick(logotuButton());
    }

    @Step
    public String getErrorMessageInvalidEmail(){
        return waitUntilVisible(errorMessageInvalidEmail()).getText();
    }

    @Step
    public boolean getErrorMessageEmptyEmail(){
        return waitUntilVisible(errorMessageEmptyemail()).isDisplayed();
    }
    @Step
    public boolean getErrorMessageEmptyPassword(){
        return waitUntilVisible(errorMessageEmptypassword()).isDisplayed();
    }

    @Step
    public boolean getErrorMessageEmptyPassword2(){
        return waitUntilVisible(errorMessageEmptypassword2()).isDisplayed();
    }

    @Step
    public boolean getErrorNotRegisteredEmail(){
        return waitUntilVisible(errorNotRegisteredEmail()).isDisplayed();
    }

    @Step
    public boolean getErrorInvalidPassword(){
        return waitUntilVisible(errorMessagePassIsLessMaxChar()).isDisplayed();
    }

    @Step
    public boolean getMessageAfterLogout(){
        return waitUntilVisible(messageLogout()).isDisplayed();
    }
}
