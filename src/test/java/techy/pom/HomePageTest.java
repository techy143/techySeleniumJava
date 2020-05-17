package techy.pom;

import org.testng.annotations.Test;

public class HomePageTest extends BasePageTest {

    @Test(priority = 1)
    public void addToCart() throws InterruptedException {
        homePage.addToCart("camera");

    }
    @Test(priority = 2)
    public void checkOut() throws InterruptedException{

        checkOutPage.checkOut("To Buy a Camera");

    }
}
