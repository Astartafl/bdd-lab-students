package stepdefs;

import io.cucumber.java.en.Then;
import pages.MyAccountPage;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountPageStepDefs {
    MyAccountPage myAccountPage = new MyAccountPage();

    @Then("I see {string} message")
    public void i_see(String message) {
        assertThat(myAccountPage.getLeftHeaderText().equals(message));

    }
}
