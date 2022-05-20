package com.example.steps;

import com.example.app.pages.TaskPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cartSteps {
    TaskPage taskPage = new TaskPage();

    @Given("I am on the homepage")
    public void iAmOnTheHomepage() throws Exception{
        taskPage.verifyTaskDisplayed();
    }

    @When("I click button Beli")
    public void iClickButtonBeli() throws Exception{
        taskPage.clickButtonBeli();
    }

    @Then("product in cart increase")
    public void producinCartIncrease() throws Exception{
        taskPage.verifyCart();
    }
}
