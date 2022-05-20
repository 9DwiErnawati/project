package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class DetailProductPage extends PageObject {
    private By productHeader(){
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div/p[1]");
    }

    @Step
    public boolean headerTextEqual(){
        return $(productHeader()).getText().equals("");
    }
}
