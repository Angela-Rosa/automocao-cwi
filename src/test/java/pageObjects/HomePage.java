package pageObjects;

import elementMapper.HomePageElementMapper;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;
import utils.Browser;

public class HomePage extends HomePageElementMapper {




    public HomePage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    // parar redirecionar para a pagina de login
    public void clickBtnLogin(){
        login.click();
    }
    
    public void clicCategoryTshirts(){
        menuTshirts.click();
        
    }
    public void sendkeysSearch_query_top(String keys) {
        search_query_top.sendKeys( keys);
    }

    public void clickSubmit_search() {
        submit_search.click();

    }
    public void doSearch(String quest) {
        clickSearch_query_top();
        sendkeysSearch_query_top(quest);
        clickSubmit_search();
    }

    private void clickSearch_query_top() {
    }

}
