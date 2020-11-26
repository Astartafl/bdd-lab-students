package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    @FindBy (id = "input-email")
    private WebElement emailInput;

    @FindBy (id = "input-password")
    private WebElement passwordInput;

    @FindBy (xpath = "//input[@value='Login']")
    private WebElement submitLoginButton;

    public LoginPage(){
        PageFactory.initElements(getDriver(), this);
    }
    public void setValidCredentialsAndSubmit(String email, String password){
        waitUntilVisible(submitLoginButton, 1000);
        emailInput.click();
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        submitLoginButton.click();
    }
}
