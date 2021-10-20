package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoryPageElementMapper {
    @FindBy(className = "cat-name")
    public WebElement nameCategoryTshits;

    @FindBy(css = ".product-image-container")
        public WebElement product;

    @FindBy(css = ".button[title=View]")
     public WebElement buttonMoreAddToProductPage;

    @FindBy(css = ".product_list .product-name")
    public WebElement productNameCategory;

    }



