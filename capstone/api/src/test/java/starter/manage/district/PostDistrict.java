package starter.manage.district;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import static starter.manage.city.GetCity.url;

public class PostDistrict {

    private String name = "";

    //scenario3
    @Step("admin set endpoint for add district")
    public String setEndpointForAddDistrict() {
        return url + "/api/page/admin/district/create";
    }

    @Step("admin send POST HTTP request with valid data district")
    public void sendPOSTHTTPRequestWithValidDataDistrict() {
        Faker faker = new Faker();
        name = faker.commerce().productName();
        JSONObject requestBody = new JSONObject();
        requestBody.put("city_id",1);
        requestBody.put( "name",name );

        SerenityRest.given().header("Content-Type","application/json").body(requestBody.toJSONString()).post(setEndpointForAddDistrict());
    }

    @Step("admin get detail about district")
    public void getDetailAboutDistrict() {
        restAssuredThat(response -> response.body("name",equalTo(name)));
        restAssuredThat(response -> response.body("id",equalTo(2)));
    }

    //scenario4
    @Step("admin set invalid endpoint for add district")
    public String setInvalidEndpointForAddDistrict() {
        return url + "/api/page/admin/district/create2435e";
    }

    @Step("admin send POST HTTP request with invalid enpoint district")
    public void sendPOSTHTTPRequestWithInvalidEnpointDistrict() {
        Faker faker = new Faker();
        name = faker.commerce().productName();
        JSONObject requestBody = new JSONObject();
        requestBody.put("city_id",1);
        requestBody.put( "name",name );

        SerenityRest.given().header("Content-Type","application/json").body(requestBody.toJSONString()).post(setInvalidEndpointForAddDistrict());
    }

    //scenario5
    @Step("admin send POST HTTP request with invalid input id city")
    public void sendPOSTHTTPRequestWithInvalidInputIdCity() {
        Faker faker = new Faker();
        name = faker.commerce().productName();
        JSONObject requestBody = new JSONObject();
        requestBody.put("city_id",99);
        requestBody.put( "name",name );

        SerenityRest.given().header("Content-Type","application/json").body(requestBody.toJSONString()).post(setEndpointForAddDistrict());
    }

    @Step("admin get error message after add district")
    public void getErrorMessageAfterAddDistrict() {
        restAssuredThat(response -> response.body("message",equalTo("City with id 99 doesn't exists")));
    }

    //scenario6
    @Step("admin send POST HTTP request with input same name district")
    public void sendPOSTHTTPRequestWithInputSameNameDistrict() {
        Faker faker = new Faker();
        name = faker.commerce().productName();
        JSONObject requestBody = new JSONObject();
        requestBody.put("city_id",1);
        requestBody.put( "name","car wash asep" );

        SerenityRest.given().header("Content-Type","application/json").body(requestBody.toJSONString()).post(setEndpointForAddDistrict());
    }

    //scenario7
    @Step("admin send POST HTTP request with input name by integer")
    public void sendPOSTHTTPRequestWithInputNameByInteger() {
        Faker faker = new Faker();
        name = faker.commerce().productName();
        JSONObject requestBody = new JSONObject();
        requestBody.put("city_id",1);
        requestBody.put( "name",78698);

        SerenityRest.given().header("Content-Type","application/json").body(requestBody.toJSONString()).post(setEndpointForAddDistrict());
    }
}
