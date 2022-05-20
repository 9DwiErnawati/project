package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;

public class LoginSteps {

    @Steps
    LoginPage loginPage;

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        loginPage.openUrl();
        loginPage.validateOnLoginPage();
    }

    @When("I input {string} and {string}")
    public void iInputAnd(String email, String password) {
        loginPage.inputEmail(email);
        loginPage.inputPassword(password);
    }

    @And("click login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("I go to homepage {string}")
    public void iGoToHomepage(String result) {
        if (result.equals("success")){
            loginPage.validateHomepage();
            loginPage.equalgotoHomepage(result);
        }else{
            loginPage.errorMessageAppears();
            loginPage.errorMessageEquals(result);
        }
    }
}
