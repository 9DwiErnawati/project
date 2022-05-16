package starter.Auth;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static net.serenitybdd.rest.RestRequests.given;
import static net.serenitybdd.rest.RestRequests.when;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Post {
    public String fullname, email, password, userId;

    private static String url = "https://be-qa.alta.id/api";

    @Step("I set an endpoint for POST new user")
    public String setPostEndpoint() {
        return url + "/auth/register";
    }

    @Step("I set an endpoint for POST new user")
    public String getFullname() {
        return this.fullname;
    }

    @Step("I set an endpoint for POST new user")
    public String getEmail() {
        return this.email;
    }

    @Step("I request user")
    public List<JSONObject> bodyData() {
        List<JSONObject> body = new ArrayList<>();

        JSONObject data = new JSONObject();
        data.put("fullname", "Alex Understand");
        data.put("email", "alexunder17@email.com");
        data.put("password", "123123124");

        body.add(data);
        return body;
    }

    @Step("I request POST detail user")
    public void iRequestPOSTDetailUser(String fullname, String email, String password) {
        given().header("Content-Type", "application/json")
                .body(bodyData());
        when().post(setPostEndpoint());
    }

    @Step("I validate the status code is")
    public void iValidateTheStatusCodeIs(int statusCode) {
        SerenityRest.then().statusCode(statusCode);
    }

    @Step("Validate the data detail after create registration")
    public void validateTheDataDetailAfterCreateRegistration(String message) {
        if (message.equals("success")){
            restAssuredThat(response -> response.body("'data'.'Fullname'", equalTo("Alex Understand")));
        } else {
            SerenityRest.then().body("'data'.'Fullname'", equalTo(null));
        }
    }

    @Step("Get userId from the response")
    public String getUserId(){
        Response response = SerenityRest.lastResponse();
        String userId = response.body().path("userID");
        try (FileWriter file = new FileWriter("src//test//resources//filejson//userId.json")) {
            file.write(userId);
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(userId);
        return userId;
    }
}
