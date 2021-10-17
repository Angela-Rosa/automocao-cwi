package pageObjects;

import elementMapper.MyAccountPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class MyAccountPage extends MyAccountPageElementMapper {

    public  MyAccountPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

  // obtem o nome do usuario logado
    public String getNameLogin(){

        return  namelogin.getText();
    }

    // verificar se a mensagem de conta criada com sucesso foi exibida
    public boolean isMsgCreateAccountView() {
        return  msgcreateaccount.getText().equals("Welcome to your account. Here you can manage all of your personal information and orders.");
    }


}
