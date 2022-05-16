package starter.stepdefinitions;

import starter.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.RegisterPage;

public class RegisterSteps {
    @Steps
    RegisterPage registerPage;

    @Steps
    LoginPage loginPage;

    @Given("I am on the register page")
    public void iAmOnTheRegisterPage() {
        registerPage.openUrl();
        registerPage.validateOnRegisterPage();
    }

    @When("I input valid fullname")
    public void iInputValidFullname() {
        registerPage.inputFullname("Dwi Ernawati");
    }

    @And("I input valid email")
    public void iInputValidEmail() {
        registerPage.inputEmail("195410079dwiernawati@gmail.com");
    }

    @And("I input valid password")
    public void iInputValidPassword() {
        registerPage.inputPassword("September90*");
    }

    @And("click register button")
    public void clickRegisterButton() {
        registerPage.clickRegisterButton();
    }

    @Then("I go to login page")
    public void iGoToLoginPage() {
        loginPage.openAt("/auth/login");
    }

    @And("I input same email")
    public void iInputSameEmail() {
        registerPage.inputEmail("195410079dwiernawati@gmail.com");
    }

    @Then("warning message {string}users_email_key{string}")
    public void warningMessageUsers_email_key(String arg0, String arg1) {
        registerPage.warningMessageAppears();
        registerPage.warningMessageEquals(arg1);
    }

    @And("click register{int} button")
    public void clickRegisterButton(int arg0) {
        registerPage.clickRegisterButton();
        registerPage.clickRegisterButton();
    }
}
