package pageObjects;

import elementMapper.LoginPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class LoginPage extends LoginPageElementMapper {

    public LoginPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }
    public void fillEmail(){
        email.sendKeys("rrsetcwi+autopractice@gmail.com");
    }

    public void fillPasswd(){
        passwd.sendKeys("teste123");
    }

    public void clickBtnSubmitLogin(){
        SubmitLogin.click();
    }

    public  void fillEmailCreate(String email){
        email_create.sendKeys(email);
    }
    public void clickBtnSubmitCreateAccount(){
        SubmitCreate.click();
    }


}
