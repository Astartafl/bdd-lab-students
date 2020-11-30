package stepdefs;

import io.cucumber.java.en.Given;
import pages.MainPage;


public class MainPageStepDefs {
    MainPage mainPage = new MainPage();

    @Given("I navigate to Login page")
    public void i_am_on_the_open_card_demo_site() {
        mainPage.goToLoginPage();}
}
