package starter.products;

import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static net.serenitybdd.rest.RestRequests.given;
import static net.serenitybdd.rest.RestRequests.when;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class Post {
    String base_url = "https://be-qa.alta.id/api/";
    String name;

    @Step("I set an endpoint for POST new products")
    public String getEndpoint(){
        return base_url + "products";
    }

    @Step("I set an endpoint for POST new products")
    public String getNameProducts(){
        return this.name;
    }

    public JSONObject bodyAddProduct() throws IOException {
        JSONObject body = new JSONObject();
        List<Integer> data = new ArrayList<>();

        body.put("name", "Tensi darah");
        body.put("price", 9800);

        data.add(3);
        data.add(6);

        body.put("categories", data);
        return body;
    }

    @Step("I request POST detail data products")
    public void requestAddProduct() throws IOException {
        given().header("Content-Type", "application/json")
                .body(bodyAddProduct().toJSONString());
        when().post(getEndpoint());
    }

    @Step("I validate the status code is {int}")
    public void validateStatusCode(int code){
        then().statusCode(equalTo(code));
    }

    @Step("Validate the data detail after create products")
    public void validateDataDetail(){
        then().body("name", equalTo(this.name));
    }

}
