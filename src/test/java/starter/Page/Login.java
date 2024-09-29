package starter.Page;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Login extends PageObject {
    private By LandingPage() {
        return By.xpath("//a[@id='nava']");
    }

    private By Login() {
        return By.xpath("//a[.='Log in']");
    }

    private By Username() {
        return By.xpath("//input[@id='loginusername']");
    }

    private By Password() {
        return By.xpath("//input[@id='loginpassword']");
    }

    private By ButtonLogin() {
        return By.xpath("//button[.='Log in']");
    }

    private By ValidasiLogin() {
        return By.xpath("//a[@id='nameofuser']");
    }

@Step
public void OnlandingPage(){
    open();
    $(LandingPage()).isDisplayed();}
@Step
public void KlikLogin (){
    $(Login()).click();}
@Step
public void KlikUsername(String InputUsername){
    $(Username()).type(InputUsername);}
@Step
public void KlikPassword(String InputPassword){
    $(Password()).type(InputPassword);}

@Step
public void KlikButtonLogin (){
    $(ButtonLogin()).click();}
@Step
public void BerhasilLoginn(){
    $(ValidasiLogin()).isDisplayed();}
}
