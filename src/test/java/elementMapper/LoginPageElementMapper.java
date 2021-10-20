    package elementMapper;

    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.support.FindBy;

    public class LoginPageElementMapper {
    //Inserir email
    @FindBy(id= "email")
    public WebElement email;

    //Inserir senha
    @FindBy(id= "passwd")
    public WebElement passwd;

    //Validar login
    @FindBy(id= "SubmitLogin")
    public WebElement SubmitLogin;

    //Cadastar não usuário
    @FindBy(id= "email_create")
    public  WebElement email_create;

    @FindBy(id = "SubmitCreate")
    public WebElement SubmitCreate;


}
