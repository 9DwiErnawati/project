package starter.Transactions;

import net.serenitybdd.rest.SerenityRest;
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

public class Post {
    private static String base_url = "https://be-qa.alta.id/api";

    @Step("I set an endpoint for POST create transaction")
    public String setEndpointForCreateTransaction(){
        return base_url + "/orders";
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


    @Step("I request POST create transaction")
    public void iRequestPOSTCreateTransaction() throws Exception{
        String token = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//token.json"), StandardCharsets.UTF_8);

        given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .body(bodyData())
                .when().post(setEndpointForCreateTransaction());
    }

    @Step("validate the data detail after create transaction")
    public void validateTheDataDetailAfterCreateTransaction(){
        restAssuredThat(response -> response.body("data[0].Quantity", equalTo(2)));
        //    then().body("result", equalTo("User authorized successfully."));
    }

    @Step("I validate the status code {int}")
    public void iValidateTheStatusCode(int code){
        SerenityRest.then().equals(400);
    }

    @Step("validate the data after create transaction")
    public void validateTheDataAfterCreate(){
        restAssuredThat(response -> response.body("data[2].Quantity", equalTo(null)));
    }
}
