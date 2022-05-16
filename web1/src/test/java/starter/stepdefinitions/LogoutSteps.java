package starter.stepdefinitions;

import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;
import starter.pages.LogoutPage;

public class LogoutSteps {
    @Steps
    LogoutPage logoutPage;

    @And("I am on the homepage")
    public void iAmOnTheHomepage() {
        logoutPage.validateOnLogoutPage();
    }

    @And("I click button icon")
    public void iClickButtonIcon() {
        logoutPage.clickIconButton();
    }

    @And("I click button logout")
    public void iClickButtonLogout() {
        logoutPage.clickLogoutButton();
    }
}
