   package pageObjects;

   import elementMapper.CreateAccountElementMapper;
   import io.qameta.allure.Step;
   import org.openqa.selenium.support.PageFactory;
   import utils.Browser;

    public class CreateAccountPage extends CreateAccountElementMapper {
    public CreateAccountPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    @Step("Verificou se estamos na mesma página")
    public boolean isPageCreateAccount(){
        return getCreateAccountTitlePage().contains("Create an account");

    }

    @Step("Obteve o titulo da tela Create account")
    public String getCreateAccountTitlePage(){
        return namecreataccountpage.getText();
    }

    //Métodos de  clicar nos campos ou inserir informações
    //SEÇÃO YOUR PERSONAL INFORMATION

    @Step("Clicou na opçãp Mr.")
    public void clickOptid_gender1(){
        id_gender1.click();
    }

    @Step("Clicou na opçãp Mrs.")
    public void clickOptid_gender2(){
        id_gender2.click();
    }

    @Step("Inseriu nome do usuário para cadastro")
    public void fillFirstName(String fname){
         customer_firstname.sendKeys(fname);
    }

    @Step("Inseriu último nome do usuário para cadastro")
    public void fillLastName(String lname){
        customer_lastname.sendKeys(lname);
    }

    @Step("Inseriu o email")
    public void fillEmail(String txtemail) {
        email.sendKeys(txtemail);
    }

    @Step("Inseriu o senha")
    public  void fillPassword(String psw) {
        passwd.sendKeys(psw);
    }

    @Step("Selecionou dia")
    public void selectDays(String d) {
        days.sendKeys(d);
    }

    @Step("Selecionou mês")
    public void selectMoth(String m) {
        months.sendKeys(m);
    }

    @Step("Selecionou ano")
    public void selectYears(String y) {
        years.sendKeys(y);
    }

    @Step("Clicou em outras opções para conta ")
    public  void clickOptnewsletter(){
        newsletter.click();
    }
    public  void clickOptSpecialOffers(){
        optin.click();
    }

    ///////// Métodos de click e inserção da seção do formulário YOUR ADDRESS/////
    @Step("Confirmou nome do usuário para cadastro")
    public void fillFirstNameYourAddressSection(String fname){
        firstname.sendKeys(fname);
    }

    @Step("Confirmou último nome do usuário para cadastro")
    public void fillLastNameYourAddressSection(String name){
        lastname.sendKeys(name);
    }

    @Step ("Inseriu Empresa")
    public void fillCompany(String textCp ) {
        company.sendKeys(textCp);
    }

    @Step ("Inseriu Endereço 1")
    public void fillAddress1(String textAds1){address1.sendKeys(textAds1);
    }

    @Step ("Inseriu Endereço 2")
    public void fillAddress2(String textAds2) {address2.sendKeys(textAds2);
    }

    @Step("Inseriu Cidade")
    public void fillCity(String textCty) {city.sendKeys(textCty);
    }

    @Step("Selecionou estado")
    public void selectId_State(String idState){id_state.sendKeys(idState);
    }

    @Step("Inseriu Código postal")
    public void fillPostCode(String PostCd) {postcode.sendKeys(PostCd);
    }

    @Step("Selecionou País")
    public void selectId_Country(String idCountry) {id_country.sendKeys(idCountry);
    }

   @Step("Inseriu outras informções")
    public void fillOther(String Other) {other.sendKeys(Other);
    }

    @Step("Inseriu telefone 1")
    public void fillPhone(String Phone1) {phone.sendKeys(Phone1);
    }

    @Step("Inseriu telefone mobile")
    public void fillPhoneMobile(String PhoneM) {phone_mobile.sendKeys(PhoneM);
    }

    @Step("Inseriu outa opção de endereço")
    public void fillMyAlias(String Alias) {
        alias.clear();
        alias.sendKeys(Alias);
    }

    @Step("Clicou para confirmar cadastro")
    public void clickRegister(){
        submitAccount.click();
    }

    }
