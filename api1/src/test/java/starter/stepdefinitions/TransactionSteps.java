package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Transactions.Get;
import starter.Transactions.Post;

public class TransactionSteps {
    @Steps
    Post post;

    @Steps
    Get get;


    @Given("I set an endpoint for POST create transaction")
    public void iSetAnEndpointForPOSTCreateTransaction() {
        post.setEndpointForCreateTransaction();
    }

    @When("I request POST create transaction")
    public void iRequestPOSTCreateTransaction() throws Exception{
        post.iRequestPOSTCreateTransaction();
    }

    @And("validate the data detail after create transaction")
    public void validateTheDataDetailAfterCreateTransaction() {
        post.validateTheDataDetailAfterCreateTransaction();
    }

    @Given("I set endpoints for GET detail transactions")
    public void iSetEndpointsForGETDetailTransactions() {
        get.iSetGETApiEndpoints();
    }

    @When("I request GET all transactions")
    public void iRequestGETAllTransactions() throws Exception{
        get.iRequestGETAllTransaction();
    }

    @And("validate the data detail after transactions")
    public void validateTheDataDetailAfterTransactions() {
//        System.out.println("success");
        get.iValidateDataForDetailTransactions();
    }

    @Then("I validate the status code {int}")
    public void iValidateTheStatusCode(int arg0) {
        post.iValidateTheStatusCode(400);
    }

    @And("validate the data after create transaction")
    public void validateTheDataAfterCreateTransaction() {
        post.validateTheDataAfterCreate();
    }
}
