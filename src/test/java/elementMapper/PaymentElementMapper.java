   package elementMapper;

   import org.openqa.selenium.WebElement;
   import org.openqa.selenium.support.FindBy;
   import org.openqa.selenium.support.ui.Select;

   public class PaymentElementMapper {
    // titulo da pagina
    @FindBy(css = "h1[class=page-heading]")
    public WebElement page_heading;

    // Choose a delivery address
    @FindBy(id = "id_address_delivery")
    public Select id_address_delivery;

    // pagamento por banco
    @FindBy(css = "a[class=bankwire][title=\"Pay by bank wire\"]")
    public WebElement bankwire;

    // pagamento por cheque
    @FindBy(css = "a[class=cheque][title=\"Pay by check.\"]")
    public WebElement cheque;

    // titulo do metodo de pagamento escolhido
    @FindBy(css = "div[class=\"box cheque-box\"] > h3[class=page-subheading]")
    public WebElement paymentMethodSelected;

    // valor total
    @FindBy(id = "amount")
    public WebElement amount;

    // I confirm my order
    @FindBy(css = "#cart_navigation > button")
    public WebElement confirmMyOrder;

    //Mensagem/titulo de confirmação de compra Your order on My Store is complete.
    @FindBy(css = "#center_column > div > p > strong")
    public WebElement titleConfimationOrder;

    // preço
    @FindBy(css = "span[class=price]>strong")
    public WebElement price;

    //  Name of account owner
    @FindBy(css = "#center_column > div > strong:nth-child(5)")
    public WebElement nameAccountOwner;

    //- Include these details
    @FindBy(css = "#center_column > div > strong:nth-child(7)")
    public WebElement theseDetails;

    //- Bank name RTP
    @FindBy(css = " #center_column > div > strong:nth-child(9)")
    public WebElement bankName;



}
