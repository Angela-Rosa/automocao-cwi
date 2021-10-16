package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderSummaryElementMapper {
    // titulo da pagina
    @FindBy(css = "h1[class=page-heading]")
    public WebElement page_heading;


    // titulo do metodo de pagamento escolhido
    @FindBy(css = "div[class=\"box cheque-box\"] > h3[class=page-subheading]")
    public WebElement paymentMethodSelected;

    // valor total
    @FindBy(id = "amount")
    public WebElement amount;

    // I confirm my order
    @FindBy(css = "#cart_navigation > button")
    public WebElement confirmMyOrder;


}
