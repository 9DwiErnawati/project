package com.example.steps;

import com.example.app.pages.TaskPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class registerSteps {
    TaskPage taskPage = new TaskPage();

    @Given("I am on the register page")
    public void iAmOnTheRegisterPage() throws Exception{
        taskPage.verifyTaskDisplayed();
    }

    @And("click register button")
    public void clickRegisterButton() throws Exception{
        taskPage.clickButtonRegister();
    }

    @When("I input {string} with {string} and {string}")
    public void iInputWithAnd(String fullname, String email, String password) throws Exception {
        taskPage.inputFullname(fullname);
        taskPage.inputEmailRegister(email);
        taskPage.inputPasswordRegister(password);
    }

    @And("click register button second")
    public void clickRegisterButtonSecond() throws Exception{
        taskPage.clickButtonRegister();
    }
}

