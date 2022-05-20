package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.ratings.Get;
import starter.ratings.Post;

public class RatingSteps {
    String rating;

    @Steps
    Get get;

    @Steps
    Post post;

    @Given("I set endpoints for GET rating")
    public void iSetEndpointsForGETRating() {
        get.iSetGETApiEndpointsRatings();
    }

    @When("I send GET HTTP request rating")
    public void iSendGETHTTPRequestRating() throws Exception{
        get.iSendGETHTTPRequestRatings();
    }

    @And("I receive valid data for rating")
    public void iReceiveValidDataForRating() {
        get.iReceiveValidDataForDetailRating();
    }

    @Given("I set an endpoint for POST new rating")
    public void iSetAnEndpointForPOSTNewRating() {
        post.iSetEndpointsForPOSTRating();
    }

    @When("I request POST rating product")
    public void iRequestPOSTRatingProduct() throws Exception{
        this.rating = post.getRatings();
        post.requestAddRating();
    }

    @And("Validate the data detail after create rating")
    public void validateTheDataDetailAfterCreateRating() {
        post.validateTheDataDetailAfterCreateRating();
    }
}
