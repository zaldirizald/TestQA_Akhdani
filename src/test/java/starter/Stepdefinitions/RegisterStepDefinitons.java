package starter.Stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Page.Register;


public class RegisterStepDefinitons {
    @Steps
    Register register;

    @Given("Pengguna berada di landing page")
    public void penggunaBeradaDiLandingPage() {
        register.OnLandingPage();
    }

    @When("Pengguna klik Sign Up")
    public void penggunaKlikSignUp() {
        register.KlikSignUp();
    }

    @And("Pengguna Input Username")
    public void penggunaInputUsername() {
        register.KlikUsername("zaldirizald14");
    }

    @And("Pengguna Input Password")
    public void penggunaInputPassword() {
        register.KlikPassword("aldi140398");
    }

    @And("Pengguna klik button Sign Up")
    public void penggunaKlikButtonSignUp() {
        register.KlikButtonSignUp();
    }


    @Then("Pengguna berhasil Sign Up")
    public void penggunaBerhasilSignUp() {
    }
}
