package pageObjects;

import elementMapper.ShippingElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class ShippingPage extends ShippingElementMapper {
    public  ShippingPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    // Obtem o titulo da tela Shipping
    public String getShippingTitlePage(){
        return page_heading.getText();
    }

    //Selecionar frete
    public void clickdelivery_option(){
        delivery_option.click();
    }

    //Clicar no termos de aceite
    public void clickcgv(){
        cgv.click();
    }

    // obter valor frete
    public void getTextShipping(){
        delivery_option_price.getText();
    }

    public  void clickproceedToCheckout(){
        proceedToCheckout.click();
    }
}
