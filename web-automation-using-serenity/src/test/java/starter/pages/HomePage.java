package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.actions.Scroll.to;

public class HomePage extends PageObject {
    private By productHeader(){
        return By.xpath("//*[@id=\"app\"]/div/header");
    }
    private By beliButton(){
        return By.xpath("//*[@class = 'col-md-4 col-lg-3 col-6'][1]//span[text() = 'Beli']");
    }

    private By detailButton(){
        return By.xpath("//*[@class = 'col-md-4 col-lg-3 col-6'][1]//span[text() = 'Detail']");
    }

    @Step
    public boolean headerAppears(){
        return $(productHeader()).isDisplayed();
    }

    @Step
    public boolean headerTextEqual(){
        return $(productHeader()).getText().equals("AltaShop");
    }

    @Step
    public void openUrl(){
        openAt("https://qa.alta.id");
    }

    @Step
    public boolean validateOnHomePage(){
        return $(beliButton()).isDisplayed();
    }

    @Step
    public boolean validateOnHomePage1(){
        return $(detailButton()).isDisplayed();
    }

    @Step
    public void clickBeliButton(){
        to(beliButton());
        $(beliButton()).click();
    }

    @Step
    public void clickDetailButton(){
        to(detailButton());
        $(detailButton()).click();
    }

}
