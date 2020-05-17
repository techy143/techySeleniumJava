package techy.page.object.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    WebDriver driver;


    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);

    }

    @FindBy(linkText = "Electronics")
    WebElement electronicsIteam;
    @FindBy(linkText = "Camera, Drones & Photo")
    WebElement iteamToBuy;
    @FindBy(linkText = "DSLR Cameras")
    WebElement camera;
    @FindBy(linkText = "Nikon")
    WebElement cameraBrand;
    @FindBy(linkText = "Nikon D5600")
    WebElement cameraModel;
    @FindBy(linkText = "Nikon D5600 DSLR Camera w/ AF-P 18-55mm VR Lens 1576")
    WebElement buyIt;
    @FindBy(id = "binBtn_btn")
    WebElement buyItNow;
    @FindBy(linkText = "No thanks")
    WebElement noThanks;
    @FindBy(id = "sbin-gxo-btn")
    WebElement checkOutIteam;


//Method for Homepage

    public void addToCart(String expectedString) throws InterruptedException {


        clickOnElement(electronicsIteam);
        System.out.println("Clicked on Electronics");

        clickOnElement(iteamToBuy);
        System.out.println("Clicked on Camera, Drones & Photo");

        clickOnElement(camera);
        Thread.sleep(3000);
        System.out.println("Clicked on DSLR Cameras");

        clickOnElement(cameraBrand);
        System.out.println("Clicked on Nikon Camera");

        clickOnElement(cameraModel);
        System.out.println("Clicked on Nikon D5600");

        clickOnElement(buyIt);
        System.out.println("clicked on Nikon D5600 DSLR Camera");

        clickOnElement(buyItNow);
        System.out.println("Clicked on Buy it Now");

        clickOnElement(noThanks);

        clickOnElement(checkOutIteam);
        System.out.println("clicked on Check out as a Guest");







}
}
