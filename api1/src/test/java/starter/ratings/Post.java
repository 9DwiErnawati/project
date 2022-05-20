package starter.ratings;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.apache.commons.io.FileUtils;
import org.json.simple.JSONObject;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class Post {
    String base_url = "https://be-qa.alta.id/api/";
    String rating;

    @Step("I set endpoints for POST new rating")
    public String iSetEndpointsForPOSTRating(){
        return base_url + "products/1/ratings";
    }

    @Step("I set endpoints for POST new rating")
    public String getRatings(){
        return this.rating;
    }

    @Step("I request POST rating product")
    public void requestAddRating() throws IOException {
        String token = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//token.json"), StandardCharsets.UTF_8);
        JSONObject requestData = new JSONObject();
        requestData.put("count", 2);

        SerenityRest.given().header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestData.toJSONString());
        SerenityRest.when().post(iSetEndpointsForPOSTRating());
    }

    @Step("Validate the data detail after create rating")
    public void validateTheDataDetailAfterCreateRating() {
        then().body("count", equalTo(this.rating));
    }

}
