package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Transactions.Get;
import starter.Transactions.Post;

public class TransactionSteps {
    @Steps
    Post post;

    @Steps
    Get get;

    @Given("I set an endpoint for POST generate token")
    public void iSetAnEndpointForPOSTGenerateToken() {
        post.setEndpointForGenerate();
    }

    @When("I request POST generate token")
    public void iRequestPOSTGenerateToken() throws Exception{
        post.requestPostGenerateToken();
    }

    @And("validate the data detail after generate token")
    public void validateTheDataDetailAfterGenerateToken() {
        post.validateDataDetailGenerateToken();
        System.out.println("Success");
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
        System.out.println("success");
        //     get.iValidateDataForDetailTransactions();
    }
}
