package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class TransactionPage extends PageObject {
    private By productHeader(){
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/h1");
    }
    @Step
    public boolean headerTextEqual(){
        return $(productHeader()).getText().equals("Transaction");
    }
}
