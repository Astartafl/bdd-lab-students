package stepdefs;

import io.cucumber.java.en.Given;
import pages.LoginPage;
import pages.MainPage;


public class MainPageStepDefs {
    MainPage mainPage = new MainPage();

    @Given("I am on the OpenCard Demo site")
    public void i_am_on_the_open_card_demo_site() {
        mainPage.goToLoginPage();

        // Write code here that turns the phrase above into concrete actions

    }
}
