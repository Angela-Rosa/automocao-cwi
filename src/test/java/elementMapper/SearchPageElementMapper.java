   package elementMapper;

   import org.openqa.selenium.WebElement;
   import org.openqa.selenium.support.FindBy;


    public class SearchPageElementMapper {
    ///Search
    @FindBy(className = "navigation_page")
    public WebElement navigation_page;

    ///Dresses
    @FindBy(className = "lighter")
    public WebElement lighter;

    ///View
    @FindBy(className = "heading-counter")
    public  WebElement heading_counter;

}
