package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippingElementMapper {

    // titulo da pagina
    @FindBy(css = "h1[class=page-heading]")
    public WebElement page_heading;

    // Choose a shipping option for this address: My address
    @FindBy(css = "input[id*=delivery_option]")
    public WebElement delivery_option;

    // Shipping value
    @FindBy(css = "div[class=delivery_option_price]")
    public WebElement delivery_option_price;

    // Terms of service
    @FindBy(id = "cgv")
    public WebElement cgv;

    //Proceed to checkout
    @FindBy(css = "button[name=processCarrier][class*=button]")
    public WebElement proceedToCheckout;

}
