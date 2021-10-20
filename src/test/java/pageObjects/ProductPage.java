   package pageObjects;

   import elementMapper.ProductPageElementMapper;
   import io.qameta.allure.Step;
   import org.openqa.selenium.support.PageFactory;
   import utils.Browser;

    public class ProductPage extends ProductPageElementMapper {
    public ProductPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    @Step("Obteve o nome do produto")
    public String getProductNamePDP() {
        return productNamePDP.getText();
    }

    @Step("Clicou no botão ADD TO CART ")
    public void clickButtonAddToCart() {
        buttonAddToCart.click();
    }

    @Step("Clicou em Proceed to Checkout(ProductPage)")
    ///Product successfully added to your shopping cart
    public void clickButtonModalProceedToCheckout(){
        buttonModalProceedToCheckout.click();
    }

}

