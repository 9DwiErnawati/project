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

    private By orderButton(){
        return By.xpath("//*[@id=\"app\"]/div/header/div/button[1]/span/span/i");
    }

    private By clickDecrease(){
        return By.xpath("//*[@class = 'v-list-item theme--light'][1]//span[text() = '-']");
    }
    private By clickIncrease(){
        return By.xpath("//*[@class = 'v-list-item theme--light'][1]//span[text() = '+']");
    }
    private By errormessage(){
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div/div[1]");
    }

    private By increaseProduct(){
        return By.xpath("//*[@id=\"label-total-quantity\"]");
    }

    @Step
    public boolean errorMessageEqual(){
        return $(errormessage()).getText().equals("Order is empty!");
    }

    @Step
    public boolean validateIncrease(){
        return $(increaseProduct()).getText().equals("2");
    }

    @Step
    public void openUrl(){
        openAt("https://qa.alta.id");
    }

    @Step
    public void clickOrderButton(){
        to(orderButton());
        $(orderButton()).click();
    }

    @Step
    public void clickDecreaseButton(){
        to(clickDecrease());
        $(clickDecrease()).click();
    }

    @Step
    public void clickIncreaseButton(){
        to(clickIncrease());
        $(clickIncrease()).click();
    }
}
