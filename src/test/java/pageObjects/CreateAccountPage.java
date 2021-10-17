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
    //SEÇÃO YOUR PERSONAL INFORMATION

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
    public void fillFirstNameYourAddressSection(String fname){
        firstname.sendKeys(fname);
    }

    public void fillLastNameYourAddressSection(String name){
        lastname.sendKeys(name);
    }

    public void fillCompany(String textCp ) {
        company.sendKeys(textCp);
    }

    public void fillAddress1(String textAds1){
        address1.sendKeys(textAds1);

    }
    public void fillAddress2(String textAds2) {
        address2.sendKeys(textAds2);
    }

    public void fillCity(String textCty) {
        city.sendKeys(textCty);
    }

    public void selectId_State(String idState){
        id_state.sendKeys(idState);
    }

    public void fillPostCode(String PostCd) {
        postcode.sendKeys(PostCd);
    }

    public void selectId_Country(String idCountry) {
        id_country.sendKeys(idCountry);
    }

    public void fillOther(String Other) {
        other.sendKeys(Other);
    }

    public void fillPhone(String Phone1) {
        phone.sendKeys(Phone1);
    }

    public void fillPhoneMobile(String PhoneM) {
        phone_mobile.sendKeys(PhoneM);
    }

    public void fillMyAlias(String Alias) {
        alias.sendKeys(Alias);
    }

    public void clickRegister(){
        submitAccount.click();
    }









    }