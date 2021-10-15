package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageElementMapper {
    // Verificar no video, qual a melhor pratica para mapeamento de elemnto por ID
    // Se é usar o FindBy(id=""), ou usar o nome do elemento igual ao seu respectivo ID.

    @FindBy(id= "email")
    public WebElement email;

    @FindBy(id= "passwd")
    public WebElement passwd;

    @FindBy(id= "SubmitLogin")
    public WebElement SubmitLogin;

    @FindBy(id= "email_create")
    public  WebElement email_create;

    @FindBy(id = "SubmitCreate")
    public WebElement SubmitCreate;


}
