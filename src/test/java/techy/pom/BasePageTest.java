package techy.pom;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import techy.page.object.model.CheckOutPage;
import techy.page.object.model.HomePage;

import java.util.concurrent.TimeUnit;

public class BasePageTest {

    public HomePage homePage;
    public WebDriver driver;
    public CheckOutPage checkOutPage;


    @BeforeClass
    public void setUpMethod(){
        initilization();
        homePage = new HomePage(driver);
        checkOutPage = new CheckOutPage(driver);

    }
    @AfterClass
    public void tearDownMethod(){

        if(driver != null) {
            driver.quit();
        }

    }

    public void initilization(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.ebay.com/");

    }

}
