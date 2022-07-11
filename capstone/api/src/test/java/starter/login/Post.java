package starter.login;

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

public class Post {

    protected static String url = "http://3.88.14.239:80/";

    //scenario 1
    @Step("user set endpoint for login")
    public String setEndpointsLogin(){
        return url + "api/auth/signin";
    }
    @Step("user send POST HTTP request")
    public void sendPostHttpRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put( "email","user015@gmail.com");
        requestBody.put( "password","password!2");

      SerenityRest.given().header("Content-Type","application/json").body(requestBody.toJSONString()).post(setEndpointsLogin());
    }
    @Step("user receive valid HTTP response code 200")
    public void receiveValidResponseCode(){
        restAssuredThat(response -> response.statusCode(200));

    }
    @Step("user receive valid data for new user")
    public void receiveValidData(){
        restAssuredThat(response -> response.body("username",equalTo("user015")));
    }

    //scenario 2
    @Step("user send POST HTTP request with empty data")
    public void sendPostWithEmptyData(){
        JSONObject requestBody = new JSONObject();
        requestBody.put( "email","");
        requestBody.put( "password","");

        SerenityRest.given().header("Content-Type","application/json").body(requestBody.toJSONString()).post(setEndpointsLogin());
    }
    @Step("user receive HTTP response code 400")
    public void receiveResponseCode(int arg0){
        restAssuredThat(response -> response.statusCode(arg0));

    }
    @Step("user get error message")
    public void getErrorMessage(){
        restAssuredThat(response -> response.body("error",equalTo("Bad Request")));
    }

    //scenario 3
    @Step("user send POST HTTP request with not register email")
    public void userSendPOSTHTTPRequestWithNotRegisterEmail() {
        JSONObject requestBody = new JSONObject();
        requestBody.put( "email","userrr@gmail.com");
        requestBody.put( "password","password!2");

        SerenityRest.given().header("Content-Type","application/json").body(requestBody.toJSONString()).post(setEndpointsLogin());
    }
    @Step("user receive HTTP response code 401")
    public void receiveResponseCode401(){
        restAssuredThat(response -> response.statusCode(401));
    }

    @Step("user get error message unauthorized")
    public void getErrorMessageUnauthorized(){
        restAssuredThat(response -> response.body("error",equalTo("Unauthorized")));
    }


    //scenario 4
    @Step("user send POST HTTP request with invalid password")
    public void userSendPOSTHTTPRequestWithInvalidPassword() {
        JSONObject requestBody = new JSONObject();
        requestBody.put( "email","user01@gmail.com");
        requestBody.put( "password","passwordwww");

        SerenityRest.given().header("Content-Type","application/json").body(requestBody.toJSONString()).post(setEndpointsLogin());
    }

    //scenario 5
    @Step("user set invalid endpoint for login")
    public String userSetInvalidEndpointForLogin() {
        return url + "api/auth/signinnnn13231";
    }

    @Step("user send POST HTTP request")
    public void userSendPOSTHTTPRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put( "email","dedeb1@gmail.com");
        requestBody.put( "password","password!2");

        SerenityRest.given().header("Content-Type","application/json").body(requestBody.toJSONString()).post(userSetInvalidEndpointForLogin());
    }

    @Step("user get status code {int}")
    public void userGetStatusCode(int arg0) {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("user get error message not found")
    public void userGetErrorMessageNotFound() {
        restAssuredThat(response -> response.body("error",equalTo("Not Found")));
    }

    //scenario 6
    @Step("user send POST HTTP request with empty email")
    public void userSendPOSTHTTPRequestWithEmptyEmail() {
        JSONObject requestBody = new JSONObject();
        requestBody.put( "email","");
        requestBody.put( "password","password!2");

        SerenityRest.given().header("Content-Type","application/json").body(requestBody.toJSONString()).post(setEndpointsLogin());
    }

    //scenario 7
    @Step("user send POST HTTP request with empty password")
    public void userSendPOSTHTTPRequestWithEmptyPassword() {
        JSONObject requestBody = new JSONObject();
        requestBody.put( "email","user01@gmail.com");
        requestBody.put( "password","");

        SerenityRest.given().header("Content-Type","application/json").body(requestBody.toJSONString()).post(setEndpointsLogin());
    }

    //scenario 8
    @Step("user send POST HTTP request with not use @")
    public void userSendPOSTHTTPRequestWithNotUse() {
        JSONObject requestBody = new JSONObject();
        requestBody.put( "email","user01.gmail.com");
        requestBody.put( "password","password!2");

        SerenityRest.given().header("Content-Type","application/json").body(requestBody.toJSONString()).post(setEndpointsLogin());
    }

    //scenario 9
    @Step("user send POST HTTP request with not use domain")
    public void userSendPOSTHTTPRequestWithNotUseDomain() {JSONObject requestBody = new JSONObject();
        requestBody.put( "email","user01");
        requestBody.put( "password","password!2");

        SerenityRest.given().header("Content-Type","application/json").body(requestBody.toJSONString()).post(setEndpointsLogin());
    }

    //scenario10
    @Step("admin set endpoint for login admin")
    public String SetEndpointForLoginAdmin() {
        return url + "api/auth/signin";
    }

    @Step("admin send POST HTTP request with valid data admin")
    public void SendPOSTHTTPRequestWithValidDataAdmin() {
        JSONObject requestBody = new JSONObject();
        requestBody.put( "email","admin01@gmail.com");
        requestBody.put( "password","password!2");

        SerenityRest.given().header("Content-Type","application/json").body(requestBody.toJSONString()).post(SetEndpointForLoginAdmin());
    }

    @Step("admin get status code {int}")
    public void adminGetStatusCode(int arg0) {
        restAssuredThat(response ->response.statusCode(200));
    }

    @Step("admin get valid data admin")
    public void aGetValidDataAdmin() {
        restAssuredThat(response -> response.body("username",equalTo("admin01")));
    }
}
