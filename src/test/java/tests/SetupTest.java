package tests;

import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.openqa.selenium.By;
import pageObjects.*;
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
        System.out.println("Preencheu o email");
        login.fillPasswd();
        System.out.println("Preencheu a senha");
        login.clickBtnSubmitLogin();
        System.out.println("Clicou em  Sing in");
        assertTrue(getCurrentDriver().getCurrentUrl().
                contains(Utils.getBaseUrl().concat("index.php?controller=my-account")));
        System.out.println("Validou a url do login");
        assertTrue(getCurrentDriver().findElement(By.className("page-heading")).getText().contains("MY ACCOUNT"));
        System.out.println("Validou minha conta com sucesso");

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
        CategoryPage category= new CategoryPage();

        //Clicar na categoria T-SHIRTS
        // home.clickCategoryTshirts(menuTshirts);
        getCurrentDriver().findElement(By.linkText("T-SHIRTS")).click();
        //Validar o clique na categoria  correta T-shirts
        assertTrue(category.isPageTshirts());
    }

    @Test
    public void testAddProductToProductPage(){
    //Acessar a categoria T-shirts
    testAcessCategoryTshirts();

    //Iniciar as paginas
        CategoryPage category= new CategoryPage();
        ProductPage pdp= new ProductPage();

    //Exibir nome do produto na pagina de categoria
        String nameProductCategory = category.getProductNameCategory();

    // Clicar em more e direcionar para pagina o produto.
    category.clickProductAddToProductPage();

    //Verificar se produto esta na pagina detalhada correto
        assertEquals(pdp.getProductNamePDP(), nameProductCategory);

    }

    @Test
     public void testAddProductToCartPage() {

        //Acessar a pagina de produtos
        testAddProductToProductPage();

        //Iniciar as paginas
        ProductPage pdp = new ProductPage();

        CartPage cart = new CartPage();

        //Salvar o nome do produto na pagina de PDP
        String nameProductPDP = pdp.getProductNamePDP();

        //Clicar no botão de adcionar ao carrinho
        pdp.clickButtonAddToCart();

        //Clicar no botão Proceed To Checkout da modal
        pdp.clickButtonModalProceedToCheckout();

        // Validar nome do produto dentro do carrinho
        assertTrue(cart.getNameProduct().equals(nameProductPDP));

    }
    @Test
    public void testPageSummaryShopping(){

    }

    @Test
    public void testPageAdrres(){

    }

    @Test
    public void testPageShipping(){

    }

    @Test
    public void testPagePayment(){

    }

    @Test
    public void testPageOrderSummary(){

    }

    @Test
    public void testPageOrderConfirmation(){

    }




}






