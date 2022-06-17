package starter.register;

import com.github.javafaker.Faker;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class PostRegist {
    private String username = "user08";
    private String email = "user014@gmail.com" ;
    private String password = "password!2";
    private String url = "http://3.88.14.239:80/";

    @Step("user set endpoint for register")
    public String setEndpointsRegister(){
        return url + "api/auth/signup";
    }
    @Step("user send create account with valid data")
    public void sendCreateAccountWithValidData(){
//        Faker faker = new Faker();
//        username = faker.name().username();
//        email = faker.internet().emailAddress();
        JSONObject requestBody = new JSONObject();
        requestBody.put( "email",email );
        requestBody.put( "password", password);
        requestBody.put( "username",username );

        SerenityRest.given().header("Content-Type","application/json").body(requestBody.toJSONString()).post(setEndpointsRegister());
    }
    @Step("user see response code 200 after send register")
    public void seeResponseCodeAfterRegist(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("user see detail data")
    public void userSeeDetailData(){
        restAssuredThat(response -> response.body("message",equalTo("User registered successfully!")));
    }
    //scenario 2
    @Step("user send post HTTP with empty data register")
    public void sendPostWithEmptyDataRegister(){
        JSONObject requestBody = new JSONObject();
        requestBody.put( "email","" );
        requestBody.put( "password", "");
        requestBody.put( "username","" );

        SerenityRest.given().header("Content-Type","application/json").body(requestBody.toJSONString()).post(setEndpointsRegister());
    }
    @Step("user get respone code 400")
    public void receiveResponseCode400() {
        restAssuredThat(response -> response.statusCode(400));
    }
    @Step("user get error message")
    public void getErrorMessageRegist(){
        restAssuredThat(response -> response.body("error",equalTo("Bad Request")));
    }
}
