package pageObjects;

import elementMapper.PaymentElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class PaymentPage extends PaymentElementMapper {

    public  PaymentPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    // Obtem o titulo da tela Payment
    public String getPaymentTitlePage(){
        return page_heading.getText();
    }

    //Selecionar cheque
    public void clickCheque(){
        cheque.click();
    }
    //Selecionar conta bancaria
    public void clickBankwire(){
        bankwire.click();
    }

}
