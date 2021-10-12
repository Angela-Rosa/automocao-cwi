package elementMapper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Browser;

public class LoginPageElementMapper {
    // Verificar no video, qual a melhor pratica para mapeamento de elemnto por ID
    // Se é usar o FindBy(id=""), ou usar o nome do elemento igual ao seu respectivo ID.

    @FindBy(id= "email")
    public WebElement email;

    @FindBy(id= "passwd")
    public WebElement passwd;

    public WebElement SubmitLogin;

}
