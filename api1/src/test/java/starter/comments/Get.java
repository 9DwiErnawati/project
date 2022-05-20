package starter.comments;

import net.thucydides.core.annotations.Step;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.nio.charset.StandardCharsets;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Get {
    protected static String url = "https://be-qa.alta.id/api";

    @Step("I set endpoints for GET comments")
    public String iSetGETApiEndpointComments() {
        return url + "/products/1/comments";
    }

    @Step("I send GET HTTP request comments")
    public void iSendGETHTTPRequestComments() throws Exception{
        String token = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//token.json"), StandardCharsets.UTF_8);

        given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .when().get(iSetGETApiEndpointComments());
    }

    @Step("I receive valid data for comments")
    public void iReceiveValidDataForDetailComments(){
        restAssuredThat(response -> response.body("data[0].ID", equalTo(2)));
    }
}
