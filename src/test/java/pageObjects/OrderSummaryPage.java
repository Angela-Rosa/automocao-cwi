package pageObjects;

import elementMapper.OrderSummaryElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class OrderSummaryPage extends OrderSummaryElementMapper {
    public  OrderSummaryPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    // Obtem o titulo da tela OrderSummary
    public String getOrderSummaryPage(){
        return page_heading.getText();
    }

    // Obtem o texto da forma de pagamento escolhida
    public String getTextpaymentMethodSelected(){
        return paymentMethodSelected.getText();
    }

    // Obtem o texto que contem o valor total
    public String getTextAmount(){
        return amount.getText();
    }


    public void clickConfirmMyOrder(){
        confirmMyOrder.click();
    }
}
