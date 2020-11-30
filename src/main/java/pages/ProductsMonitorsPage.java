package pages;

import components.Product;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class ProductsMonitorsPage extends BasePage{
    private Product product;
    private By boxContainers = By.xpath("//div[@class='product-thumb']");

    public ProductsMonitorsPage(){
        this.product = new Product(driver);
    }

    public ProductsMonitorsPage addToWishList(String...productNames){
        List<Product> allProductsFromPage = product.getAllItems(boxContainers);
        for(String productName : productNames){
            for(Product product : allProductsFromPage){
                if (product.getProductName().contains(productName)){
                    new Actions(driver).moveToElement(product.getAddToWishListButton()).build().perform();
                    clickWithJs(product.getAddToWishListButton());
                }
            }
        }
        return this;
    }
}
