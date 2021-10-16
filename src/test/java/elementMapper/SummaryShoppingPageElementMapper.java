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

    @FindBy(className = "cart_quantity item")
    public WebElement Qty;

    @FindBy(id = "total_products")
    public WebElement totalProducts;

    @FindBy(id = "total-shipping")
    public WebElement totalShipping;

    @FindBy(id = "total_price_container")
    public WebElement Total;

    @FindBy(css = "a[class*=\"button\"][title=\"Check out\"]")
    public WebElement proceedToCheckout;






}
