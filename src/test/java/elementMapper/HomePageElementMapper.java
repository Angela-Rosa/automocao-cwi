   package elementMapper;

   import org.openqa.selenium.WebElement;
   import org.openqa.selenium.support.FindBy;

   public class HomePageElementMapper {
    // Acessar página de login
    @FindBy(className= "login")
    public WebElement login;
    public WebElement search_query_top;

    //Page Search
    @FindBy(css = "button.btn.btn-default.button-search")
    public WebElement submit_search;

    //Page Tshirts
    @FindBy(css = "#block_top_menu .sf-menu li:nth-child(3) a[title=T-shirts]")
    public  WebElement menuTshirts;


}
