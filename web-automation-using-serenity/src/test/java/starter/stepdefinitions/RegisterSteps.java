package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.RegisterPage;

public class RegisterSteps {

    @Steps
    RegisterPage registerPage;

    @Given("I am on the register page")
    public void iAmOnTheRegisterPage() {
        registerPage.openUrl();
        registerPage.validateOnRegisterPage();
    }

    @When("I input {string} with {string} and {string}")
    public void iInputWithAnd(String fullname, String email, String password) {
        registerPage.inputFullname(fullname);
        registerPage.inputEmail(email);
        registerPage.inputPassword(password);
    }


    @And("{string} register button")
    public void registerButton(String result) {
        if (result.equals("success")) {
            registerPage.clickRegisterButton();
        } else {
            registerPage.clickRegisterButton();
            registerPage.clickRegisterButton();
        }
    }

    @Then("I go to login page {string}")
    public void iGoToLoginPage(String result) {
        if (result.equals("success")) {
            registerPage.validateLoginPage();
            registerPage.equalLogin(result);
        } else {
            registerPage.warningMessageAppears();
            registerPage.warningMessageEquals(result);
        }
    }
}
