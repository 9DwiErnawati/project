package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.actions.Scroll.to;

public class LoginPage extends PageObject {

    private By emailField(){
        return By.xpath("//*[label[text() = 'Email']]/input");
    }

    private By passwordField(){
        return By.xpath("//*[label[text() = 'Password']]/input");
    }

    private By loginButton(){
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/form/div[3]/button/span");
    }

    private By errorMessage(){
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/div[1]/div/div[1]");
    }

    @Step
    public void openUrl(){
        openAt("/auth/login");
    }

    @Step
    public boolean validateOnLoginPage(){
        return $(loginButton()).isDisplayed();
    }

    @Step
    public void inputEmail(String email){
            $(emailField()).type(email);
    }

    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }

    @Step
    public void clickLoginButton(){
        to(loginButton());
        $(loginButton()).click();
    }

    @Step
    public boolean errorMessageAppears(){
        getDriver().findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
        to(errorMessage());
        return $(errorMessage()).isDisplayed();
    }

    @Step
    public boolean errorMessageEquals(String text){
        to(errorMessage());
        return $(errorMessage()).getText().equals(text);
    }
}
