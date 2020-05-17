package techy.page.object.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends BasePage {
    WebDriver driver;

    public CheckOutPage(WebDriver driver){
        super(driver);

        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[3]/div[1]/div/div[1]/section[1]/div/div/div[2]/div/div/div/div[2]/span/div/div/div/div/fieldset/span/div/div/span/div/label/span/span/div/div/fieldset/span/div[2]/div/span/span/input")
    WebElement deliveryMethod;
    @FindBy(id = "firstName")
    WebElement firstName;
    @FindBy(id = "lastName")
    WebElement lastName;




    //Method for Homepage

    public void checkOut (String expectedString) throws InterruptedException{

        clickOnElement(deliveryMethod);
        System.out.println("clicked on deliveryMethod");


        typeOnTextBox(firstName,"Shakib");
        typeOnTextBox(lastName,"Hassan");






    }

}
