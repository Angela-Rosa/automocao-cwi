package pageObjects;

import elementMapper.HomePageElementMapper;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class HomePage extends HomePageElementMapper {

    public HomePage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }
    // parar redirecionar para a pagina de login
    public void clickBtnLogin(){
        login.click();
    }




}
