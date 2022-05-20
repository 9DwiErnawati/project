package starter.products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class Get {
    protected static String url = "https://be-qa.alta.id/api";

    @Step("I set endpoints for GET detail products")
    public String iSetEndpointsForGETDetailProducts() {
        return url + "/products";
    }

    @Step("I send GET HTTP request products")
    public void iSendGETHTTPRequestProducts() {
        SerenityRest.given().get(iSetEndpointsForGETDetailProducts());
    }

    @Step("I receive valid data for detail products")
    public void iReceiveValidDataDetailProducts(){
        then().body("data[0].ID", equalTo(2314));
    }

    @Step("I set endpoints for GET ID detail products")
    public String iSetEndpointsForGETIDDetailProducts() {
        return url + "/products/2314";
    }

    @Step("I send GET HTTP request ID products")
    public void iSendGETHTTPRequestIDProducts() {
        SerenityRest.given().get(iSetEndpointsForGETIDDetailProducts());
    }

    @Step("I receive valid data for ID products")
    public void iReceiveValidDataForIDProducts(){
        then().body("'data'.'ID'", equalTo(2314));
    }
}
