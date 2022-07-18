package test.mobile.stepdefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.mobile.pages.ChatPage;

public class ChatSteps {
    @Steps
    ChatPage chatPage;

    //scenario 1
    @Given("user click chat tab")
    public void userClickChatTab() {
        chatPage.clickToSendPage();
    }

    @And("user on the chat page")
    public void onChatPage(){
        chatPage.onTheChatPage();
    }

    @When("user click message")
    public void userClickMessage() {
        chatPage.clickNewMessage();
    }

    @Then("user see detail chat")
    public void userSeeDetailChat() {
        Assert.assertTrue(chatPage.onMessage());
    }

    //scenario 2
    @When("user click search box and input name building")
    public void userClickSearchBoxAndInputNameBuilding() {
    }

    @Then("user see message from admin building")
    public void userSeeMessageFromAdminBuilding() {
    }

    //scenario 3
    @And("user input text on message field")
    public void userInputTextOnMessageField() {
        chatPage.fillMessageField("testttt");
    }

    @And("user click send button")
    public void userClickSendButton() {
        chatPage.clickSendMessage();
    }

    @Then("user success send message")
    public void userSuccessSendMessage() {
        Assert.assertTrue(chatPage.successSendMessage());
    }

    //scenario 4
    @And("user not input text on message field")
    public void userNotInputTextOnMessageField() {
    }

    @Then("user fail send message")
    public void userFailSendMessage() {
    }
}
