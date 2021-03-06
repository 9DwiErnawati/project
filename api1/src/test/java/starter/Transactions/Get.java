package starter.Transactions;

import net.thucydides.core.annotations.Step;
import org.apache.commons.io.FileUtils;
import org.json.simple.JSONObject;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Get {
    protected static String url = "https://be-qa.alta.id/api";

    @Step("I set endpoints for GET detail transactions")
    public String iSetGETApiEndpoints() {
        return url + "/orders";
    }

    @Step("Build request data")
    public List<JSONObject> bodyData(){
        List<JSONObject> body = new ArrayList<>();

        JSONObject data = new JSONObject();
        data.put("product_id", 428);
        data.put("quantity", 2);

        body.add(data);
        return body;
    }

    @Step("Build request data")
    public JSONObject bodyDataProduct(){
        JSONObject body = new JSONObject();
        List<Integer> data = new ArrayList<>();

        body.put("name", "Tensi darah");
        body.put("price", 9800);

        data.add(3);
        data.add(6);

        body.put("categories", data);
        return body;
    }

    @Step("I request GET all transactions")
    public void iRequestGETAllTransaction() throws Exception{
        String token = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//token.json"), StandardCharsets.UTF_8);

        given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .body(bodyData())
                .when().get(iSetGETApiEndpoints());
    }

    @Step("validate the data detail after transactions")
    public void iValidateDataForDetailTransactions(){
        restAssuredThat(response -> response.body("data[0].Quantity", equalTo(null)));
    }
}
