package test.mobile.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.mobile.pageobject.BasePageObject;

public class ChatPage extends BasePageObject {

    //element
    private By toChatPage(){
        return MobileBy.xpath("(//android.view.View)[21]");
    }

    private By onChatPage(){
        return MobileBy.xpath("(//android.view.View)[10]");
    }

    private By messageField(){
        return MobileBy.xpath("//android.widget.EditText");
    }

    private By sendMessage(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]");
    }

    private By chatSending(){
        return MobileBy.xpath("(//android.view.View)[9]");
    }

    //function
    @Step
    public void clickToSendPage(){
        onClick(toChatPage());
    }

    @Step
    public boolean onTheChatPage(){
        return waitUntilPresence(onChatPage()).isDisplayed();
    }

    @Step
    public void clickNewMessage(){
        onClick(onChatPage());
    }

    @Step
    public boolean onMessage(){
        return waitUntilVisible(messageField()).isDisplayed();
    }

    @Step
    public void fillMessageField(String message){
        onClick(messageField());
        onType(messageField(),message);
    }

    @Step
    public void clickSendMessage(){
        onClick(sendMessage());
    }

    @Step
    public boolean successSendMessage(){
        return waitUntilVisible(chatSending()).isDisplayed();
    }
}
