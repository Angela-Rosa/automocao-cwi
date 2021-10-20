     package pageObjects;

     import elementMapper.CategoryPageElementMapper;
     import io.qameta.allure.Step;
     import org.openqa.selenium.support.PageFactory;
     import utils.Browser;

    public class CategoryPage extends CategoryPageElementMapper {
    public CategoryPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    @Step("Verificou se estamos na mesma página")
    public boolean isPageTshirts(){
        return getAuthenticatinPageThirts().contains("T-SHIRTS");
    }

    @Step ("Certificou a categoria da página")
    public String getAuthenticatinPageThirts(){
        return nameCategoryTshits.getText();
    }


    @Step("Clicou no botão para exibir o produto")
    public void clickProductAddToProductPage(){
        BasePage.mouseOver(productNameCategory);
        buttonMoreAddToProductPage.click();
    }

    @Step("Clicou no botão para exibir o produto")
    public String getProductNameCategory(){
        return productNameCategory.getText();
    }
}



