package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.pages.OrderPage;
import starter.pages.TransactionPage;

public class OrderSteps {
    @Steps
    OrderPage orderPage;

    @Steps
    TransactionPage transactionPage;

    @And("I am on the homepage order")
    public void iAmOnTheHomepageOrder() {
        orderPage.validateOnHomepageOrder();
    }

    @Then("I click button bayar")
    public void iClickButtonBayar() {
        orderPage.clickBayarButton();
    }

    @And("I go to transaction page")
    public void iGoToTransactionPage() {
        transactionPage.headerTextEqual();
    }
}
