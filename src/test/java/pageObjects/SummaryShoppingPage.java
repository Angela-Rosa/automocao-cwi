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

    //Inserir quantidade
    public void fillQty(String qtyvalue){
       Qty.clear();
       Qty.sendKeys(qtyvalue);

    }

    // Obtem o valor do produto
    public String getTextTotal_products(){return totalProducts.getText();
    }

    // Obtem o valor do frete
    public String getTextTotalShipping(){
        return totalShipping.getText();
    }

    // Obtem o valor total
    public String getTextTotal(){return Total.getText();
    }
    //Validar Checkout de compra

    public void clickProceedCheckout(){
        proceedToCheckout.click();
    }



}
