package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.assertj.core.api.Assertions.assertThat;

public class MyAccountPage extends BasePage {

    @FindBy (xpath = "//div[@id='content']/h2[1]")
    private WebElement myAccountLeftHeader;

    public MyAccountPage(){
        PageFactory.initElements(getDriver(), this);
    }

    public String getLeftHeaderText(){
        waitUntilVisible(myAccountLeftHeader, 10);
        return myAccountLeftHeader.getText();


    }
}
