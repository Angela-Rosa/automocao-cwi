package tests;

import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.openqa.selenium.By;
import pageObjects.CategoryPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.SearchPage;
import utils.Utils;

import static org.junit.Assert.*;
import static utils.Browser.getCurrentDriver;

public class SetupTest extends BaseTests{
    private Object LoginPage;

    @Test
    public void testOpeningBrowserAndLoadingPage(){
        assertTrue(getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()));
        System.out.println("Abrimos o navegador e carregamos a url do site de teste!");

    }
    @Test
    public void testLogin(){
        //Iniciar as paginas
        HomePage home = new HomePage();
        LoginPage login= new LoginPage();
        home.clickBtnLogin();
        System.out.println("Clicou em  Sing in e redirecionou");
        assertTrue(getCurrentDriver().getCurrentUrl()
            .contains(Utils.getBaseUrl().concat("index.php?controller=authentication&back=my-account")));
        login.fillEmail();
        System.out.println(" Preencheu o email");
        login.fillPasswd();
        System.out.println("Preencheu a senha");
        login.clickBtnSubmitLogin();
        System.out.println("Clicou em  Sing in");
        assertTrue(getCurrentDriver().getCurrentUrl().
                contains(Utils.getBaseUrl().concat("index.php?controller=my-account")));
        System.out.println(" Validou a url do login");
        assertTrue(getCurrentDriver().findElement(By.className("page-heading")).getText().contains("MY ACCOUNT"));
        System.out.println(" Validou minha conta com sucesso");

    }
    @Test
    public void testSearch(){

       String quest= "DRESS";
       String questResultQtd= "7";


        //Iniciar as paginas
        HomePage home = new HomePage();
        SearchPage search= new SearchPage();

        //Fazer a pesquisa
        home.doSearch(quest);

      //Validar a pequisa
        assertTrue(search.isSearchPage());
        assertEquals(search.getTextLighter().replace("\"", ""), quest);
        assertThat(search.getTextHeading_counter(), CoreMatchers.containsString(questResultQtd));


    }

    @Test
    public void testAcessCategoryTshirts(){

        //Iniciar as paginas
        HomePage home = new HomePage();
        CategoryPage category= new CategoryPage();

        //Clicar na categoria T-SHIRTS
        // home.clickCategoryTshirts(menuTshirts);
        getCurrentDriver().findElement(By.linkText("T-SHIRTS")).click();
        //Validar o clique na categoria  correta T-shirts
        assertTrue(category.isPageTshirts());

    }
}
