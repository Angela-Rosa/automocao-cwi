package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddressElementMapper {

    // titulo da pagina
    @FindBy(css = "h1[class=page-heading]")
    public WebElement page_heading;


    // Choose a delivery address
    @FindBy(id = "id_address_delivery")
    public Select id_address_delivery;

    // Use the delivery address as the billing address.
    @FindBy(id = "addressesAreEquals")
    public WebElement addressesAreEquals;

    //If you would like to add a comment about your order, please write it in the field below.
    @FindBy(css = "div[id=ordermsg]>textarea")
    public WebElement textcomment;

    //Proceed to checkout
    @FindBy(css = "button[name=processAddress]")
    public WebElement proceedToCheckout;


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
    public WebElement proceedToCheckoutShipping;

}

