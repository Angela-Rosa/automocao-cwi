package pageObjects;

import elementMapper.SummaryShoppingPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class SummaryShoppingPage extends SummaryShoppingPageElementMapper {
    public SummaryShoppingPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);

    }

    // Obtem o titulo da tela summary
    public String getSummaryTitlePage(){
        return shoppingCartSummary.getText();
    }

    // Obtem o valor do frete
    public String getTextTotalShipping(){
        return totalShipping.getText();
    }

    // Obtem o valor total
    public String getTextTotal(){
        return Total.getText();
    }

    //Inserir quantidade
    public void fillQty(String qtyvalue){
        Qty.sendKeys(qtyvalue);
    }

    public void clickProceedCheckout(){

        proceedToCheckout.click();
    }



}
