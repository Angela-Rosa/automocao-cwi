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


    // Obtem a mensagem de confirmação
    public String getOrderConfirmationPage(){
        return titleConfimationOrder.getText();
    }

    // Obtem o valor da compra
    public String getTextprice(){
        return price.getText();
    }

    // Obtem o valor da nameAccountOwner
    public String getTextnameAccountOwner(){
        return nameAccountOwner.getText();
    }

    // Obtem o valor da theseDetails
    public String getTexttheseDetails(){
        return theseDetails.getText();
    }

    // Obtem o valor da bankName
    public String getTextbankName(){
        return bankName.getText();
    }
}
