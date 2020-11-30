package stepdefs;

import components.TopMenu;
import components.enums.TopMenuComponents;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static pages.BasePage.getDriver;

public class TopBarStepDefs {
    TopMenu topMenu = new TopMenu(getDriver());

    @Given("I click at {} on top menu")
    public void i_click_at_on_top_menu(TopMenuComponents item) {
        topMenu.selectCategoryFromDropDown(item);

        System.out.println(item);
    }

    @When("I click on {}")
    public void i_click_on(TopMenuComponents item) {

        System.out.println(item);
    }
}
