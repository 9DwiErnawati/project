package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.actions.Scroll.to;

public class OrderPage extends PageObject {
    private By bayarButton(){
        return By.xpath("//*[@id=\"button-bayar\"]/span");
    }

    @Step
    public boolean validateOnHomepageOrder(){
        return $(bayarButton()).isDisplayed();
    }

    @Step
    public void clickBayarButton(){
        to(bayarButton());
        $(bayarButton()).click();
    }
}
