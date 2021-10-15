package pageObjects;

import elementMapper.CreateAccountElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class CreateAccountPage extends CreateAccountElementMapper {
    public CreateAccountPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public boolean isPageCreateAccount(){
        return getCreateAccountTitlePage().contains("Create an account");

    }

    // Obtem o titulo da tela create account
    public String getCreateAccountTitlePage(){
        return namecreataccountpage.getText();
    }


    //Metodos de  clicar nos campos ou inserir informações

    public void clickOptid_gender1(){
        id_gender1.click();
    }

    public void clickOptid_gender2(){
        id_gender2.click();
    }

    public void fillFirstName(String fname){
         customer_firstname.sendKeys(fname);
    }

    public void fillLastName(String lname){
        customer_lastname.sendKeys(lname);
    }

    public void fillEmail(String txtemail) {
        email.sendKeys(txtemail);
    }

    public  void fillPassword(String psw) {
        passwd.sendKeys(psw);
    }

    public void selectDays(String d)
    {
        days.sendKeys(d);
    }

    public void selectMoth(String m) {
        months.sendKeys(m);
    }
    public void selectYears(String y) {
        years.sendKeys(y);
    }

    public  void clickOptnewsletter(){
        newsletter.click();
    }
    public  void clickOptSpecialOffers(){
        optin.click();
    }

    ///////// Metodos de click e inserção da secção do formulario YOUR ADDRESS/////


}
