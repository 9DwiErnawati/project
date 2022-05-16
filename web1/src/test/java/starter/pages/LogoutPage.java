package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;


import static net.serenitybdd.screenplay.actions.Scroll.to;

public class LogoutPage extends PageObject {
    private By iconButton() {
        return By.xpath("//*[@id=\"app\"]/div[1]/header/div/button[2]/span/i");
    }
    private By logoutButton(){
        return By.xpath ("//*[@id='app']//child::div[6]");
    }

    @Step
    public boolean validateOnLogoutPage(){
        return $(iconButton()).isDisplayed();
    }

    @Step
    public void clickIconButton(){
        to(iconButton());
        $(iconButton()).click();
    }
    @Step
    public void clickLogoutButton(){
        to(logoutButton());
        $(logoutButton()).click();
    }
}
