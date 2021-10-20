package pageObjects;

import elementMapper.HomePageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class HomePage extends HomePageElementMapper {

    public HomePage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    @Step ("Redirecionou para a pagina de login")
    public void clickBtnLogin() {
        login.click();
    }

    @Step ("Acessou categoria do produto")
    public void clicCategoryTshirts() {
        menuTshirts.click();
    }

    @Step ("Validou categoria no campo de pesquisa")
    public void sendkeysSearch_query_top(String keys) {
        search_query_top.sendKeys(keys);
    }

    @Step("Clicou no botão de Pesquisa" )
    public void clickSubmit_search() {
        submit_search.click();

    }

    @Step("Realizou a pesquisa do produto")
    public void doSearch(String quest) {
        clickSearch_query_top();
        sendkeysSearch_query_top(quest);
        clickSubmit_search();
    }

    @Step("Clicou em Search")
    private void clickSearch_query_top() {
    }
}
    


