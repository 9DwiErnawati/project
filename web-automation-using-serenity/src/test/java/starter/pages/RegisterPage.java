package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.actions.Scroll.to;

public class RegisterPage extends PageObject {

    private By fullnameField(){
        return By.xpath("//*[label[text() = 'Nama Lengkap']]/input");
    }

    private By emailField(){
        return By.xpath("//*[label[text() = 'Email']]/input");
    }

    private By passwordField(){
        return By.xpath("//*[label[text() = 'Password']]/input");
    }

    private By registerButton(){
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/form/div[4]/button");
    }

    private By warningMessage(){
        return By.xpath("//*[@class = 'v-alert__wrapper']");
    }

    private By validate(){
        return By.xpath("//*[@class = 'v-card v-sheet theme--light']//div[text() = 'Login']");
    }

    private By equalLoginPage(){
        return By.xpath("//*[@class = 'v-card v-sheet theme--light']//div[text() = 'Login']");
    }

    @Step
    public boolean validateLoginPage(){
        return $(validate()).isDisplayed();
    }

    @Step
    public boolean equalLogin(String result){
        to(equalLoginPage());
        return $(equalLoginPage()).getText().equals(result);
    }
    @Step
    public void openUrl(){
        openAt("/auth/register");
    }

    @Step
    public boolean validateOnRegisterPage(){
        return $(registerButton()).isDisplayed();
    }

    @Step
    public void inputFullname(String fullname){
        $(fullnameField()).type(fullname);
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
    public void clickRegisterButton(){
        to(registerButton());
        $(registerButton()).click();
    }

    @Step
    public boolean warningMessageAppears(){
        getDriver().findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
        to(warningMessage());
        return $(warningMessage()).isDisplayed();
    }

    @Step
    public boolean warningMessageEquals(String text){
        to(warningMessage());
        return $(warningMessage()).getText().equals(text);
    }
}
