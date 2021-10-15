package pageObjects;

import elementMapper.CategoryPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class CategoryPage extends CategoryPageElementMapper {
    public CategoryPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public boolean isPageTshirts(){
        return getAuthenticatinPageThirts().contains("T-SHIRTS");

    }

    public String getAuthenticatinPageThirts(){
        return nameCategoryTshits.getText();
    }

    public void clickProductAddToProductPage(){
        BasePage.mouseOver(productNameCategory);
        buttonMoreAddToProductPage.click();
    }
    public String getProductNameCategory(){
        return productNameCategory.getText();
    }

}



