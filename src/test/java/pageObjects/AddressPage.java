package pageObjects;

import elementMapper.AddressElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.Browser;


public class AddressPage extends AddressElementMapper {

    public  AddressPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    @Step("Obteve o titulo da tela Address")
    public String getAddressTitlePage(){
        return page_heading.getText();
    }

    @Step("Clicou em Endereços São iguais")
    public void clickaddressesAreEquals(){
        addressesAreEquals.click();
    }

    @Step("Selecionou o Endereço")
    public void selectAddress(int index){
        Select selectObject = new Select(id_address_delivery);
        selectObject.selectByIndex(index);
    }

    @Step("Inseriu o cometario")
    public void fillTextComment(String cmt){
        textcomment.sendKeys(cmt);
    }

    @Step("Clicou em Proceed to Checkout")
    public  void clickproceedToCheckout(){ proceedToCheckout.click();
    }

    @Step("Obteve o texto do titulo da tela")
    public String getShippingTitlePage(){
        return page_heading.getText();
    }

    @Step("Clicou no frete")
    public  void clickdelivery_option(){
        delivery_option.click();
    }

    @Step("Clicou nos termos de aceite")
    public void clickcgv(){cgv.click();
    }

    @Step("Obteve o texto de Shipping")
    public String getTextShipping(){
        return delivery_option_price.getText();
    }

    @Step("Clicou em Proceed to Checkout(Shipping)")
    public  void clickproceedToCheckoutShipping(){
        proceedToCheckoutShipping.click();
    }
}


