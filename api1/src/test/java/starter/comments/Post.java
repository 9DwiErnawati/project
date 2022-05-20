package starter.comments;

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
    String comment;

    @Step("I set an endpoint for POST new comments")
    public String iSetEndpointsForPOSTComments(){
        return base_url + "products/1/comments";
    }

    @Step("I set an endpoint for POST new comments")
    public String getComments(){
        return this.comment;
    }

    @Step("I request POST comments products")
    public void requestAddComment() throws IOException {
        String token = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//token.json"), StandardCharsets.UTF_8);
        JSONObject requestData = new JSONObject();
        requestData.put("content", "mantap nih");

        SerenityRest.given().header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestData.toJSONString());
        SerenityRest.when().post(iSetEndpointsForPOSTComments());
    }

    @Step("Validate the data detail after create comments")
    public void validateTheDataDetailAfterCreateComments() {
        then().body("'data'.'Content'", equalTo("mantap nih"));
    }

}
