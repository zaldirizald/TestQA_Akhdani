package starter.Page;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Register extends PageObject {
    private By Landingpage(){return By.xpath("//a[@id='nava']");}
    private By SignUp(){return  By.xpath("//a[.='Sign up']");}
    private By Username(){return By.xpath("//input[@id='sign-username']");}
    private By Password() {return By.xpath("//input[@id='sign-password']");}
    private By ButtonSignUp(){return By.xpath("//button[.='Sign up']");}

@Step
public void OnLandingPage(){
    open();
    $(Landingpage()).isDisplayed();
}
@Step
    public void KlikSignUp(){
        $(SignUp()).click();
}
@Step
    public void KlikUsername(String InputUsername){
        $(Username()).type(InputUsername);
}
@Step
    public void KlikPassword(String InputPassword){
        $(Password()).type(InputPassword);
}
@Step
    public void KlikButtonSignUp(){
        $(ButtonSignUp()).click();
}
}
