package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.DetailProductPage;
import starter.pages.HomePage;

public class HomeSteps {
    @Steps
    HomePage homePage;
    @Steps
    DetailProductPage detailProductPage;

    @Given("I am on the home pages")
    public void iAmOnTheHomePages() {
        homePage.openUrl();
        homePage.validateOnHomePage();
    }
    @When("I click button Beli")
    public void iClickButtonBeli() {
        homePage.clickBeliButton();
    }

    @Then("product go to order page")
    public void productGoToOrderPage() {
        homePage.clickOrderButton();
    }

    @Given("I am on the home page")
    public void iAmOnTheHomePage() {
        homePage.openUrl();
        homePage.validateOnHomePage1();
    }

    @When("I click button Detail")
    public void iClickButtonDetail() {
        homePage.clickDetailButton();
    }

    @Then("I can see detail product")
    public void iCanSeeDetailProduct() {
        detailProductPage.headerTextEqual();
    }
}
