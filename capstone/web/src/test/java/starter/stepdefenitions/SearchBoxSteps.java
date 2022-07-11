package starter.stepdefenitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.SearchBoxPage;

public class SearchBoxSteps {
    @Steps
    SearchBoxPage searchBoxPage;

    //scenario 1
    @When("admin fill name building on the search box")
    public void fillNameBuildingWithValidKeyword(){

    }

    @Then("admin see building with this keyword")
    public void adminSeeBuildingWithThisKeyword() {
    }

    //scenario 2
    @When("admin fill name building on the search box with invalid keyword")
    public void adminFillNameBuildingOnTheSearchBoxWithInvalidKeyword() {
    }

    @Then("admin fail to see list building with invalid keyword")
    public void adminFailToSeeListBuildingWithInvalidKeyword() {
    }
}
