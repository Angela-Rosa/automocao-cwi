package pageObjects;

import elementMapper.AddressElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;


public class AddressPage extends AddressElementMapper {

    public  AddressPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    // Obtem o titulo da tela Address
    public String getAddressTitlePage(){
        return page_heading.getText();
    }

    public void clickaddressesAreEquals(){
        addressesAreEquals.click();
    }

    public void selectAddress(int index){
        id_address_delivery.selectByIndex(index);
    }

    public void fillTextComment(String cmt){
        textcomment.sendKeys(cmt);
    }

    public  void clickproceedToCheckout(){ proceedToCheckout.click();
    }

    // Obtem o titulo da tela Shipping
    public String getShippingTitlePage(){
        return page_heading.getText();
    }

    //Selecionar frete
    public  void clickdelivery_option(){
        delivery_option.click();
    }

    //Clicar no termos de aceite
    public void clickcgv(){cgv.click();
    }

    // obter valor frete
    public String getTextShipping(){
        return delivery_option_price.getText();
    }

    public  void clickproceedToCheckoutShipping(){
        proceedToCheckoutShipping.click();
    }
}


