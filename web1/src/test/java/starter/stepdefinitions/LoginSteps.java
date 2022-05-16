package starter.stepdefinitions;

import starter.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;

public class LoginSteps {

    @Steps
    LoginPage loginPage;

    @Steps
    HomePage homePage;

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        loginPage.openUrl();
        loginPage.validateOnLoginPage();
    }

    @And("click login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("I go to homepage")
    public void iGoToHomepage() {
        homePage.headerAppears();
        homePage.headerTextEqual();
    }

    @When("I input invalid email")
    public void iInputInvalidEmail() {
        loginPage.inputEmail("Januari");
    }

    @Then("error message {string}")
    public void errorMessage(String arg0) {
        loginPage.errorMessageAppears();
        loginPage.errorMessageEquals(arg0);
    }
}
