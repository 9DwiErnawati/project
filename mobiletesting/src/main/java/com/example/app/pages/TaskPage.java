package com.example.app.pages;

import com.example.app.base.BasePageObject;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class TaskPage extends BasePageObject {
    By buttonRegister(){
        return By.xpath("(//android.widget.Button)[@content-desc=\"Register\"]");
    }

    public void clickButtonRegister()throws Exception{
        Thread.sleep(5000);
        click(buttonRegister());
    }

    By fieldFullname(){
        return By.xpath("(//android.widget.EditText)[1]");
    }

    public void inputFullname(String fullname) throws Exception{
        Thread.sleep(5000);
        click(fieldFullname());
        clear(fieldFullname());
        sendKeys(fieldFullname(), fullname);
    }

    By fieldEmailRegister(){
        return By.xpath("\t\n" + "(//android.widget.EditText)[2]");
    }

    public void inputEmailRegister(String email) throws Exception{
        Thread.sleep(5000);
        click(fieldEmailRegister());
        clear(fieldEmailRegister());
        sendKeys(fieldEmailRegister(), email);
    }

    By fieldPasswordRegistrer(){
        return By.xpath("\t\n" + "(//android.widget.EditText)[3]");
    }

    public void inputPasswordRegister(String password) throws Exception{
        Thread.sleep(5000);
        click(fieldPasswordRegistrer());
        clear(fieldPasswordRegistrer());
        sendKeys(fieldPasswordRegistrer(), password);
    }

    By errorMessage(){
        return By.xpath("(//android.view.View)[1]");
    }

    public void verifyErrorMessage()throws Exception{
        Thread.sleep(5000);
        Assertions.assertTrue(isDisplayed(errorMessage()));
        Assertions.assertEquals("", getText(errorMessage()));
    }

    By taskProduct(){
        return By.xpath("\t\n" +
                "//android.view.View[@content-desc=\"Products\"]");
    }

    public  void verifyEqualPage() throws Exception{
        Thread.sleep(5000);
        Assertions.assertEquals("", getText(taskProduct()));
    }
    public void verifyTaskDisplayed()throws Exception{
        Thread.sleep(5000);
        Assertions.assertTrue(find(taskProduct()).isDisplayed());
    }

    By buttonLogin(){
        return By.xpath("(//android.widget.Button[@content-desc=\"Login\"])");
    }

    public void clickButtonLogin()throws Exception {
        Thread.sleep(5000);
        click(buttonLogin());
    }

    By fieldEmailLogin(){
        return By.xpath( "\t\n" + "(//android.widget.EditText)[1]");
    }

    public void inputEmailLogin(String email) throws Exception {
        Thread.sleep(5000);
        click(fieldEmailLogin());
        sendKeys(fieldEmailLogin(), email);
    }

    By fieldPasswordLogin(){
        return By.xpath( "\t\n" + "(//android.widget.EditText)[2]");
    }
    public void inputPasswordLogin(String password) throws Exception{
        Thread.sleep(5000);
        click(fieldPasswordLogin());
        sendKeys(fieldPasswordLogin(), password);
    }

    By buttonMenu(){
        return By.xpath("(//android.widget.Button)[1]");
    }

    public void clickButtonMenu(){
        click(buttonMenu());
    }

    By buttonBeli(){
        return By.xpath("(//android.widget.Button[@content-desc=\"Beli\"])[1]");
    }

    public void clickButtonBeli()throws Exception{
        Thread.sleep(5000);
        click(buttonBeli());
    }

    By buttonCart(){
        return By.xpath("//android.widget.Button[@content-desc=\"1\"]");
    }

    public void verifyCart()throws Exception{
        Thread.sleep(5000);
        Assertions.assertEquals("", getText(buttonCart()));
        Assertions.assertTrue(find(buttonCart()).isDisplayed());
    }
}
