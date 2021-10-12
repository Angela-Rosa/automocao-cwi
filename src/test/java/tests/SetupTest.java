package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import utils.Browser;
import utils.Utils;

import static org.junit.Assert.assertTrue;

public class SetupTest extends BaseTests{
    private Object LoginPage;

    @Test
    public void testOpeningBrowserAndLoadingPage(){
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()));
        System.out.println("Abrimos o navegador e carregamos a url do site de teste!");

    }
    @Test
    public void testLogin(){
        //Iniciar as paginas
        HomePage home = new HomePage();
        LoginPage login= new LoginPage();
        home.clickBtnLogin();
        System.out.println("Clicou em  Sing in e redirecionou");
        assertTrue(Browser.getCurrentDriver().getCurrentUrl()
            .contains(Utils.getBaseUrl().concat("index.php?controller=authentication&back=my-account")));
        login.fillEmail();
        System.out.println(" Preencheu o email");
        login.fillPasswd();
        System.out.println("Preencheu a senha");
        login.clickBtnSubmitLogin();
        System.out.println("Clicou em  Sing in");
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().
                contains(Utils.getBaseUrl().concat("index.php?controller=my-account")));
        System.out.println(" Validou a url do login");
        assertTrue(Browser.getCurrentDriver().findElement(By.className("page-heading")).getText().contains("MY ACCOUNT"));
        System.out.println(" Validou minha conta com sucesso");

    }

}
