package pageObjects;

import elementMapper.OrderConfirmationElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class OrderConfirmationPage extends OrderConfirmationElementMapper {

    public  OrderConfirmationPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    // Obtem o titulo da tela OrderConfirmation
    public String getOrderConfirmationPage(){
        return page_heading.getText();
    }

    // Obtem o valor da compra
    public String getTextprice(){
        return price.getText();
    }

}
