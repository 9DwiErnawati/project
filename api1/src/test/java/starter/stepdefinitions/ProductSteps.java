package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.products.Get;
import starter.products.Post;

public class ProductSteps {
    String products;

    @Steps
    Get get;

    @Steps
    Post post;

    @Given("I set endpoints for GET detail products")
    public void iSetEndpointsForGETDetailProducts() {
        get.iSetEndpointsForGETDetailProducts();
    }

    @When("I send GET HTTP request products")
    public void iSendGETHTTPRequestProducts() {
        get.iSendGETHTTPRequestProducts();
    }

    @And("I receive valid data for detail products")
    public void iReceiveValidDataForDetailProducts() {
        get.iReceiveValidDataDetailProducts();
    }

    @Given("I set an endpoint for POST new products")
    public void iSetAnEndpointForPOSTNewProducts() {
        post.getEndpoint();
    }

    @When("I request POST detail data products")
    public void iRequestPOSTDetailDataProducts() throws Exception{
        post.requestAddProduct();
        this.products = post.getNameProducts();
    }

    @And("Validate the data detail after create products")
    public void validateTheDataDetailAfterCreateProducts() {
        post.validateDataDetail();
    }

    @Given("I set endpoints for GET ID detail products")
    public void iSetEndpointsForGETIDDetailProducts() {
        get.iSetEndpointsForGETIDDetailProducts();
    }

    @When("I send GET HTTP request ID products")
    public void iSendGETHTTPRequestIDProducts() {
        get.iSendGETHTTPRequestIDProducts();
    }

    @And("I receive valid data for ID products")
    public void iReceiveValidDataForIDProducts() {
        get.iReceiveValidDataForIDProducts();
    }
}

