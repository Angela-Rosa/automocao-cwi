   package pageObjects;

   import elementMapper.SummaryShoppingPageElementMapper;
   import io.qameta.allure.Step;
   import org.openqa.selenium.support.PageFactory;
   import utils.Browser;

    public class SummaryShoppingPage extends SummaryShoppingPageElementMapper {
    public SummaryShoppingPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);

    }

    @Step("Obteve o titulo da tela Summary")
    public String getSummaryTitlePage(){
        return shoppingCartSummary.getText();
    }

    @Step("Inseriu a quantidade")
    public void fillQty(String qtyvalue){
       Qty.clear();
       Qty.sendKeys(qtyvalue);

    }

    @Step("Obteve o valor do produto")
    public String getTextTotal_products(){return totalProducts.getText();
    }
    @Step("Obteve o valor do frete")
    public String getTextTotalShipping(){
        return totalShipping.getText();
    }

    @Step("Obteve o valor total")
    public String getTextTotal(){return Total.getText();
    }

    @Step("Clicou em Proceed to Checkout(SummaryShopping)")
    public void clickProceedCheckout(){
        proceedToCheckout.click();
    }


}
