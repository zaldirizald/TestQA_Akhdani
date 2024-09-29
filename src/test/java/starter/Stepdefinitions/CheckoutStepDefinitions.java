package starter.Stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.Page.Checkout;
import starter.Page.Login;

public class CheckoutStepDefinitions {
    @Steps
    Checkout checkout;
    @Given("Pengguna berada di landingPage")
    public void penggunaBeradaDiLandingPage() {
        checkout.OnlandingPage();
        checkout.KlikLogin();
        checkout.KlikUsername("zaldirizald14");
        checkout.KlikPassword("aldi140398");
        checkout.KlikButtonLogin();
    }

    @When("Pengguna klik product")
    public void penggunaKlikProduct() {
        checkout.KlikProduct();
    }

    @And("Pengguna klik add to cart")
    public void penggunaKlikAddToCart() {
        checkout.KlikAddtoCart();
    }


    @And("Pengguna klik cart")
    public void penggunaKlikCart() {
        checkout.KlikCart();
    }

    @And("Pengguna klik place order")
    public void penggunaKlikPlaceOrder() {
        checkout.KlikPlaceOrder();
    }

    @And("Pengguna Input Form")
    public void penggunaInputForm() {
        checkout.Inputname("Muhammad Rizaldi");
        checkout.InputCountry("Indonesia");
        checkout.InputCity("Depok");
        checkout.InputCreditcard("1");
        checkout.InputMonth("1");
        checkout.Inputyears("2024");
    }

    @And("Pengguna Klik Purchase")
    public void penggunaKlikPurchase() {
        checkout.KlikButtonPurchase();
    }

    @Then("Pengguna berhasil purchase product")
    public void penggunaBerhasilPurchaseProduct() {
    }

    @And("Klik ok")
    public void klikOk() {
        checkout.KlikButtonOK();
    }
}
