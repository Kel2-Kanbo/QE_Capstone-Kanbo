package test.mobile.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.mobile.pageobject.BasePageObject;

import java.util.concurrent.TimeUnit;

public class RegisterPage extends BasePageObject {
    public void timeDelay(long t) {
        try {
            Thread.sleep(t);
        } catch (InterruptedException e) {}
    }
    private By loginButton(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Login\"]");
    }
    private By toRegister(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Register\"]");
    }
    private By nameField(){
//        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
        return MobileBy.xpath("//android.widget.EditText[1]");
    }
    private By usernameFieldRegist() {
//        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
        return MobileBy.xpath("//android.widget.EditText[2]");
    }
    private By emailFieldRegist() {
//        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]");
        return MobileBy.xpath("//android.widget.EditText[3]");
    }
    private By passFieldRegist(){
//        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[4]");
        return MobileBy.xpath("//android.widget.EditText[4]");
    }
    private By confimrPassFieldRegist(){
//        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[5]");
        return MobileBy.xpath("//android.widget.EditText[5]");
    }
    private By registerButton(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Register\"]");
    }
    private By clickVerifyEmail(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Open email app\"]");
    }
    private By homePage(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Products\"]");
    }
    private By errorNoName() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Can not be empty\"]");
    }
    private By errorNoUsername() {
        return MobileBy.xpath("(//android.view.View[@content-desc=\"Can not be empty\"])[2]");
    }
    private By errorNoUsername2() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Can not be empty\"]");
    }
    private By errorNoEmail(){
        return MobileBy.xpath("(//android.view.View[@content-desc=\"Can not be empty\"])[3]");
    }
    private By errorNoEmail2(){
        return MobileBy.AccessibilityId("Can not be empty");
    }
    private By errorNoPassword(){
        return MobileBy.xpath("(//android.view.View[@content-desc=\"Can not be empty\"])[4]");
    }
    private By errorNoPassword2(){
        return MobileBy.xpath("(//android.view.View[@content-desc=\"Can not be empty\"])");
    }
    private By errorNoConfirmPassword(){
        return MobileBy.xpath("(//android.view.View[@content-desc=\"Can not be empty\"])[5]");
    }
    private By errorNoConfirmPassword2(){
        return MobileBy.xpath("(//android.view.View[@content-desc=\"Can not be empty\"])");
    }
    private By errorNotSamePassword(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Password must be the same\"]");
    }
    private By errorRegisteredEmail(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Error: Email is Already in User !\"]");
    }
    private By errorRegisteredUsrname(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Error:Username is Already taken\"]");
    }
    private By errorInvalidEmail(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"This field requires a valid email address.\"]");
    }
    private By errorInvalidPassword(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Value must have a length greater than or equal to 8\"]");
    }
    private By errorPasswordMaxChar(){
        return MobileBy.xpath("(//android.view.View[@content-desc=\"Value must have a length less than or equal to 40\"])[1]");
    }

    @Step
    public void onTheLoginPage(){
        waitUntilPresence(loginButton()).isDisplayed();
    }
    @Step
    public void clickToRegister(){
        onClick(toRegister());
    }
    @Step
    public void inputName(String name){
        onClick(nameField());
        onType(nameField(),name);
    }
    @Step
    public void inputUsername(String username){
        onClick(usernameFieldRegist());
        onType(usernameFieldRegist(),username);
    }
    @Step
    public void inputEmail(String email){
        onClick(emailFieldRegist());
        onType(emailFieldRegist(),email);
    }
    @Step
    public void inputPassword(String password){
        onClick(passFieldRegist());
        onType(passFieldRegist(),password);
    }
    @Step
    public void inputConfirmPassword(String password){
        onClick(confimrPassFieldRegist());
        onType(confimrPassFieldRegist(),password);
    }
    @Step
    public void clickRegisterButton(){
        onClick(registerButton());
    }

    @Step
    public void verifyEmail(){
        onClick(clickVerifyEmail());
    }

    @Step
    public void backToApp(){
        backApp();
    }

    @Step
    public boolean errorMessageNoName(){
        return waitUntilVisible(errorNoName()).isDisplayed();
    }

    @Step
    public boolean errorMessageNoUserame(){
        return waitUntilVisible(errorNoUsername()).isDisplayed();
    }

    @Step
    public boolean errorMessageNoUserame2(){
        return waitUntilVisible(errorNoUsername2()).isDisplayed();
    }

    @Step
    public boolean errorMessageNoEmail(){
        return waitUntilVisible(errorNoEmail()).isDisplayed();
    }

    @Step
    public boolean errorMessageNoEmail2(){
        return waitUntilVisible(errorNoEmail2()).isDisplayed();
    }

    @Step
    public boolean errorMessageNoPassword(){
        return waitUntilVisible(errorNoPassword()).isDisplayed();
    }

    @Step
    public boolean errorMessageNoPassword2(){
        return waitUntilVisible(errorNoPassword2()).isDisplayed();
    }

    @Step
    public boolean errorMessageNoConfirmPassword(){
        return waitUntilVisible(errorNoConfirmPassword()).isDisplayed();
    }

    @Step
    public boolean errorMessageNoConfirmPassword2(){
        return waitUntilVisible(errorNoConfirmPassword2()).isDisplayed();
    }

    @Step
    public boolean errorMessageRegisteredEmail(){
        return waitUntilVisible(errorRegisteredEmail()).isDisplayed();
    }

    @Step
    public boolean errorMessageRegisteredUsername(){
        return waitUntilVisible(errorRegisteredUsrname()).isDisplayed();
    }

    @Step
    public boolean getErrorInvalidEmail(){
        return waitUntilVisible(errorInvalidEmail()).isDisplayed();
    }

    @Step
    public boolean getErrorNotSamePassword(){
        return waitUntilVisible(errorNotSamePassword()).isDisplayed();
    }

    @Step
    public boolean getErrorInvalidPassword(){
        return waitUntilVisible(errorInvalidPassword()).isDisplayed();
    }

    @Step
    public boolean getErrorMaxCharPass(){
        return waitUntilVisible(errorPasswordMaxChar()).isDisplayed();
    }
}
