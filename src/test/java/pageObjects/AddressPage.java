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

    public void selectAddress(){
        id_address_delivery.selectByIndex(0);
    }

    public void fillTextComment(String cmt){
        textcomment.sendKeys(cmt);
    }

    public  void clickproceedToCheckout(){
        proceedToCheckout.click();
    }


}
