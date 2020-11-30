package pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Getter
public abstract class BasePage {

  protected static WebDriver driver;

  public static void setDriver(WebDriver webDriver) {
    driver = webDriver;
  }

  public static WebDriver getDriver() {
    return driver;
  }

  public WebElement waitUntilVisible(WebElement element, int time) {
    return new WebDriverWait(driver, time)
        .until(ExpectedConditions.visibilityOf(element));
  }

  public WebElement waitUntilClickable(WebElement element, int time) {
    return new WebDriverWait(driver, time)
        .until(ExpectedConditions.elementToBeClickable(element));
  }

  public void clickWithJs(WebElement webElement) {
    JavascriptExecutor executor = (JavascriptExecutor) driver;
    executor.executeScript("arguments[0].click();", webElement);
  }
  public WebElement find(By locator){
    return getDriver().findElement(locator);
  }


}
