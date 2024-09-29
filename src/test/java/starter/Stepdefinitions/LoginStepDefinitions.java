package starter.Stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Page.Login;

public class LoginStepDefinitions {
    @Steps
    Login login;
    @Given("Pengguna berada di landingpage")
    public void penggunaBeradaDiLandingpage() {
        login.OnlandingPage();
    }

    @When("Pengguna klik Login")
    public void penggunaKlikLogin() {
        login.KlikLogin();
    }

    @And("Pengguna Input Username valid")
    public void penggunaInputUsernameValid() {
        login.KlikUsername("zaldirizald14");
    }

    @And("Pengguna Input Password valid")
    public void penggunaInputPasswordValid() {
        login.KlikPassword("aldi140398");
    }

    @And("Pengguna klik button Login")
    public void penggunaKlikButtonLogin() {
        login.KlikButtonLogin();
    }

    @Then("Pengguna berhasil login")
    public void penggunaBerhasilLogin() {
        login.BerhasilLoginn();
    }
}
