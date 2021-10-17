package tests;

import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.openqa.selenium.By;
import pageObjects.*;
import utils.Utils;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;
import static utils.Browser.getCurrentDriver;

public class SetupTest extends BaseTests{


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
        assertTrue(getCurrentDriver().findElement(By.className("page-heading"))
                .getText().contains("MY ACCOUNT"));

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

        //Iniciar as paginas
        SummaryShoppingPage summaryShopping = new SummaryShoppingPage();

        // inserindo Qty
        summaryShopping.fillQty("1");

        //// Valor do produto
        String valorProduto=summaryShopping.getTextTotal_products();
        assertEquals(valorProduto,"$16.51");

        // Valor do frete
        String valorTotalShipping= summaryShopping.getTextTotalShipping();
        assertEquals(valorTotalShipping,"$2.00");

        // Valor total
        String valorTotal= summaryShopping.getTextTotal();
        assertEquals(valorTotal, "$18.51");

        //Validar Checkout de compra
        summaryShopping.clickProceedCheckout();
        }


    @Test
    public void testPageAddress(){

        //Tela Address
        AddressPage addressP= new AddressPage();

        //Selecionar My adress
        addressP.selectAddress(0);

        //Clicar em Adrress
        addressP.clickaddressesAreEquals();

        //Preencher comentários
        addressP.fillTextComment("Favor entrar em contato antes de realizar a entrega");

       // Clique em Proceed to Checkout
        addressP.clickproceedToCheckout();

        // selecionar o frete escolhido
        addressP.clickdelivery_option();

        //Termo de Aceite
        addressP.clickcgv();

        //Verificar valor do frete
        assertTrue(addressP.getTextShipping().equals("$2.00"));

        // clicar em proceded to checkout
        addressP.clickproceedToCheckoutShipping();
        }


    @Test
    public void testPagePayment(){
        PaymentPage paymentP= new PaymentPage();

        paymentP.clickBankwire();

        // verificar qual a opção de pagamento escolhida
        assertTrue(paymentP.getTextpaymentMethodSelected().contains("BANK-WIRE PAYMENT"));

        //verificar o valor total
        assertTrue(paymentP.getTextAmount().contains("$18.51"));

        // clicar em confirmar compra
        paymentP.clickConfirmMyOrder();

        // verificar as informações e validação de compra
        assertTrue(paymentP.getOrderConfirmationPage().contains("Your order on My Store is complete."));
        assertTrue( paymentP.getTextprice().contains("$18.51"));
        assertTrue(paymentP.getTextnameAccountOwner().contains("Pradeep Macharla"));
        assertTrue(paymentP.getTexttheseDetails().contains("xyz"));
        assertTrue( paymentP.getTextbankName().contains("RTP"));

    }


    @Test
    public void CreateAccount(){
        HomePage home = new HomePage();
        LoginPage login= new LoginPage();
        CreateAccountPage createAccountP= new CreateAccountPage();

        home.clickBtnLogin();

        // inserindo o email  para criação de conta
        login.fillEmailCreate("COLOCAR AQUI O EMAIL PARA CRIAR CONTA");

        //clicar em create account
        login.clickBtnSubmitCreateAccount();

        //clicar em mr
        createAccountP.clickOptid_gender1();

        // inserir nome do usuario
        createAccountP.fillFirstName("Nome Usuario de teste");


    }




    }











