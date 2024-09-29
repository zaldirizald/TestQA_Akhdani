package starter.Page;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Checkout extends PageObject {
    private By Product(){return By.xpath("//a[.='Nokia lumia 1520']");}
    private By Addtocart(){return By.xpath("//a[.='Add to cart']");}
    private By Cart (){return By.xpath("//a[@id='cartur']");}
    private By PlaceOrder(){ return By.xpath("//button[@class='btn btn-success']");}
    private By InputName(){ return By.xpath("//input[@id='name']");}
    private By InputCountry(){return By.xpath("//input[@id='country']");}
    private By InputCity(){return  By.xpath("//input[@id='city']");}
    private By InputCreditcard(){return By.xpath("//input[@id='card']");}
    private By InputMonth(){return  By.xpath("//input[@id='month']");}
    private By InputYears(){return By.xpath("//input[@id='year']");}
    private By Purchase(){return  By.xpath("//button[.='Purchase']");}
    private By OK(){return By.xpath("//button[@class='confirm btn btn-lg btn-primary']");}
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

@Step
public void KlikProduct(){
    $(Product()).click();}

    @Step
    public void KlikAddtoCart(){
        $(Addtocart()).click();
    }
    @Step
    public void KlikCart(){
        $(Cart()).click();
    }
    @Step
    public void KlikPlaceOrder(){
        $(PlaceOrder()).click();
    }
    @Step
    public void Inputname(String inputname){
        $(InputName()).type(inputname);
    }
    @Step
    public void InputCountry(String inputcountry){
        $(InputCountry()).type(inputcountry);
    }
    @Step
    public void InputCity(String inputcity){
        $(InputCity()).type(inputcity);
    }
    @Step
    public void InputCreditcard(String inputcreditcard){
        $(InputCreditcard()).type(inputcreditcard);
    }
    @Step
    public void InputMonth(String inputmonth){
        $(InputMonth()).type(inputmonth);
    }
    @Step
    public void Inputyears(String inputyears){
        $(InputYears()).type(inputyears);
    }
    @Step
    public void KlikButtonPurchase(){
        $(Purchase()).click();
    }
    @Step
    public void KlikButtonOK(){
        $(OK()).click();
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
}
