   package pageObjects;

   import elementMapper.SearchPageElementMapper;
   import io.qameta.allure.Step;
   import org.openqa.selenium.support.PageFactory;
   import utils.Browser;

    public class SearchPage extends SearchPageElementMapper {
    public SearchPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    @Step("Iniciou a página")
    public String getTextNavigation_page(){
        return navigation_page.getText();
    }

    @Step("Pesquisou produto na página")
    public String getTextLighter(){
        return lighter.getText();
    }

    @Step("Obteve dados do produto")
    public String getTextHeading_counter(){
        return heading_counter.getText();
    }

    @Step ("Verificou se estamos na mesma página")
    public boolean isSearchPage() {
        return getTextNavigation_page().equals("Search");
    }

}
