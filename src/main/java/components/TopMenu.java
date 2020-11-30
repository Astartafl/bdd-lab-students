package components;

import components.enums.TopMenuComponents;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ProductsMonitorsPage;

import static pages.BasePage.getDriver;

@Getter
public class TopMenu {
    private static WebDriver webDriver;
    private static WebDriverWait wait;


    @FindBy(xpath = "//li[@class='dropdown']/a[text()='Desktops']")
    private WebElement desktopDropDown;

    @FindBy(xpath = "//li[@class='dropdown']/a[text()='Components']")
    private WebElement componentsDropDown;

    @FindBy(xpath = "//a[contains(text(), 'Monitors')]")
    private WebElement monitorSubmenuDropDownLink;
    public TopMenu(WebDriver driver){
        PageFactory.initElements(getDriver(), this);
        webDriver = driver;
        wait = new WebDriverWait(driver, 10);
    }

//    public TopMenu(){
//        PageFactory.initElements(getDriver(), this);
//    }

    public TopMenu selectCategoryFromDropDown(TopMenuComponents topMenuItem){
        System.out.println(webDriver);
        System.out.println(componentsDropDown);
        Actions actions = new Actions(webDriver);
        switch(topMenuItem){
            case DESKTOP:
                actions.moveToElement(desktopDropDown).build().perform();
            break;
            case COMPONENTS:
                actions.moveToElement(componentsDropDown).build().perform();
            break;
        }
        return this;
    }
    public ProductsMonitorsPage selectSubmenuMonitors(){
        monitorSubmenuDropDownLink.click();
        return new ProductsMonitorsPage();
    }
}
