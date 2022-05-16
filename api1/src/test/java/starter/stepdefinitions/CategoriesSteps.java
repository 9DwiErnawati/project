package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.categories.Get;
import starter.categories.Post;

public class CategoriesSteps {
    public String categories, message;
    int statusCode;

    @Steps
    Get get;

    @Steps
    Post post;

    @Given("I set GET api endpoints")
    public void iSetGETApiEndpoints() {
        get.iSetGETApiEndpoints();
    }

    @When("I send GET HTTP request")
    public void iSendGETHTTPRequest() {
        get.iSendGETHTTPRequest();
    }

    @Then("I receive valid HTTP response code {int}")
    public void iReceiveValidHTTPResponseCode(int arg0) {
        get.iReceiveValidHTTPResponseCode(arg0);
    }

    @And("I receive valid data for detail categories")
    public void iReceiveValidDataForDetailCategories() {
        get.iReceiveValidDataForDetailCategories();
    }

    @Given("I set an endpoint for POST new categories")
    public void iSetAnEndpointForPOSTNewCategories() {
        post.setPostEndpoint();
    }

    @When("I request POST detail {string}")
    public void iRequestPOSTDetail(String arg0) {
        post.iRequestPostDetailCategories(categories);
        this.categories = post.getNameCategory();
    }

    @Then("I validate the status code is {int}")
    public void validateStatusCode(int arg0) {
        post.validateStatusCode(arg0);
    }

    @And("Validate the data detail after create categories")
    public void validateTheDataDetailAfterCreateCategories() {
        post.iValidateDataAfterDetailCategories();
    }
}

