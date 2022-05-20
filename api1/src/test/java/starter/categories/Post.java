package starter.categories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class Post {
    String categories;

    private static String url = "https://be-qa.alta.id/api";

    @Step("I set an endpoint for POST new categories")
    public String setPostEndpoint() {
        return url + "/categories";
    }

    @Step("I set an endpoint for POST new user")
    public String getNameCategory() {
        return this.categories;
    }

    @Step("I request POST detail categories")
    public void iRequestPostDetailCategories(String categories) {
        JSONObject requestData = new JSONObject();
            requestData.put("name", "kesehatan");

        SerenityRest.given().header("Content-Type", "application/json").body(requestData.toJSONString());
        SerenityRest.when().post(setPostEndpoint());
    }

    @Step("I validate the status code is {int}")
    public void validateStatusCode(int statusCode) {
        SerenityRest.then().statusCode(statusCode);
    }

    @Step("validate the data detail after create categories")
    public void iValidateDataAfterDetailCategories() {
        restAssuredThat(response -> response.body("'data'.'Name'", equalTo("kesehatan")));
    }
}
