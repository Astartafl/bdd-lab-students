package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class MainPage extends BasePage {

  @FindBy(xpath = "//a[@title='My Account']")
  private WebElement myAccountButton;

  @FindBy(xpath = "//a[text()='Register']")
  private WebElement registerButton;

  @FindBy(xpath = "//a[text()='Login']")
  private WebElement loginButton;

  public MainPage(){
    PageFactory.initElements(getDriver(), this);
  }

  public void openMainPage() {
    getDriver().get("https://demo.opencart.com/");
  }

  public void goToLoginPage(){
    openMainPage();
    waitUntilVisible(myAccountButton, 10);
    myAccountButton.click();
    loginButton.click();
  }

}


