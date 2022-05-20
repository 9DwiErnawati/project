package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;
import starter.pages.OrderPage;
import starter.pages.TransactionPage;

public class OrderSteps {
    @Steps
    OrderPage orderPage;

    @Steps
    LoginPage loginPage;

    @Steps
    TransactionPage transactionPage;

    @And("I am on the homepage order")
    public void iAmOnTheHomepageOrder() {
        orderPage.openUrl();
        orderPage.validateOnHomepageOrder();
    }

    @And("I input {string} and {string}>")
    public void iInputAnd(String email, String password) {
        loginPage.inputEmail(email);
        loginPage.inputPassword(password);
    }

    @And("I click button cart")
    public void iClickButtonCart() {
        orderPage.clickOrderButton();
    }

    @And("I click button {string}")
    public void iClickButton(String select) {
        if (select.equals("bayar")){
            orderPage.clickBayarButton();
        }else if (select.equals("increase")){
            orderPage.clickIncreaseButton();
        }else {
            orderPage.clickDecreaseButton();
        }
    }

    @Then("I go to transaction page {string}")
    public void iGoToTransactionPage(String result) {
        if (result.equals("transaction page")){
            transactionPage.headerTextEqual();
        }else if (result.equals("product increase")){
            orderPage.validateIncrease();
        }else {
            orderPage.errorMessageEqual();
        }
    }
}
