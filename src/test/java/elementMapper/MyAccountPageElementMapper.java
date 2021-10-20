package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPageElementMapper {

    @FindBy(css = "a[title=\"View my customer account\"]>span")
    public WebElement namelogin;

    @FindBy(css = "p[class=info-account]")
    public WebElement msgcreateaccount;



}
