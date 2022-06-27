package starter.manage.city;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetCity {

    public static String url = "http://3.88.14.239:80";

    //scenario1
    @Step("admin set endpoint for get city")
    public String setEndpointForGetCity(){
        return url + "/api/page/admin/city/findAll";
    }

    @Step("admin send request")
    public void sendRequest() {
        SerenityRest.given().get(setEndpointForGetCity());
    }

    @Step("admin get list city")
    public void getListCity() {
        Response response = SerenityRest.lastResponse();
        String Name = response.getBody().jsonPath().get("name");
        int Price = response.getBody().jsonPath().get("id");
        Assert.assertEquals(Name,"padang");
        Assert.assertEquals(Price,3);
    }

    //scenario2
    @Step("admin set invalid endpoint for get city")
    public String setInvalidEndpointForGetCity() {
       return url + "/api/page/admin/city/findAlllll123";
    }

    @Step("admin send request invalid endpoint")
    public void sendRequestInvalidEndpoint() {
        SerenityRest.given().get(setInvalidEndpointForGetCity());
    }

    @Step("admin get error message")
    public void getErrorMessage() {
        restAssuredThat(response -> response.body("error",equalTo("Not Found")));
    }
}
