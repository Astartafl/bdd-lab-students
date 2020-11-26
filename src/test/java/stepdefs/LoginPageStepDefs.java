package stepdefs;

import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginPageStepDefs {
    LoginPage loginPage = new LoginPage();

    @When("I enter {string}, {string} and submit it")
    public void i_enter_to_email_field(String email, String password) {
        loginPage.setValidCredentialsAndSubmit(email, password);


    }

}
