  package tests;

   import io.qameta.allure.Description;
   import io.qameta.allure.Story;
   import org.hamcrest.CoreMatchers;
   import org.junit.Test;
   import org.openqa.selenium.By;
   import pageObjects.*;
   import utils.Utils;

   import static org.junit.Assert.*;
   import static utils.Browser.getCurrentDriver;

   public class SetupTest extends BaseTests{


    @Test
    public void testOpeningBrowserAndLoadingPage(){
        assertTrue(getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()));
        System.out.println("Abrimos o navegador e carregamos a url do site de teste!");

    }

    @Story("Realizar uma compra  de produto")
    @Description("Realizar uma compra  de um produto da loja com sucesso")
    @Test
    public void realizarCompra(){
        //Iniciar as paginas
        HomePage home = new HomePage();
        LoginPage login= new LoginPage();
        CategoryPage category= new CategoryPage();
        ProductPage pdp = new ProductPage();
        CartPage cart = new CartPage();
        SummaryShoppingPage summaryShopping = new SummaryShoppingPage();
        AddressPage addressP= new AddressPage();
        PaymentPage paymentP= new PaymentPage();

        //Ações de Login
        //Clicar em botão Sign in
        home.clickBtnLogin();

        assertTrue(getCurrentDriver().getCurrentUrl()
                .contains(Utils.getBaseUrl().concat("index.php?controller=authentication&back=my-account")));
        //Inserir email
        login.fillEmail();

        //Inserir senha
        login.fillPasswd();

        //Clicar para validar login
        login.clickBtnSubmitLogin();
        assertTrue(getCurrentDriver().getCurrentUrl().
                contains(Utils.getBaseUrl().concat("index.php?controller=my-account")));
        assertTrue(getCurrentDriver().findElement(By.className("page-heading"))
                .getText().contains("MY ACCOUNT"));

        //Testes de Acess Category Tshirts
        //Clicar na categoria T-SHIRTS
        getCurrentDriver().findElement(By.linkText("T-SHIRTS")).click();

        //Validar o clique na categoria  correta T-shirts
        assertTrue(category.isPageTshirts());

        // testes de  Add Product To Product Page

        //Exibir nome do produto na pagina de categoria
        String nameProductCategory = category.getProductNameCategory();

        // Clicar em more e direcionar para pagina o produto.
        category.clickProductAddToProductPage();

        //Verificar se produto esta na pagina detalhada correta
        assertEquals(pdp.getProductNamePDP(), nameProductCategory);

        //testes de Add Product To Cart Page

        //Salvar o nome do produto na pagina de PDP
        String nameProductPDP = pdp.getProductNamePDP();

        //Clicar no botão de adcionar ao carrinho
        pdp.clickButtonAddToCart();

        //Clicar no botão Proceed To Checkout da modal
        pdp.clickButtonModalProceedToCheckout();

        // Validar nome do produto dentro do carrinho
        assertTrue(cart.getNameProduct().equals(nameProductPDP));

        //testes de Page Summary Shopping

        // inserindo Qty
        summaryShopping.fillQty("1");

        // Validar Valor do produto
        assertEquals(summaryShopping.getTextTotal_products(),"$16.51");

        // Validar Valor do frete
        assertEquals(summaryShopping.getTextTotalShipping(),"$2.00");

        //Validar  Valor total
        assertEquals(summaryShopping.getTextTotal(), "$18.51");

        //Clicar Checkout de compra
        summaryShopping.clickProceedCheckout();

        // Testes de Page Address
        //Selecionar My adress
        addressP.selectAddress(0);

        //Clicar em Adrress
        //addressP.clickaddressesAreEquals();

        //Preencher comentários
        addressP.fillTextComment("Favor entrar em contato antes de realizar a entrega");

        // Clique em Proceed to Checkout
        addressP.clickproceedToCheckout();

        // Selecionar o frete escolhido
        addressP.clickdelivery_option();

        //Termo de Aceite
        addressP.clickcgv();

        //Verificar valor do frete
        assertTrue(addressP.getTextShipping().equals("$2.00"));

        // Clicar em proceded to checkout
        addressP.clickproceedToCheckoutShipping();

        // Testes de  Page Payment
        paymentP.clickBankwire();

        // Verificar qual a opção de pagamento escolhida
        assertTrue(paymentP.getTextpaymentMethodSelected().contains("BANK-WIRE PAYMENT"));

        //Verificar o valor total
        assertTrue(paymentP.getTextAmount().contains("$18.51"));

        // Clicar em confirmar compra
        paymentP.clickConfirmMyOrder();

        // Verificar as informações e validação de compra
        assertTrue(paymentP.getOrderConfirmationPage().contains("Your order on My Store is complete."));
        assertTrue( paymentP.getTextprice().contains("$18.51"));
        assertTrue(paymentP.getTextnameAccountOwner().contains("Pradeep Macharla"));
        assertTrue(paymentP.getTexttheseDetails().contains("xyz"));
        assertTrue( paymentP.getTextbankName().contains("RTP"));
        System.out.println("Compra realizada com SUCESSO!");

    }

    @Story("Criar uma conta")
    @Description("Criar uma conta de usuario com sucesso")
    @Test
    public void CreateAccount(){
        HomePage home = new HomePage();
        LoginPage login= new LoginPage();
        CreateAccountPage createAccountP= new CreateAccountPage();
        MyAccountPage myAccountP= new MyAccountPage();
        home.clickBtnLogin();

        //SEÇÃO YOUR PERSONAL INFORMATION
        // Inserindo o email  para criação de conta
        String emailcliente= "angela8459roxxsa@gmail.com";
        emailcliente=Utils.getEmailRandon()+"@gmail.com";
        String primeironome="testecwi";
        String ultimonome=" santos";

        //inserir email do cliente
        login.fillEmailCreate(emailcliente);

        //Clicar em create account
        login.clickBtnSubmitCreateAccount();

        //Clicar em mr
        createAccountP.clickOptid_gender1();

        // Inserir nome do usuario
        createAccountP.fillFirstName(primeironome);

        //Inserir Ultimo nome do usuario
        createAccountP.fillLastName(ultimonome);

        //Inserir senha
        createAccountP.fillPassword("teste123");

        //Selecionar dia
        createAccountP.selectDays("1");

        //Selecionar mes
        createAccountP.selectMoth("July");

        //Selecionar ano
        createAccountP.selectYears("1990");

        //Sign up for our newsletter!
        createAccountP.clickOptnewsletter();

        //Receive special offers from our partners!
        createAccountP.clickOptSpecialOffers();

        //SEÇÃO DO FORMULÁRIO YOUR ADDRESS
        //Company
        createAccountP.fillCompany("empresa fantasia");

        //Endereço 1
        createAccountP.fillAddress1("casa de praia");

        //Endereço 2
        createAccountP.fillAddress2("apartamento do centro");

        //City
        createAccountP.fillCity("Salvador");

        //State
        createAccountP.selectId_State("Alabama");

        //Zip/Postal Code
        createAccountP.fillPostCode("58322");

        //Country
        createAccountP.selectId_Country("United States");

        //Additional information
        createAccountP.fillOther("entre em contato");

        //Home phone
        createAccountP.fillPhone("123456789");

        //Mobile phone
        createAccountP.fillPhoneMobile("123456780");

        //Assign an address alias for future reference
        createAccountP.fillMyAlias("meuEndereco");

        //Register
        createAccountP.clickRegister();

        // Valida se a mensagem de usuario criado com sucesso é exibida
        assertTrue(myAccountP.isMsgCreateAccountView());

        //Valida se o usuario logado foi o usuario criado
        assertTrue(myAccountP.getNameLogin().contains(primeironome));
        assertTrue(myAccountP.getNameLogin().contains(ultimonome));
        System.out.println("Cadastro realizado com SUCESSO!");


    }
    @Story("Realizar pesquisa de produto")
    @Description("Realizar uma pesquisa de um produto da loja com sucesso")
    @Test
    public void testSearch(){
        //Iniciar as páginas
        HomePage home = new HomePage();
        SearchPage search= new SearchPage();

        //Inserir nome da pesquisa
        String quest= "DRESS";
        String questResultQtd= "7";

        //Fazer a pesquisa
        home.doSearch(quest);

        //Validar a pequisa
        assertTrue(search.isSearchPage());
        assertEquals(search.getTextLighter().replace("\"", ""), quest);
        assertThat(search.getTextHeading_counter(), CoreMatchers.containsString(questResultQtd));

    }

}











