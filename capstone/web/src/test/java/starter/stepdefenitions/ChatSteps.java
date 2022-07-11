package starter.stepdefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.ChatPage;

public class ChatSteps {
    @Steps
    ChatPage chatPage;

    @When("admin click chat")
    public void clickChat(){}

    @Then("admin on the chat page")
    public void adminOnTheChatPage() {
    }

    @When("admin fill search box with customer username")
    public void adminFillSearchBoxWithCustomerUsername() {
    }

    @Then("admin see chat customer")
    public void adminSeeChatCustomer() {
    }

    @When("admin click chat with customer")
    public void adminClickChatWithCustomer() {
    }

    @And("admin write message")
    public void adminWriteMessage() {
    }

    @And("admin click send message")
    public void adminClickSendMessage() {
    }

    @Then("admin success send message")
    public void adminSuccessSendMessage() {
    }
}
