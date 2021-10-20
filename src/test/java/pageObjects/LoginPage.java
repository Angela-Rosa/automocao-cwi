package pageObjects;

import elementMapper.LoginPageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class LoginPage extends LoginPageElementMapper {

    public LoginPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    @Step("Inseriu o email")
    public void fillEmail(){
        email.sendKeys("angela.rousa@gmail.com");
    }

    @Step("Inseriu a senha")
    public void fillPasswd(){
        passwd.sendKeys("teste123");
    }

    @Step("Clicou para realizar login")
    public void clickBtnSubmitLogin(){
        SubmitLogin.click();
    }

    @Step("Inseriu o email para realização de cadastro")
    public  void fillEmailCreate(String email){
        email_create.sendKeys(email);
    }

    @Step("Clicou para realizar o cadastro")
    public void clickBtnSubmitCreateAccount(){
        SubmitCreate.click();
    }


}
