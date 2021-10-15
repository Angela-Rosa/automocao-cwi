package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountElementMapper {

    // Header ( Titulo da pagina)
    @FindBy(className = "page-heading")
    public  WebElement namecreataccountpage;

    // Mr
    @FindBy(id="id_gender1")
    public WebElement id_gender1;

    // Mrs
    @FindBy(id="id_gender2")
    public WebElement id_gender2;

    // First Name
    @FindBy(id="customer_firstname")
    public WebElement customer_firstname;

    //Last name
    @FindBy(id="customer_lastname")
    public WebElement customer_lastname;

    //Email
    @FindBy(id="email")
    public WebElement email;

    //Password
    @FindBy(id="passwd")
    public WebElement passwd;

    ////////Bloco de Date of Birth//////////

    //days
    @FindBy(id="days")
    public WebElement days;

    //months
    @FindBy(id="months")
    public WebElement months;

    //years
    @FindBy(id="years")
    public WebElement years;

    //newsletter
    @FindBy(id="newsletter")
    public WebElement newsletter;

    //optin
    @FindBy(id="optin")
    public WebElement optin;

    ///////// YOUR ADDRESS////////
    //firstname
    @FindBy(id="firstname")
    public WebElement firstname;

    //lastname
    @FindBy(id="lastname")
    public WebElement lastname;

    //company
    @FindBy(id="company")
    public WebElement company;

    //address1
    @FindBy(id="address1")
    public WebElement address1;

    //address2
    @FindBy(id="address2")
    public WebElement address2;

    //city
    @FindBy(id="city")
    public WebElement city;

    //State
    @FindBy(id="id_state")
    public WebElement id_state;

    //Zip code
    @FindBy(id="postcode")
    public WebElement postcode;

    //Country
    @FindBy(id="id_country")
    public WebElement id_country;

    //Additional information
    @FindBy(id="other")
    public WebElement other;

    //Home phone
    @FindBy(id="phone")
    public WebElement phone;

    //Phone mobile
    @FindBy(id="phone_mobile")
    public WebElement phone_mobile;

    //Assign an address alias for future reference. *
    @FindBy(id="alias")
    public WebElement alias;

    // Register
    @FindBy(id="submitAccount")
    public WebElement submitAccount;

}
