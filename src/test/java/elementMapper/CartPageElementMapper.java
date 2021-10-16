package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPageElementMapper {

    @FindBy(css = ".cart_description .product-name")
    public WebElement productNameCart;

    @FindBy(css = "#add_to_cart > button")
    public WebElement buttonAddToCart;

    @FindBy (css = ".button-container a [title='Proceed to checkout`]")
    public WebElement buttonModalProceedToCheckout;


}
