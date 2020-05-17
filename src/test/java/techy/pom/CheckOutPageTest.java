package techy.pom;

import org.testng.annotations.Test;

public class CheckOutPageTest extends BasePageTest {

    @Test(priority = 1)
    public void checkOut() throws InterruptedException{

        checkOutPage.checkOut("To Buy a Camera");

    }

}
