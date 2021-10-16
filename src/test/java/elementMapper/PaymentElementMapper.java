package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PaymentElementMapper {
    // titulo da pagina
    @FindBy(css = "h1[class=page-heading]")
    public WebElement page_heading;

    // Choose a delivery address
    @FindBy(id = "id_address_delivery")
    public Select id_address_delivery;

    // pagamento por banco
    @FindBy(css = "a[class=bankwire][title=\"Pay by bank wire\"]")
    public WebElement bankwire;

    // pagamento por cheque
    @FindBy(css = "a[class=cheque][title=\"Pay by check.\"]")
    public WebElement cheque;




}
