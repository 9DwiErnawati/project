package starter.categories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Get {
    protected static String url = "https://be-qa.alta.id/api";

    @Step("I set GET api endpoints")
    public String iSetGETApiEndpoints() {
        return url + "/categories";
    }

    @Step("I send GET HTTP request")
    public void iSendGETHTTPRequest() {
        SerenityRest.given().get(iSetGETApiEndpoints());
    }

    @Step("I receive valid HTTP response code {int}")
    public void iReceiveValidHTTPResponseCode(int statusCode) {
        SerenityRest.then().statusCode(statusCode);
    }

    @Step("I receive valid data for detail categories")
    public void iReceiveValidDataForDetailCategories(){
        restAssuredThat(response -> response.body("data[8].ID", equalTo(12)));
    }
}
