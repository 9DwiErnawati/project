package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Auth.Post;

public class AuthSteps {
    String fullname, userId, email, password;
    int statusCode;

    @Steps
    Post post;

    @Given("I set an endpoint for POST new {string} with {string} with {string}")
    public void iSetAnEndpointForPOSTNewWithWith(String arg0, String arg1, String arg2) {
        post.setPostEndpoint();
    }

    @When("I request POST detail user")
    public void iRequestPOSTDetailUser() throws Exception{
        post.iRequestPOSTDetailUser(fullname, email, password);
        this.fullname = post.getFullname();
    }

    @Then("I validate the status code is ")
    public void iValidateTheStatusCodeIs() {
        post.iValidateTheStatusCodeIs(statusCode);
    }

    @And("Validate the {string} after create registration")
    public void validateTheAfterCreateRegistration(String message) {
        post.validateTheDataDetailAfterCreateRegistration(message);
    }

    @And("get userId if {string} for other request")
    public void getUserIdIfForOtherRequest(String message) {
        this.userId = post.getUserId();
    }
}
