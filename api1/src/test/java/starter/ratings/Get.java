package starter.ratings;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.nio.charset.StandardCharsets;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Get {
    protected static String url = "https://be-qa.alta.id/api";

    @Step("I set endpoints for GET rating")
    public String iSetGETApiEndpointsRatings() {
        return url + "/products/1/ratings";
    }

    @Step("I send GET HTTP request rating")
    public void iSendGETHTTPRequestRatings() throws Exception{
        String token = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//token.json"), StandardCharsets.UTF_8);

        given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .when().get(iSetGETApiEndpointsRatings());
    }

    @Step("I receive valid data for rating")
    public void iReceiveValidDataForDetailRating(){
        restAssuredThat(response -> response.body("data", equalTo(2)));
    }
}
