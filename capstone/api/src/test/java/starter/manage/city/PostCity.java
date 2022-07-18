package starter.manage.city;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import static starter.login.Post.url;

public class PostCity {

    private String  City = "";

    //scenario3
    @Step("admin set endpoint for add city")
    public String setEndpointForAddCity() {
        return url + "/api/page/admin/city/create";
    }

    @Step("admin send POST HTTP request with valid data city")
    public void sendPOSTHTTPRequestWithValidDataCity() {
        Faker faker = new Faker();
        City = faker.address().city();
        JSONObject requestBody = new JSONObject();
        requestBody.put( "name",City );

        SerenityRest.given().header("Content-Type","application/json").body(requestBody.toJSONString()).post(setEndpointForAddCity());
    }

    @Step("admin get detail about city")
    public void getDetailAboutCity() {
        restAssuredThat(response -> response.body("name",equalTo("padang")));
        restAssuredThat(response -> response.body("id",equalTo(3)));
    }

    //scenario4
    @Step("admin set invalid endpoint for add city")
    public String setInvalidEndpointForAddCity() {
        return url + "/api/page/admin/city/createeerrt44";
    }

    @Step("admin send POST HTTP request with invalid enpoint")
    public void sendPOSTHTTPRequestWithInvalidEnpoint() {
        Faker faker = new Faker();
        City = faker.address().city();
        JSONObject requestBody = new JSONObject();
        requestBody.put( "name",City );

        SerenityRest.given().header("Content-Type","application/json").body(requestBody.toJSONString()).post(setInvalidEndpointForAddCity());
    }

    //scenario5
    @Step("admin send POST HTTP request with invalid input data")
    public void sendPOSTHTTPRequestWithInvalidInputData() {
        Faker faker = new Faker();
        City = faker.number().digits(7);
        JSONObject requestBody = new JSONObject();
        requestBody.put( "name",City );

        SerenityRest.given().header("Content-Type","application/json").body(requestBody.toJSONString()).post(setEndpointForAddCity());
    }

    @Step("admin get error message after add city")
    public void getErrorMessageAfterAddCity() {
        restAssuredThat(response -> response.body("message",equalTo("City with id 99 doesn't exists")));

    }

    @Step("admin send POST HTTP request with same name")
    public void sendPOSTHTTPRequestWithSameName() {
        Faker faker = new Faker();
        City = faker.address().city();
        JSONObject requestBody = new JSONObject();
        requestBody.put( "name",City );

        SerenityRest.given().header("Content-Type","application/json").body(requestBody.toJSONString()).post(setEndpointForAddCity());
    }

    @Step("admin get status code {int} on city")
    public void getStatusCodeOnCity(int arg0) {
        restAssuredThat(response -> response.statusCode(arg0));
    }
}
