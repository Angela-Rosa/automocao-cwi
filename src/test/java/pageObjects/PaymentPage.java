package pageObjects;

import elementMapper.PaymentElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class PaymentPage extends PaymentElementMapper {

    public  PaymentPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    @Step("Obteve o titulo da tela Payment")
    public String getPaymentTitlePage(){
        return page_heading.getText();
    }

    @Step("Selecionou a opção cheque")
    public void clickCheque(){
        cheque.click();
    }

    @Step("Selecionou a conta bancaria")
    public void clickBankwire(){
        bankwire.click();
    }


    @Step("Obteve o texto da forma de pagamento escolhida")
    public String getTextpaymentMethodSelected(){
        return paymentMethodSelected.getText();
    }

    @Step("Obteve o texto que contem o valor total")
    public String getTextAmount(){
        return amount.getText();
    }

    @Step("Validou confirmação")
    public void clickConfirmMyOrder(){
        confirmMyOrder.click();
    }

    @Step("Obteve a mensagem de confirmação")
    public String getOrderConfirmationPage(){
        return titleConfimationOrder.getText();
    }

    @Step("Obteve o valor da compra")
    public String getTextprice(){
        return price.getText();
    }

    @Step("Obteve o valor da nameAccountOwner")
    public String getTextnameAccountOwner(){
        return nameAccountOwner.getText();
    }

    @Step("Obteve o valor da theseDetails")
    public String getTexttheseDetails(){
        return theseDetails.getText();
    }

    @Step("Obteve o valor da bankName")
    public String getTextbankName(){
        return bankName.getText();
    }
}
