package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.comments.Get;
import starter.comments.Post;

public class commentSteps {

    String comment;

    @Steps
    Get get;

    @Steps
    Post post;

    @Given("I set endpoints for GET comments")
    public void iSetEndpointsForGETComments() {
        get.iSetGETApiEndpointComments();
    }

    @When("I send GET HTTP request comments")
    public void iSendGETHTTPRequestComments() throws Exception{
        get.iSendGETHTTPRequestComments();
    }

    @And("I receive valid data for comments")
    public void iReceiveValidDataForComments() {
        get.iReceiveValidDataForDetailComments();
    }

    @Given("I set an endpoint for POST new comments")
    public void iSetAnEndpointForPOSTNewComments() {
        post.iSetEndpointsForPOSTComments();
    }

    @When("I request POST comments products")
    public void iRequestPOSTCommentsProducts() throws Exception{
        this.comment = post.getComments();
        post.requestAddComment();
    }

    @And("Validate the data detail after create comments")
    public void validateTheDataDetailAfterCreateComments() {
        post.validateTheDataDetailAfterCreateComments();
    }
}
