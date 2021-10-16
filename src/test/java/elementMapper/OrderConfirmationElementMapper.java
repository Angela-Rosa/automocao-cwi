package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderConfirmationElementMapper {
    // titulo da pagina
    @FindBy(css = "h1[class=page-heading]")
    public WebElement page_heading;

    //Mensagem/titulo de confirmação de compra Your order on My Store is complete.
    @FindBy(css = "#center_column > div > p > strong")
    public WebElement titleConfimationOrder;

    // preço
    @FindBy(css = "span[class=price]>strong")
    public WebElement price;


}
