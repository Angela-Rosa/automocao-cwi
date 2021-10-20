    package elementMapper;

    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.support.FindBy;

    public class SummaryShoppingPageElementMapper {
    //Página de compra
    @FindBy (className = "navigation_Page")
    public WebElement yourShoppingCart;

    @FindBy (id = "cart_title")
    public WebElement shoppingCartSummary;


    //// Campo Summary///
    @FindBy (className = "step_curret first")
    public WebElement summary;

    @FindBy(css= "input[class*=cart_quantity]")
    public WebElement Qty;

    @FindBy(css = "#total_product")
    public WebElement totalProducts;

    @FindBy(css = "#total_shipping")
    public WebElement totalShipping;

    @FindBy(css = "#total_price")
    public WebElement Total;

    @FindBy(css = "p[class*=cart]>a[class*=btn][title=\"Proceed to checkout\"]")
    public WebElement proceedToCheckout;

}

