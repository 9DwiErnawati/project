package com.example.steps;

import com.example.app.pages.TaskPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {
    TaskPage taskPage = new TaskPage();

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() throws Exception{
        taskPage.verifyTaskDisplayed();
    }

    @And("I click menu button")
    public void iClickMenuButton() {
        taskPage.clickButtonMenu();
    }

    @When("I input {string} and {string}")
    public void iInputAnd(String email, String password) throws Exception{
        taskPage.inputEmailLogin(email);
        taskPage.inputPasswordLogin(password);
        }

    @And("click login button")
    public void clickLoginButton() throws Exception{
        taskPage.clickButtonLogin();
    }

    @Then("I go to homepage {string}")
    public void iGoToHomepage(String result) throws Exception{
        if (result.equals("success")){
            taskPage.verifyTaskDisplayed();
            taskPage.verifyEqualPage();
        } else {
            taskPage.verifyErrorMessage();
        }
    }
}
