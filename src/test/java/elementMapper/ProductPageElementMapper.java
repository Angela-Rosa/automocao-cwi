   package elementMapper;

   import org.openqa.selenium.WebElement;
   import org.openqa.selenium.support.FindBy;

    ///Faded Short Sleeve T-shirts
   public class ProductPageElementMapper {
    @FindBy(css = "h1[itemprop=name]")
    public WebElement productNamePDP;

    ///Add to cart
    @FindBy(css = "#add_to_cart > button")
    public WebElement buttonAddToCart;

    ///Proceed to checkout
    @FindBy(css = ".button-container a[ title= \"Proceed to checkout\"]")
    public WebElement buttonModalProceedToCheckout;

}
