package starter.manage.district;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static starter.manage.city.GetCity.url;

public class GetDistrict {

    //scenario1
    @Step("admin set endpoint for get district")
    public String setEndpointGetDistrict(){
        return url + "/api/page/admin/district/list/1";
    }

    @Step("admin send request district")
    public void sendRequestDistrict() {
        SerenityRest.given().get(setEndpointGetDistrict());
    }

    @Step("admin get status code {int} on district")
    public void getStatusCodeOnDistrict(int arg0) {
        restAssuredThat(response -> response.statusCode(arg0));
    }

    @Step("admin get list district")
    public void getListDistrict() {
        Response response = SerenityRest.lastResponse();
        String Name = response.getBody().jsonPath().get("name[0]");
        int Price = response.getBody().jsonPath().get("district_id[0]");
        Assert.assertEquals(Name,"Tembalang");
        Assert.assertEquals(Price,1);
    }

    //scenario2
    @Step("admin set invalid endpoint for get district")
    public String setInvalidEndpointForGetDistrict() {
        return url + "/api/page/admin/district/list/6565";
    }

    @Step("admin send request invalid endpoint district")
    public void sendRequestInvalidEndpointDistrict() {
        SerenityRest.given().get(setInvalidEndpointForGetDistrict());
    }
}
